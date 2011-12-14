package de.foerther;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: rfoerthe
 * Date: 14.12.11
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem implements Serializable {
    private String label;
    private Class<? extends Page> page;

    public MenuItem(String label, Class<? extends Page> page) {
        this.label = label;
        this.page = page;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Class<? extends Page> getPage() {
        return page;
    }

    public void setPage(Class<? extends Page> page) {
        this.page = page;
    }
}
