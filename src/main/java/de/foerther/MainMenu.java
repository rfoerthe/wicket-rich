package de.foerther;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Page;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.PropertyModel;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Panel {
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public MainMenu(String id) {
        super(id);

        ListView<MenuItem> buttonBar = new ListView<MenuItem>("buttonBar", new PropertyModel<List<? extends MenuItem>>(this, "menuItems")) {
            @Override
            protected void populateItem(ListItem<MenuItem> item) {
                final BookmarkablePageLink<Page> pageLink = new BookmarkablePageLink<Page>("link", item.getModelObject().getPage()) {

                    @Override
                    protected void disableLink(ComponentTag tag) {
                        super.disableLink(tag);
                        tag.setName("strong");
                    }

                };
                pageLink.setAutoEnable(true);
                pageLink.setBeforeDisabledLink("").setAfterDisabledLink("");
                pageLink.add(new Label("label", item.getModelObject().getLabel()));
                item.add(pageLink);
                item.add(new AttributeModifier("class", new AbstractReadOnlyModel<String>() {
                    @Override
                    public String getObject() {
                        return pageLink.linksTo(getPage()) ? "active" : "";
                    }
                }));
            }

        };
        add(buttonBar);
    }


    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
