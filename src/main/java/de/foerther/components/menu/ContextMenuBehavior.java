package de.foerther.components.menu;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.commons.lang.StringUtils;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.odlabs.wiquery.core.behavior.WiQueryAbstractBehavior;
import org.odlabs.wiquery.core.javascript.JsQuery;
import org.odlabs.wiquery.core.javascript.JsStatement;

/**
 * User: Roland Foerther
 * Date: 15.12.11 Time: 23:46
 */
public class ContextMenuBehavior extends WiQueryAbstractBehavior {
    public static final String CONTEXT_MENU_SEPARATOR = "$.contextMenu.separator";

    private JSONArray menu = new JSONArray();
    private JSONObject options = new JSONObject();

    public static enum Theme {DEFAULT, XP, VISTA, OSX, human, gloss}


    @Override
    public JsStatement statement() {
        return new JsQuery(getComponent()).$().chain("contextMenu", StringUtils.replace(menu.toString(), "\"" + CONTEXT_MENU_SEPARATOR + "\"", CONTEXT_MENU_SEPARATOR), options.toString());
    }

    @Override
    public void renderHead(Component component, IHeaderResponse response) {
        response.renderJavaScriptReference(ContextMenuJavaScriptResourceReference.get());
        response.renderCSSReference(new PackageResourceReference(getClass(), "jquery.contextmenu.css"));
    }

    public ContextMenuBehavior setThemes(Theme... themes) {
        StringBuffer buffer = new StringBuffer();
        for (Theme theme : themes) {
            buffer.append(theme.name().toLowerCase()).append(',');
        }
        buffer.deleteCharAt(buffer.lastIndexOf(","));
        String themeList = buffer.toString();
        options.put("theme", themeList);
        return this;
    }

    public ContextMenuBehavior setOpenOnLeftClick(boolean openOnLeftClick) {
        String clickEvent = openOnLeftClick ? "click" : "contextmenu";
        options.put("clickEvent", clickEvent);
        return this;
    }

    public ContextMenuBehavior addMenuItem(ContextMenuItem contextMenuItem) {
        JSONObject jsonContextMenuItem = new JSONObject();
        JSONObject jsonContextMenuItemValue = new JSONObject();
        jsonContextMenuItemValue.put("onclick", "function(menuItem,menu) {" + contextMenuItem.getAction() + "}");
        jsonContextMenuItem.put(contextMenuItem.getLabel(), jsonContextMenuItemValue);
        menu.add(jsonContextMenuItem);

        return this;
    }

    public ContextMenuBehavior addSeperator() {
        JsonConfig config = new JsonConfig();
        config.setAllowNonStringKeys(true);
        config.setJavascriptCompliant(true);
        config.setArrayMode(JsonConfig.MODE_OBJECT_ARRAY);
        //config.set
        menu.add(CONTEXT_MENU_SEPARATOR, config);
        return this;
    }


}
