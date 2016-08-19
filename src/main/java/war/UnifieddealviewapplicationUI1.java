/*package war;

 

import java.io.File;

import javax.servlet.annotation.WebServlet;

//import com.vaadin.addon.responsive.Responsive;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.server.FileResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import form.DealInfoForm;
import form.DownPaymentForm;
import form.InformationForm;

@SuppressWarnings("serial")
@Theme("unifieddealviewapplicationtheme")
public class UnifieddealviewapplicationUI extends UI {
	Button label1 = new Button("button1");
	String opportunity="";
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = UnifieddealviewapplicationUI.class)
	public static class Servlet extends VaadinServlet {
	}
 
	@Override
	protected void init(VaadinRequest request) {
		//new Responsive(this);
		
		final VerticalLayout layout = new VerticalLayout();
//		layout.setSizeFull();
		layout.setWidth("100%");
		setContent(layout);
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		//Image as a file resource
		FileResource resource = new FileResource(new File(basepath +"/WEB-INF/image/visdom-logo.png"));
		//Show the image in the application
		Image image = new Image("",resource);
		//Let the userview the file in browser or download it
		image.setWidth("50%");
		//CssLayout topbar = new CssLayout();
		VerticalLayout topbar = new VerticalLayout();
		topbar.setStyleName("top");
		HorizontalLayout headerLoc = new HorizontalLayout();
		headerLoc.setMargin(true);
		headerLoc.setSizeFull();
		headerLoc.addComponent(image);
		
		TextField searchInput=new TextField();
		
		searchInput.setSizeFull();
		Button search=new Button("Go");
//		search.setSizeFull();
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
		
		//FOR MENU CONTENT LIST
		 if ("basic".equals(context))
			 	            basic(layout);
			 	        else if ("expanding".equals(context))
			 	            expanding(layout);
			 	        else if ("expandlistener".equals(context))
			 	            expandCollapse();
			 	        else if ("collapselistener".equals(context))
			             expandCollapse();
			 	        else if ("itemclicklistener".equals(context))
			 	            itemClickListener();
			 	        else if ("disable".equals(context))
			 	            disableItem();
			 	        else if ("itemstylegenerator".equals(context))
			 	            itemstylegenerator();
			 	       
			 	        if (getCompositionRoot() == null)
			 	            setCompositionRoot(layout);
	}
		final Object[][] menuItems = new Object[][]{
		        new Object[]{"Opportunity","General","Deal","Configuration","Property","Solution"}, 
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
		 Add menuItems as root items in the tree. 
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
		menu.addComponent(tree);
		
//        tree.addValueChangeListener(new getProperty().getValue());
        tree.addListener(new Property.ValueChangeListener() {
        	
    		@Override
    		public void valueChange(ValueChangeEvent event) {
    			if(event != null){
    				System.out.println(event.getProperty().getValue());
    			}
    			Object id = event.getProperty().getValue();
    			System.out.println(">>>>>>>>id>>>>>>>>>"+id);
    			if (id != null) {
    				//Department entity = departments.getItem(id).getEntity();
    			//	departmentFilter = entity;
    			}    			
    			//updateFilters();
    		}
    	});
		tree.addItemClickListener(new ItemClickEvent.ItemClickListener() {
		    @Override
		    public void itemClick(ItemClickEvent itemClickEvent) {
		    	
		    	opportunity = itemClickEvent.getItemId().toString();
		
		        System.out.println(">>>>>>>>>>>>>>>id "+itemClickEvent.getItemId().toString());
		        System.out.println("Name >>>>>>>>>>>>>>>>>>>>>>"+itemClickEvent.getItem());
		    }
		});
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+opportunity);
		
		//FOR CONTENT AREA 
		VerticalLayout contentArea=new VerticalLayout();
		contentArea.addStyleName("content");
		contentArea.setSpacing(true);
		contentArea.setMargin(true);
		menuAndContent.addComponent(contentArea);
		menuAndContent.setExpandRatio(menu, (float)1.2);
		menuAndContent.setExpandRatio(contentArea, 6);
		
		//Code For Tabsheet
		TabSheet tabsheet = new TabSheet();
		contentArea.addComponent(tabsheet);
		
		 // Create the first tab
			        VerticalLayout tab1 = new VerticalLayout();
			        tab1.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Mercury.jpg")));
			        tabsheet.addTab(tab1, "Partial App",
			                new ThemeResource("img/planets/Mercury_symbol.png"));
			
			        // Second tab gets its caption from component caption
			        VerticalLayout tab2 = new VerticalLayout();
			        tab2.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
			        tab2.setCaption("Completed App");
			        tabsheet.addTab(tab2).setIcon(
			                new ThemeResource("img/planets/Venus_symbol.png"));
			        //Third Tab
			        VerticalLayout tab3 = new VerticalLayout();
			        tab3.addComponent(new Embedded(null,
			                new ThemeResource("img/planets/Venus.jpg")));
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
			        
		
		//FOR  HEADING
		Label header = new Label(" Information ");
		header.addStyleName("h2");
		contentArea.addComponent(header);
		
		InformationForm informationForm = new InformationForm();
		contentArea.addComponent(informationForm);
		
		Label dealInfo = new Label(" Deal Info ");
		dealInfo.addStyleName("h2");
		contentArea.addComponent(dealInfo);
		
		DealInfoForm dealInfoForm = new DealInfoForm();
		contentArea.addComponent(dealInfoForm);
		
		Label downPayments = new Label(" Down Payments ");
		downPayments.addStyleName("h2");
		contentArea.addComponent(downPayments);
		
		DownPaymentForm downPaymentForm = new DownPaymentForm();
		contentArea.addComponent(downPaymentForm);
		
		
		Label text = new Label("<Strong><p>This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.This is the paragraph content where we can explain / we can have application text/informaion.</p></Strong>",ContentMode.HTML);
		contentArea.addComponent(text);
		
		//FOR FORM
		FormLayout form = new FormLayout();
		form.setSpacing(true);
		contentArea.addComponent(form);
		addCollapse(form);
		//FOR TEXTFIELD
		TextField firstName = new TextField("First Name");
		form.addComponent(firstName);
		
		TextField lastName = new TextField("Last Name");
		form.addComponent(lastName);

		TextField email = new TextField("Email");
		form.addComponent(email);

		Button submit=new Button("Submit");
		form.addComponent(submit);
		

	    -----------------------------------------------------------------
		
		
	   	---------------------------------------------------------------------------------
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
	public TabSheet.SelectedTabChangeListener listenerForTab() {
	    System.out.println("Entering in to tabChangeListener of WizardUtil");
	    // Instance of TabSheet.SelectedTabChangeListener
	    TabSheet.SelectedTabChangeListener listener = new TabSheet.SelectedTabChangeListener() {
	      public void selectedTabChange(SelectedTabChangeEvent event) {
	        TabSheet tabsheet = event.getTabSheet();
	        Tab tab = tabsheet.getTab(tabsheet.getSelectedTab());
	        // Tab content displayed on setting height to the tab sheet
	        if(tab.getCaption().equals("+")) {
	          tabsheet.setHeight("100%");
	        } else {
	          tabsheet.setHeight("10%");
	        }
	      }
	    };
	    System.out.println("Exiting from tabChangeListener of WizardUtil");
//	    _logger.info("Exiting from tabChangeListener of WizardUtil");
	    return listener;
	  }
	
	public void getInformationDetails(){
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
	
}
*/