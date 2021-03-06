package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for the selected point. These settings
 * override the normal state options when a point is selected.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select</a>
 *
 */
public interface PlotWindbarbStatesSelectOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWindbarbStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWindbarbStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWindbarbStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWindbarbStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotWindbarbStatesSelectAnimationOptions value);

  /**
   * (Highcharts, Highstock, Gantt) A specific border color for the selected
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Gantt) A specific border color for the selected
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.borderColor">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.windbarb.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.windbarb.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.windbarb.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.windbarb.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
   * series to visualize that the user hovers either the series itself or the
   * legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
   * series to visualize that the user hovers either the series itself or the
   * legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.enabled">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);
}
