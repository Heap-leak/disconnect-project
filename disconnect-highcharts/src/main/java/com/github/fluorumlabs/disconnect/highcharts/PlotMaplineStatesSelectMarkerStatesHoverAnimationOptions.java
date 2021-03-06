package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Animation when hovering over the marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mapline.states.select.marker.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.mapline.states.select.marker.states.hover.animation</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mapline.states.select.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.mapline.states.select.marker.states.hover.animation</a>
 *
 */
public interface PlotMaplineStatesSelectMarkerStatesHoverAnimationOptions extends Any {
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
