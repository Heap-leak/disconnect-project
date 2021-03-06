package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.PolymerElement;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;

/**
 * Base class that provides the core API for Polymer's meta-programming features including template stamping,
 * data-binding, attribute deserialization, and property change observation.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public abstract class AbstractPolymerElement<E extends PolymerElement, T extends AbstractPolymerElement<E, T>>
		extends AbstractComponent<E>
		implements HasElementMixin<E, T> {
	/**
	 * Instantiates a new Abstract polymer element.
	 *
	 * @param tagName the tag name
	 */
	protected AbstractPolymerElement(String tagName) {
		super(tagName);
	}
}
