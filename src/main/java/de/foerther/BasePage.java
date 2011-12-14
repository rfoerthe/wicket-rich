package de.foerther;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * @author Roland Förther, Senacor Technologies AG
 */
public class BasePage extends WebPage {

    public BasePage() {
    }

	protected BasePage(PageParameters parameters) {
		super(parameters);	//To change body of overridden methods use File | Settings | File Templates.
	}

	@Override
    protected void onInitialize() {
        super.onInitialize();
        MainMenu menu = new MainMenu("menu");
        menu.addMenuItem(new MenuItem("Home", HomePage.class));
        menu.addMenuItem(new MenuItem("Context-Menu", ContextMenuPage.class));
        add(menu);
        add(new Label("title",getTitle()));
    }


    protected IModel<String> getTitle() {
        return null;
    }
}
