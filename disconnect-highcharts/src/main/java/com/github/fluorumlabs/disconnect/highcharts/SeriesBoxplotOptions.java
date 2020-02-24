package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>boxplot</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * Configuration options for the series are given in three levels:
 *
 * <ol>
 * <li>
 * Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * </li>
 * <li>
 * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.boxplot">https://api.highcharts.com/highcharts/series.boxplot</a>
 *
 */
public interface SeriesBoxplotOptions extends PlotBoxplotOptions, SeriesOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options.(see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available.(see online documentation for example)
   *
   * </li>
   * </ol>
   * @see <a href="https://api.highcharts.com/highcharts/series.boxplot.data">https://api.highcharts.com/highcharts/series.boxplot.data</a>
   *
   * @implspec data?: Array&lt;([(number|string), number, number, number, number]|[(number|string), number, number, number, number, number]|SeriesBoxplotDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<Unknown> getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options.(see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available.(see online documentation for example)
   *
   * </li>
   * </ol>
   * @see <a href="https://api.highcharts.com/highcharts/series.boxplot.data">https://api.highcharts.com/highcharts/series.boxplot.data</a>
   *
   * @implspec data?: Array&lt;([(number|string), number, number, number, number]|[(number|string), number, number, number, number, number]|SeriesBoxplotDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  void setData(Array<Unknown> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;boxplot&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;boxplot&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type BOXPLOT = JsEnum.of("boxplot");
  }
}
