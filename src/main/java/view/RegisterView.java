package view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class RegisterView extends VerticalLayout implements View {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterView.class);
	@Override
	public void enter(ViewChangeEvent event) {
		LOGGER.info("Comming RegisterView");
		
	}

}
