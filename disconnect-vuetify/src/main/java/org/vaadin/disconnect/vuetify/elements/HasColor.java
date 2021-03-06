package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.client.elements.ElementBase;
import org.vaadin.disconnect.vuetify.theme.Color;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasColor<T extends HasColor<T>> extends ElementBase {
    default T setColor(Color color) {
        data().properties().set("color", color);
        return (T) this;
    }
}
