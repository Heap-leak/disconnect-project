package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vue.client.elements.HasClickListener;
import org.vaadin.disconnect.vue.client.events.VoidEventListener;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VBtn")
public final class Button extends Element<Button> implements HasChildElements<Button, Element<?>>,
        HasTheme<Button>,
        HasColor<Button>,
        HasClickListener<Button> {
    public Button() {
        super(Button.class);
    }

    public Button(String title) {
        this();
        setText(title);
    }

    public Button setEnabled(boolean enabled) {
        data().properties().set("disabled", !enabled);
        return this;
    }

    @Override
    public Button onClick(VoidEventListener listener) {
        data().eventListeners().set("click", listener);
        return this;
    }
}
