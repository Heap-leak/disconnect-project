package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;
import js.web.dom.Node;


public interface HasSlottedComponents<E extends Element, T extends HasSlottedComponents<E, T, C>, C extends Component<? extends Element>> extends HasComponents<E,T,C> {
    default T addSlotted(String slot, C component) {
        component.getRenderedNode().<Element>cast().setSlot(slot);
        return add(component);
    }

    default T addSlotted(String slot,C... components) {
        for (C component : components) {
            addSlotted(slot, component);
        }
        return (T) this;
    }

    default T insertSlotted(String slot, C... components) {
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return addSlotted(slot, components);
        }

        for (C component : components) {
            component.getRenderedNode().<Element>cast().setSlot(slot);
            getNode().insertBefore(component.getRenderedNode(), firstChild);
        }
        return (T) this;
    }

    default T insertSlotted(String slot, C component) {
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return addSlotted(slot, component);
        }

        component.getRenderedNode().<Element>cast().setSlot(slot);
        getNode().insertBefore(component.getRenderedNode(), firstChild);
        return (T) this;
    }

    default T replaceSlotted(String slot, C component) {
        return removeAllSlotted(slot).addSlotted(slot, component);
    }

    default T replaceSlotted(String slot, C... components) {
        return removeAllSlotted(slot).addSlotted(slot, components);
    }

    default T removeAllSlotted(String slot) {
        while (true) {
            E element = getNode();
            if (element.getFirstElementChild() == null) break;
            if (element.getFirstElementChild().getSlot().equals(slot))
                element.removeChild(element.getFirstElementChild());
        }
        return (T) this;
    }
}
