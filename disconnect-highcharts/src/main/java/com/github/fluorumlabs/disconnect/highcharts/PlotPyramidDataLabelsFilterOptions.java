package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts) A declarative filter for which data labels to display. The
 * declarative filter is designed for use when callback functions are not
 * available, like when the chart options require a pure JSON structure or for
 * use with graphical editors. For programmatic control, use the <code>formatter</code>
 * instead, and return <code>undefined</code> to disable a single data label.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter</a>
 *
 */
public interface PlotPyramidDataLabelsFilterOptions extends Any {
  /**
   * (Highcharts) The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>,
   * <code>&lt;=</code>, <code>==</code>, and <code>===</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.operator">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.operator</a>
   *
   * @implspec operator?: (&quot;==&quot;|&quot;===&quot;|&quot;&gt;&quot;|&quot;&gt;=&quot;|&quot;&lt;&quot;|&quot;&lt;=&quot;);
   *
   */
  @JSProperty("operator")
  @Nullable
  Operator getOperator();

  /**
   * (Highcharts) The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>,
   * <code>&lt;=</code>, <code>==</code>, and <code>===</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.operator">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.operator</a>
   *
   * @implspec operator?: (&quot;==&quot;|&quot;===&quot;|&quot;&gt;&quot;|&quot;&gt;=&quot;|&quot;&lt;&quot;|&quot;&lt;=&quot;);
   *
   */
  @JSProperty("operator")
  void setOperator(Operator value);

  /**
   * (Highcharts) The point property to filter by. Point options are passed
   * directly to properties, additionally there are <code>y</code> value, <code>percentage</code>
   * and others listed under Point members.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.property">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.property</a>
   *
   * @implspec property?: string;
   *
   */
  @JSProperty("property")
  @Nullable
  String getProperty();

  /**
   * (Highcharts) The point property to filter by. Point options are passed
   * directly to properties, additionally there are <code>y</code> value, <code>percentage</code>
   * and others listed under Point members.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.property">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.property</a>
   *
   * @implspec property?: string;
   *
   */
  @JSProperty("property")
  void setProperty(String value);

  /**
   * (Highcharts) The value to compare against.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.value">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.value</a>
   *
   * @implspec value?: any;
   *
   */
  @JSProperty("value")
  @Nullable
  Any getValue();

  /**
   * (Highcharts) The value to compare against.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.value">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels.filter.value</a>
   *
   * @implspec value?: any;
   *
   */
  @JSProperty("value")
  void setValue(Any value);

}
