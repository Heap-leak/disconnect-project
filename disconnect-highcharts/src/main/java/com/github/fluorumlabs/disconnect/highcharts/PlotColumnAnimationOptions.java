package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Enable or disable the initial animation when a series
 * is displayed. The animation can also be set as a configuration object. Please
 * note that this option only applies to the initial animation of the series
 * itself. For other animations, see chart.animation and the animation parameter
 * under the API methods. The following properties are supported:
 *
 * (see online documentation for example)
 *
 * Due to poor performance, animation is disabled in old IE browsers for several
 * chart types.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.animation">https://api.highcharts.com/highcharts/plotOptions.column.animation</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.animation">https://api.highcharts.com/highstock/plotOptions.column.animation</a>
 *
 */
public interface PlotColumnAnimationOptions extends Any {
  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  void setDuration(double value);
}
