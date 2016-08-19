package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class ApplicantsForm extends GridLayout {
	private Label firstNameHeading = new Label("First Name");
	private Label lastNameHeading = new Label("Last Name");
	private Label includeInDealHeading = new Label("Include In Deal");
	private Label emailHeading = new Label("Email");
	private Label cellHeading = new Label("Cell");

	private TextField appFirstName = new TextField();
	private TextField appLastName = new TextField();
	private TextField appIncludeIndDeal = new TextField();
	private TextField appEmail = new TextField();
	private TextField appCell = new TextField();

	private TextField coAppFirstName = new TextField();
	private TextField coAppLastName = new TextField();
	private TextField coAppIncludeIndDeal = new TextField();
	private TextField coAppEmail = new TextField();
	private TextField coAppCell = new TextField();

	public ApplicantsForm() {
		super(5, 3);
		// Grid Heading
		addComponent(firstNameHeading);
		addComponent(lastNameHeading);
		addComponent(includeInDealHeading);
		addComponent(emailHeading);
		addComponent(cellHeading);

		// 1st Record/row
		addComponent(appFirstName);
		addComponent(appLastName);
		addComponent(appIncludeIndDeal);
		addComponent(appEmail);
		addComponent(appCell);

		// 2nd Record
		addComponent(coAppFirstName);
		addComponent(coAppLastName);
		addComponent(coAppIncludeIndDeal);
		addComponent(coAppEmail);
		addComponent(coAppCell);

	}
}
