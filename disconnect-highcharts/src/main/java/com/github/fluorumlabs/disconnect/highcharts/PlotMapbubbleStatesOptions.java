package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states</a>
 *
 */
public interface PlotMapbubbleStatesOptions extends Any {
  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.hover</a>
   *
   * @implspec hover?: PlotMapbubbleStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMapbubbleStatesHoverOptions getHover();

  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.hover</a>
   *
   * @implspec hover?: PlotMapbubbleStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMapbubbleStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.normal</a>
   *
   * @implspec normal?: PlotMapbubbleStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMapbubbleStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.normal</a>
   *
   * @implspec normal?: PlotMapbubbleStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMapbubbleStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.select">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.select</a>
   *
   * @implspec select?: PlotMapbubbleStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMapbubbleStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.select">https://api.highcharts.com/highmaps/plotOptions.mapbubble.states.select</a>
   *
   * @implspec select?: PlotMapbubbleStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMapbubbleStatesSelectOptions value);
}
