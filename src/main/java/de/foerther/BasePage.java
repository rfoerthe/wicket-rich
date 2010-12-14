package de.foerther;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;

/**
 * @author Roland Förther, Senacor Technologies AG
 */
public class BasePage extends WebPage {

    public BasePage() {
    }

    public BasePage(PageParameters parameters) {
        super(parameters);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        add(new Label("title",getTitle()));

    }


    protected IModel<String> getTitle() {
        return null;
    }
}
