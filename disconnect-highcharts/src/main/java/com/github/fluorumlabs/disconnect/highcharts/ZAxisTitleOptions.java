package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The axis title, showing next to the axis
 * line.
 *
 * @see <a href="https://api.highcharts.com/highcharts/zAxis.title">https://api.highcharts.com/highcharts/zAxis.title</a>
 * @see <a href="https://api.highcharts.com/highstock/zAxis.title">https://api.highcharts.com/highstock/zAxis.title</a>
 * @see <a href="https://api.highcharts.com/highmaps/zAxis.title">https://api.highcharts.com/highmaps/zAxis.title</a>
 *
 */
public interface ZAxisTitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Alignment of the title relative to the
   * axis values. Possible values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.align">https://api.highcharts.com/highcharts/zAxis.title.align</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.align">https://api.highcharts.com/highstock/zAxis.title.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.align">https://api.highcharts.com/highmaps/zAxis.title.align</a>
   *
   * @implspec align?: (&quot;high&quot;|&quot;low&quot;|&quot;middle&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Alignment of the title relative to the
   * axis values. Possible values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.align">https://api.highcharts.com/highcharts/zAxis.title.align</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.align">https://api.highcharts.com/highstock/zAxis.title.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.align">https://api.highcharts.com/highmaps/zAxis.title.align</a>
   *
   * @implspec align?: (&quot;high&quot;|&quot;low&quot;|&quot;middle&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts) Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.enabled">https://api.highcharts.com/highcharts/zAxis.title.enabled</a>
   *
   * @implspec enabled?: string;
   *
   */
  @JSProperty("enabled")
  @Nullable
  String getEnabled();

  /**
   * (Highcharts) Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.enabled">https://api.highcharts.com/highcharts/zAxis.title.enabled</a>
   *
   * @implspec enabled?: string;
   *
   */
  @JSProperty("enabled")
  void setEnabled(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel distance between the axis
   * labels or line and the title. Defaults to 0 for horizontal axes, 10 for
   * vertical
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.margin">https://api.highcharts.com/highcharts/zAxis.title.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.margin">https://api.highcharts.com/highstock/zAxis.title.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.margin">https://api.highcharts.com/highmaps/zAxis.title.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel distance between the axis
   * labels or line and the title. Defaults to 0 for horizontal axes, 10 for
   * vertical
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.margin">https://api.highcharts.com/highcharts/zAxis.title.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.margin">https://api.highcharts.com/highstock/zAxis.title.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.margin">https://api.highcharts.com/highmaps/zAxis.title.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The distance of the axis title from the
   * axis line. By default, this distance is computed from the offset width of
   * the labels, the labels' distance from the axis and the title's margin.
   * However when the offset option is set, it overrides all this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.offset">https://api.highcharts.com/highcharts/zAxis.title.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.offset">https://api.highcharts.com/highstock/zAxis.title.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.offset">https://api.highcharts.com/highmaps/zAxis.title.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * (Highcharts, Highstock, Highmaps) The distance of the axis title from the
   * axis line. By default, this distance is computed from the offset width of
   * the labels, the labels' distance from the axis and the title's margin.
   * However when the offset option is set, it overrides all this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.offset">https://api.highcharts.com/highcharts/zAxis.title.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.offset">https://api.highcharts.com/highstock/zAxis.title.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.offset">https://api.highcharts.com/highmaps/zAxis.title.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  /**
   * (Highcharts) Defines how the title is repositioned according to the 3D
   * chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * <li>
   * <code>undefined</code>: Will use the config from <code>labels.position3d</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.position3d">https://api.highcharts.com/highcharts/zAxis.title.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;|null);
   *
   */
  @JSProperty("position3d")
  @Nullable
  Position3d getPosition3d();

  /**
   * (Highcharts) Defines how the title is repositioned according to the 3D
   * chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * <li>
   * <code>undefined</code>: Will use the config from <code>labels.position3d</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.position3d">https://api.highcharts.com/highcharts/zAxis.title.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;|null);
   *
   */
  @JSProperty("position3d")
  void setPosition3d(Position3d value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
   * when laying out the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.reserveSpace">https://api.highcharts.com/highcharts/zAxis.title.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.reserveSpace">https://api.highcharts.com/highstock/zAxis.title.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.reserveSpace">https://api.highcharts.com/gantt/zAxis.title.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  /**
   * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
   * when laying out the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.reserveSpace">https://api.highcharts.com/highcharts/zAxis.title.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.reserveSpace">https://api.highcharts.com/highstock/zAxis.title.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.reserveSpace">https://api.highcharts.com/gantt/zAxis.title.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The rotation of the text in degrees. 0
   * is horizontal, 270 is vertical reading from bottom to top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.rotation">https://api.highcharts.com/highcharts/zAxis.title.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.rotation">https://api.highcharts.com/highstock/zAxis.title.rotation</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.rotation">https://api.highcharts.com/highmaps/zAxis.title.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Highmaps) The rotation of the text in degrees. 0
   * is horizontal, 270 is vertical reading from bottom to top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.rotation">https://api.highcharts.com/highcharts/zAxis.title.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.rotation">https://api.highcharts.com/highstock/zAxis.title.rotation</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.rotation">https://api.highcharts.com/highmaps/zAxis.title.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) If enabled, the axis title will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>title.position3d</code>.
   *
   * A <code>null</code> value will use the config from <code>labels.skew3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.skew3d">https://api.highcharts.com/highcharts/zAxis.title.skew3d</a>
   *
   * @implspec skew3d?: (boolean|null);
   *
   */
  @JSProperty("skew3d")
  boolean getSkew3d();

  /**
   * (Highcharts) If enabled, the axis title will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>title.position3d</code>.
   *
   * A <code>null</code> value will use the config from <code>labels.skew3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.skew3d">https://api.highcharts.com/highcharts/zAxis.title.skew3d</a>
   *
   * @implspec skew3d?: (boolean|null);
   *
   */
  @JSProperty("skew3d")
  void setSkew3d(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title. If the title
   * text is longer than the axis length, it will wrap to multiple lines by
   * default. This can be customized by setting <code>textOverflow: 'ellipsis'</code>, by
   * setting a specific <code>width</code> or by setting <code>whiteSpace: 'nowrap'</code>.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-title</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.style">https://api.highcharts.com/highcharts/zAxis.title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.style">https://api.highcharts.com/highstock/zAxis.title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.style">https://api.highcharts.com/highmaps/zAxis.title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title. If the title
   * text is longer than the axis length, it will wrap to multiple lines by
   * default. This can be customized by setting <code>textOverflow: 'ellipsis'</code>, by
   * setting a specific <code>width</code> or by setting <code>whiteSpace: 'nowrap'</code>.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-title</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.style">https://api.highcharts.com/highcharts/zAxis.title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.style">https://api.highcharts.com/highstock/zAxis.title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.style">https://api.highcharts.com/highmaps/zAxis.title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The actual text of the axis title. It
   * can contain basic HTML text markup like <b>, <i> and spans with style.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.text">https://api.highcharts.com/highcharts/zAxis.title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.text">https://api.highcharts.com/highstock/zAxis.title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.text">https://api.highcharts.com/highmaps/zAxis.title.text</a>
   *
   * @implspec text?: (string|null);
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) The actual text of the axis title. It
   * can contain basic HTML text markup like <b>, <i> and spans with style.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.text">https://api.highcharts.com/highcharts/zAxis.title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.text">https://api.highcharts.com/highstock/zAxis.title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.text">https://api.highcharts.com/highmaps/zAxis.title.text</a>
   *
   * @implspec text?: (string|null);
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Alignment of the text, can be <code>&quot;left&quot;</code>,
   * <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.textAlign">https://api.highcharts.com/highcharts/zAxis.title.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.textAlign">https://api.highcharts.com/highstock/zAxis.title.textAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.textAlign">https://api.highcharts.com/highmaps/zAxis.title.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Alignment of the text, can be <code>&quot;left&quot;</code>,
   * <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.textAlign">https://api.highcharts.com/highcharts/zAxis.title.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.textAlign">https://api.highcharts.com/highstock/zAxis.title.textAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/zAxis.title.textAlign">https://api.highcharts.com/highmaps/zAxis.title.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
   * title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.useHTML">https://api.highcharts.com/highcharts/zAxis.title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.useHTML">https://api.highcharts.com/highstock/zAxis.title.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.useHTML">https://api.highcharts.com/gantt/zAxis.title.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
   * title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.useHTML">https://api.highcharts.com/highcharts/zAxis.title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.useHTML">https://api.highcharts.com/highstock/zAxis.title.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.useHTML">https://api.highcharts.com/gantt/zAxis.title.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
   * position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.x">https://api.highcharts.com/highcharts/zAxis.title.x</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.x">https://api.highcharts.com/highstock/zAxis.title.x</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.x">https://api.highcharts.com/gantt/zAxis.title.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
   * position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.x">https://api.highcharts.com/highcharts/zAxis.title.x</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.x">https://api.highcharts.com/highstock/zAxis.title.x</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.x">https://api.highcharts.com/gantt/zAxis.title.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
   * position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.y">https://api.highcharts.com/highcharts/zAxis.title.y</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.y">https://api.highcharts.com/highstock/zAxis.title.y</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.y">https://api.highcharts.com/gantt/zAxis.title.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
   * position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.title.y">https://api.highcharts.com/highcharts/zAxis.title.y</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.title.y">https://api.highcharts.com/highstock/zAxis.title.y</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.title.y">https://api.highcharts.com/gantt/zAxis.title.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align HIGH = JsEnum.of("high");

    public static final Align LOW = JsEnum.of("low");

    public static final Align MIDDLE = JsEnum.of("middle");
  }

  /**
   */
  abstract class Position3d extends JsEnum {
    public static final Position3d CHART = JsEnum.of("chart");

    public static final Position3d FLAP = JsEnum.of("flap");

    public static final Position3d OFFSET = JsEnum.of("offset");

    public static final Position3d ORTHO = JsEnum.of("ortho");
  }
}