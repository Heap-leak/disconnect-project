package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Options for the series data labels, appearing next to each data
 * point.
 *
 * Since v6.2.0, multiple data labels can be applied to each single point by
 * defining them as an array of configs.
 *
 * In styled mode, the data labels can be styled with the
 * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names (see
 * example).
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels</a>
 *
 */
public interface PlotGanttDataLabelsOptions extends Any {
  /**
   * (Gantt) The alignment of the data label compared to the point. If
   * <code>right</code>, the right side of the label should be touching the point. For
   * points with an extent, like columns, the alignments also dictates how to
   * align it inside the box, as given with the inside option. Can be one of
   * <code>left</code>, <code>center</code> or <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.align">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Gantt) The alignment of the data label compared to the point. If
   * <code>right</code>, the right side of the label should be touching the point. For
   * points with an extent, like columns, the alignments also dictates how to
   * align it inside the box, as given with the inside option. Can be one of
   * <code>left</code>, <code>center</code> or <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.align">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Gantt) Whether to allow data labels to overlap. To make the labels less
   * sensitive for overlapping, the dataLabels.padding can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.allowOverlap">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Gantt) Whether to allow data labels to overlap. To make the labels less
   * sensitive for overlapping, the dataLabels.padding can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.allowOverlap">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Gantt) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Gantt) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Gantt) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Gantt) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Gantt) The border color for the data label. Defaults to <code>undefined</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Gantt) The border color for the data label. Defaults to <code>undefined</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderColor">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Gantt) The border radius in pixels for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderRadius">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Gantt) The border radius in pixels for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderRadius">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Gantt) The border width in pixels for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Gantt) The border width in pixels for the data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Gantt) A class name for the data label. Particularly in styled mode,
   * this can be used to give each series' or point's data label unique
   * styling. In addition to this option, a default color class name is added
   * so that we can give the labels a contrast text shadow.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.className">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Gantt) A class name for the data label. Particularly in styled mode,
   * this can be used to give each series' or point's data label unique
   * styling. In addition to this option, a default color class name is added
   * so that we can give the labels a contrast text shadow.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.className">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Gantt) The text color for the data labels. Defaults to <code>undefined</code>. For
   * certain series types, like column or map, the data labels can be drawn
   * inside the points. In this case the data label will be drawn with maximum
   * contrast by default. Additionally, it will be given a <code>text-outline</code>
   * style with the opposite color, to further increase the contrast. This can
   * be overridden by setting the <code>text-outline</code> style to <code>none</code> in the
   * <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Gantt) The text color for the data labels. Defaults to <code>undefined</code>. For
   * certain series types, like column or map, the data labels can be drawn
   * inside the points. In this case the data label will be drawn with maximum
   * contrast by default. Additionally, it will be given a <code>text-outline</code>
   * style with the opposite color, to further increase the contrast. This can
   * be overridden by setting the <code>text-outline</code> style to <code>none</code> in the
   * <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Gantt) The text color for the data labels. Defaults to <code>undefined</code>. For
   * certain series types, like column or map, the data labels can be drawn
   * inside the points. In this case the data label will be drawn with maximum
   * contrast by default. Additionally, it will be given a <code>text-outline</code>
   * style with the opposite color, to further increase the contrast. This can
   * be overridden by setting the <code>text-outline</code> style to <code>none</code> in the
   * <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) The text color for the data labels. Defaults to <code>undefined</code>. For
   * certain series types, like column or map, the data labels can be drawn
   * inside the points. In this case the data label will be drawn with maximum
   * contrast by default. Additionally, it will be given a <code>text-outline</code>
   * style with the opposite color, to further increase the contrast. This can
   * be overridden by setting the <code>text-outline</code> style to <code>none</code> in the
   * <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Gantt) Whether to hide data labels that are outside the plot area. By
   * default, the data label is moved inside the plot area according to the
   * overflow option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.crop">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.crop</a>
   *
   * @implspec crop?: boolean;
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Gantt) Whether to hide data labels that are outside the plot area. By
   * default, the data label is moved inside the plot area according to the
   * overflow option.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.crop">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.crop</a>
   *
   * @implspec crop?: boolean;
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/highcharts/plotOptions.gantt.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/highstock/plotOptions.gantt.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.defer</a>
   *
   * @implspec defer?: boolean;
   *
   */
  @JSProperty("defer")
  boolean getDefer();

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/highcharts/plotOptions.gantt.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/highstock/plotOptions.gantt.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.defer">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.defer</a>
   *
   * @implspec defer?: boolean;
   *
   */
  @JSProperty("defer")
  void setDefer(boolean value);

  /**
   * (Gantt) Enable or disable the data labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.enabled">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable or disable the data labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.enabled">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Gantt) A declarative filter for which data labels to display. The
   * declarative filter is designed for use when callback functions are not
   * available, like when the chart options require a pure JSON structure or
   * for use with graphical editors. For programmatic control, use the
   * <code>formatter</code> instead, and return <code>undefined</code> to disable a single data
   * label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.filter">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.filter</a>
   *
   * @implspec filter?: PlotGanttDataLabelsFilterOptions;
   *
   */
  @JSProperty("filter")
  @Nullable
  PlotGanttDataLabelsFilterOptions getFilter();

  /**
   * (Gantt) A declarative filter for which data labels to display. The
   * declarative filter is designed for use when callback functions are not
   * available, like when the chart options require a pure JSON structure or
   * for use with graphical editors. For programmatic control, use the
   * <code>formatter</code> instead, and return <code>undefined</code> to disable a single data
   * label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.filter">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.filter</a>
   *
   * @implspec filter?: PlotGanttDataLabelsFilterOptions;
   *
   */
  @JSProperty("filter")
  void setFilter(PlotGanttDataLabelsFilterOptions value);

  /**
   * (Gantt) A format string for the data label. Available variables are the
   * same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.format">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Gantt) A format string for the data label. Available variables are the
   * same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.format">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Gantt) The default formatter for X-range data labels displays the
   * percentage of the partial fill amount.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.formatter">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject> getFormatter();

  /**
   * (Gantt) The default formatter for X-range data labels displays the
   * percentage of the partial fill amount.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.formatter">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject> value);

  /**
   * (Gantt) For points with an extent, like columns or map areas, whether to
   * align the data label inside the box or to the actual value point.
   * Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.inside">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Gantt) For points with an extent, like columns or map areas, whether to
   * align the data label inside the box or to the actual value point.
   * Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.inside">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  void setInside(boolean value);

  /**
   * (Gantt) How to handle data labels that flow outside the plot area. The
   * default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For
   * columns and bars, this means it will be moved inside the bar. To display
   * data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code>
   * to <code>&quot;allow&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.overflow">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Gantt) How to handle data labels that flow outside the plot area. The
   * default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For
   * columns and bars, this means it will be moved inside the bar. To display
   * data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code>
   * to <code>&quot;allow&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.overflow">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  void setOverflow(Overflow value);

  /**
   * (Gantt) When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,
   * this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.padding">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Gantt) When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,
   * this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.padding">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Gantt) Text rotation in degrees. Note that due to a more complex
   * structure, backgrounds, borders and padding will be lost on a rotated
   * data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.rotation">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Gantt) Text rotation in degrees. Note that due to a more complex
   * structure, backgrounds, borders and padding will be lost on a rotated
   * data label.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.rotation">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Gantt) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Gantt) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Gantt) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Gantt) The name of a symbol to use for the border around the label.
   * Symbols are predefined functions on the Renderer object.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shape">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Gantt) The name of a symbol to use for the border around the label.
   * Symbols are predefined functions on the Renderer object.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shape">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  void setShape(String value);

  /**
   * (Gantt) Styles for the label. The default <code>color</code> setting is
   * <code>&quot;contrast&quot;</code>, which is a pseudo color that Highcharts picks up and
   * applies the maximum contrast to the underlying point item, for example
   * the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.style">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Gantt) Styles for the label. The default <code>color</code> setting is
   * <code>&quot;contrast&quot;</code>, which is a pseudo color that Highcharts picks up and
   * applies the maximum contrast to the underlying point item, for example
   * the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.style">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.useHTML">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.useHTML">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Gantt) The vertical alignment of a data label. Can be one of <code>top</code>,
   * <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance
   * in a column chart, the label is above positive values and below negative
   * values.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.verticalAlign">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Gantt) The vertical alignment of a data label. Can be one of <code>top</code>,
   * <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance
   * in a column chart, the label is above positive values and below negative
   * values.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.verticalAlign">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Gantt) The x position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.x">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Gantt) The x position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.x">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Gantt) The y position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.y">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.y</a>
   *
   * @implspec y?: (number|null);
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Gantt) The y position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.y">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.y</a>
   *
   * @implspec y?: (number|null);
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Gantt) The Z index of the data labels. The default Z index puts it above
   * the series. Use a Z index of 2 to display it behind the series.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Gantt) The Z index of the data labels. The default Z index puts it above
   * the series. Use a Z index of 2 to display it behind the series.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dataLabels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }

  /**
   */
  abstract class Overflow extends JsEnum {
    public static final Overflow ALLOW = JsEnum.of("allow");

    public static final Overflow JUSTIFY = JsEnum.of("justify");
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
