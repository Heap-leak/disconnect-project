package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the hovered series. These settings override the
 * normal state options when a series is moused over or touched.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover</a>
 *
 */
public interface PlotZigzagStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotZigzagStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotZigzagStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotZigzagStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotZigzagStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotZigzagStatesHoverAnimationOptions value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps) The border color of the point in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) The relative brightness of the point when hovered, relative to
   * the normal point color.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.brightness">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  double getBrightness();

  /**
   * (Highmaps) The relative brightness of the point when hovered, relative to
   * the normal point color.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.brightness">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line- type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>false</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.halo</a>
   *
   * @implspec halo?: PlotZigzagStatesHoverHaloOptions;
   *
   */
  @JSProperty("halo")
  @Nullable
  PlotZigzagStatesHoverHaloOptions getHalo();

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line- type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>false</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.halo</a>
   *
   * @implspec halo?: PlotZigzagStatesHoverHaloOptions;
   *
   */
  @JSProperty("halo")
  void setHalo(PlotZigzagStatesHoverHaloOptions value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidth">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidth">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
   * belonging to the hovered series. For settings on the hover state of the
   * individual point, see marker.states.hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.marker">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.marker">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.marker</a>
   *
   * @implspec marker?: PlotZigzagStatesHoverMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotZigzagStatesHoverMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
   * belonging to the hovered series. For settings on the hover state of the
   * individual point, see marker.states.hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.marker">https://api.highcharts.com/highcharts/plotOptions.zigzag.states.hover.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.marker">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover.marker</a>
   *
   * @implspec marker?: PlotZigzagStatesHoverMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotZigzagStatesHoverMarkerOptions value);
}
