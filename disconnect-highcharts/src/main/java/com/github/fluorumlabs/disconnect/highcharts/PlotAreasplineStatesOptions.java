package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.states">https://api.highcharts.com/highcharts/plotOptions.areaspline.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.states">https://api.highcharts.com/highstock/plotOptions.areaspline.states</a>
 *
 */
public interface PlotAreasplineStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.states.hover">https://api.highcharts.com/highcharts/plotOptions.areaspline.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.states.hover">https://api.highcharts.com/highstock/plotOptions.areaspline.states.hover</a>
   *
   * @implspec hover?: PlotAreasplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreasplineStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.states.hover">https://api.highcharts.com/highcharts/plotOptions.areaspline.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.states.hover">https://api.highcharts.com/highstock/plotOptions.areaspline.states.hover</a>
   *
   * @implspec hover?: PlotAreasplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreasplineStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areaspline.states.normal">https://api.highcharts.com/highmaps/plotOptions.areaspline.states.normal</a>
   *
   * @implspec normal?: PlotAreasplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreasplineStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areaspline.states.normal">https://api.highcharts.com/highmaps/plotOptions.areaspline.states.normal</a>
   *
   * @implspec normal?: PlotAreasplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreasplineStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areaspline.states.select">https://api.highcharts.com/highmaps/plotOptions.areaspline.states.select</a>
   *
   * @implspec select?: PlotAreasplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreasplineStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areaspline.states.select">https://api.highcharts.com/highmaps/plotOptions.areaspline.states.select</a>
   *
   * @implspec select?: PlotAreasplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreasplineStatesSelectOptions value);
}
