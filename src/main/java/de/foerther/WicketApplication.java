package de.foerther;

import org.apache.wicket.protocol.http.WebApplication;
import org.odlabs.wiquery.core.WiQuerySettings;

/**
 * Application object for your web application.
 */
public class WicketApplication extends WebApplication  {
    /**
     * Constructor
     */
    public WicketApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        getMarkupSettings().setStripWicketTags(true);
        getMarkupSettings().setDefaultMarkupEncoding("utf-8");
        getRequestCycleSettings().setResponseRequestEncoding("utf-8");
    }


	@Override
	protected void validateInit() {
		super.validateInit();
		WiQuerySettings.get().setMinifiedJavaScriptResources(true);
	}
}
