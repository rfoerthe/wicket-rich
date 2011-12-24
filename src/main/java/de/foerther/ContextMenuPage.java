package de.foerther;

import de.foerther.components.menu.ContextMenuBehavior;
import de.foerther.components.menu.ContextMenuItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.Button;

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

        ContextMenuBehavior menuBehavior1 = new ContextMenuBehavior();
        menuBehavior1.addMenuItem(menuItem1);
        menuBehavior1.addMenuItem(menuItem2);

        WebMarkupContainer divContainer = new WebMarkupContainer("divmenu");
        divContainer.add(menuBehavior1);
        add(divContainer);

        ContextMenuBehavior menuBehavior2 = new ContextMenuBehavior();
        menuBehavior2.addMenuItem(menuItem1);
        menuBehavior2.addSeperator();
        menuBehavior2.addMenuItem(menuItem2);
        menuBehavior2.addSeperator();
        menuBehavior2.addMenuItem(menuItem3);

        menuBehavior2.setThemes(ContextMenuBehavior.Theme.VISTA);
        menuBehavior2.setOpenOnLeftClick(true);


        Button button = new Button("menuButton");
        button.add(menuBehavior2);
        add(button);
    }


}
