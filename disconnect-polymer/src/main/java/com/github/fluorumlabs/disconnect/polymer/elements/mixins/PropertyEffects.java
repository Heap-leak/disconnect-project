package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.polymer.types.SpliceRecord;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.StringRecord;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Element class mixin that provides meta-programming for Polymer's template binding and data observation (collectively,
 * &quot;property effects&quot;) system.
 * <p>
 * This mixin uses provides the following key static methods for adding property effects to an element class:
 *
 * <ul>
 * <li><code>addPropertyEffect</code></li>
 * <li><code>createPropertyObserver</code></li>
 * <li><code>createMethodObserver</code></li>
 * <li><code>createNotifyingProperty</code></li>
 * <li><code>createReadOnlyProperty</code></li>
 * <li><code>createReflectedProperty</code></li>
 * <li><code>createComputedProperty</code></li>
 * <li><code>bindTemplate</code></li>
 * </ul>
 * Each method creates one or more property accessors, along with metadata used by this mixin's implementation of
 * <code>_propertiesChanged</code> to perform the property effects.
 * <p>
 * Underscored versions of the above methods also exist on the element prototype for adding property effects on
 * instances at runtime.
 * <p>
 * Note that this mixin overrides several <code>PropertyAccessors</code> methods, in many cases to maintain guarantees
 * provided by the Polymer 1.x features; notably it changes property accessors to be synchronous by default whereas the
 * default when using <code>PropertyAccessors</code> standalone is to be async by default.
 */
public interface PropertyEffects extends TemplateStamp, PropertyAccessors {
	/**
	 * Property effect types string record.
	 *
	 * @return the string record
	 */
	@JSProperty("PROPERTY_EFFECT_TYPES")
	StringRecord PROPERTY_EFFECT_TYPES();

	/**
	 * Sets a bag of property changes to this instance, and synchronously processes all effects of the properties as a
	 * batch.
	 * <p>
	 * Property names must be simple properties, not paths.  Batched path propagation is not supported.
	 *
	 * @param props       Bag of one or more key-value pairs whose key is a property and value is the new value to set
	 *                    for that property.
	 * @param setReadOnly When true, any private values set in                    <code>props</code> will be set. By
	 *                    default, <code>setProperties</code> will not set                    <code>readOnly:
	 *                    true</code> root properties.
	 */
	void setProperties(Record<Any> props, boolean setReadOnly);

	/**
	 * Aliases one data path as another, such that path notifications from one are routed to the other.
	 *
	 * @param to   Target path to link.
	 * @param from Source path to link.
	 */
	void linkPaths(String to, String from);

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	void linkPaths(String[] to, String[] from);

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	void linkPaths(Unknown[] to, Unknown[] from);

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	void linkPaths(Array<Unknown> to, Array<Unknown> from);

	/**
	 * Removes a data path alias previously established with
	 * <code>_linkPaths</code>.
	 * <p>
	 * Note, the path to unlink should be the target (<code>to</code>) used when linking the paths.
	 *
	 * @param path Target path to unlink.
	 */
	void unlinkPaths(String path);

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	void unlinkPaths(String... path);

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	void unlinkPaths(Unknown... path);

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	void unlinkPaths(Array<Unknown> path);

	/**
	 * Notify that an array has changed.
	 * <p>
	 * Example:
	 *
	 * <pre><code>this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
	 * ...
	 * this.items.splice(1, 1, {name: 'Sam'});
	 * this.items.push({name: 'Bob'});
	 * this.notifySplices('items', [
	 *   { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
	 *     object: this.items, type: 'splice' },
	 *   { index: 3, removed: [], addedCount: 1,
	 *     object: this.items, type: 'splice'}
	 * ]);
	 * </code></pre>
	 *
	 * @param <T>     the type parameter
	 * @param path    Path that should be notified.
	 * @param splices Array of splice records indicating ordered changes that occurred to the array. Each record should
	 *                have the following fields:                <ul>
	 *                <li>index: index at which the change occurred</li>                <li>removed: array of
	 *                items that were removed from this index</li>                <li>addedCount: number of new items
	 *                added at this index</li>                <li>object: a reference to the array in question</li>
	 *                <li>type: the string literal 'splice'</li>
	 *                </ul>                Note that splice records <em>must</em> be normalized such that they are
	 *                reported in index order                (raw results from <code>Object.observe</code> are not
	 *                ordered and must be normalized/merged                before                notifying).
	 */
	<T extends Any> void notifySplices(String path, SpliceRecord<T>... splices);

	/**
	 * Notify splices.
	 *
	 * @param <T>     the type parameter
	 * @param path    the path
	 * @param splices the splices
	 */
	<T extends Any> void notifySplices(String path, Array<SpliceRecord<T>> splices);

	/**
	 * Convenience method for reading a value from a path.
	 * <p>
	 * Note, if any part in the path is undefined, this method returns
	 * <code>undefined</code> (this method does not throw when dereferencing undefined
	 * paths).
	 *
	 * @param <T>  the type parameter
	 * @param path Path to the value to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>) or
	 *                        an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that bracketed
	 *             expressions are             not supported; string-based path parts
	 *             <em>must</em> be separated by dots.  Note that when dereferencing array             indices, the
	 *             index may be used as a dotted part directly (e.g. <code>users.12.name</code> or
	 *             <code>['users', 12, 'name']</code>).
	 * @param root Root object from which the path is evaluated.
	 *
	 * @return Value at the path, or <code>undefined</code> if any part of the path is undefined.
	 */
	@Nullable
	<T extends Any> T get(String path, Any root);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 * @param root the root
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(String[] path, Any root);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 * @param root the root
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(Unknown[] path, Any root);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 * @param root the root
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(Array<Unknown> path, Any root);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(String path);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(String[] path);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(Unknown[] path);

	/**
	 * Get t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T get(Array<Unknown> path);

	/**
	 * Convenience method for setting a value to a path and notifying any elements bound to the same path.
	 * <p>
	 * Note, if any part in the path except for the last is undefined, this method does nothing (this method does not
	 * throw when dereferencing undefined paths).
	 *
	 * @param path  Path to the value to write.  The path may be specified as a string (e.g. <code>'foo.bar
	 *              .baz'</code>)              or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note
	 *              that bracketed expressions              are not supported; string-based path parts
	 *              <em>must</em> be separated by dots.  Note that when dereferencing array              indices,
	 *              the index may be used as a dotted part directly (e.g. <code>'users.12.name'</code> or
	 *              <code>['users', 12, 'name']</code>).
	 * @param value Value to set at the specified path.
	 * @param root  Root object from which the path is evaluated. When specified, no notification will occur.
	 */
	void set(String path, Any value, Any root);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	void set(String[] path, Any value, Any root);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	void set(Unknown[] path, Any value, Any root);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	void set(Array<Unknown> path, Any value, Any root);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void set(String path, Any value);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void set(String[] path, Any value);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void set(Unknown[] path, Any value);

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void set(Array<Unknown> path, Any value);

	/**
	 * Adds items onto the end of the array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.push</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <T>   the type parameter
	 * @param path  Path to array.
	 * @param items Items to push onto array
	 *
	 * @return New length of the array.
	 */
	@JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
	<T extends Any> int push(String path, T... items);

	/**
	 * Push int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
	<T extends Any> int push(String[] path, T... items);

	/**
	 * Push int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
	<T extends Any> int push(Unknown[] path, T... items);

	/**
	 * Push int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
	<T extends Any> int push(Array<Unknown> path, T... items);

	/**
	 * Removes an item from the end of array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.pop</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <T>  the type parameter
	 * @param path Path to array.
	 *
	 * @return Item that was removed.
	 */
	<T extends Any> T pop(String path);

	/**
	 * Pop t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	<T extends Any> T pop(String... path);

	/**
	 * Pop t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	<T extends Any> T pop(Unknown... path);

	/**
	 * Pop t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	<T extends Any> T pop(Array<Unknown> path);

	/**
	 * Starting from the start index specified, removes 0 or more items from the array and inserts 0 or more new items
	 * in their place.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.splice</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <T>         the type parameter
	 * @param path        Path to array.
	 * @param start       Index from which to start removing/inserting.
	 * @param deleteCount Number of items to remove.
	 * @param items       Items to insert into array.
	 *
	 * @return Array of removed items.
	 */
	@JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, " +
			"start, deleteCount].concat(items))")
	<T extends Any> Array<T> splice(String path, int start, int deleteCount, T... items);

	/**
	 * Splice array.
	 *
	 * @param <T>         the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	@JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, " +
			"start, deleteCount].concat(items))")
	<T extends Any> Array<T> splice(String[] path, int start, int deleteCount, T... items);

	/**
	 * Splice array.
	 *
	 * @param <T>         the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	@JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, " +
			"start, deleteCount].concat(items))")
	<T extends Any> Array<T> splice(Unknown[] path, int start, int deleteCount, T... items);

	/**
	 * Splice array.
	 *
	 * @param <T>         the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	@JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, " +
			"start, deleteCount].concat(items))")
	<T extends Any> Array<T> splice(Array<Unknown> path, int start, int deleteCount, T... items);

	/**
	 * Removes an item from the beginning of array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.pop</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <T>  the type parameter
	 * @param path Path to array.
	 *
	 * @return Item that was removed.
	 */
	@Nullable
	<T extends Any> T shift(String path);

	/**
	 * Shift t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T shift(String... path);

	/**
	 * Shift t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T shift(Unknown... path);

	/**
	 * Shift t.
	 *
	 * @param <T>  the type parameter
	 * @param path the path
	 *
	 * @return the t
	 */
	@Nullable
	<T extends Any> T shift(Array<Unknown> path);

	/**
	 * Adds items onto the beginning of the array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.push</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <T>   the type parameter
	 * @param path  Path to array.
	 * @param items Items to insert info array
	 *
	 * @return New length of the array.
	 */
	@JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
	<T extends Any> int unshift(String path, T... items);

	/**
	 * Unshift int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
	<T extends Any> int unshift(String[] path, T... items);

	/**
	 * Unshift int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
	<T extends Any> int unshift(Unknown[] path, T... items);

	/**
	 * Unshift int.
	 *
	 * @param <T>   the type parameter
	 * @param path  the path
	 * @param items the items
	 *
	 * @return the int
	 */
	@JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
	<T extends Any> int unshift(Array<Unknown> path, T... items);

	/**
	 * Notify that a path has changed.
	 * <p>
	 * Example:
	 *
	 * <pre><code>this.item.user.name = 'Bob';
	 * this.notifyPath('item.user.name');
	 * </code></pre>
	 *
	 * @param path  Path that should be notified.
	 * @param value Value at the path (optional).
	 */
	void notifyPath(String path, Any value);

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void notifyPath(String[] path, Any value);

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void notifyPath(Unknown[] path, Any value);

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	void notifyPath(Array<Unknown> path, Any value);

	/**
	 * Notify path.
	 *
	 * @param path the path
	 */
	void notifyPath(String path);

	/**
	 * Notify path.
	 *
	 * @param path the path
	 */
	void notifyPath(String... path);

	/**
	 * Notify path.
	 *
	 * @param path the path
	 */
	void notifyPath(Unknown... path);

	/**
	 * Notify path.
	 *
	 * @param path the path
	 */
	void notifyPath(Array<Unknown> path);
}
