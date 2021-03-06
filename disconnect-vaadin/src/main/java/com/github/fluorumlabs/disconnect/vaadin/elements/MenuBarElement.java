package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ButtonsMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InteractionsMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-menu-bar&gt;</code> is a Web Component providing a set of horizontally stacked buttons offering
 * the user quick access to a consistent set of commands. Each button can toggle a submenu with
 * support for additional levels of nested menus.
 * <p>
 * To create the menu bar, first add the component to the page:
 *
 * <pre><code>&lt;vaadin-menu-bar&gt;&lt;/vaadin-menu-bar&gt;
 * </code></pre>
 * And then use <a href="#/elements/vaadin-menu-bar#property-items"><code>items</code></a>
 * property to initialize the structure:
 *
 * <pre><code>document.querySelector('vaadin-menu-bar').items = [{text: 'File'}, {text: 'Edit'}];
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>container</code></td><td>The container wrapping menu bar buttons.</td></tr>
 * <tr><td><code>menu-bar-button</code></td><td>The menu bar button.</td></tr>
 * <tr><td><code>overflow-button</code></td><td>The &quot;overflow&quot; button appearing when menu bar width is not
 * enough to fit all the buttons.</td></tr>
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

		module = "@vaadin/vaadin-menu-bar/theme/lumo/vaadin-menu-bar.js"
)
public interface MenuBarElement extends HTMLElement, ButtonsMixin, InteractionsMixin, ElementMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-menu-bar";
	}

	/**
	 * Defines a hierarchical structure, where root level items represent menu bar buttons,
	 * and <code>children</code> property configures a submenu with items to be opened below
	 * the button on click, Enter, Space, Up and Down arrow keys.
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-js">menubar.items = [
	 *   {
	 *     text: 'File',
	 *     children: [
	 *       {text: 'Open'}
	 *       {text: 'Auto Save', checked: true},
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {
	 *     text: 'Edit',
	 *     children: [
	 *       {text: 'Undo', disabled: true},
	 *       {text: 'Redo'}
	 *     ]
	 *   },
	 *   {text: 'Help'}
	 * ];
	 * </code></pre>
	 */
	@JSProperty
	Array<MenuItem> getItems();

	/**
	 * Defines a hierarchical structure, where root level items represent menu bar buttons,
	 * and <code>children</code> property configures a submenu with items to be opened below
	 * the button on click, Enter, Space, Up and Down arrow keys.
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-js">menubar.items = [
	 *   {
	 *     text: 'File',
	 *     children: [
	 *       {text: 'Open'}
	 *       {text: 'Auto Save', checked: true},
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {
	 *     text: 'Edit',
	 *     children: [
	 *       {text: 'Undo', disabled: true},
	 *       {text: 'Redo'}
	 *     ]
	 *   },
	 *   {text: 'Help'}
	 * ];
	 * </code></pre>
	 */
	@JSProperty
	void setItems(MenuItem... items);

	@JSProperty
	void setItems(Array<MenuItem> items);
}
