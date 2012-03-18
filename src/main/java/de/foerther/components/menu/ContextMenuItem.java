package de.foerther.components.menu;

import org.apache.wicket.markup.html.link.ILinkListener;
import org.apache.wicket.request.cycle.RequestCycle;

import java.io.Serializable;

public class ContextMenuItem implements Serializable, ILinkListener {
    private String hoverTitle;
    private String label;
    private String action;
    private boolean disabled;
    
    public ContextMenuItem() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getHoverTitle() {
        return hoverTitle;
    }

    public void setHoverTitle(String hoverTitle) {
        this.hoverTitle = hoverTitle;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void onLinkClicked() {
        System.out.println("clicked: "+this.getLabel());
    }
}
