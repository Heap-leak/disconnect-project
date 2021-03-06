package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Element mixin for recording dynamic associations between item paths in a master <code>items</code> array and a
 * <code>selected</code> array such that path changes to the master array (at the host) element or elsewhere via
 * data-binding) are correctly propagated to items in the selected array and vice-versa.
 * <p>
 * The <code>items</code> property accepts an array of user data, and via the
 * <code>select(item)</code> and <code>deselect(item)</code> API, updates the <code>selected</code> property
 * which may be bound to other parts of the application, and any changes to sub-fields of <code>selected</code> item(s)
 * will be kept in sync with items in the
 * <code>items</code> array.  When <code>multi</code> is false, <code>selected</code> is a property
 * representing the last selected item.  When <code>multi</code> is true, <code>selected</code> is an array of multiply
 * selected items.
 *
 * @param <T> the type parameter
 */
public interface ArraySelectorMixin<T extends Any> extends ElementMixin {
	/**
	 * An array containing items from which selection will be made.
	 *
	 * @return the items
	 */
	@Nullable
	@JSProperty
	Array<T> getItems();

	/**
	 * An array containing items from which selection will be made.
	 *
	 * @param items the items
	 */
	@JSProperty
	void setItems(T... items);

	/**
	 * Sets items.
	 *
	 * @param items the items
	 */
	@JSProperty
	void setItems(Array<T> items);

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isMulti();

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 *
	 * @param multi the multi
	 */
	@JSProperty
	void setMulti(boolean multi);

	/**
	 * When <code>multi</code> is true, this is an array that contains any selected. When <code>multi</code> is false,
	 * this is the currently selected item, or <code>null</code> if no item is selected.
	 *
	 * @return the selected
	 */
	@JSBody(script = "var result = this.selected; \n" +
			"if ( result && Array.isArray(result)) {\n" +
			"    return result;\n" +
			"} else {\n" +
			"    return result!==null ? [result]:[];\n" +
			"}")
	Array<T> getSelected();

	/**
	 * When <code>multi</code> is true, this is an array that contains any selected. When <code>multi</code> is false,
	 * this is the currently selected item, or <code>null</code> if no item is selected.
	 *
	 * @param selected the selected
	 */
	@JSProperty
	void setSelected(T selected);

	/**
	 * Sets selected.
	 *
	 * @param selected the selected
	 */
	@JSProperty
	void setSelected(T... selected);

	/**
	 * Sets selected.
	 *
	 * @param selected the selected
	 */
	@JSProperty
	void setSelected(Array<T> selected);

	/**
	 * When <code>multi</code> is false, this is the currently selected item, or <code>null</code> if no item is
	 * selected.
	 *
	 * @return the selected item
	 */
	@Nullable
	@JSProperty
	T getSelectedItem();

	/**
	 * FIXME type ?Object When <code>multi</code> is false, this is the currently selected item, or
	 * <code>null</code> if
	 * no item is selected.
	 *
	 * @param selectedItem the selected item
	 */
	@JSProperty
	void setSelectedItem(T selectedItem);

	/**
	 * When <code>true</code>, calling <code>select</code> on an item that is already selected will deselect the item.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isToggle();

	/**
	 * When <code>true</code>, calling <code>select</code> on an item that is already selected will deselect the item.
	 *
	 * @param toggle the toggle
	 */
	@JSProperty
	void setToggle(boolean toggle);

	/**
	 * Clears the selection state.
	 */
	void clearSelection();

	/**
	 * Returns whether the item is currently selected.
	 *
	 * @param item Item from <code>items</code> array to test
	 *
	 * @return Whether the item is selected
	 */
	boolean isSelected(T item);

	/**
	 * Returns whether the item is currently selected.
	 *
	 * @param idx Index from <code>items</code> array to test
	 *
	 * @return Whether the item is selected
	 */
	boolean isIndexSelected(int idx);

	/**
	 * Deselects the given item if it is already selected.
	 *
	 * @param item Item from <code>items</code> array to deselect
	 */
	void deselect(T item);

	/**
	 * Deselects the given index if it is already selected.
	 *
	 * @param idx Index from <code>items</code> array to deselect
	 */
	void deselectIndex(int idx);

	/**
	 * Selects the given item.  When <code>toggle</code> is true, this will automatically deselect the item if already
	 * selected.
	 *
	 * @param item Item from <code>items</code> array to select
	 */
	void select(T item);

	/**
	 * Selects the given index.  When <code>toggle</code> is true, this will automatically deselect the item if already
	 * selected.
	 *
	 * @param idx Index from <code>items</code> array to select
	 */
	void selectIndex(int idx);
}
