package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.TextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-text-field&gt;</code> is a Web Component for text field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label=&quot;First Name&quot;&gt;
 * &lt;/vaadin-text-field&gt;
 * </code></pre>
 * <h3>Prefixes and suffixes</h3>
 * These are child elements of a <code>&lt;vaadin-text-field&gt;</code> that are displayed
 * inline with the input, before or after.
 * In order for an element to be considered as a prefix, it must have the slot
 * attribute set to <code>prefix</code> (and similarly for <code>suffix</code>).
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label=&quot;Email address&quot;&gt;
 *   &lt;div slot=&quot;prefix&quot;&gt;Sent to:&lt;/div&gt;
 *   &lt;div slot=&quot;suffix&quot;&gt;@vaadin.com&lt;/div&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-text-field-default-width</code></td><td>Set the default width of the input
 * field</td><td><code>12em</code></td></tr>
 * </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>input-field</code></td><td>The element that wraps prefix, value and suffix</td></tr>
 * <tr><td><code>value</code></td><td>The text value element inside the <code>input-field</code> element</td></tr>
 * <tr><td><code>error-message</code></td><td>The error message element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled text field</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>input-prevented</code></td><td>Temporarily set when invalid input is prevented</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly text field</td><td>:host</td></tr>
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

		module = "@vaadin/vaadin-text-field/theme/lumo/vaadin-text-field.js"
)
public interface TextFieldElement extends HTMLElement, TextFieldMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-text-field";
	}

	/**
	 * Identifies a list of pre-defined options to suggest to the user.
	 * The value must be the id of a <datalist> element in the same document.
	 */
	@Nullable
	@JSProperty
	String getList();

	/**
	 * Identifies a list of pre-defined options to suggest to the user.
	 * The value must be the id of a <datalist> element in the same document.
	 */
	@JSProperty
	void setList(String list);

	/**
	 * A regular expression that the value is checked against.
	 * The pattern must match the entire value, not just some subset.
	 */
	@Nullable
	@JSProperty
	String getPattern();

	/**
	 * A regular expression that the value is checked against.
	 * The pattern must match the entire value, not just some subset.
	 */
	@JSProperty
	void setPattern(String pattern);
}
