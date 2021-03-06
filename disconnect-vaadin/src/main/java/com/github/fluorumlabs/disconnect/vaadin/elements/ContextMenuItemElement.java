package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * The vaadin-context-menu-item element.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-context-menu/theme/lumo/vaadin-contextmenu-items-mixin.js"
)
public interface ContextMenuItemElement extends ItemElement {
	static String TAGNAME() {
		return "vaadin-context-menu-item";
	}
}
