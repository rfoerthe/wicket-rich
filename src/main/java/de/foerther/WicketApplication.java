package de.foerther;

import org.apache.wicket.protocol.http.WebApplication;
import org.odlabs.wiquery.core.commons.IWiQuerySettings;
import org.odlabs.wiquery.core.commons.WiQuerySettings;

/**
 * Application object for your web application.
 */
public class WicketApplication extends WebApplication implements IWiQuerySettings {
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


    public WiQuerySettings getWiQuerySettings() {
        WiQuerySettings settings = new WiQuerySettings();
        return settings;
    }
}
