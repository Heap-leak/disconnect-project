package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.OptionalMutableData;
import js.lang.Any;
import js.util.collections.Array;
import js.util.function.IntKeyPredicate;
import js.util.function.JsComparator;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The <code>&lt;dom-repeat&gt;</code> element will automatically stamp and binds one instance of template content to
 * each object in a user-provided array.
 * <code>dom-repeat</code> accepts an <code>items</code> property, and one instance of the template
 * is stamped for each item into the DOM at the location of the <code>dom-repeat</code> element.  The <code>item</code>
 * property will be set on each instance's binding scope, thus templates should bind to sub-properties of
 * <code>item</code>.
 * <p>
 * Example:
 *
 * <pre><code class="language-html">&lt;dom-module id=&quot;employee-list&quot;&gt;
 *
 *   &lt;template&gt;
 *
 *     &lt;div&gt; Employee list: &lt;/div&gt;
 *     &lt;dom-repeat items=&quot;{{employees}}&quot;&gt;
 *       &lt;template&gt;
 *         &lt;div&gt;First name: &lt;span&gt;{{item.first}}&lt;/span&gt;&lt;/div&gt;
 *         &lt;div&gt;Last name: &lt;span&gt;{{item.last}}&lt;/span&gt;&lt;/div&gt;
 *       &lt;/template&gt;
 *     &lt;/dom-repeat&gt;
 *
 *   &lt;/template&gt;
 *
 * &lt;/dom-module&gt;
 * </code></pre>
 * With the following custom element definition:
 *
 * <pre><code class="language-js">class EmployeeList extends PolymerElement {
 *   static get is() { return 'employee-list'; }
 *   static get properties() {
 *     return {
 *       employees: {
 *         value() {
 *           return [
 *             {first: 'Bob', last: 'Smith'},
 *             {first: 'Sally', last: 'Johnson'},
 *             ...
 *           ];
 *         }
 *       }
 *     };
 *   }
 * }
 * </code></pre>
 * Notifications for changes to items sub-properties will be forwarded to template instances, which will update via the
 * normal structured data notification system.
 * <p>
 * Mutations to the <code>items</code> array itself should be made using the Array mutation API's on the PropertyEffects
 * mixin (<code>push</code>, <code>pop</code>, <code>splice</code>,
 * <code>shift</code>, <code>unshift</code>), and template instances will be kept in sync with the
 * data in the array.
 * <p>
 * Events caught by event handlers within the <code>dom-repeat</code> template will be decorated with a
 * <code>model</code> property, which represents the binding scope for each template instance.  The model should be
 * used
 * to manipulate data on the instance, for example <code>event.model.set('item.checked', true);</code>.
 * <p>
 * Alternatively, the model for a template instance for an element stamped by a <code>dom-repeat</code> can be obtained
 * using the <code>modelForElement</code> API on the
 * <code>dom-repeat</code> that stamped it, for example
 * <code>this.$.domRepeat.modelForElement(event.target).set('item.checked', true);</code>.
 * This may be useful for manipulating instance data of event targets obtained by event handlers on parents of the
 * <code>dom-repeat</code> (event delegation).
 * <p>
 * A view-specific filter/sort may be applied to each <code>dom-repeat</code> by supplying a
 * <code>filter</code> and/or <code>sort</code> property.  This may be a string that names a function on
 * the host, or a function may be assigned to the property directly.  The functions should implemented following the
 * standard <code>Array</code> filter/sort API.
 * <p>
 * In order to re-run the filter or sort functions based on changes to sub-fields of <code>items</code>, the
 * <code>observe</code> property may be set as a space-separated list of
 * <code>item</code> sub-fields that should cause a re-filter/sort when modified.  If
 * the filter or sort function depends on properties not contained in <code>items</code>, the user should observe
 * changes to those properties and call <code>render</code> to update the view based on the dependency change.
 * <p>
 * For example, for an <code>dom-repeat</code> with a filter of the following:
 *
 * <pre><code class="language-js">isEngineer(item) {
 *   return item.type == 'engineer' || item.manager.type == 'engineer';
 * }
 * </code></pre>
 * Then the <code>observe</code> property should be configured as follows:
 *
 * <pre><code class="language-html">&lt;dom-repeat items=&quot;{{employees}}&quot; filter=&quot;isEngineer&quot;
 * observe=&quot;type manager.type&quot;&gt;
 * </code></pre>
 *
 * @param <ITEM> the type parameter
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "DomRepeat",
		module = "@polymer/polymer/lib/elements/dom-repeat.js"
)
public interface DomRepeatElement<ITEM extends Any> extends PolymerElement, OptionalMutableData {
	/**
	 * Tagname string.
	 *
	 * @return the string
	 */
	static String TAGNAME() {
		return "dom-repeat";
	}

	/**
	 * An array containing items determining how many instances of the template to stamp and that that each template
	 * instance should bind to.
	 *
	 * @return the items
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * An array containing items determining how many instances of the template to stamp and that that each template
	 * instance should bind to.
	 *
	 * @param items the items
	 */
	@JSProperty
	void setItems(ITEM... items);

	/**
	 * Sets items.
	 *
	 * @param items the items
	 */
	@JSProperty
	void setItems(Array<ITEM> items);

	/**
	 * The name of the variable to add to the binding scope for the array element associated with a given template
	 * instance.
	 *
	 * @return the as
	 */
	@Nullable
	@JSProperty
	String getAs();

	/**
	 * The name of the variable to add to the binding scope for the array element associated with a given template
	 * instance.
	 *
	 * @param as the as
	 */
	@JSProperty
	void setAs(String as);

	/**
	 * The name of the variable to add to the binding scope with the index of the instance in the sorted and filtered
	 * list of rendered items. Note, for the index in the <code>this.items</code> array, use the value of the
	 * <code>itemsIndexAs</code> property.
	 *
	 * @return the index as
	 */
	@Nullable
	@JSProperty
	String getIndexAs();

	/**
	 * The name of the variable to add to the binding scope with the index of the instance in the sorted and filtered
	 * list of rendered items. Note, for the index in the <code>this.items</code> array, use the value of the
	 * <code>itemsIndexAs</code> property.
	 *
	 * @param indexAs the index as
	 */
	@JSProperty
	void setIndexAs(String indexAs);

	/**
	 * The name of the variable to add to the binding scope with the index of the instance in the
	 * <code>this.items</code> array. Note, for the index of this instance in the sorted and filtered list of rendered
	 * items, use the value of the <code>indexAs</code> property.
	 *
	 * @return the items index as
	 */
	@Nullable
	@JSProperty
	String getItemsIndexAs();

	/**
	 * The name of the variable to add to the binding scope with the index of the instance in the
	 * <code>this.items</code> array. Note, for the index of this instance in the sorted and filtered list of rendered
	 * items, use the value of the <code>indexAs</code> property.
	 *
	 * @param itemsIndexAs the items index as
	 */
	@JSProperty
	void setItemsIndexAs(String itemsIndexAs);

	/**
	 * A function that should determine the sort order of the items.  This property should either be provided as a
	 * string, indicating a method name on the element's host, or else be an actual function.  The function should
	 * match
	 * the sort function passed to <code>Array.sort</code>. Using a sort function has no effect on the underlying
	 * <code>items</code> array.
	 *
	 * @return the sort
	 */
	@Nullable
	@JSProperty
	JsComparator<ITEM> getSort();

	/**
	 * A function that should determine the sort order of the items.  This property should either be provided as a
	 * string, indicating a method name on the element's host, or else be an actual function.  The function should
	 * match
	 * the sort function passed to <code>Array.sort</code>. Using a sort function has no effect on the underlying
	 * <code>items</code> array.
	 *
	 * @param sort the sort
	 */
	@JSProperty
	void setSort(JsComparator<ITEM> sort);

	/**
	 * A function that can be used to filter items out of the view.  This property should either be provided as a
	 * string, indicating a method name on the element's host, or else be an actual function.  The function should
	 * match
	 * the sort function passed to <code>Array.filter</code>. Using a filter function has no effect on the underlying
	 * <code>items</code> array.
	 *
	 * @return the filter
	 */
	@Nullable
	@JSProperty
	IntKeyPredicate<ITEM, Array<ITEM>> getFilter();

	/**
	 * A function that can be used to filter items out of the view.  This property should either be provided as a
	 * string, indicating a method name on the element's host, or else be an actual function.  The function should
	 * match
	 * the sort function passed to <code>Array.filter</code>. Using a filter function has no effect on the underlying
	 * <code>items</code> array.
	 *
	 * @param filter the filter
	 */
	@JSProperty
	void setFilter(IntKeyPredicate<ITEM, Array<ITEM>> filter);

	/**
	 * When using a <code>filter</code> or <code>sort</code> function, the <code>observe</code> property should be set
	 * to a space-separated list of the names of item sub-fields that should trigger a re-sort or re-filter when
	 * changed. These should generally be fields of <code>item</code> that the sort or filter function depends on.
	 *
	 * @return the observe
	 */
	@Nullable
	@JSProperty
	String getObserve();

	/**
	 * When using a <code>filter</code> or <code>sort</code> function, the <code>observe</code> property should be set
	 * to a space-separated list of the names of item sub-fields that should trigger a re-sort or re-filter when
	 * changed. These should generally be fields of <code>item</code> that the sort or filter function depends on.
	 *
	 * @param observe the observe
	 */
	@JSProperty
	void setObserve(String observe);

	/**
	 * When using a <code>filter</code> or <code>sort</code> function, the <code>delay</code> property determines a
	 * debounce time in ms after a change to observed item properties that must pass before the filter or sort is
	 * re-run. This is useful in rate-limiting shuffling of the view when item changes may be frequent.
	 *
	 * @return the delay
	 */
	@JSProperty
	double getDelay();

	/**
	 * When using a <code>filter</code> or <code>sort</code> function, the <code>delay</code> property determines a
	 * debounce time in ms after a change to observed item properties that must pass before the filter or sort is
	 * re-run. This is useful in rate-limiting shuffling of the view when item changes may be frequent.
	 *
	 * @param delay the delay
	 */
	@JSProperty
	void setDelay(double delay);

	/**
	 * Count of currently rendered items after <code>filter</code> (if any) has been applied. If &quot;chunking
	 * mode&quot; is enabled, <code>renderedItemCount</code> is updated each time a set of template instances is
	 * rendered.
	 *
	 * @return the rendered item count
	 */
	@JSProperty
	int getRenderedItemCount();

	/**
	 * Defines an initial count of template instances to render after setting the <code>items</code> array, before the
	 * next paint, and puts the <code>dom-repeat</code> into &quot;chunking mode&quot;.  The remaining items will be
	 * created and rendered incrementally at each animation frame therof until all instances have been rendered.
	 *
	 * @return the initial count
	 */
	@JSProperty
	int getInitialCount();

	/**
	 * Defines an initial count of template instances to render after setting the <code>items</code> array, before the
	 * next paint, and puts the <code>dom-repeat</code> into &quot;chunking mode&quot;.  The remaining items will be
	 * created and rendered incrementally at each animation frame therof until all instances have been rendered.
	 *
	 * @param initialCount the initial count
	 */
	@JSProperty
	void setInitialCount(int initialCount);

	/**
	 * When <code>initialCount</code> is used, this property defines a frame rate (in fps) to target by throttling the
	 * number of instances rendered each frame to not exceed the budget for the target frame rate.  The framerate is
	 * effectively the number of <code>requestAnimationFrame</code>s that it tries to allow to actually fire in a given
	 * second. It does this by measuring the time between <code>rAF</code>s and continuously adjusting the number of
	 * items created each <code>rAF</code> to maintain the target framerate. Setting this to a higher number allows
	 * lower latency and higher throughput for event handlers and other tasks, but results in a longer time for the
	 * remaining items to complete rendering.
	 *
	 * @return the target framerate
	 */
	@JSProperty
	double getTargetFramerate();

	/**
	 * When <code>initialCount</code> is used, this property defines a frame rate (in fps) to target by throttling the
	 * number of instances rendered each frame to not exceed the budget for the target frame rate.  The framerate is
	 * effectively the number of <code>requestAnimationFrame</code>s that it tries to allow to actually fire in a given
	 * second. It does this by measuring the time between <code>rAF</code>s and continuously adjusting the number of
	 * items created each <code>rAF</code> to maintain the target framerate. Setting this to a higher number allows
	 * lower latency and higher throughput for event handlers and other tasks, but results in a longer time for the
	 * remaining items to complete rendering.
	 *
	 * @param targetFramerate the target framerate
	 */
	@JSProperty
	void setTargetFramerate(double targetFramerate);

	/**
	 * Forces the element to render its content. Normally rendering is asynchronous to a provoking change. This is done
	 * for efficiency so that multiple changes trigger only a single render. The render method should be called if, for
	 * example, template rendering is required to validate application state.
	 */
	void render();

	/**
	 * Returns the item associated with a given element stamped by this <code>dom-repeat</code>.
	 * <p>
	 * Note, to modify sub-properties of the item,
	 * <code>modelForElement(el).set('item.&lt;sub-prop&gt;', value)</code>
	 * should be used.
	 *
	 * @param el Element for which to return the item.
	 *
	 * @return Item associated with the element.
	 */
	ITEM itemForElement(HTMLElement el);

	/**
	 * Returns the inst index for a given element stamped by this <code>dom-repeat</code>. If <code>sort</code> is
	 * provided, the index will reflect the sorted order (rather than the original array order).
	 *
	 * @param el Element for which to return the index.
	 *
	 * @return Row index associated with the element (note this may 		not correspond to the array index if a user
	 * 		<code>sort</code> is applied).
	 */
	int indexForElement(HTMLElement el);

	/**
	 * Returns the template &quot;model&quot; associated with a given element, which serves as the binding scope for
	 * the
	 * template instance the element is contained in. A template model should be used to manipulate data associated
	 * with
	 * this template instance.
	 * <p>
	 * Example:
	 * <p>
	 * let model = modelForElement(el); if (model.index &lt; 10) { model.set('item.checked', true); }
	 *
	 * @param el Element for which to return a template model.
	 *
	 * @return Model representing the binding scope for 		the element.
	 */
	TemplateInstanceBase modelForElement(HTMLElement el);
}
