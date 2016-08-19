package form;

import java.util.List;

import model.ApplicantAsset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ApplicantAssetTabForm extends CssLayout{
		private static final Logger LOGGER = LoggerFactory.getLogger(ApplicantAssetTabForm.class);
		private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
		
		public ApplicantAssetTabForm(int applicantId) {
			setLiabilitiesForm(applicantId);
		}
		private void setLiabilitiesForm(int applicantId) {
			
			VerticalLayout verticallayut= new VerticalLayout();
			verticallayut.setMargin(true);
			Label header = new Label(" Assets ");
			header.addStyleName("h2");
			verticallayut.addComponent(header);
			ApplicantAssetForm assetForm = new ApplicantAssetForm();
			assetForm.setSizeUndefined();
			assetForm.setStyleName("loppp");
			
			
			List<ApplicantAsset> listOfApplicantAsset=null;
			BeanItemContainer<ApplicantAsset> item = new BeanItemContainer<ApplicantAsset>(ApplicantAsset.class);
			try{
				listOfApplicantAsset=pdaoi.getApplicantAssets(applicantId);
					for(ApplicantAsset applicantAsset:listOfApplicantAsset){
						item.addBean(applicantAsset);
					}
			}catch(Exception e){
				LOGGER.error("Error when retrieving Opportunity details from postgress",e);
			}
			assetForm.setContainerDataSource(item);
			verticallayut.addComponent(assetForm);
			verticallayut.setComponentAlignment(assetForm, Alignment.TOP_LEFT);
			addComponent(verticallayut);
			
		}
}
