package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Data labels for the gauge. For gauges, the data labels are
 * enabled by default and shown in a bordered box below the point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels</a>
 *
 */
public interface PlotSolidgaugeDataLabelsOptions extends Any {
  /**
   * (Highcharts) The alignment of the data label compared to the point. If
   * <code>right</code>, the right side of the label should be touching the point. For
   * points with an extent, like columns, the alignments also dictates how to
   * align it inside the box, as given with the inside option. Can be one of
   * <code>left</code>, <code>center</code> or <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.align">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) The alignment of the data label compared to the point. If
   * <code>right</code>, the right side of the label should be touching the point. For
   * points with an extent, like columns, the alignments also dictates how to
   * align it inside the box, as given with the inside option. Can be one of
   * <code>left</code>, <code>center</code> or <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.align">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts) Whether to allow data labels to overlap. To make the labels
   * less sensitive for overlapping, the dataLabels.padding can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.allowOverlap">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts) Whether to allow data labels to overlap. To make the labels
   * less sensitive for overlapping, the dataLabels.padding can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.allowOverlap">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts) The background color or gradient for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highcharts, Highmaps) The border color for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderColor">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highmaps) The border color for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderColor">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderColor">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highmaps) The border radius in pixels for the gauge's data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderRadius">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderRadius">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highmaps) The border radius in pixels for the gauge's data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderRadius">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderRadius">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highmaps) The border width in pixels for the gauge data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderWidth">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highmaps) The border width in pixels for the gauge data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderWidth">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) A class name for the data label. Particularly in styled
   * mode, this can be used to give each series' or point's data label unique
   * styling. In addition to this option, a default color class name is added
   * so that we can give the labels a contrast text shadow.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.className">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) A class name for the data label. Particularly in styled
   * mode, this can be used to give each series' or point's data label unique
   * styling. In addition to this option, a default color class name is added
   * so that we can give the labels a contrast text shadow.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.className">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) The text color for the data labels. Defaults to <code>undefined</code>.
   * For certain series types, like column or map, the data labels can be
   * drawn inside the points. In this case the data label will be drawn with
   * maximum contrast by default. Additionally, it will be given a
   * <code>text-outline</code> style with the opposite color, to further increase the
   * contrast. This can be overridden by setting the <code>text-outline</code> style to
   * <code>none</code> in the <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The text color for the data labels. Defaults to <code>undefined</code>.
   * For certain series types, like column or map, the data labels can be
   * drawn inside the points. In this case the data label will be drawn with
   * maximum contrast by default. Additionally, it will be given a
   * <code>text-outline</code> style with the opposite color, to further increase the
   * contrast. This can be overridden by setting the <code>text-outline</code> style to
   * <code>none</code> in the <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The text color for the data labels. Defaults to <code>undefined</code>.
   * For certain series types, like column or map, the data labels can be
   * drawn inside the points. In this case the data label will be drawn with
   * maximum contrast by default. Additionally, it will be given a
   * <code>text-outline</code> style with the opposite color, to further increase the
   * contrast. This can be overridden by setting the <code>text-outline</code> style to
   * <code>none</code> in the <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The text color for the data labels. Defaults to <code>undefined</code>.
   * For certain series types, like column or map, the data labels can be
   * drawn inside the points. In this case the data label will be drawn with
   * maximum contrast by default. Additionally, it will be given a
   * <code>text-outline</code> style with the opposite color, to further increase the
   * contrast. This can be overridden by setting the <code>text-outline</code> style to
   * <code>none</code> in the <code>dataLabels.style</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) Whether to hide data labels that are outside the plot area.
   * By default, the data label is moved inside the plot area according to the
   * overflow option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.crop">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.crop</a>
   *
   * @implspec crop?: boolean;
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts) Whether to hide data labels that are outside the plot area.
   * By default, the data label is moved inside the plot area according to the
   * overflow option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.crop">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.crop</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/highstock/plotOptions.solidgauge.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/gantt/plotOptions.solidgauge.dataLabels.defer</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/highstock/plotOptions.solidgauge.dataLabels.defer</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.solidgauge.dataLabels.defer">https://api.highcharts.com/gantt/plotOptions.solidgauge.dataLabels.defer</a>
   *
   * @implspec defer?: boolean;
   *
   */
  @JSProperty("defer")
  void setDefer(boolean value);

  /**
   * (Highcharts, Highmaps) Enable or disable the data labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.enabled">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.enabled">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highmaps) Enable or disable the data labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.enabled">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.enabled">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) A declarative filter for which data labels to display. The
   * declarative filter is designed for use when callback functions are not
   * available, like when the chart options require a pure JSON structure or
   * for use with graphical editors. For programmatic control, use the
   * <code>formatter</code> instead, and return <code>undefined</code> to disable a single data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.filter">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.filter</a>
   *
   * @implspec filter?: PlotSolidgaugeDataLabelsFilterOptions;
   *
   */
  @JSProperty("filter")
  @Nullable
  PlotSolidgaugeDataLabelsFilterOptions getFilter();

  /**
   * (Highcharts) A declarative filter for which data labels to display. The
   * declarative filter is designed for use when callback functions are not
   * available, like when the chart options require a pure JSON structure or
   * for use with graphical editors. For programmatic control, use the
   * <code>formatter</code> instead, and return <code>undefined</code> to disable a single data
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.filter">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.filter</a>
   *
   * @implspec filter?: PlotSolidgaugeDataLabelsFilterOptions;
   *
   */
  @JSProperty("filter")
  void setFilter(PlotSolidgaugeDataLabelsFilterOptions value);

  /**
   * (Highcharts) A format string for the data label. Available variables are
   * the same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.format">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts) A format string for the data label. Available variables are
   * the same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.format">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highcharts) Callback JavaScript function to format the data label. Note
   * that if a <code>format</code> is defined, the format takes precedence and the
   * formatter is ignored. Available data are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.formatter">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject> getFormatter();

  /**
   * (Highcharts) Callback JavaScript function to format the data label. Note
   * that if a <code>format</code> is defined, the format takes precedence and the
   * formatter is ignored. Available data are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.formatter">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<SeriesDataLabelsFormatterContextObject> value);

  /**
   * (Highcharts) For points with an extent, like columns or map areas,
   * whether to align the data label inside the box or to the actual value
   * point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.inside">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Highcharts) For points with an extent, like columns or map areas,
   * whether to align the data label inside the box or to the actual value
   * point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.inside">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  void setInside(boolean value);

  /**
   * (Highcharts) How to handle data labels that flow outside the plot area.
   * The default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For
   * columns and bars, this means it will be moved inside the bar. To display
   * data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code>
   * to <code>&quot;allow&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.overflow">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts) How to handle data labels that flow outside the plot area.
   * The default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For
   * columns and bars, this means it will be moved inside the bar. To display
   * data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code>
   * to <code>&quot;allow&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.overflow">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  void setOverflow(Overflow value);

  /**
   * (Highcharts) When either the <code>borderWidth</code> or the <code>backgroundColor</code> is
   * set, this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.padding">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts) When either the <code>borderWidth</code> or the <code>backgroundColor</code> is
   * set, this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.padding">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts) Text rotation in degrees. Note that due to a more complex
   * structure, backgrounds, borders and padding will be lost on a rotated
   * data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.rotation">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Text rotation in degrees. Note that due to a more complex
   * structure, backgrounds, borders and padding will be lost on a rotated
   * data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.rotation">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts) The shadow of the box. Works best with <code>borderWidth</code> or
   * <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts) The name of a symbol to use for the border around the label.
   * Symbols are predefined functions on the Renderer object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shape">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highcharts) The name of a symbol to use for the border around the label.
   * Symbols are predefined functions on the Renderer object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shape">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  void setShape(String value);

  /**
   * (Highcharts) Styles for the label. The default <code>color</code> setting is
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.style">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts) Styles for the label. The default <code>color</code> setting is
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.style">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.useHTML">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.useHTML">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highmaps) The vertical alignment of the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.verticalAlign">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.verticalAlign">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highmaps) The vertical alignment of the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.verticalAlign">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.verticalAlign">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts) The x position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.x">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) The x position offset of the label relative to the point in
   * pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.x">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highmaps) The y position offset of the label relative to the
   * center of the gauge.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.y">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.y">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highmaps) The y position offset of the label relative to the
   * center of the gauge.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.y">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.y">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highmaps) The Z index of the data labels. A value of 2
   * display them behind the dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.zIndex">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.zIndex">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highmaps) The Z index of the data labels. A value of 2
   * display them behind the dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.zIndex">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dataLabels.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.zIndex">https://api.highcharts.com/highmaps/plotOptions.solidgauge.dataLabels.zIndex</a>
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
