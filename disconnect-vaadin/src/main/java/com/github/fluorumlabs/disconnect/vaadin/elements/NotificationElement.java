package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.NotificationPosition;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.NotificationRenderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-notification&gt;</code> is a Web Component providing accessible and customizable notifications
 * (toasts).
 * The content of the notification can be populated in two ways: imperatively by using renderer callback function
 * and declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the notification uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides <code>root</code>, <code>notification</code> arguments.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>notification</code>. Before generating new content,
 * users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-notification id=&quot;notification&quot;&gt;&lt;/vaadin-notification&gt;
 * </code></pre>
 * <pre><code class="language-js">const notification = document.querySelector('#notification');
 * notification.renderer = function(root) {
 *   root.textContent = &quot;Your work has been saved&quot;;
 * };
 * </code></pre>
 * Renderer is called on the opening of the notification.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template.
 * Notification finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code>&lt;vaadin-notification&gt;
 *   &lt;template&gt;
 *     Your work has been saved
 *   &lt;/template&gt;
 * &lt;/vaadin-notification&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * <code>&lt;vaadin-notification&gt;</code> uses <code>&lt;vaadin-notification-card&gt;</code> internal
 * themable component as the actual visible notification cards. See
 * the stylable parts the
 * <a href="https://vaadin.com/components/vaadin-notification/html-api/elements/Vaadin.NotificationCard"><code>&lt;vaadin-notification-card&gt;</code> API</a>.
 * <p>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-notification&gt;</code> is
 * propagated to the internal <code>&lt;vaadin-notification-card&gt;</code>.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-notification/theme/lumo/vaadin-notification.js"
)
public interface NotificationElement extends HTMLElement, ThemePropertyMixin {
	static String TAGNAME() {
		return "vaadin-notification";
	}

	/**
	 * The duration in milliseconds to show the notification.
	 * Set to <code>0</code> or a negative number to disable the notification auto-closing.
	 */
	@JSProperty
	double getDuration();

	/**
	 * The duration in milliseconds to show the notification.
	 * Set to <code>0</code> or a negative number to disable the notification auto-closing.
	 */
	@JSProperty
	void setDuration(double duration);

	/**
	 * True if the notification is currently displayed.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the notification is currently displayed.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Alignment of the notification in the viewport
	 * Valid values are <code>top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end
	 * |bottom-stretch</code>
	 */
	@Nullable
	@JSProperty
	NotificationPosition getPosition();

	/**
	 * Alignment of the notification in the viewport
	 * Valid values are <code>top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end
	 * |bottom-stretch</code>
	 */
	@JSProperty
	void setPosition(NotificationPosition position);

	/**
	 * Custom function for rendering the content of the notification.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-notification-card&gt;</code> DOM element. Append
	 * your content to it.</li>
	 * <li><code>notification</code> The reference to the <code>&lt;vaadin-notification&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	NotificationRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the notification.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-notification-card&gt;</code> DOM element. Append
	 * your content to it.</li>
	 * <li><code>notification</code> The reference to the <code>&lt;vaadin-notification&gt;</code> element.</li>
	 * </ul>
	 */
	@JSProperty
	void setRenderer(NotificationRenderer renderer);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();

	/**
	 * Opens the notification.
	 */
	void open();

	/**
	 * Closes the notification.
	 */
	void close();
}
