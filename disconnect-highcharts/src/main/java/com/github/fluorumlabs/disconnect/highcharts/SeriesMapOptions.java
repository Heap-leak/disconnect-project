package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A <code>map</code> series. If the type option is not specified, it is
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
 * Options for all <code>map</code> series are defined in plotOptions.map.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highmaps/series.map">https://api.highcharts.com/highmaps/series.map</a>
 *
 */
public interface SeriesMapOptions extends PlotMapOptions, SeriesOptions {
  /**
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example:(see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example:(see online documentation for example)
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
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data">https://api.highcharts.com/highmaps/series.map.data</a>
   *
   * @implspec data?: Array&lt;(number|[string, number]|SeriesMapDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<Unknown> getData();

  /**
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example:(see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example:(see online documentation for example)
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
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data">https://api.highcharts.com/highmaps/series.map.data</a>
   *
   * @implspec data?: Array&lt;(number|[string, number]|SeriesMapDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  void setData(Array<Unknown> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;map&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;map&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type MAP = JsEnum.of("map");
  }
}
