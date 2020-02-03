package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.OptionalMutableData;
import js.lang.Any;
import js.util.collections.Array;
import js.util.function.IntKeyPredicate;
import js.util.function.JsComparator;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The `<dom-repeat>` element will automatically stamp and binds one instance
 * of template content to each object in a user-provided array.
 * `dom-repeat` accepts an `items` property, and one instance of the template
 * is stamped for each item into the DOM at the location of the `dom-repeat`
 * element.  The `item` property will be set on each instance's binding
 * scope, thus templates should bind to sub-properties of `item`.
 * <p>
 * Example:
 * <p>
 * ```html
 * <dom-module id="employee-list">
 *
 * <template>
 *
 * <div> Employee list: </div>
 * <dom-repeat items="{{employees}}">
 * <template>
 * <div>First name: <span>{{item.first}}</span></div>
 * <div>Last name: <span>{{item.last}}</span></div>
 * </template>
 * </dom-repeat>
 *
 * </template>
 * <p>
 * </dom-module>
 * ```
 * <p>
 * With the following custom element definition:
 * <p>
 * ```js
 * class EmployeeList extends PolymerElement {
 * static get is() { return 'employee-list'; }
 * static get properties() {
 * return {
 * employees: {
 * value() {
 * return [
 * {first: 'Bob', last: 'Smith'},
 * {first: 'Sally', last: 'Johnson'},
 * ...
 * ];
 * }
 * }
 * };
 * }
 * }
 * ```
 * <p>
 * Notifications for changes to items sub-properties will be forwarded to template
 * instances, which will update via the normal structured data notification system.
 * <p>
 * Mutations to the `items` array itself should be made using the Array
 * mutation API's on the PropertyEffects mixin (`push`, `pop`, `splice`,
 * `shift`, `unshift`), and template instances will be kept in sync with the
 * data in the array.
 * <p>
 * Events caught by event handlers within the `dom-repeat` template will be
 * decorated with a `model` property, which represents the binding scope for
 * each template instance.  The model should be used to manipulate data on the
 * instance, for example `event.model.set('item.checked', true);`.
 * <p>
 * Alternatively, the model for a template instance for an element stamped by
 * a `dom-repeat` can be obtained using the `modelForElement` API on the
 * `dom-repeat` that stamped it, for example
 * `this.$.domRepeat.modelForElement(event.target).set('item.checked', true);`.
 * This may be useful for manipulating instance data of event targets obtained
 * by event handlers on parents of the `dom-repeat` (event delegation).
 * <p>
 * A view-specific filter/sort may be applied to each `dom-repeat` by supplying a
 * `filter` and/or `sort` property.  This may be a string that names a function on
 * the host, or a function may be assigned to the property directly.  The functions
 * should implemented following the standard `Array` filter/sort API.
 * <p>
 * In order to re-run the filter or sort functions based on changes to sub-fields
 * of `items`, the `observe` property may be set as a space-separated list of
 * `item` sub-fields that should cause a re-filter/sort when modified.  If
 * the filter or sort function depends on properties not contained in `items`,
 * the user should observe changes to those properties and call `render` to update
 * the view based on the dependency change.
 * <p>
 * For example, for an `dom-repeat` with a filter of the following:
 * <p>
 * ```js
 * isEngineer(item) {
 * return item.type == 'engineer' || item.manager.type == 'engineer';
 * }
 * ```
 * <p>
 * Then the `observe` property should be configured as follows:
 * <p>
 * ```html
 * <dom-repeat items="{{employees}}" filter="isEngineer" observe="type manager.type">
 * ```
 */
@Import(
        symbols = "DomRepeat",
        module = "@polymer/polymer/lib/elements/dom-repeat.js"
)
public interface DomRepeatElement<ITEM extends Any> extends PolymerElement, OptionalMutableData {
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @Nullable
    @JSProperty
    Array<ITEM> getItems();

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @JSProperty
    void setItems(@JSByRef ITEM... items);

    @JSProperty
    void setItems(@JSByRef Array<ITEM> items);

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @Nullable
    @JSProperty
    String getAs();

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @JSProperty
    void setAs(String as);

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the sorted and filtered list of rendered items.
     * Note, for the index in the `this.items` array, use the value of the
     * `itemsIndexAs` property.
     */
    @Nullable
    @JSProperty
    String getIndexAs();

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the sorted and filtered list of rendered items.
     * Note, for the index in the `this.items` array, use the value of the
     * `itemsIndexAs` property.
     */
    @JSProperty
    void setIndexAs(String indexAs);

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the `this.items` array. Note, for the index of
     * this instance in the sorted and filtered list of rendered items,
     * use the value of the `indexAs` property.
     */
    @Nullable
    @JSProperty
    String getItemsIndexAs();

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the `this.items` array. Note, for the index of
     * this instance in the sorted and filtered list of rendered items,
     * use the value of the `indexAs` property.
     */
    @JSProperty
    void setItemsIndexAs(String itemsIndexAs);

    /**
     * A function that should determine the sort order of the items.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.sort`.
     * Using a sort function has no effect on the underlying `items` array.
     */
    @Nullable
    @JSProperty
    JsComparator<ITEM> getSort();

    /**
     * A function that should determine the sort order of the items.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.sort`.
     * Using a sort function has no effect on the underlying `items` array.
     */
    @JSProperty
    void setSort(JsComparator<ITEM> sort);

    /**
     * A function that can be used to filter items out of the view.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.filter`.
     * Using a filter function has no effect on the underlying `items` array.
     */
    @Nullable
    @JSProperty
    IntKeyPredicate<ITEM, Array<ITEM>> getFilter();

    /**
     * A function that can be used to filter items out of the view.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.filter`.
     * Using a filter function has no effect on the underlying `items` array.
     */
    @JSProperty
    void setFilter(IntKeyPredicate<ITEM, Array<ITEM>> filter);

    /**
     * When using a `filter` or `sort` function, the `observe` property
     * should be set to a space-separated list of the names of item
     * sub-fields that should trigger a re-sort or re-filter when changed.
     * These should generally be fields of `item` that the sort or filter
     * function depends on.
     */
    @Nullable
    @JSProperty
    String getObserve();

    /**
     * When using a `filter` or `sort` function, the `observe` property
     * should be set to a space-separated list of the names of item
     * sub-fields that should trigger a re-sort or re-filter when changed.
     * These should generally be fields of `item` that the sort or filter
     * function depends on.
     */
    @JSProperty
    void setObserve(String observe);

    /**
     * When using a `filter` or `sort` function, the `delay` property
     * determines a debounce time in ms after a change to observed item
     * properties that must pass before the filter or sort is re-run.
     * This is useful in rate-limiting shuffling of the view when
     * item changes may be frequent.
     */
    @JSProperty
    double getDelay();

    /**
     * When using a `filter` or `sort` function, the `delay` property
     * determines a debounce time in ms after a change to observed item
     * properties that must pass before the filter or sort is re-run.
     * This is useful in rate-limiting shuffling of the view when
     * item changes may be frequent.
     */
    @JSProperty
    void setDelay(double delay);

    /**
     * Count of currently rendered items after `filter` (if any) has been applied.
     * If "chunking mode" is enabled, `renderedItemCount` is updated each time a
     * set of template instances is rendered.
     */
    @JSProperty
    int getRenderedItemCount();

    /**
     * Defines an initial count of template instances to render after setting
     * the `items` array, before the next paint, and puts the `dom-repeat`
     * into "chunking mode".  The remaining items will be created and rendered
     * incrementally at each animation frame therof until all instances have
     * been rendered.
     */
    @JSProperty
    int getInitialCount();

    /**
     * Defines an initial count of template instances to render after setting
     * the `items` array, before the next paint, and puts the `dom-repeat`
     * into "chunking mode".  The remaining items will be created and rendered
     * incrementally at each animation frame therof until all instances have
     * been rendered.
     */
    @JSProperty
    void setInitialCount(int initialCount);

    /**
     * When `initialCount` is used, this property defines a frame rate (in
     * fps) to target by throttling the number of instances rendered each
     * frame to not exceed the budget for the target frame rate.  The
     * framerate is effectively the number of `requestAnimationFrame`s that
     * it tries to allow to actually fire in a given second. It does this
     * by measuring the time between `rAF`s and continuously adjusting the
     * number of items created each `rAF` to maintain the target framerate.
     * Setting this to a higher number allows lower latency and higher
     * throughput for event handlers and other tasks, but results in a
     * longer time for the remaining items to complete rendering.
     */
    @JSProperty
    double getTargetFramerate();

    /**
     * When `initialCount` is used, this property defines a frame rate (in
     * fps) to target by throttling the number of instances rendered each
     * frame to not exceed the budget for the target frame rate.  The
     * framerate is effectively the number of `requestAnimationFrame`s that
     * it tries to allow to actually fire in a given second. It does this
     * by measuring the time between `rAF`s and continuously adjusting the
     * number of items created each `rAF` to maintain the target framerate.
     * Setting this to a higher number allows lower latency and higher
     * throughput for event handlers and other tasks, but results in a
     * longer time for the remaining items to complete rendering.
     */
    @JSProperty
    void setTargetFramerate(double targetFramerate);

    /**
     * Forces the element to render its content. Normally rendering is
     * asynchronous to a provoking change. This is done for efficiency so
     * that multiple changes trigger only a single render. The render method
     * should be called if, for example, template rendering is required to
     * validate application state.
     */
    void render();

    /**
     * Returns the item associated with a given element stamped by
     * this `dom-repeat`.
     * <p>
     * Note, to modify sub-properties of the item,
     * `modelForElement(el).set('item.<sub-prop>', value)`
     * should be used.
     *
     * @param el Element for which to return the item.
     *
     * @return Item associated with the element.
     */
    ITEM itemForElement(HTMLElement el);

    /**
     * Returns the inst index for a given element stamped by this `dom-repeat`.
     * If `sort` is provided, the index will reflect the sorted order (rather
     * than the original array order).
     *
     * @param el Element for which to return the index.
     *
     * @return Row index associated with the element (note this may
     *         not correspond to the array index if a user `sort` is applied).
     */
    int indexForElement(HTMLElement el);

    /**
     * Returns the template "model" associated with a given element, which
     * serves as the binding scope for the template instance the element is
     * contained in. A template model
     * should be used to manipulate data associated with this template instance.
     * <p>
     * Example:
     * <p>
     * let model = modelForElement(el);
     * if (model.index < 10) {
     * model.set('item.checked', true);
     * }
     *
     * @param el Element for which to return a template model.
     *
     * @return Model representing the binding scope for
     *         the element.
     */
    TemplateInstanceBase modelForElement(HTMLElement el);
}
