package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.cssom.MediaQueryList;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>iron-media-query</code> can be used to data bind to a CSS media query.
 * The <code>query</code> property is a bare CSS media query. The <code>query-matches</code> property is a boolean
 * representing whether the page matches that media query.
 * <p>
 * Example:
 *
 * <pre><code class="language-html">&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{
 * queryMatches}}&quot;&gt;
 * &lt;/iron-media-query&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronMediaQuery",
		module = "@polymer/iron-media-query/iron-media-query.js"
)
public interface IronMediaQueryElement extends HTMLElement {
	/**
	 * Tagname string.
	 *
	 * @return the string
	 */
	static String TAGNAME() {
		return "iron-media-query";
	}

	/**
	 * The Boolean return value of the media query.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isQueryMatches();

	/**
	 * The CSS media query to evaluate.
	 *
	 * @return the query
	 */
	@Nullable
	@JSProperty
	String getQuery();

	/**
	 * The CSS media query to evaluate.
	 *
	 * @param query the query
	 */
	@JSProperty
	void setQuery(String query);

	/**
	 * If true, the query attribute is assumed to be a complete media query string rather than a single media feature.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isFull();

	/**
	 * If true, the query attribute is assumed to be a complete media query string rather than a single media feature.
	 *
	 * @param full the full
	 */
	@JSProperty
	void setFull(boolean full);

	/**
	 * Query changed.
	 */
	void queryChanged();

	/**
	 * Query handler.
	 *
	 * @param mq the mq
	 */
	void queryHandler(MediaQueryList mq);
}
