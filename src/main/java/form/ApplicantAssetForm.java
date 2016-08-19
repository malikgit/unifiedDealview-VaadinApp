package form;

import com.vaadin.ui.Grid;

public class ApplicantAssetForm extends Grid {

	public ApplicantAssetForm() {
		setVisible(true);
		setSizeFull();
		setColumns("asset_type","name", "value");
	}
}
