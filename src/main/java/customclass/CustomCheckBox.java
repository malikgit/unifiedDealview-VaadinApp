package customclass;

import java.util.Locale;

import com.vaadin.data.util.converter.StringToBooleanConverter;
import com.vaadin.server.FontAwesome;

public class CustomCheckBox extends StringToBooleanConverter{
@Override
public String convertToPresentation(Boolean value,
		Class<? extends String> targetType, Locale locale)
		throws com.vaadin.data.util.converter.Converter.ConversionException {
	String color;
	if(value == null || !value){
		color="#ccccff";
	}else{
		color="#6600cc";
	}
//	CIRCLE.getHtml().replace("style=\"","style=\"color:"+color+";");
	return FontAwesome.SQUARE.getHtml().replace("style=\"","style=\"color:"+color+";");
}
}
