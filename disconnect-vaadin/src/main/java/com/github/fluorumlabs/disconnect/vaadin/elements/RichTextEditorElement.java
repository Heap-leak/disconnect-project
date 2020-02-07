package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.RichTextEditorI18n;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;
import javax.annotation.Untainted;

/**
 * <code>&lt;vaadin-rich-text-editor&gt;</code> is a Web Component for rich text editing.
 * It provides a set of toolbar controls to apply formatting on the content,
 * which is stored and can be accessed as HTML5 or JSON string.
 *
 * <pre><code>&lt;vaadin-rich-text-editor&gt;&lt;/vaadin-rich-text-editor&gt;
 * </code></pre>
 * Vaadin Rich Text Editor focuses on the structure, not the styling of content.
 * Therefore, the semantic HTML5 tags such as <h1>, <strong> and <ul> are used,
 * and CSS usage is limited to most common cases, like horizontal text alignment.
 *
 * <h3>Styling</h3>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled text editor</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly text editor</td><td>:host</td></tr>
 * <tr><td><code>on</code></td><td>Set to a toolbar button applied to the selected text</td><td>toolbar-button</td></tr>
 * </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>content</code></td><td>The content wrapper</td></tr>
 * <tr><td><code>toolbar</code></td><td>The toolbar wrapper</td></tr>
 * <tr><td><code>toolbar-group</code></td><td>The group for toolbar controls</td></tr>
 * <tr><td><code>toolbar-group-history</code></td><td>The group for histroy controls</td></tr>
 * <tr><td><code>toolbar-group-emphasis</code></td><td>The group for emphasis controls</td></tr>
 * <tr><td><code>toolbar-group-heading</code></td><td>The group for heading controls</td></tr>
 * <tr><td><code>toolbar-group-glyph-transformation</code></td><td>The group for glyph transformation controls</td></tr>
 * <tr><td><code>toolbar-group-group-list</code></td><td>The group for group list controls</td></tr>
 * <tr><td><code>toolbar-group-alignment</code></td><td>The group for alignment controls</td></tr>
 * <tr><td><code>toolbar-group-rich-text</code></td><td>The group for rich text controls</td></tr>
 * <tr><td><code>toolbar-group-block</code></td><td>The group for preformatted block controls</td></tr>
 * <tr><td><code>toolbar-group-format</code></td><td>The group for format controls</td></tr>
 * <tr><td><code>toolbar-button</code></td><td>The toolbar button (applies to all buttons)</td></tr>
 * <tr><td><code>toolbar-button-undo</code></td><td>The &quot;undo&quot; button</td></tr>
 * <tr><td><code>toolbar-button-redo</code></td><td>The &quot;redo&quot; button</td></tr>
 * <tr><td><code>toolbar-button-bold</code></td><td>The &quot;bold&quot; button</td></tr>
 * <tr><td><code>toolbar-button-italic</code></td><td>The &quot;italic&quot; button</td></tr>
 * <tr><td><code>toolbar-button-underline</code></td><td>The &quot;underline&quot; button</td></tr>
 * <tr><td><code>toolbar-button-strike</code></td><td>The &quot;strike-through&quot; button</td></tr>
 * <tr><td><code>toolbar-button-h1</code></td><td>The &quot;header 1&quot; button</td></tr>
 * <tr><td><code>toolbar-button-h2</code></td><td>The &quot;header 2&quot; button</td></tr>
 * <tr><td><code>toolbar-button-h3</code></td><td>The &quot;header 3&quot; button</td></tr>
 * <tr><td><code>toolbar-button-subscript</code></td><td>The &quot;subscript&quot; button</td></tr>
 * <tr><td><code>toolbar-button-superscript</code></td><td>The &quot;superscript&quot; button</td></tr>
 * <tr><td><code>toolbar-button-list-ordered</code></td><td>The &quot;ordered list&quot; button</td></tr>
 * <tr><td><code>toolbar-button-list-bullet</code></td><td>The &quot;bullet list&quot; button</td></tr>
 * <tr><td><code>toolbar-button-align-left</code></td><td>The &quot;left align&quot; button</td></tr>
 * <tr><td><code>toolbar-button-align-center</code></td><td>The &quot;center align&quot; button</td></tr>
 * <tr><td><code>toolbar-button-align-right</code></td><td>The &quot;right align&quot; button</td></tr>
 * <tr><td><code>toolbar-button-image</code></td><td>The &quot;image&quot; button</td></tr>
 * <tr><td><code>toolbar-button-link</code></td><td>The &quot;link&quot; button</td></tr>
 * <tr><td><code>toolbar-button-blockquote</code></td><td>The &quot;blockquote&quot; button</td></tr>
 * <tr><td><code>toolbar-button-code-block</code></td><td>The &quot;code block&quot; button</td></tr>
 * <tr><td><code>toolbar-button-clean</code></td><td>The &quot;clean formatting&quot; button</td></tr>
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

		module = "@vaadin/vaadin-rich-text-editor/theme/lumo/vaadin-rich-text-editor.js"
)
public interface RichTextEditorElement extends HTMLElement, ElementMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-rich-text-editor";
	}

	/**
	 * Value is a list of the operations which describe change to the document.
	 * Each of those operations describe the change at the current index.
	 * They can be an <code>insert</code>, <code>delete</code> or <code>retain</code>. The format is as follows:
	 *
	 * <pre><code class="language-js"> [
	 *    { insert: 'Hello World' },
	 *    { insert: '!', attributes: { bold: true }}
	 *  ]
	 * </code></pre>
	 * See also <a href="https://github.com/quilljs/delta">https://github.com/quilljs/delta</a>
	 * for detailed documentation.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * Value is a list of the operations which describe change to the document.
	 * Each of those operations describe the change at the current index.
	 * They can be an <code>insert</code>, <code>delete</code> or <code>retain</code>. The format is as follows:
	 *
	 * <pre><code class="language-js"> [
	 *    { insert: 'Hello World' },
	 *    { insert: '!', attributes: { bold: true }}
	 *  ]
	 * </code></pre>
	 * See also <a href="https://github.com/quilljs/delta">https://github.com/quilljs/delta</a>
	 * for detailed documentation.
	 */
	@JSProperty
	void setValue(String value);

	/**
	 * HTML representation of the rich text editor content.
	 */
	@Nullable
	@JSProperty
	String getHtmlValue();

	/**
	 * When true, the user can not modify, nor copy the editor content.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * When true, the user can not modify, nor copy the editor content.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * When true, the user can not modify the editor content, but can copy it.
	 */
	@JSProperty
	boolean isReadonly();

	/**
	 * When true, the user can not modify the editor content, but can copy it.
	 */
	@JSProperty
	void setReadonly(boolean readonly);

	/**
	 * An object used to localize this component. The properties are used
	 * e.g. as the tooltips for the editor toolbar buttons.
	 */
	@Nullable
	@JSProperty
	RichTextEditorI18n getI18n();

	/**
	 * An object used to localize this component. The properties are used
	 * e.g. as the tooltips for the editor toolbar buttons.
	 */
	@JSProperty
	void setI18n(RichTextEditorI18n i18n);

	/**
	 * Sets content represented by HTML snippet into the editor.
	 * The snippet is interpreted by
	 * <a href="https://quilljs.com/docs/modules/clipboard/#matchers">Quill's Clipboard matchers</a>,
	 * which may not produce the exactly input HTML.
	 *
	 * <strong>NOTE:</strong> Improper handling of HTML can lead to cross site scripting (XSS) and failure to sanitize
	 * properly is both notoriously error-prone and a leading cause of web vulnerabilities.
	 * This method is aptly named to ensure the developer has taken the necessary precautions.
	 */
	void dangerouslySetHtmlValue(@Untainted String htmlValue);
}
