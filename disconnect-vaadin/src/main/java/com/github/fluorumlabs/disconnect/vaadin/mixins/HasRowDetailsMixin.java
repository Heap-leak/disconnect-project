package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.RowDetailsMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.RowDetailsRenderer;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

public interface HasRowDetailsMixin<ITEM extends Any, E extends RowDetailsMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * An array containing references to items with open row details.
	 */
	@Nullable
	default Array<ITEM> detailsOpenedItems() {
		return getNode().getDetailsOpenedItems();
	}

	/**
	 * An array containing references to items with open row details.
	 */
	default T detailsOpenedItems(ITEM... detailsOpenedItems) {
		getNode().setDetailsOpenedItems(detailsOpenedItems);
		return (T) this;
	}

	default T detailsOpenedItems(Array<ITEM> detailsOpenedItems) {
		getNode().setDetailsOpenedItems(detailsOpenedItems);
		return (T) this;
	}

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
	 * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@Nullable
	default RowDetailsRenderer<ITEM> rowDetailsRenderer() {
		return getNode().getRowDetailsRenderer();
	}

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
	 * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	default T rowDetailsRenderer(RowDetailsRenderer<ITEM> rowDetailsRenderer) {
		getNode().setRowDetailsRenderer(rowDetailsRenderer);
		return (T) this;
	}

	/**
	 * FIXME param item: <unspecified>Open the details row of a given item.
	 */
	default void openItemDetails(ITEM item) {
		getNode().openItemDetails(item);
	}

	/**
	 * Close the details row of a given item.
	 */
	default void closeItemDetails(ITEM item) {
		getNode().closeItemDetails(item);
	}
}
