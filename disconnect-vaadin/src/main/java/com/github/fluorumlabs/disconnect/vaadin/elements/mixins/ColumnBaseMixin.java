package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.renderers.GridHeaderFooterRenderer;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface ColumnBaseMixin<ITEM extends Any> extends Element {
	/**
	 * When set to true, the column is user-resizable.
	 */
	@JSProperty
	boolean isResizable();

	/**
	 * When set to true, the column is user-resizable.
	 */
	@JSProperty
	void setResizable(boolean resizable);

	/**
	 * When true, the column is frozen. When a column inside of a column group is frozen,
	 * all of the sibling columns inside the group will get frozen also.
	 */
	@JSProperty
	boolean isFrozen();

	/**
	 * When true, the column is frozen. When a column inside of a column group is frozen,
	 * all of the sibling columns inside the group will get frozen also.
	 */
	@JSProperty
	void setFrozen(boolean frozen);

	/**
	 * When set to true, the cells for this column are hidden.
	 */
	@JSProperty
	boolean isHidden();

	/**
	 * When set to true, the cells for this column are hidden.
	 */
	@JSProperty
	void setHidden(boolean hidden);

	/**
	 * Text content to display in the header cell of the column.
	 */
	@Nullable
	@JSProperty
	String getHeader();

	/**
	 * Text content to display in the header cell of the column.
	 */
	@JSProperty
	void setHeader(String header);

	/**
	 * Aligns the columns cell content horizontally.
	 * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
	 */
	@Nullable
	@JSProperty
	String getTextAlign();

	/**
	 * Aligns the columns cell content horizontally.
	 * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
	 */
	@JSProperty
	void setTextAlign(String textAlign);

	/**
	 * Custom function for rendering the header content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	GridHeaderFooterRenderer<ITEM> getHeaderRenderer();

	/**
	 * Custom function for rendering the header content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@JSProperty
	void setHeaderRenderer(GridHeaderFooterRenderer<ITEM> headerRenderer);

	/**
	 * Custom function for rendering the footer content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	GridHeaderFooterRenderer<ITEM> getFooterRenderer();

	/**
	 * Custom function for rendering the footer content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@JSProperty
	void setFooterRenderer(GridHeaderFooterRenderer<ITEM> footerRenderer);
}
