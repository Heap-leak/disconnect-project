package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.CrudEditorPosition;
import com.github.fluorumlabs.disconnect.vaadin.dataproviders.GridDataProvider;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.CrudI18n;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud&gt;</code> is a Web Component for
 * <a href="https://en.wikipedia.org/wiki/Create,_read,_update_and_delete">CRUD</a> operations.
 *
 * <h3>Quick Start</h3>
 * Assign an array to the <a href="#/elements/vaadin-crud#property-items"><code>items</code></a> property.
 * <p>
 * A grid and an editor will be automatically generated and configured based on the data structure provided.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-crud items='[{&quot;name&quot;: &quot;John&quot;, &quot;surname&quot;:
 * &quot;Lennon&quot;, &quot;role&quot;: &quot;singer&quot;},
 *                      {&quot;name&quot;: &quot;Ringo&quot;, &quot;surname&quot;: &quot;Starr&quot;, &quot;
 *                      role&quot;: &quot;drums&quot;}]'&gt;&lt;/vaadin-crud&gt;
 * </code></pre>
 * <h3>Data Provider Function</h3>
 * Otherwise, you can provide a <a href="#/elements/vaadin-crud#property-dataProvider"><code>dataProvider</code></a>
 * function.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-crud&gt;&lt;/vaadin-crud&gt;
 * </code></pre>
 * <pre><code class="language-js">const crud = document.querySelector('vaadin-crud');
 * const users = [{'name': 'John', 'surname': 'Lennon', 'role': 'singer'}, ...];
 * crud.dataProvider = function(params, callback) {
 *   const chunk = users.slice(params.page * params.pageSize, params.page * params.pageSize + params.pageSize);
 *   callback(chunk, people.length);
 * };
 * </code></pre>
 * NOTE: The autogenerated editor only supports string types. If you need to handle special cases
 * customizing the editor is discussed below.
 *
 * <h3>Customization</h3>
 * Alternatively you can fully configure the component by using <code>slot</code> names.
 *
 * <table>
 * <thead>
 * <tr><th>Slot name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>grid</code></td><td>To replace the autogenerated grid with a custom one.</td></tr>
 * <tr><td><code>form</code></td><td>To replace the autogenerated form.</td></tr>
 * <tr><td><code>toolbar</code></td><td>To replace the toolbar content. Add an element with the attribure
 * <code>new-button</code> for the new item action.</td></tr>
 * <tr><td><code>new</code></td><td>For customizing the 'new item' button.</td></tr>
 * </tbody>
 * </table>
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-crud items='[{&quot;name&quot;: &quot;John&quot;, &quot;surname&quot;:
 * &quot;Lennon&quot;, &quot;role&quot;: &quot;singer&quot;},
 *                      {&quot;name&quot;: &quot;Ringo&quot;, &quot;surname&quot;: &quot;Starr&quot;, &quot;
 *                      role&quot;: &quot;drums&quot;}]'&gt;
 *
 *  &lt;vaadin-grid slot=&quot;grid&quot;&gt;
 *   &lt;vaadin-crud-edit-column&gt;&lt;/vaadin-crud-edit-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *    &lt;template class=&quot;header&quot;&gt;Name&lt;/template&gt;&lt;template&gt;[[item.name]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *    &lt;template class=&quot;header&quot;&gt;Surname&lt;/template&gt;&lt;template&gt;[[item.surname]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *  &lt;/vaadin-grid&gt;
 *
 *  &lt;vaadin-form-layout slot=&quot;form&quot;&gt;
 *   &lt;vaadin-text-field label=&quot;First&quot; path=&quot;name&quot;&gt;&lt;/vaadin-text-field&gt;
 *   &lt;vaadin-text-field label=&quot;Surname&quot; path=&quot;surname&quot;&gt;&lt;/vaadin-text-field&gt;
 *  &lt;/vaadin-form-layout&gt;
 *
 *  &lt;div slot=&quot;footer&quot;&gt;Total singers: [[size]]&lt;/div&gt;
 *
 *  &lt;button slot=&quot;new&quot;&gt;New singer&lt;/button&gt;
 * &lt;/vaadin-crud&gt;
 * </code></pre>
 * <h3>Helpers</h3>
 * The following elements are used to autoconfigure the grid and the editor
 *
 * <ul>
 * <li><a href="#/elements/vaadin-crud-grid"><code>&lt;vaadin-crud-grid&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-crud-edit-column"><code>&lt;vaadin-crud-edit-column&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-crud-form"><code>&lt;vaadin-crud-form&gt;</code></a></li>
 * </ul>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toolbar</code></td><td>Toolbar container at the bottom. By default it contains the the
 * <code>new</code> button</td></tr>
 * </tbody>
 * </table>
 * The following custom properties are available:
 *
 * <table>
 * <thead>
 * <tr><th>Custom Property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td>--vaadin-crud-editor-max-height</td><td>max height of editor when opened on the bottom</td><td>40%</td></tr>
 * <tr><td>--vaadin-crud-editor-max-width</td><td>max width of editor when opened on the side</td><td>40%</td></tr>
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
		symbols = "CrudElement",
		module = "@vaadin/vaadin-crud/vaadin-crud.js"
)
public interface CrudElement<ITEM extends Any> extends HTMLElement, ElementMixin, ThemableMixin {
	/**
	 * An array containing the items which will be stamped to the column template instances.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * An array containing the items which will be stamped to the column template instances.
	 */
	@JSProperty
	void setItems(@JSByRef ITEM... items);

	@JSProperty
	void setItems(Array<ITEM> items);

	/**
	 * The item being edited in the dialog.
	 */
	@Nullable
	@JSProperty
	ITEM getEditedItem();

	/**
	 * The item being edited in the dialog.
	 */
	@JSProperty
	void setEditedItem(ITEM editedItem);

	/**
	 * Sets how editor will be presented on desktop screen.
	 * <p>
	 * Accepted values are:
	 *
	 * <ul>
	 * <li>`` (default) - form will open as overlay</li>
	 * <li><code>bottom</code> - form will open below the grid</li>
	 * <li><code>aside</code> - form will open on the grid side (<em>right</em>, if lft and <em>left</em> if rtl)</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	CrudEditorPosition getEditorPosition();

	/**
	 * Sets how editor will be presented on desktop screen.
	 * <p>
	 * Accepted values are:
	 *
	 * <ul>
	 * <li>`` (default) - form will open as overlay</li>
	 * <li><code>bottom</code> - form will open below the grid</li>
	 * <li><code>aside</code> - form will open on the grid side (<em>right</em>, if lft and <em>left</em> if rtl)</li>
	 * </ul>
	 */
	@JSProperty
	void setEditorPosition(CrudEditorPosition editorPosition);

	/**
	 * Enables user to click on row to edit it.
	 * Note: When enabled, autogenerated grid won't show the edit column.
	 */
	@JSProperty
	boolean isEditOnClick();

	/**
	 * Enables user to click on row to edit it.
	 * Note: When enabled, autogenerated grid won't show the edit column.
	 */
	@JSProperty
	void setEditOnClick(boolean editOnClick);

	/**
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 * <code>params.pageSize</code> Current page size
	 * <code>params.filters</code> Currently applied filters
	 * <code>params.sortOrders</code> Currently applied sorting orders
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	GridDataProvider<ITEM> getDataProvider();

	/**
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 * <code>params.pageSize</code> Current page size
	 * <code>params.filters</code> Currently applied filters
	 * <code>params.sortOrders</code> Currently applied sorting orders
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items</li>
	 * </ul>
	 */
	@JSProperty
	void setDataProvider(GridDataProvider<ITEM> dataProvider);

	/**
	 * Disable filtering when grid is autofonfigured.
	 */
	@JSProperty
	boolean isNoFilter();

	/**
	 * Disable filtering when grid is autofonfigured.
	 */
	@JSProperty
	void setNoFilter(boolean noFilter);

	/**
	 * Disable sorting when grid is autofonfigured.
	 */
	@JSProperty
	boolean isNoSort();

	/**
	 * Disable sorting when grid is autofonfigured.
	 */
	@JSProperty
	void setNoSort(boolean noSort);

	/**
	 * Remove grid headers when it is autoconfigured.
	 */
	@JSProperty
	boolean isNoHead();

	/**
	 * Remove grid headers when it is autoconfigured.
	 */
	@JSProperty
	void setNoHead(boolean noHead);

	/**
	 * A comma-separated list of fields to include in the generated grid and the generated editor.
	 * <p>
	 * It can be used to explicitly define the field order.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud#property-exclude"><code>exclude</code></a> is ignored.
	 * <p>
	 * Default is undefined meaning that all properties in the object should be mapped to fields.
	 */
	@Nullable
	@JSProperty
	String getInclude();

	/**
	 * A comma-separated list of fields to include in the generated grid and the generated editor.
	 * <p>
	 * It can be used to explicitly define the field order.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud#property-exclude"><code>exclude</code></a> is ignored.
	 * <p>
	 * Default is undefined meaning that all properties in the object should be mapped to fields.
	 */
	@JSProperty
	void setInclude(String include);

	/**
	 * A comma-separated list of fields to be excluded from the generated grid and the generated editor.
	 * <p>
	 * When <a href="#/elements/vaadin-crud#property-include"><code>include</code></a>
	 * is defined, this parameter is ignored.
	 * <p>
	 * Default is to exclude all private fields (those properties starting with underscore)
	 */
	@Nullable
	@JSProperty
	String getExclude();

	/**
	 * A comma-separated list of fields to be excluded from the generated grid and the generated editor.
	 * <p>
	 * When <a href="#/elements/vaadin-crud#property-include"><code>include</code></a>
	 * is defined, this parameter is ignored.
	 * <p>
	 * Default is to exclude all private fields (those properties starting with underscore)
	 */
	@JSProperty
	void setExclude(String exclude);

	/**
	 * Reflects the opened status of the editor.
	 */
	@JSProperty
	boolean isEditorOpened();

	/**
	 * Reflects the opened status of the editor.
	 */
	@JSProperty
	void setEditorOpened(boolean editorOpened);

	/**
	 * Number of items in the data set which is reported by the grid.
	 * Typically it reflects the number of filtered items displayed in the grid.
	 */
	@JSProperty
	int getSize();

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>    {
	 *       newItem: 'New item',
	 *       editItem: 'Edit item',
	 *       saveItem: 'Save',
	 *       cancel: 'Cancel',
	 *       deleteItem: 'Delete...',
	 *       editLabel: 'Edit',
	 *       confirm: {
	 *         delete: {
	 *           title: 'Confirm delete',
	 *           content: 'Are you sure you want to delete the selected item? This action cannot be undone.',
	 *           button: {
	 *             confirm: 'Delete',
	 *             dismiss: 'Cancel'
	 *           }
	 *         },
	 *         cancel: {
	 *           title: 'Unsaved changes',
	 *           content: 'There are unsaved modifications to the item.',
	 *           button: {
	 *             confirm: 'Discard',
	 *             dismiss: 'Continue editing'
	 *           }
	 *         }
	 *       }
	 *     }
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	CrudI18n getI18n();

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>    {
	 *       newItem: 'New item',
	 *       editItem: 'Edit item',
	 *       saveItem: 'Save',
	 *       cancel: 'Cancel',
	 *       deleteItem: 'Delete...',
	 *       editLabel: 'Edit',
	 *       confirm: {
	 *         delete: {
	 *           title: 'Confirm delete',
	 *           content: 'Are you sure you want to delete the selected item? This action cannot be undone.',
	 *           button: {
	 *             confirm: 'Delete',
	 *             dismiss: 'Cancel'
	 *           }
	 *         },
	 *         cancel: {
	 *           title: 'Unsaved changes',
	 *           content: 'There are unsaved modifications to the item.',
	 *           button: {
	 *             confirm: 'Discard',
	 *             dismiss: 'Continue editing'
	 *           }
	 *         }
	 *       }
	 *     }
	 * </code></pre>
	 */
	@JSProperty
	void setI18n(CrudI18n i18n);
}
