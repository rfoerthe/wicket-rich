package de.foerther;

import de.foerther.components.menu.ContextMenuBehavior;
import de.foerther.components.menu.ContextMenuItem;
import org.apache.wicket.markup.html.form.Button;

/**
 * Created by IntelliJ IDEA.
 * User: rfoerthe
 * Date: 14.12.11
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class ContextMenuPage extends BasePage {
    public ContextMenuPage() {
        ContextMenuItem menuItem1 = new ContextMenuItem();
        menuItem1.setLabel("Option 1");
        menuItem1.setAction("alert('Option 1');");
        ContextMenuItem menuItem2 = new ContextMenuItem();
        menuItem2.setLabel("Option 2");
        menuItem2.setAction("alert('Option 2');");
        ContextMenuItem menuItem3 = new ContextMenuItem();
        menuItem3.setLabel("Option 3");
        menuItem3.setAction("alert('Option 3');");

        ContextMenuBehavior menuBehavior = new ContextMenuBehavior();
        menuBehavior.addMenuItem(menuItem1);
        menuBehavior.addSeperator();
        menuBehavior.addMenuItem(menuItem2);
        menuBehavior.addSeperator();
        menuBehavior.addMenuItem(menuItem3);

        menuBehavior.setThemes(ContextMenuBehavior.Theme.VISTA);
        menuBehavior.setOpenOnLeftClick(true);
        Button button = new Button("menuButton");
        button.add(menuBehavior);
        add(button);
    }
}
