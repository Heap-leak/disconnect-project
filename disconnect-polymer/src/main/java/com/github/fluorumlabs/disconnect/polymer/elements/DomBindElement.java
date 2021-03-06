package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.GestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.OptionalMutableData;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import js.web.dom.HTMLElement;

/**
 * Custom element to allow using Polymer's template features (data binding, declarative event listeners, etc.) in the
 * main document without defining a new custom element.
 *
 * <code>&lt;template&gt;</code> tags utilizing bindings may be wrapped with the <code>&lt;dom-bind&gt;</code>
 * element, which will immediately stamp the wrapped template into the main document and bind elements to the
 * <code>dom-bind</code> element itself as the binding scope.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "DomBind",
		module = "@polymer/polymer/lib/elements/dom-bind.js"
)
public interface DomBindElement extends HTMLElement, PropertyEffects, OptionalMutableData, GestureEventListeners {
	/**
	 * Tagname string.
	 *
	 * @return the string
	 */
	static String TAGNAME() {
		return "dom-bind";
	}

	/**
	 * Forces the element to render its content. This is typically only necessary to call if HTMLImports with the async
	 * attribute are used.
	 */
	void render();
}
