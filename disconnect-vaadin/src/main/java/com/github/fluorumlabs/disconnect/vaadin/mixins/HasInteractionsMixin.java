package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InteractionsMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

public interface HasInteractionsMixin<E extends InteractionsMixin, T extends Component<E>> extends Component<E> {
	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	default boolean openOnHover() {
		return getNode().isOpenOnHover();
	}

	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	default T openOnHover(boolean openOnHover) {
		getNode().setOpenOnHover(openOnHover);
		return (T) this;
	}
}
