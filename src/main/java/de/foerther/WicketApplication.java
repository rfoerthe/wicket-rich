package de.foerther;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.wicket.Application;
import org.apache.wicket.IApplicationListener;
import org.apache.wicket.protocol.http.WebApplication;
import org.odlabs.wiquery.core.WiQuerySettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application object for your web application.
 */
public class WicketApplication extends WebApplication  {
    private static final Logger LOG = LoggerFactory.getLogger(WicketApplication.class);
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
        
        getApplicationListeners().add(new MyIApplicationListener());
    }

    private static class MyIApplicationListener implements IApplicationListener {
        public void onAfterInitialized(Application application) {

            //WiQuerySettings.get().setMinifiedJavaScriptResources(true);
            //WiQuerySettings.get().setMinifiedStyleSheetResources(true);
            LOG.debug(ReflectionToStringBuilder.reflectionToString(WiQuerySettings.get(), ToStringStyle.MULTI_LINE_STYLE));
        }

        public void onBeforeDestroyed(Application application) {
        }
    }
}
