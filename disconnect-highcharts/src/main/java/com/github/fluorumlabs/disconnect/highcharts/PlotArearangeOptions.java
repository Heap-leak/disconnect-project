package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The area range series is a carteseian series with
 * higher and lower values for each point along an X axis, where the area
 * between the values is shaded. Requires <code>highcharts-more.js</code>.
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
 * Options for all <code>arearange</code> series are defined in plotOptions.arearange.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange">https://api.highcharts.com/highcharts/plotOptions.arearange</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange">https://api.highcharts.com/highstock/plotOptions.arearange</a>
 *
 */
public interface PlotArearangeOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.allAreas">https://api.highcharts.com/highmaps/plotOptions.arearange.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  boolean getAllAreas();

  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.allAreas">https://api.highcharts.com/highmaps/plotOptions.arearange.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.arearange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.arearange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.arearange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.arearange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animation">https://api.highcharts.com/highcharts/plotOptions.arearange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animation">https://api.highcharts.com/highstock/plotOptions.arearange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotArearangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animation">https://api.highcharts.com/highcharts/plotOptions.arearange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animation">https://api.highcharts.com/highstock/plotOptions.arearange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotArearangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animation">https://api.highcharts.com/highcharts/plotOptions.arearange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animation">https://api.highcharts.com/highstock/plotOptions.arearange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotArearangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotArearangeAnimationOptions value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animation">https://api.highcharts.com/highcharts/plotOptions.arearange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animation">https://api.highcharts.com/highstock/plotOptions.arearange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotArearangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation doesn't run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.arearange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animationLimit">https://api.highcharts.com/highstock/plotOptions.arearange.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation doesn't run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.arearange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.animationLimit">https://api.highcharts.com/highstock/plotOptions.arearange.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
   *
   * Setting it to e.g. 2000 will cause the series to enter boost mode when
   * there are 2000 or more points in the series.
   *
   * To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting
   * it to 1 will force boosting.
   *
   * Note that the cropThreshold also affects this setting. When zooming in on
   * a series that has fewer points than the <code>cropThreshold</code>, all points are
   * rendered although outside the visible plot area, and the <code>boostThreshold</code>
   * won't take effect.
   *
   * Requires <code>modules/boost.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.boostThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
   *
   * Setting it to e.g. 2000 will cause the series to enter boost mode when
   * there are 2000 or more points in the series.
   *
   * To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting
   * it to 1 will force boosting.
   *
   * Note that the cropThreshold also affects this setting. When zooming in on
   * a series that has fewer points than the <code>cropThreshold</code>, all points are
   * rendered although outside the visible plot area, and the <code>boostThreshold</code>
   * won't take effect.
   *
   * Requires <code>modules/boost.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.boostThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.borderColor">https://api.highcharts.com/highmaps/plotOptions.arearange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.borderColor">https://api.highcharts.com/highcharts/plotOptions.arearange.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.borderColor">https://api.highcharts.com/highmaps/plotOptions.arearange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.borderColor">https://api.highcharts.com/highcharts/plotOptions.arearange.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps, Highcharts) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.borderWidth">https://api.highcharts.com/highmaps/plotOptions.arearange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.arearange.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps, Highcharts) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.borderWidth">https://api.highcharts.com/highmaps/plotOptions.arearange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.arearange.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.className">https://api.highcharts.com/highcharts/plotOptions.arearange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.className">https://api.highcharts.com/highstock/plotOptions.arearange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.className">https://api.highcharts.com/highcharts/plotOptions.arearange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.className">https://api.highcharts.com/highstock/plotOptions.arearange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.clip">https://api.highcharts.com/highcharts/plotOptions.arearange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.clip">https://api.highcharts.com/highstock/plotOptions.arearange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.clip">https://api.highcharts.com/highcharts/plotOptions.arearange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.clip">https://api.highcharts.com/highstock/plotOptions.arearange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.color">https://api.highcharts.com/highcharts/plotOptions.arearange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.color">https://api.highcharts.com/highstock/plotOptions.arearange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.color">https://api.highcharts.com/highcharts/plotOptions.arearange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.color">https://api.highcharts.com/highstock/plotOptions.arearange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.color">https://api.highcharts.com/highcharts/plotOptions.arearange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.color">https://api.highcharts.com/highstock/plotOptions.arearange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.color">https://api.highcharts.com/highcharts/plotOptions.arearange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.color">https://api.highcharts.com/highstock/plotOptions.arearange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highmaps) Set this option to <code>false</code> to prevent a series from connecting
   * to the global color axis. This will cause the series to have its own
   * legend item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.arearange.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  boolean getColorAxis();

  /**
   * (Highmaps) Set this option to <code>false</code> to prevent a series from connecting
   * to the global color axis. This will cause the series to have its own
   * legend item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.arearange.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.arearange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.colorIndex">https://api.highcharts.com/highstock/plotOptions.arearange.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.arearange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.colorIndex">https://api.highcharts.com/highstock/plotOptions.arearange.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compare">https://api.highcharts.com/highstock/plotOptions.arearange.compare</a>
   *
   * @implspec compare?: string;
   *
   */
  @JSProperty("compare")
  @Nullable
  String getCompare();

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compare">https://api.highcharts.com/highstock/plotOptions.arearange.compare</a>
   *
   * @implspec compare?: string;
   *
   */
  @JSProperty("compare")
  void setCompare(String value);

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compareBase">https://api.highcharts.com/highstock/plotOptions.arearange.compareBase</a>
   *
   * @implspec compareBase?: (0|100);
   *
   */
  @JSProperty("compareBase")
  @Nullable
  CompareBase getCompareBase();

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compareBase">https://api.highcharts.com/highstock/plotOptions.arearange.compareBase</a>
   *
   * @implspec compareBase?: (0|100);
   *
   */
  @JSProperty("compareBase")
  void setCompareBase(CompareBase value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compareStart">https://api.highcharts.com/highstock/plotOptions.arearange.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  boolean getCompareStart();

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.compareStart">https://api.highcharts.com/highstock/plotOptions.arearange.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.connectEnds">https://api.highcharts.com/highcharts/plotOptions.arearange.connectEnds</a>
   *
   * @implspec connectEnds?: boolean;
   *
   */
  @JSProperty("connectEnds")
  boolean getConnectEnds();

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.connectEnds">https://api.highcharts.com/highcharts/plotOptions.arearange.connectEnds</a>
   *
   * @implspec connectEnds?: boolean;
   *
   */
  @JSProperty("connectEnds")
  void setConnectEnds(boolean value);

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.connectNulls">https://api.highcharts.com/highcharts/plotOptions.arearange.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.connectNulls">https://api.highcharts.com/highstock/plotOptions.arearange.connectNulls</a>
   *
   * @implspec connectNulls?: boolean;
   *
   */
  @JSProperty("connectNulls")
  boolean getConnectNulls();

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.connectNulls">https://api.highcharts.com/highcharts/plotOptions.arearange.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.connectNulls">https://api.highcharts.com/highstock/plotOptions.arearange.connectNulls</a>
   *
   * @implspec connectNulls?: boolean;
   *
   */
  @JSProperty("connectNulls")
  void setConnectNulls(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors">https://api.highcharts.com/gantt/plotOptions.arearange.connectors</a>
   *
   * @implspec connectors?: PlotArearangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotArearangeConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors">https://api.highcharts.com/gantt/plotOptions.arearange.connectors</a>
   *
   * @implspec connectors?: PlotArearangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotArearangeConnectorsOptions value);

  /**
   * (Highcharts, Highstock) When the series contains less points than the
   * crop threshold, all points are drawn, even if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.cropThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  double getCropThreshold();

  /**
   * (Highcharts, Highstock) When the series contains less points than the
   * crop threshold, all points are drawn, even if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.cropThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.cursor">https://api.highcharts.com/highcharts/plotOptions.arearange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.cursor">https://api.highcharts.com/highstock/plotOptions.arearange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.cursor">https://api.highcharts.com/highcharts/plotOptions.arearange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.cursor">https://api.highcharts.com/highstock/plotOptions.arearange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.cursor">https://api.highcharts.com/highcharts/plotOptions.arearange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.cursor">https://api.highcharts.com/highstock/plotOptions.arearange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph,
   * or for some series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dashStyle">https://api.highcharts.com/highcharts/plotOptions.arearange.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dashStyle">https://api.highcharts.com/highstock/plotOptions.arearange.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph,
   * or for some series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dashStyle">https://api.highcharts.com/highcharts/plotOptions.arearange.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dashStyle">https://api.highcharts.com/highstock/plotOptions.arearange.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(DashStyle value);

  /**
   * (Highstock) Data grouping is the concept of sampling the data values into
   * larger blocks in order to ease readability and increase performance of
   * the JavaScript charts. Highstock by default applies data grouping when
   * the points become closer than a certain pixel value, determined by the
   * <code>groupPixelWidth</code> option.
   *
   * If data grouping is applied, the grouping information of grouped points
   * can be read from the Point.dataGroup. If point options other than the
   * data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
   * the grouping logic doesn't know how to group it. In this case the options
   * of the first point instance are copied over to the group point. This can
   * be altered through a custom <code>approximation</code> callback function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.arearange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotArearangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotArearangeDataGroupingOptions getDataGrouping();

  /**
   * (Highstock) Data grouping is the concept of sampling the data values into
   * larger blocks in order to ease readability and increase performance of
   * the JavaScript charts. Highstock by default applies data grouping when
   * the points become closer than a certain pixel value, determined by the
   * <code>groupPixelWidth</code> option.
   *
   * If data grouping is applied, the grouping information of grouped points
   * can be read from the Point.dataGroup. If point options other than the
   * data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
   * the grouping logic doesn't know how to group it. In this case the options
   * of the first point instance are copied over to the group point. This can
   * be altered through a custom <code>approximation</code> callback function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.arearange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotArearangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotArearangeDataGroupingOptions value);

  /**
   * (Highcharts, Highstock) Extended data labels for range series types.
   * Range series data labels have no <code>x</code> and <code>y</code> options. Instead, they have
   * <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower
   * data label sets individually.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.arearange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dataLabels">https://api.highcharts.com/highstock/plotOptions.arearange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotArearangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotArearangeDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock) Extended data labels for range series types.
   * Range series data labels have no <code>x</code> and <code>y</code> options. Instead, they have
   * <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower
   * data label sets individually.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.arearange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dataLabels">https://api.highcharts.com/highstock/plotOptions.arearange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotArearangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotArearangeDataLabelsOptions value);

  /**
   * (Highcharts, Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.description">https://api.highcharts.com/highcharts/plotOptions.arearange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.description">https://api.highcharts.com/highstock/plotOptions.arearange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.description">https://api.highcharts.com/highcharts/plotOptions.arearange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.description">https://api.highcharts.com/highstock/plotOptions.arearange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.arearange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dragDrop">https://api.highcharts.com/highstock/plotOptions.arearange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotArearangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotArearangeDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.arearange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.dragDrop">https://api.highcharts.com/highstock/plotOptions.arearange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotArearangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotArearangeDragDropOptions value);

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.arearange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.arearange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.arearange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.arearange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.events">https://api.highcharts.com/highcharts/plotOptions.arearange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.events">https://api.highcharts.com/highstock/plotOptions.arearange.events</a>
   *
   * @implspec events?: PlotArearangeEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotArearangeEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.events">https://api.highcharts.com/highcharts/plotOptions.arearange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.events">https://api.highcharts.com/highstock/plotOptions.arearange.events</a>
   *
   * @implspec events?: PlotArearangeEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotArearangeEventsOptions value);

  /**
   * (Highcharts, Highstock) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.arearange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.arearange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts, Highstock) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.arearange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.arearange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillColor">https://api.highcharts.com/highstock/plotOptions.arearange.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillColor">https://api.highcharts.com/highstock/plotOptions.arearange.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillColor">https://api.highcharts.com/highstock/plotOptions.arearange.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillColor">https://api.highcharts.com/highstock/plotOptions.arearange.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) Fill opacity for the area. When you set an
   * explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you
   * should define the opacity in the <code>fillColor</code> with an rgba color
   * definition. The <code>fillOpacity</code> setting, also the default setting,
   * overrides the alpha component of the <code>color</code> setting.
   *
   * In styled mode, the fill opacity can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.arearange.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillOpacity">https://api.highcharts.com/highstock/plotOptions.arearange.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highcharts, Highstock) Fill opacity for the area. When you set an
   * explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you
   * should define the opacity in the <code>fillColor</code> with an rgba color
   * definition. The <code>fillOpacity</code> setting, also the default setting,
   * overrides the alpha component of the <code>color</code> setting.
   *
   * In styled mode, the fill opacity can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.arearange.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.fillOpacity">https://api.highcharts.com/highstock/plotOptions.arearange.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.arearange.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.arearange.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.arearange.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.arearange.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(FindNearestPointBy value);

  /**
   * (Highstock) Defines when to display a gap in the graph, together with the
   * gapUnit option.
   *
   * In case when <code>dataGrouping</code> is enabled, points can be grouped into a
   * larger time span. This can make the grouped points to have a greater
   * distance than the absolute value of <code>gapSize</code> property, which will result
   * in disappearing graph completely. To prevent this situation the mentioned
   * distance between grouped points is used instead of previously defined
   * <code>gapSize</code>.
   *
   * In practice, this option is most often used to visualize gaps in time
   * series. In a stock chart, intraday data is available for daytime hours,
   * while gaps will appear in nights and weekends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.gapSize">https://api.highcharts.com/highstock/plotOptions.arearange.gapSize</a>
   *
   * @implspec gapSize?: number;
   *
   */
  @JSProperty("gapSize")
  double getGapSize();

  /**
   * (Highstock) Defines when to display a gap in the graph, together with the
   * gapUnit option.
   *
   * In case when <code>dataGrouping</code> is enabled, points can be grouped into a
   * larger time span. This can make the grouped points to have a greater
   * distance than the absolute value of <code>gapSize</code> property, which will result
   * in disappearing graph completely. To prevent this situation the mentioned
   * distance between grouped points is used instead of previously defined
   * <code>gapSize</code>.
   *
   * In practice, this option is most often used to visualize gaps in time
   * series. In a stock chart, intraday data is available for daytime hours,
   * while gaps will appear in nights and weekends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.gapSize">https://api.highcharts.com/highstock/plotOptions.arearange.gapSize</a>
   *
   * @implspec gapSize?: number;
   *
   */
  @JSProperty("gapSize")
  void setGapSize(double value);

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means that if
   * the distance between two points is greater than five times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,
   * which on a datetime axis is milliseconds. This also applies to the
   * navigator series that inherits gap options from the base series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.gapUnit">https://api.highcharts.com/highstock/plotOptions.arearange.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  @Nullable
  GapUnit getGapUnit();

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means that if
   * the distance between two points is greater than five times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,
   * which on a datetime axis is milliseconds. This also applies to the
   * navigator series that inherits gap options from the base series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.gapUnit">https://api.highcharts.com/highstock/plotOptions.arearange.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.arearange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.arearange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.arearange.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  boolean getGetExtremesFromAll();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.arearange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.arearange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.arearange.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy">https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  @Nullable
  Unknown getJoinBy();

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy">https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String value);

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy">https://api.highcharts.com/highmaps/plotOptions.arearange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.keys">https://api.highcharts.com/highcharts/plotOptions.arearange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.keys">https://api.highcharts.com/highstock/plotOptions.arearange.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.keys">https://api.highcharts.com/highcharts/plotOptions.arearange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.keys">https://api.highcharts.com/highstock/plotOptions.arearange.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  void setKeys(String[] value);

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.label">https://api.highcharts.com/highcharts/plotOptions.arearange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.label">https://api.highcharts.com/highstock/plotOptions.arearange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.label">https://api.highcharts.com/gantt/plotOptions.arearange.label</a>
   *
   * @implspec label?: PlotArearangeLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotArearangeLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.label">https://api.highcharts.com/highcharts/plotOptions.arearange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.label">https://api.highcharts.com/highstock/plotOptions.arearange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.label">https://api.highcharts.com/gantt/plotOptions.arearange.label</a>
   *
   * @implspec label?: PlotArearangeLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotArearangeLabelOptions value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.linecap">https://api.highcharts.com/highcharts/plotOptions.arearange.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.linecap">https://api.highcharts.com/highstock/plotOptions.arearange.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  @Nullable
  Linecap getLinecap();

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.linecap">https://api.highcharts.com/highcharts/plotOptions.arearange.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.linecap">https://api.highcharts.com/highstock/plotOptions.arearange.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock) A separate color for the graph line. By default
   * the line takes the <code>color</code> of the series, but the lineColor setting
   * allows setting a separate color for the line without altering the
   * <code>fillColor</code>.
   *
   * In styled mode, the line stroke can be set with the <code>.highcharts-graph</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.lineColor">https://api.highcharts.com/highcharts/plotOptions.arearange.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.lineColor">https://api.highcharts.com/highstock/plotOptions.arearange.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock) A separate color for the graph line. By default
   * the line takes the <code>color</code> of the series, but the lineColor setting
   * allows setting a separate color for the line without altering the
   * <code>fillColor</code>.
   *
   * In styled mode, the line stroke can be set with the <code>.highcharts-graph</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.lineColor">https://api.highcharts.com/highcharts/plotOptions.arearange.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.lineColor">https://api.highcharts.com/highstock/plotOptions.arearange.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock) Pixel width of the arearange graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.lineWidth">https://api.highcharts.com/highcharts/plotOptions.arearange.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.lineWidth">https://api.highcharts.com/highstock/plotOptions.arearange.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the arearange graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.lineWidth">https://api.highcharts.com/highcharts/plotOptions.arearange.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.lineWidth">https://api.highcharts.com/highstock/plotOptions.arearange.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.arearange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.linkedTo">https://api.highcharts.com/highstock/plotOptions.arearange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.linkedTo">https://api.highcharts.com/gantt/plotOptions.arearange.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  @Nullable
  String getLinkedTo();

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.arearange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.linkedTo">https://api.highcharts.com/highstock/plotOptions.arearange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.linkedTo">https://api.highcharts.com/gantt/plotOptions.arearange.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.marker">https://api.highcharts.com/highcharts/plotOptions.arearange.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.marker">https://api.highcharts.com/highstock/plotOptions.arearange.marker</a>
   *
   * @implspec marker?: PlotArearangeMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotArearangeMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.marker">https://api.highcharts.com/highcharts/plotOptions.arearange.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.marker">https://api.highcharts.com/highstock/plotOptions.arearange.marker</a>
   *
   * @implspec marker?: PlotArearangeMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotArearangeMarkerOptions value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.arearange.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  @Nullable
  PlotSeriesOptions getNavigatorOptions();

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.arearange.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor">https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor">https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor">https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor">https://api.highcharts.com/highstock/plotOptions.arearange.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  @Nullable
  Unknown getNegativefillColor();

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(GradientColorObject value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(String value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.arearange.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(Any value);

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.point">https://api.highcharts.com/highcharts/plotOptions.arearange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.point">https://api.highcharts.com/highstock/plotOptions.arearange.point</a>
   *
   * @implspec point?: PlotArearangePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotArearangePointOptions getPoint();

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.point">https://api.highcharts.com/highcharts/plotOptions.arearange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.point">https://api.highcharts.com/highstock/plotOptions.arearange.point</a>
   *
   * @implspec point?: PlotArearangePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotArearangePointOptions value);

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.arearange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.arearange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.arearange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.arearange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, <code>pointInterval</code> defines the interval of the x values. For
   * example, if a series contains one value every decade starting from year
   * 0, set <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the
   * <code>pointInterval</code> is set in milliseconds.
   *
   * It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
   * time intervals.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointInterval">https://api.highcharts.com/highcharts/plotOptions.arearange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointInterval">https://api.highcharts.com/highstock/plotOptions.arearange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointInterval">https://api.highcharts.com/gantt/plotOptions.arearange.pointInterval</a>
   *
   * @implspec pointInterval?: number;
   *
   */
  @JSProperty("pointInterval")
  double getPointInterval();

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, <code>pointInterval</code> defines the interval of the x values. For
   * example, if a series contains one value every decade starting from year
   * 0, set <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the
   * <code>pointInterval</code> is set in milliseconds.
   *
   * It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
   * time intervals.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointInterval">https://api.highcharts.com/highcharts/plotOptions.arearange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointInterval">https://api.highcharts.com/highstock/plotOptions.arearange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointInterval">https://api.highcharts.com/gantt/plotOptions.arearange.pointInterval</a>
   *
   * @implspec pointInterval?: number;
   *
   */
  @JSProperty("pointInterval")
  void setPointInterval(double value);

  /**
   * (Highcharts, Highstock, Gantt) On datetime series, this allows for
   * setting the pointInterval to irregular time units, <code>day</code>, <code>month</code> and
   * <code>year</code>. A day is usually the same as 24 hours, but <code>pointIntervalUnit</code>
   * also takes the DST crossover into consideration when dealing with local
   * time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6
   * months, 10 years etc.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.arearange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.arearange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.arearange.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  @Nullable
  PointIntervalUnit getPointIntervalUnit();

  /**
   * (Highcharts, Highstock, Gantt) On datetime series, this allows for
   * setting the pointInterval to irregular time units, <code>day</code>, <code>month</code> and
   * <code>year</code>. A day is usually the same as 24 hours, but <code>pointIntervalUnit</code>
   * also takes the DST crossover into consideration when dealing with local
   * time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6
   * months, 10 years etc.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.arearange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.arearange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.arearange.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(PointIntervalUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  @Nullable
  Unknown getPointPlacement();

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(double value);

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.arearange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.arearange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(String value);

  /**
   * (Highstock) The width of each point on the x axis. For example in a
   * column chart with one value each day, the pointRange would be 1 day (= 24
   *
   * <ul>
   * <li>
   * 3600
   *
   * </li>
   * <li>
   * 1000 milliseconds). This is normally computed automatically, but this
   * option can be used to override the automatic value.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointRange">https://api.highcharts.com/highstock/plotOptions.arearange.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * (Highstock) The width of each point on the x axis. For example in a
   * column chart with one value each day, the pointRange would be 1 day (= 24
   *
   * <ul>
   * <li>
   * 3600
   *
   * </li>
   * <li>
   * 1000 milliseconds). This is normally computed automatically, but this
   * option can be used to override the automatic value.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointRange">https://api.highcharts.com/highstock/plotOptions.arearange.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointStart">https://api.highcharts.com/highcharts/plotOptions.arearange.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointStart">https://api.highcharts.com/highstock/plotOptions.arearange.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointStart">https://api.highcharts.com/gantt/plotOptions.arearange.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  double getPointStart();

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.pointStart">https://api.highcharts.com/highcharts/plotOptions.arearange.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.pointStart">https://api.highcharts.com/highstock/plotOptions.arearange.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.pointStart">https://api.highcharts.com/gantt/plotOptions.arearange.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.selected">https://api.highcharts.com/highcharts/plotOptions.arearange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.selected">https://api.highcharts.com/highstock/plotOptions.arearange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.selected">https://api.highcharts.com/highcharts/plotOptions.arearange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.selected">https://api.highcharts.com/highstock/plotOptions.arearange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.shadow">https://api.highcharts.com/highcharts/plotOptions.arearange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.shadow">https://api.highcharts.com/highcharts/plotOptions.arearange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.shadow">https://api.highcharts.com/highcharts/plotOptions.arearange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.arearange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.arearange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.arearange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.arearange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.arearange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showInLegend">https://api.highcharts.com/highstock/plotOptions.arearange.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.arearange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showInLegend">https://api.highcharts.com/highstock/plotOptions.arearange.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.arearange.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  boolean getShowInNavigator();

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.arearange.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.arearange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.arearange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.arearange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.arearange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts, Highstock) When this is true, the series will not cause the
   * Y axis to cross the zero plane (or threshold option) unless the data
   * actually crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.softThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.softThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  boolean getSoftThreshold();

  /**
   * (Highcharts, Highstock) When this is true, the series will not cause the
   * Y axis to cross the zero plane (or threshold option) unless the data
   * actually crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.softThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.softThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.states">https://api.highcharts.com/highcharts/plotOptions.arearange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.states">https://api.highcharts.com/highstock/plotOptions.arearange.states</a>
   *
   * @implspec states?: PlotArearangeStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotArearangeStatesOptions getStates();

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.states">https://api.highcharts.com/highcharts/plotOptions.arearange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.states">https://api.highcharts.com/highstock/plotOptions.arearange.states</a>
   *
   * @implspec states?: PlotArearangeStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotArearangeStatesOptions value);

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.step">https://api.highcharts.com/highcharts/plotOptions.arearange.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.step">https://api.highcharts.com/highstock/plotOptions.arearange.step</a>
   *
   * @implspec step?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("step")
  @Nullable
  Step getStep();

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.step">https://api.highcharts.com/highcharts/plotOptions.arearange.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.step">https://api.highcharts.com/highstock/plotOptions.arearange.step</a>
   *
   * @implspec step?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("step")
  void setStep(Step value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.arearange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.arearange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.arearange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.arearange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) The Y axis value to serve as the base for the
   * area, for distinguishing between values above and below a threshold. The
   * area between the graph and the threshold is filled.
   *
   * <ul>
   * <li>
   * If a number is given, the Y axis will scale to the threshold.
   *
   * </li>
   * <li>
   * If <code>null</code>, the scaling behaves like a line series with fill between the
   * graph and the Y axis minimum.
   *
   * </li>
   * <li>
   * If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the
   * corresponing Y axis extreme is filled (since v6.1.0).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.threshold">https://api.highcharts.com/highcharts/plotOptions.arearange.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.threshold">https://api.highcharts.com/highstock/plotOptions.arearange.threshold</a>
   *
   * @implspec threshold?: any;
   *
   */
  @JSProperty("threshold")
  @Nullable
  Any getThreshold();

  /**
   * (Highcharts, Highstock) The Y axis value to serve as the base for the
   * area, for distinguishing between values above and below a threshold. The
   * area between the graph and the threshold is filled.
   *
   * <ul>
   * <li>
   * If a number is given, the Y axis will scale to the threshold.
   *
   * </li>
   * <li>
   * If <code>null</code>, the scaling behaves like a line series with fill between the
   * graph and the Y axis minimum.
   *
   * </li>
   * <li>
   * If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the
   * corresponing Y axis extreme is filled (since v6.1.0).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.threshold">https://api.highcharts.com/highcharts/plotOptions.arearange.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.threshold">https://api.highcharts.com/highstock/plotOptions.arearange.threshold</a>
   *
   * @implspec threshold?: any;
   *
   */
  @JSProperty("threshold")
  void setThreshold(Any value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.tooltip">https://api.highcharts.com/highcharts/plotOptions.arearange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.tooltip">https://api.highcharts.com/highstock/plotOptions.arearange.tooltip</a>
   *
   * @implspec tooltip?: PlotArearangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotArearangeTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.tooltip">https://api.highcharts.com/highcharts/plotOptions.arearange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.tooltip">https://api.highcharts.com/highstock/plotOptions.arearange.tooltip</a>
   *
   * @implspec tooltip?: PlotArearangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotArearangeTooltipOptions value);

  /**
   * (Highcharts, Highstock) Whether the whole area or just the line should
   * respond to mouseover tooltips and other mouse or touch events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.trackByArea">https://api.highcharts.com/highcharts/plotOptions.arearange.trackByArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.trackByArea">https://api.highcharts.com/highstock/plotOptions.arearange.trackByArea</a>
   *
   * @implspec trackByArea?: boolean;
   *
   */
  @JSProperty("trackByArea")
  boolean getTrackByArea();

  /**
   * (Highcharts, Highstock) Whether the whole area or just the line should
   * respond to mouseover tooltips and other mouse or touch events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.trackByArea">https://api.highcharts.com/highcharts/plotOptions.arearange.trackByArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.trackByArea">https://api.highcharts.com/highstock/plotOptions.arearange.trackByArea</a>
   *
   * @implspec trackByArea?: boolean;
   *
   */
  @JSProperty("trackByArea")
  void setTrackByArea(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.arearange.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  double getTurboThreshold();

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.arearange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.arearange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.arearange.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.visible">https://api.highcharts.com/highcharts/plotOptions.arearange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.visible">https://api.highcharts.com/highstock/plotOptions.arearange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.visible">https://api.highcharts.com/highcharts/plotOptions.arearange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.visible">https://api.highcharts.com/highstock/plotOptions.arearange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.zIndex">https://api.highcharts.com/highmaps/plotOptions.arearange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.zIndex">https://api.highcharts.com/highmaps/plotOptions.arearange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.arearange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.arearange.zoneAxis</a>
   *
   * @implspec zoneAxis?: string;
   *
   */
  @JSProperty("zoneAxis")
  @Nullable
  String getZoneAxis();

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.arearange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.arearange.zoneAxis</a>
   *
   * @implspec zoneAxis?: string;
   *
   */
  @JSProperty("zoneAxis")
  void setZoneAxis(String value);

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.zones">https://api.highcharts.com/highcharts/plotOptions.arearange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.zones">https://api.highcharts.com/highstock/plotOptions.arearange.zones</a>
   *
   * @implspec zones?: Array<PlotArearangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotArearangeZonesOptions> getZones();

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.zones">https://api.highcharts.com/highcharts/plotOptions.arearange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.zones">https://api.highcharts.com/highstock/plotOptions.arearange.zones</a>
   *
   * @implspec zones?: Array<PlotArearangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotArearangeZonesOptions> value);

  /**
   */
  abstract class CompareBase extends JsEnum {
    public static final CompareBase VALUE_0 = JsEnum.of(0);

    public static final CompareBase VALUE_100 = JsEnum.of(100);
  }

  /**
   */
  abstract class DashStyle extends JsEnum {
    public static final DashStyle DASH = JsEnum.of("Dash");

    public static final DashStyle DASHDOT = JsEnum.of("DashDot");

    public static final DashStyle DOT = JsEnum.of("Dot");

    public static final DashStyle LONGDASH = JsEnum.of("LongDash");

    public static final DashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final DashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final DashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final DashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final DashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final DashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final DashStyle SOLID = JsEnum.of("Solid");
  }

  /**
   */
  abstract class FindNearestPointBy extends JsEnum {
    public static final FindNearestPointBy X = JsEnum.of("x");

    public static final FindNearestPointBy XY = JsEnum.of("xy");
  }

  /**
   */
  abstract class GapUnit extends JsEnum {
    public static final GapUnit RELATIVE = JsEnum.of("relative");

    public static final GapUnit VALUE = JsEnum.of("value");
  }

  /**
   */
  abstract class Linecap extends JsEnum {
    public static final Linecap BUTT = JsEnum.of("butt");

    public static final Linecap ROUND = JsEnum.of("round");

    public static final Linecap SQUARE = JsEnum.of("square");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }

  /**
   */
  abstract class PointIntervalUnit extends JsEnum {
    public static final PointIntervalUnit DAY = JsEnum.of("day");

    public static final PointIntervalUnit MONTH = JsEnum.of("month");

    public static final PointIntervalUnit YEAR = JsEnum.of("year");
  }

  /**
   */
  abstract class Step extends JsEnum {
    public static final Step CENTER = JsEnum.of("center");

    public static final Step LEFT = JsEnum.of("left");

    public static final Step RIGHT = JsEnum.of("right");
  }
}
