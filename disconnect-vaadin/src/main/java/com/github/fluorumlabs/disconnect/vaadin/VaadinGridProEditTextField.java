package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The cell editor text-field element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-text-field>` documentation](https://github
 * .com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html)
 * for `<vaadin-text-field>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinGridProEditTextField extends AbstractComponent<GridProEditTextFieldElement>
        implements HasComponents<GridProEditTextFieldElement, VaadinGridProEditTextField, Component<?>> {
    public VaadinGridProEditTextField() {
        super("vaadin-grid-pro-edit-text-field");
    }
}
