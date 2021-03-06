package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.MultiSelectListMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-list-box&gt;</code> is a Web Component for creating menus.
 *
 * <pre><code>  &lt;vaadin-list-box selected=&quot;2&quot;&gt;
 *     &lt;vaadin-item&gt;Item 1&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 2&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 3&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 4&lt;/vaadin-item&gt;
 *   &lt;/vaadin-list-box&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>items</code></td><td>The items container</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-list-box/theme/lumo/vaadin-list-box.js"
)
public interface ListBoxElement extends HTMLElement, MultiSelectListMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-list-box";
	}
}
