package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Animation when hovering over the marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover.animation</a>
 *
 */
public interface PlotPriceenvelopesMarkerStatesHoverAnimationOptions extends Any {
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
