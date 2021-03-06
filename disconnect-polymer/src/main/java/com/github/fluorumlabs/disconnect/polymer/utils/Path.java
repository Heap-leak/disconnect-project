package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * The interface Path.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"isAncestor", "split", "set", "isDescendant", "root", "normalize", "get", "isPath", "matches",
				"translate"},
		module = "@polymer/polymer/lib/utils/path.js"
)
public interface Path extends Any {
	/**
	 * Returns true if the given string is a structured data path (has dots).
	 * <p>
	 * Example:
	 *
	 * <pre><code>isPath('foo.bar.baz') // true
	 * isPath('foo')         // false
	 * </code></pre>
	 *
	 * @param path Path string
	 *
	 * @return True if the string contained one or more dots
	 */
	@JSBody(params = "path", script = "return isPath(path)")
	static boolean isPath(String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns the root property name for the given path.
	 * <p>
	 * Example:
	 *
	 * <pre><code>root('foo.bar.baz') // 'foo'
	 * root('foo')         // 'foo'
	 * </code></pre>
	 *
	 * @param path Path string
	 *
	 * @return Root property name
	 */
	@JSBody(params = "path", script = "return root(path)")
	static String root(String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Given <code>base</code> is <code>foo.bar</code>, <code>foo</code> is an ancestor, <code>foo.bar</code> is not
	 * Returns true if the given path is an ancestor of the base path.
	 * <p>
	 * Example:
	 *
	 * <pre><code>isAncestor('foo.bar', 'foo')         // true
	 * isAncestor('foo.bar', 'foo.bar')     // false
	 * isAncestor('foo.bar', 'foo.bar.baz') // false
	 * </code></pre>
	 *
	 * @param base Path string to test against.
	 * @param path Path string to test.
	 *
	 * @return True if <code>path</code> is an ancestor of <code>base</code>.
	 */
	@JSBody(
			params = {"base", "path"},
			script = "return isAncestor(base, path)"
	)
	static boolean isAncestor(String base, String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Given <code>base</code> is <code>foo.bar</code>, <code>foo.bar.baz</code> is an descendant
	 * <p>
	 * Example:
	 *
	 * <pre><code>isDescendant('foo.bar', 'foo.bar.baz') // true
	 * isDescendant('foo.bar', 'foo.bar')     // false
	 * isDescendant('foo.bar', 'foo')         // false
	 * </code></pre>
	 *
	 * @param base Path string to test against.
	 * @param path Path string to test.
	 *
	 * @return True if <code>path</code> is a descendant of <code>base</code>.
	 */
	@JSBody(
			params = {"base", "path"},
			script = "return isDescendant(base, path)"
	)
	static boolean isDescendant(String base, String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Replaces a previous base path with a new base path, preserving the remainder of the path.
	 * <p>
	 * User must ensure <code>path</code> has a prefix of <code>base</code>.
	 * <p>
	 * Example:
	 *
	 * <pre><code>translate('foo.bar', 'zot', 'foo.bar.baz') // 'zot.baz'
	 * </code></pre>
	 *
	 * @param base    Current base string to remove
	 * @param newBase New base string to replace with
	 * @param path    Path to translate
	 *
	 * @return Translated string
	 */
	@JSBody(
			params = {"base", "newBase", "path"},
			script = "return translate(base, newBase, path)"
	)
	static String translate(String base, String newBase, String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Matches boolean.
	 *
	 * @param base Path string to test against
	 * @param path Path string to test
	 *
	 * @return True if <code>path</code> is equal to <code>base</code>
	 */
	@JSBody(
			params = {"base", "path"},
			script = "return matches(base, path)"
	)
	static boolean matches(String base, String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Converts array-based paths to flattened path. String-based paths are returned as-is.
	 * <p>
	 * Example:
	 *
	 * <pre><code>normalize(['foo.bar', 0, 'baz'])  // 'foo.bar.0.baz'
	 * normalize('foo.bar.0.baz')        // 'foo.bar.0.baz'
	 * </code></pre>
	 *
	 * @param path Input path
	 *
	 * @return Flattened path
	 */
	@JSBody(params = "path", script = "return normalize(path)")
	static String normalize(String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Normalize string.
	 *
	 * @param path the path
	 *
	 * @return the string
	 */
	@JSBody(params = "path", script = "return normalize(path)")
	static String normalize(String... path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Normalize string.
	 *
	 * @param path the path
	 *
	 * @return the string
	 */
	@JSBody(params = "path", script = "return normalize(path)")
	static String normalize(Unknown... path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Normalize string.
	 *
	 * @param path the path
	 *
	 * @return the string
	 */
	@JSBody(params = "path", script = "return normalize(path)")
	static String normalize(Array<Unknown> path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Splits a path into an array of property names. Accepts either arrays of path parts or strings.
	 * <p>
	 * Example:
	 *
	 * <pre><code>split(['foo.bar', 0, 'baz'])  // ['foo', 'bar', '0', 'baz']
	 * split('foo.bar.0.baz')        // ['foo', 'bar', '0', 'baz']
	 * </code></pre>
	 *
	 * @param path Input path
	 *
	 * @return Array of path parts
	 */
	@JSBody(params = "path", script = "return split(path)")
	static String[] split(String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Split string [ ].
	 *
	 * @param path the path
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "path", script = "return split(path)")
	static String[] split(String... path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Split string [ ].
	 *
	 * @param path the path
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "path", script = "return split(path)")
	static String[] split(Unknown... path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Split string [ ].
	 *
	 * @param path the path
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "path", script = "return split(path)")
	static String[] split(Array<Unknown> path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>, this method returns
	 * `undefined` (will never throw.
	 *
	 * @param root Object from which to dereference path from
	 * @param path Path to read
	 * @param info If an object is provided to <code>info</code>, the normalized (flattened) path will be set to
	 *             <code>info.path</code>.
	 *
	 * @return Value at path, or <code>undefined</code> if the path could not be fully dereferenced.
	 */
	@JSBody(
			params = {"root", "path", "info"},
			script = "return get(root, path, info)"
	)
	static Unknown get(Any root, String path, Any info) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 * @param info the info
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path", "info"},
			script = "return get(root, path, info)"
	)
	static Unknown get(Any root, String[] path, Any info) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 * @param info the info
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path", "info"},
			script = "return get(root, path, info)"
	)
	static Unknown get(Any root, Unknown[] path, Any info) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 * @param info the info
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path", "info"},
			script = "return get(root, path, info)"
	)
	static Unknown get(Any root, Array<Unknown> path, Any info) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path"},
			script = "return get(root, path)"
	)
	static Unknown get(Any root, String path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path"},
			script = "return get(root, path)"
	)
	static Unknown get(Any root, String[] path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path"},
			script = "return get(root, path)"
	)
	static Unknown get(Any root, Unknown[] path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Get unknown.
	 *
	 * @param root the root
	 * @param path the path
	 *
	 * @return the unknown
	 */
	@JSBody(
			params = {"root", "path"},
			script = "return get(root, path)"
	)
	static Unknown get(Any root, Array<Unknown> path) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Sets a value to a path.  If any sub-property in the path is <code>undefined</code>, this method will no-op.
	 * <p>
	 *
	 * @param root  Object from which to dereference path from
	 * @param path  Path to set
	 * @param value Value to set to path
	 *
	 * @return The normalized version of the input path
	 */
	@Nullable
	@JSBody(
			params = {"root", "path", "value"},
			script = "return set(root, path, value)"
	)
	static String set(Any root, String path, Any value) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Set string.
	 *
	 * @param root  the root
	 * @param path  the path
	 * @param value the value
	 *
	 * @return the string
	 */
	@Nullable
	@JSBody(
			params = {"root", "path", "value"},
			script = "return set(root, path, value)"
	)
	static String set(Any root, String[] path, Any value) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Set string.
	 *
	 * @param root  the root
	 * @param path  the path
	 * @param value the value
	 *
	 * @return the string
	 */
	@Nullable
	@JSBody(
			params = {"root", "path", "value"},
			script = "return set(root, path, value)"
	)
	static String set(Any root, Unknown[] path, Any value) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Set string.
	 *
	 * @param root  the root
	 * @param path  the path
	 * @param value the value
	 *
	 * @return the string
	 */
	@Nullable
	@JSBody(
			params = {"root", "path", "value"},
			script = "return set(root, path, value)"
	)
	static String set(Any root, Array<Unknown> path, Any value) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
