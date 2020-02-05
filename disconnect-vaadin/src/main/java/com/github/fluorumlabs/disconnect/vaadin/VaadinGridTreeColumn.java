package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridTreeColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-tree-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default template and functionality for toggling tree/hierarchical items.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-tree-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-tree-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
public class VaadinGridTreeColumn<ITEM extends Any> extends AbstractComponent<GridTreeColumnElement<ITEM>>
		implements HasComponents<GridTreeColumnElement<ITEM>, VaadinGridTreeColumn<ITEM>, Component<?>> {
	public VaadinGridTreeColumn() {
		super("vaadin-grid-tree-column");
	}

	/**
	 * JS Path of the property in the item used as text content for the tree toggle.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * JS Path of the property in the item used as text content for the tree toggle.
	 */
	public VaadinGridTreeColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	@Nullable
	public String itemHasChildrenPath() {
		return getNode().getItemHasChildrenPath();
	}

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	public VaadinGridTreeColumn<ITEM> itemHasChildrenPath(String itemHasChildrenPath) {
		getNode().setItemHasChildrenPath(itemHasChildrenPath);
		return this;
	}
}
