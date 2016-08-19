package war;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;
import view.FoodView;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import form.GeneralTabForm;

@SuppressWarnings("serial")
@Widgetset("war.MyAppWidgetset")
public class UnifieddealviewapplicationUI extends UI {
	private static final Logger LOGGER = LoggerFactory.getLogger(GeneralTabForm.class);
	private PostgresDAOI pdaoi = DAOFactory.getPostgresDAO();
	
	@Override 
	protected void init(VaadinRequest request){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>)))))))))))))))Comming inside");
		final VerticalLayout layout=new VerticalLayout(); 
		final CssLayout topBar=new CssLayout();
		final CssLayout viewLayout=new CssLayout(); 
		layout.addComponent(topBar);
		layout.addComponent(viewLayout);
		setContent(layout);
		
		final Navigator navigator = new Navigator(this,viewLayout);
		navigator.addView("food",FoodView.class);
		navigator.addView("register",RegisterView.class);
		navigator.addView("settings",SettingsView.class);
		navigator.addView("search",SearchView.class);
		
		for(String s: new String[]{"food","register","settings","search"}){
			topBar.addComponent(this.createNavigationButton(s, navigator));
		}
		
	}
	private Button createNavigationButton(final String state,final Navigator navigator){
		return new Button("Go to"+state,new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				navigator.navigateTo("state");
			}
		});
	}
		
	}*/

import java.io.File;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import model.Applicant;
import model.Opportunity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import form.DealConfigurationTabForm;
import form.GeneralTabForm;
import form.PropertiesTabForm;
import form.PropertyTabForm;
import form.SolutionTabForm;
import form.UnderwritingForm;


/**
 *
 */
@SuppressWarnings("serial")
@Theme("mytheme")
@Widgetset("war.MyAppWidgetset")
public class UnifieddealviewapplicationUI extends UI {
	private static final Logger LOGGER = LoggerFactory.getLogger(GeneralTabForm.class);
	private PostgresDAOI pdaoi = DAOFactory.getPostgresDAO();

	public static final Object hw_PROPERTY_NAME = "name";
	public static final Object hw_PROPERTY_ICON = "icon";

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = UnifieddealviewapplicationUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

	String navigateValue="";
	String opportunityId="3584";
	Opportunity opportunity=null;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	//new Responsive(this);
	final VerticalLayout layout = new VerticalLayout();
//	layout.setSizeFull();
	layout.setWidth("100%");
	setContent(layout);
	
	
	CssLayout topbar = new CssLayout();
	//VerticalLayout topbar = new VerticalLayout();
	topbar.setStyleName("top");
	HorizontalLayout headerLoc = new HorizontalLayout();
	headerLoc.setMargin(true);
	headerLoc.setSizeFull();
	headerLoc.addComponent(setLogo());
	
	//TextField searchInput=new TextField();
	ComboBox searchInput = new ComboBox(); 
	
	searchInput.setSizeFull();
	Button search=new Button("Go");
//	search.setSizeFull();
	search.setStyleName("Search");
	
	headerLoc.addComponent(searchInput);
	headerLoc.addComponent(search);
	
	topbar.addComponent(headerLoc);
	layout.addComponent(topbar);
	
		        
	HorizontalLayout menuAndContent = new HorizontalLayout();
	menuAndContent.setSizeFull();
	layout.addComponent(menuAndContent);
	
	//For MENU LIST SIDE BAR
	CssLayout menu = new CssLayout();
	//menu.setWidth("30%");
	menu.addStyleName("menu");
	menuAndContent.addComponent(menu);
	
//	getHardwareContainer();
	//FOR CONTENT AREA 
	VerticalLayout contentArea=new VerticalLayout();
	contentArea.addStyleName("content");
	contentArea.setSpacing(true);
	contentArea.setMargin(true);
	contentArea.addComponent(setTabSheet());
	menuAndContent.addComponent(contentArea);
//	menuAndContent.setExpandRatio(menu,(float)1.2);
	menuAndContent.setExpandRatio(contentArea, 6);
	
	/*Tree tree=setSideBar();
	tree.addValueChangeListener(e -> Notification.show("Value changed:",
String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));*/
	
	List<Applicant> applicants = null;
	try{
		opportunity = pdaoi.getOpportunityDetails(opportunityId);
		applicants = pdaoi.getApplicantIds(opportunityId);
	}catch(Exception e){
		LOGGER.error("Error when reading the Data from db",e);
	}
	menu.addComponent(setSideBar(contentArea,applicants));
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "+navigateValue+"<<<<<<");
	
	

		
	//FOR  HEADING
	/*Label header = new Label(" Information ");
	header.addStyleName("h2");
	contentArea.addComponent(header);*/
			
	
	/*contentArea.addComponent(new GeneralTabForm("4473"));
	contentArea.addComponent(new DealConfigurationTabForm("4473"));
	contentArea.addComponent(new PropertyTabForm("4473"));
	contentArea.addComponent(new SolutionTabForm("4473"));*/
	
	/*for(Applicant applicant : applicants) {
		Label applicantsLabel = new Label();
		applicantsLabel.addStyleName("h2");
		contentArea.addComponent(applicantsLabel);
		contentArea.addComponent(new PersonalInfoTabForm(applicant.getId()));
		contentArea.addComponent(new IncomesTabForm(applicant.getId()));
		contentArea.addComponent(new CreditLiabilitiesTabForm(applicant.getId()));
		contentArea.addComponent(new CreditReportTabForm(applicant.getId()));
		contentArea.addComponent(new PropertiesTabForm(applicant.getId()));
		contentArea.addComponent(new ApplicantAssetTabForm(applicant.getId()));
	}*/
	
	//FOR FORM
	/*FormLayout form = new FormLayout();
	form.setSpacing(true);
	contentArea.addComponent(form);
	addCollapse(form);*/
	
	//form.addComponent(getHardwareContainer());
	//getHardwareContainer();
	}//End of init
    private Button createNavigationButton(final String state,final Navigator navigator){
		return new Button(state,new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				navigator.navigateTo(state);
			}
		});
	}

    public Image setLogo(){
    	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		//Image as a file resource
		FileResource resource = new FileResource(new File(basepath +"/images/visdom-logo.png"));
		//Show the image in the application
		Image image = new Image("",resource);
		//Let the userview the file in browser or download it
		image.setWidth("50%");
		return image;
    }
    public Tree setSideBar(VerticalLayout contentArea,List<Applicant> applicants){
    	final Object[][] menuItems = new Object[][]{
		        new Object[]{"Opportunity","General","Deal Configuration","Property","Solution"}, 
		        new Object[]{"Applicant","Personal Info","Credit/Liabilities","Assets","Income","Credit Report"},
		        new Object[]{"Co-Applicant", "Personal info","Credit/liabilities","assets","income","Credit report"},    
		        new Object[]{"Tasks"},
		        new Object[]{"Communication"},
		        new Object[]{"Documents"},
		        new Object[]{"Underwriting"},
		        new Object[]{"History"},
		        new Object[]{"Surveys"}
		        };
		        
		Tree tree = new Tree(" ");
		tree.setImmediate(true);
		//tree.setVisible(true);
		/* Add menuItems as root items in the tree. */
		for (int i=0; i<menuItems.length; i++) {
		    String root = (String) (menuItems[i][0]);
		    tree.addItem(root);
		    
		    if (menuItems[i].length == 1) {
		        // The root has no child so make it a leaf.
		        tree.setChildrenAllowed(root, false);
		    } else {
		        // Add children (child) under the root.
		        for (int j=1; j<menuItems[i].length; j++) {
		            String child = (String) menuItems[i][j];
		            
		            // Add the item as a regular item.
		            tree.addItem(child);
		            
		            // Set it to be a child.
		            tree.setParent(child, root);
		            
		            // Make the child look like leaves.
		            tree.setChildrenAllowed(child, false);
		        }

		        // Expand the subtree.
		        tree.expandItemsRecursively(root);
		    }
		}
		/*tree.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));*/
		
		tree.addItemClickListener(new ItemClickEvent.ItemClickListener() {
		    @Override
		    public void itemClick(ItemClickEvent itemClickEvent) {
		    	navigateValue = itemClickEvent.getItemId().toString();		    	
		        //System.out.println(">>>>>>>>>>>>>>> id "+itemClickEvent.getItemId().toString());
		    	LOGGER.debug("navigateValue >>>>>>>>>>>>>>>>>>>>>>"+navigateValue);
		    	if(navigateValue != null && navigateValue.equalsIgnoreCase("Opportunity")){
		    		LOGGER.debug("Opportunity Details.."+opportunityId);
		    		
		    		contentArea.addComponent(new GeneralTabForm(opportunity));
		    		contentArea.addComponent(new DealConfigurationTabForm(opportunity));
		    		contentArea.addComponent(new PropertyTabForm(opportunity));
		    		contentArea.addComponent(new SolutionTabForm(opportunity));
		    	}else if(navigateValue != null && navigateValue.equalsIgnoreCase("Applicant")){
		    	LOGGER.debug("Applicant Details.");
		    		for(Applicant applicant : applicants) {
		    			Label applicantsLabel = new Label();
		    			applicantsLabel.addStyleName("h2");
		    			contentArea.addComponent(applicantsLabel);
		    			/*contentArea.addComponent(new PersonalInfoTabForm(applicant.getId()));
		    			contentArea.addComponent(new IncomesTabForm(applicant.getId()));
		    			contentArea.addComponent(new CreditLiabilitiesTabForm(applicant.getId()));
		    			contentArea.addComponent(new CreditReportTabForm(applicant.getId()));*/
		    			contentArea.addComponent(new PropertiesTabForm(applicant.getId()));
//		    			contentArea.addComponent(new ApplicantAssetTabForm(applicant.getId()));
		    		}
		    	}
		    	else if(navigateValue != null && navigateValue.equalsIgnoreCase("Underwriting")){
		    		LOGGER.debug("Inside Underwriting >>>> "+opportunityId);
		    		contentArea.addComponent(new UnderwritingForm());
		    	}
		    	else if(navigateValue != null && navigateValue.equalsIgnoreCase("Documents")){
		    		BrowserFrame browser = new BrowserFrame("Browser",
		    			    new ExternalResource("https://documentanalyzer.visdom.ca/getdoc"));
		    			browser.setWidth("1200px");
		    			browser.setHeight("1050px");
		    			contentArea.addComponent(browser);
		    	}
		    		
		    }
		});
		return tree;
    }
    public TabSheet setTabSheet(){
    	TabSheet tabsheet = new TabSheet();
		 // Create the first tab
			        VerticalLayout tab1 = new VerticalLayout();
			        
			        tab1.addComponent(new Label("Partial App"));
			        tabsheet.addTab(tab1, "Partial App",
			                new ThemeResource("images/visdom-logo.png"));
			
			        // Second tab gets its caption from component caption
			        VerticalLayout tab2 = new VerticalLayout();
			        tab2.addComponent(new Label("Completed App"));
			        tab2.setCaption("Completed App");
			        tabsheet.addTab(tab2).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        //Third Tab
			        VerticalLayout tab3 = new VerticalLayout();
			        tab3.addComponent(new Label("Credit"));
			        tab3.setCaption("Credit");
			        tabsheet.addTab(tab3).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			        //Fourth Tab
			        VerticalLayout tab4 = new VerticalLayout();
			        tab4.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab4.setCaption("Awaiting Docs");
			        tabsheet.addTab(tab4).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			      //Fifth Tab
			        VerticalLayout tab5 = new VerticalLayout();
			        tab5.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab5.setCaption("All Products");
			        tabsheet.addTab(tab5).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			      //Sixth Tab
			        VerticalLayout tab6 = new VerticalLayout();
			        tab6.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab6.setCaption("Proposal");
			        tabsheet.addTab(tab6).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        //7th Tab
			        VerticalLayout tab7 = new VerticalLayout();
			        tab7.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab7.setCaption("Post Selection");
			        tabsheet.addTab(tab7).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			        //8th Tab
			        VerticalLayout tab8 = new VerticalLayout();
			        tab8.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab8.setCaption("Lender Submission");
			        tabsheet.addTab(tab8).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			        //9th Tab
			        VerticalLayout tab9 = new VerticalLayout();
			        tab9.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab9.setCaption("Commitment");
			        tabsheet.addTab(tab9).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			      //10th Tab
			        VerticalLayout tab10 = new VerticalLayout();
			        tab10.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab10.setCaption("Compensation");
			        tabsheet.addTab(tab10).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        
			        //11th Tab
			        VerticalLayout tab11 = new VerticalLayout();
			        tab11.addComponent(new Embedded(null,
			                new ThemeResource("UnifiedDealViewApplication/src/com/example/unifieddealviewapplication/visdom-logo.png")));
			        tab11.setCaption("Paid");
			        tabsheet.addTab(tab11).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        //12 Tab
			        VerticalLayout tab12 = new VerticalLayout();
			        tab12.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab12.setCaption("Lost");
			        tabsheet.addTab(tab12).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
		//End of tabsheet code
			        return tabsheet;
    }
    public void addCollapse(final FormLayout form){

		Panel C = new Panel();
		Panel B = new Panel();
		
		Button bC = new Button("+", new CloseButtonHandler(C));
		Button bB = new Button("Toggle B", new CloseButtonHandler(B));
		    B.setHeight("80px");
		    B.setWidth("100%");
		    B.setContent(new Label("B"));
		    C.setHeight("100%");
		    C.setHeight("100%");
		    C.setContent(new Label("C"));
		    Label addToggleOpportunity = new Label("Opportunity");
		    VerticalLayout vl = new VerticalLayout();
		    vl.addComponent(C);
		    
		    vl.addComponent(B);
		    vl.setExpandRatio(C, 1);
		    vl.setSizeFull();

		    HorizontalLayout hl = new HorizontalLayout();
		    hl.addComponent(vl);
		    hl.setExpandRatio(vl, 1);
		    hl.setSizeFull();

		    CssLayout root = new CssLayout();
		    
		    root.addComponent(bC);
		    root.addComponent(addToggleOpportunity);
		    root.addComponent(bB);
		    root.addComponent(hl);
		    root.setSizeFull();
		
	   	form.addComponent(root);
	
    }
    private class CloseButtonHandler implements ClickListener {
	    private Panel layout;

	    public CloseButtonHandler(Panel layout) {
	        this.layout = layout;
	    }

	    @Override
	    public void buttonClick(ClickEvent event) {
	        layout.setVisible(!layout.isVisible());

	    }
	}
    public Object method1(){
    	
    	return "";
    }
    

}
