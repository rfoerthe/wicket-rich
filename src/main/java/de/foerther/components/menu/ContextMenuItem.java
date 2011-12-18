package de.foerther.components.menu;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: rfoerthe
 * Date: 17.12.11
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public class ContextMenuItem implements Serializable {
    private String label;
    private String action;
    
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
}
