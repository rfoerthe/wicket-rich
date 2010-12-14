package de.foerther;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

/**
 * Homepage
 */
public class HomePage extends BasePage {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that is invoked when page is invoked without a session.
     * @param parameters Page parameters
     */
    public HomePage(final PageParameters parameters) {
        super(parameters);
        add(new Label("message", "If you see this message wicket is properly configured and running"));
    }
}
