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
 * (Highcharts) A treemap displays hierarchical data using nested rectangles.
 * The data can be laid out in varying ways depending on options.
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
 * Options for all <code>treemap</code> series are defined in plotOptions.treemap.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap">https://api.highcharts.com/highcharts/plotOptions.treemap</a>
 *
 */
public interface PlotTreemapOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.allAreas">https://api.highcharts.com/highmaps/plotOptions.treemap.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.allAreas">https://api.highcharts.com/highmaps/plotOptions.treemap.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts) When enabled the user can click on a point which is a parent
   * and zoom in on its children.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.allowDrillToNode">https://api.highcharts.com/highcharts/plotOptions.treemap.allowDrillToNode</a>
   *
   * @implspec allowDrillToNode?: boolean;
   *
   */
  @JSProperty("allowDrillToNode")
  boolean getAllowDrillToNode();

  /**
   * (Highcharts) When enabled the user can click on a point which is a parent
   * and zoom in on its children.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.allowDrillToNode">https://api.highcharts.com/highcharts/plotOptions.treemap.allowDrillToNode</a>
   *
   * @implspec allowDrillToNode?: boolean;
   *
   */
  @JSProperty("allowDrillToNode")
  void setAllowDrillToNode(boolean value);

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.treemap.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.treemap.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts) Enabling this option will make the treemap alternate the
   * drawing direction between vertical and horizontal. The next levels
   * starting direction will always be the opposite of the previous.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.alternateStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.alternateStartingDirection</a>
   *
   * @implspec alternateStartingDirection?: boolean;
   *
   */
  @JSProperty("alternateStartingDirection")
  boolean getAlternateStartingDirection();

  /**
   * (Highcharts) Enabling this option will make the treemap alternate the
   * drawing direction between vertical and horizontal. The next levels
   * starting direction will always be the opposite of the previous.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.alternateStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.alternateStartingDirection</a>
   *
   * @implspec alternateStartingDirection?: boolean;
   *
   */
  @JSProperty("alternateStartingDirection")
  void setAlternateStartingDirection(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotTreemapAnimationOptions value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animationLimit">https://api.highcharts.com/highcharts/plotOptions.treemap.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.animationLimit">https://api.highcharts.com/highcharts/plotOptions.treemap.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts) Set the point threshold for when a series should enter boost
   * mode.
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highcharts) Set the point threshold for when a series should enter boost
   * mode.
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highmaps, Highcharts) The color of the border surrounding each tree map
   * item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.borderColor">https://api.highcharts.com/highmaps/plotOptions.treemap.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.borderColor">https://api.highcharts.com/highcharts/plotOptions.treemap.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps, Highcharts) The color of the border surrounding each tree map
   * item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.borderColor">https://api.highcharts.com/highmaps/plotOptions.treemap.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.borderColor">https://api.highcharts.com/highcharts/plotOptions.treemap.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps, Highcharts) The width of the border surrounding each tree map
   * item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.borderWidth">https://api.highcharts.com/highmaps/plotOptions.treemap.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.borderWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps, Highcharts) The width of the border surrounding each tree map
   * item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.borderWidth">https://api.highcharts.com/highmaps/plotOptions.treemap.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.borderWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.className">https://api.highcharts.com/highcharts/plotOptions.treemap.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.className">https://api.highcharts.com/highcharts/plotOptions.treemap.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.clip">https://api.highcharts.com/highcharts/plotOptions.treemap.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.clip">https://api.highcharts.com/highcharts/plotOptions.treemap.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.color">https://api.highcharts.com/highcharts/plotOptions.treemap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.color">https://api.highcharts.com/highcharts/plotOptions.treemap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.color">https://api.highcharts.com/highcharts/plotOptions.treemap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.color">https://api.highcharts.com/highcharts/plotOptions.treemap.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.colorAxis">https://api.highcharts.com/highmaps/plotOptions.treemap.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.colorAxis">https://api.highcharts.com/highmaps/plotOptions.treemap.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts) When using automatic point colors pulled from the
   * <code>options.colors</code> collection, this option determines whether the chart
   * should receive one color per series or one color per point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.treemap.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts) When using automatic point colors pulled from the
   * <code>options.colors</code> collection, this option determines whether the chart
   * should receive one color per series or one color per point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.treemap.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colorIndex">https://api.highcharts.com/highcharts/plotOptions.treemap.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colorIndex">https://api.highcharts.com/highcharts/plotOptions.treemap.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) A series specific or series type specific color set to apply
   * instead of the global colors when colorByPoint is true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colors">https://api.highcharts.com/highcharts/plotOptions.treemap.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts) A series specific or series type specific color set to apply
   * instead of the global colors when colorByPoint is true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.colors">https://api.highcharts.com/highcharts/plotOptions.treemap.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  void setColors(String[] value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compare">https://api.highcharts.com/highstock/plotOptions.treemap.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compare">https://api.highcharts.com/highstock/plotOptions.treemap.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compareBase">https://api.highcharts.com/highstock/plotOptions.treemap.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compareBase">https://api.highcharts.com/highstock/plotOptions.treemap.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compareStart">https://api.highcharts.com/highstock/plotOptions.treemap.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.compareStart">https://api.highcharts.com/highstock/plotOptions.treemap.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.connectEnds">https://api.highcharts.com/highcharts/plotOptions.treemap.connectEnds</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.connectEnds">https://api.highcharts.com/highcharts/plotOptions.treemap.connectEnds</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.connectNulls">https://api.highcharts.com/highcharts/plotOptions.treemap.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.connectNulls">https://api.highcharts.com/highstock/plotOptions.treemap.connectNulls</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.connectNulls">https://api.highcharts.com/highcharts/plotOptions.treemap.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.connectNulls">https://api.highcharts.com/highstock/plotOptions.treemap.connectNulls</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.connectors">https://api.highcharts.com/gantt/plotOptions.treemap.connectors</a>
   *
   * @implspec connectors?: PlotTreemapConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotTreemapConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.connectors">https://api.highcharts.com/gantt/plotOptions.treemap.connectors</a>
   *
   * @implspec connectors?: PlotTreemapConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotTreemapConnectorsOptions value);

  /**
   * (Highcharts) When the series contains less points than the crop
   * threshold, all points are drawn, event if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  double getCropThreshold();

  /**
   * (Highcharts) When the series contains less points than the crop
   * threshold, all points are drawn, event if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.cursor">https://api.highcharts.com/highcharts/plotOptions.treemap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.cursor">https://api.highcharts.com/highcharts/plotOptions.treemap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.cursor">https://api.highcharts.com/highcharts/plotOptions.treemap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dashStyle">https://api.highcharts.com/highcharts/plotOptions.treemap.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dashStyle">https://api.highcharts.com/highcharts/plotOptions.treemap.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.dataGrouping">https://api.highcharts.com/highstock/plotOptions.treemap.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotTreemapDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotTreemapDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.dataGrouping">https://api.highcharts.com/highstock/plotOptions.treemap.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotTreemapDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotTreemapDataGroupingOptions value);

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dataLabels">https://api.highcharts.com/highcharts/plotOptions.treemap.dataLabels</a>
   *
   * @implspec dataLabels?: PlotTreemapDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotTreemapDataLabelsOptions getDataLabels();

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dataLabels">https://api.highcharts.com/highcharts/plotOptions.treemap.dataLabels</a>
   *
   * @implspec dataLabels?: PlotTreemapDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotTreemapDataLabelsOptions value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.description">https://api.highcharts.com/highcharts/plotOptions.treemap.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.description">https://api.highcharts.com/highcharts/plotOptions.treemap.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dragDrop">https://api.highcharts.com/highcharts/plotOptions.treemap.dragDrop</a>
   *
   * @implspec dragDrop?: PlotTreemapDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotTreemapDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.dragDrop">https://api.highcharts.com/highcharts/plotOptions.treemap.dragDrop</a>
   *
   * @implspec dragDrop?: PlotTreemapDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotTreemapDragDropOptions value);

  /**
   * (Highcharts) Options for the button appearing when drilling down in a
   * treemap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton</a>
   *
   * @implspec drillUpButton?: PlotTreemapDrillUpButtonOptions;
   *
   */
  @JSProperty("drillUpButton")
  @Nullable
  PlotTreemapDrillUpButtonOptions getDrillUpButton();

  /**
   * (Highcharts) Options for the button appearing when drilling down in a
   * treemap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton</a>
   *
   * @implspec drillUpButton?: PlotTreemapDrillUpButtonOptions;
   *
   */
  @JSProperty("drillUpButton")
  void setDrillUpButton(PlotTreemapDrillUpButtonOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.treemap.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.treemap.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.events">https://api.highcharts.com/highcharts/plotOptions.treemap.events</a>
   *
   * @implspec events?: PlotTreemapEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotTreemapEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.events">https://api.highcharts.com/highcharts/plotOptions.treemap.events</a>
   *
   * @implspec events?: PlotTreemapEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotTreemapEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.treemap.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.treemap.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.treemap.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highcharts) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.treemap.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.gapSize">https://api.highcharts.com/highstock/plotOptions.treemap.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.gapSize">https://api.highcharts.com/highstock/plotOptions.treemap.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.gapUnit">https://api.highcharts.com/highstock/plotOptions.treemap.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.gapUnit">https://api.highcharts.com/highstock/plotOptions.treemap.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.treemap.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.treemap.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.treemap.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.treemap.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.treemap.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.treemap.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highcharts) Whether to ignore hidden points when the layout algorithm
   * runs. If <code>false</code>, hidden points will leave open spaces.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.treemap.ignoreHiddenPoint</a>
   *
   * @implspec ignoreHiddenPoint?: boolean;
   *
   */
  @JSProperty("ignoreHiddenPoint")
  boolean getIgnoreHiddenPoint();

  /**
   * (Highcharts) Whether to ignore hidden points when the layout algorithm
   * runs. If <code>false</code>, hidden points will leave open spaces.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.treemap.ignoreHiddenPoint</a>
   *
   * @implspec ignoreHiddenPoint?: boolean;
   *
   */
  @JSProperty("ignoreHiddenPoint")
  void setIgnoreHiddenPoint(boolean value);

  /**
   * (Highcharts) This option decides if the user can interact with the parent
   * nodes or just the leaf nodes. When this option is undefined, it will be
   * true by default. However when allowDrillToNode is true, then it will be
   * false by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.interactByLeaf">https://api.highcharts.com/highcharts/plotOptions.treemap.interactByLeaf</a>
   *
   * @implspec interactByLeaf?: boolean;
   *
   */
  @JSProperty("interactByLeaf")
  boolean getInteractByLeaf();

  /**
   * (Highcharts) This option decides if the user can interact with the parent
   * nodes or just the leaf nodes. When this option is undefined, it will be
   * true by default. However when allowDrillToNode is true, then it will be
   * false by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.interactByLeaf">https://api.highcharts.com/highcharts/plotOptions.treemap.interactByLeaf</a>
   *
   * @implspec interactByLeaf?: boolean;
   *
   */
  @JSProperty("interactByLeaf")
  void setInteractByLeaf(boolean value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy">https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy">https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy">https://api.highcharts.com/highmaps/plotOptions.treemap.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.keys">https://api.highcharts.com/highcharts/plotOptions.treemap.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.keys">https://api.highcharts.com/highcharts/plotOptions.treemap.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.label">https://api.highcharts.com/highcharts/plotOptions.treemap.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.label">https://api.highcharts.com/highstock/plotOptions.treemap.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.label">https://api.highcharts.com/gantt/plotOptions.treemap.label</a>
   *
   * @implspec label?: PlotTreemapLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotTreemapLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.label">https://api.highcharts.com/highcharts/plotOptions.treemap.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.label">https://api.highcharts.com/highstock/plotOptions.treemap.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.label">https://api.highcharts.com/gantt/plotOptions.treemap.label</a>
   *
   * @implspec label?: PlotTreemapLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotTreemapLabelOptions value);

  /**
   * (Highcharts) This option decides which algorithm is used for setting
   * position and dimensions of the points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.layoutAlgorithm">https://api.highcharts.com/highcharts/plotOptions.treemap.layoutAlgorithm</a>
   *
   * @implspec layoutAlgorithm?: (&quot;squarified&quot;|&quot;strip&quot;|&quot;stripes&quot;|&quot;sliceAndDice&quot;);
   *
   */
  @JSProperty("layoutAlgorithm")
  @Nullable
  LayoutAlgorithm getLayoutAlgorithm();

  /**
   * (Highcharts) This option decides which algorithm is used for setting
   * position and dimensions of the points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.layoutAlgorithm">https://api.highcharts.com/highcharts/plotOptions.treemap.layoutAlgorithm</a>
   *
   * @implspec layoutAlgorithm?: (&quot;squarified&quot;|&quot;strip&quot;|&quot;stripes&quot;|&quot;sliceAndDice&quot;);
   *
   */
  @JSProperty("layoutAlgorithm")
  void setLayoutAlgorithm(LayoutAlgorithm value);

  /**
   * (Highcharts) Defines which direction the layout algorithm will start
   * drawing.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.layoutStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.layoutStartingDirection</a>
   *
   * @implspec layoutStartingDirection?: (&quot;horizontal&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layoutStartingDirection")
  @Nullable
  LayoutStartingDirection getLayoutStartingDirection();

  /**
   * (Highcharts) Defines which direction the layout algorithm will start
   * drawing.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.layoutStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.layoutStartingDirection</a>
   *
   * @implspec layoutStartingDirection?: (&quot;horizontal&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layoutStartingDirection")
  void setLayoutStartingDirection(LayoutStartingDirection value);

  /**
   * (Highcharts) Used together with the levels and allowDrillToNode options.
   * When set to false the first level visible when drilling is considered to
   * be level one. Otherwise the level will be the same as the tree structure.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levelIsConstant">https://api.highcharts.com/highcharts/plotOptions.treemap.levelIsConstant</a>
   *
   * @implspec levelIsConstant?: boolean;
   *
   */
  @JSProperty("levelIsConstant")
  boolean getLevelIsConstant();

  /**
   * (Highcharts) Used together with the levels and allowDrillToNode options.
   * When set to false the first level visible when drilling is considered to
   * be level one. Otherwise the level will be the same as the tree structure.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levelIsConstant">https://api.highcharts.com/highcharts/plotOptions.treemap.levelIsConstant</a>
   *
   * @implspec levelIsConstant?: boolean;
   *
   */
  @JSProperty("levelIsConstant")
  void setLevelIsConstant(boolean value);

  /**
   * (Highcharts) Set options on specific levels. Takes precedence over series
   * options, but not point options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels">https://api.highcharts.com/highcharts/plotOptions.treemap.levels</a>
   *
   * @implspec levels?: Array<PlotTreemapLevelsOptions>;
   *
   */
  @JSProperty("levels")
  @Nullable
  Array<PlotTreemapLevelsOptions> getLevels();

  /**
   * (Highcharts) Set options on specific levels. Takes precedence over series
   * options, but not point options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels">https://api.highcharts.com/highcharts/plotOptions.treemap.levels</a>
   *
   * @implspec levels?: Array<PlotTreemapLevelsOptions>;
   *
   */
  @JSProperty("levels")
  void setLevels(Array<PlotTreemapLevelsOptions> value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.linecap">https://api.highcharts.com/highcharts/plotOptions.treemap.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.linecap">https://api.highcharts.com/highstock/plotOptions.treemap.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.linecap">https://api.highcharts.com/highcharts/plotOptions.treemap.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.linecap">https://api.highcharts.com/highstock/plotOptions.treemap.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock) The width of the line connecting the data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the line connecting the data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.linkedTo">https://api.highcharts.com/highcharts/plotOptions.treemap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.linkedTo">https://api.highcharts.com/highstock/plotOptions.treemap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.linkedTo">https://api.highcharts.com/gantt/plotOptions.treemap.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.linkedTo">https://api.highcharts.com/highcharts/plotOptions.treemap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.linkedTo">https://api.highcharts.com/highstock/plotOptions.treemap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.linkedTo">https://api.highcharts.com/gantt/plotOptions.treemap.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.treemap.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.treemap.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.treemap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.opacity">https://api.highcharts.com/highcharts/plotOptions.treemap.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.opacity">https://api.highcharts.com/highcharts/plotOptions.treemap.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.point">https://api.highcharts.com/highcharts/plotOptions.treemap.point</a>
   *
   * @implspec point?: PlotTreemapPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotTreemapPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.point">https://api.highcharts.com/highcharts/plotOptions.treemap.point</a>
   *
   * @implspec point?: PlotTreemapPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotTreemapPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.treemap.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.treemap.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointInterval">https://api.highcharts.com/highcharts/plotOptions.treemap.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointInterval">https://api.highcharts.com/highstock/plotOptions.treemap.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointInterval">https://api.highcharts.com/gantt/plotOptions.treemap.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointInterval">https://api.highcharts.com/highcharts/plotOptions.treemap.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointInterval">https://api.highcharts.com/highstock/plotOptions.treemap.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointInterval">https://api.highcharts.com/gantt/plotOptions.treemap.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.treemap.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.treemap.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.treemap.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.treemap.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.treemap.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.treemap.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(PointIntervalUnit value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointRange">https://api.highcharts.com/highstock/plotOptions.treemap.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointRange">https://api.highcharts.com/highstock/plotOptions.treemap.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointStart">https://api.highcharts.com/highcharts/plotOptions.treemap.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointStart">https://api.highcharts.com/highstock/plotOptions.treemap.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointStart">https://api.highcharts.com/gantt/plotOptions.treemap.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.pointStart">https://api.highcharts.com/highcharts/plotOptions.treemap.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.pointStart">https://api.highcharts.com/highstock/plotOptions.treemap.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.pointStart">https://api.highcharts.com/gantt/plotOptions.treemap.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.selected">https://api.highcharts.com/highcharts/plotOptions.treemap.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.selected">https://api.highcharts.com/highcharts/plotOptions.treemap.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.treemap.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.treemap.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this series type or specific series item
   * in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.showInLegend">https://api.highcharts.com/highcharts/plotOptions.treemap.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this series type or specific series item
   * in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.showInLegend">https://api.highcharts.com/highcharts/plotOptions.treemap.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.showInNavigator">https://api.highcharts.com/highstock/plotOptions.treemap.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.showInNavigator">https://api.highcharts.com/highstock/plotOptions.treemap.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.treemap.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.treemap.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.softThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.softThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.softThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.softThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.softThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts) The sort index of the point inside the treemap level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.sortIndex">https://api.highcharts.com/highcharts/plotOptions.treemap.sortIndex</a>
   *
   * @implspec sortIndex?: number;
   *
   */
  @JSProperty("sortIndex")
  double getSortIndex();

  /**
   * (Highcharts) The sort index of the point inside the treemap level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.sortIndex">https://api.highcharts.com/highcharts/plotOptions.treemap.sortIndex</a>
   *
   * @implspec sortIndex?: number;
   *
   */
  @JSProperty("sortIndex")
  void setSortIndex(double value);

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>. When stacking is enabled, data must be
   * sorted in ascending X order. A special stacking option is with the
   * streamgraph series type, where the stacking option is set to <code>&quot;stream&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.stacking">https://api.highcharts.com/highcharts/plotOptions.treemap.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.stacking">https://api.highcharts.com/highstock/plotOptions.treemap.stacking</a>
   *
   * @implspec stacking?: (&quot;normal&quot;|&quot;percent&quot;);
   *
   */
  @JSProperty("stacking")
  @Nullable
  Stacking getStacking();

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>. When stacking is enabled, data must be
   * sorted in ascending X order. A special stacking option is with the
   * streamgraph series type, where the stacking option is set to <code>&quot;stream&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.stacking">https://api.highcharts.com/highcharts/plotOptions.treemap.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.stacking">https://api.highcharts.com/highstock/plotOptions.treemap.stacking</a>
   *
   * @implspec stacking?: (&quot;normal&quot;|&quot;percent&quot;);
   *
   */
  @JSProperty("stacking")
  void setStacking(Stacking value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states">https://api.highcharts.com/highcharts/plotOptions.treemap.states</a>
   *
   * @implspec states?: PlotTreemapStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotTreemapStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states">https://api.highcharts.com/highcharts/plotOptions.treemap.states</a>
   *
   * @implspec states?: PlotTreemapStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotTreemapStatesOptions value);

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.step">https://api.highcharts.com/highcharts/plotOptions.treemap.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.step">https://api.highcharts.com/highstock/plotOptions.treemap.step</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.step">https://api.highcharts.com/highcharts/plotOptions.treemap.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.step">https://api.highcharts.com/highstock/plotOptions.treemap.step</a>
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
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.treemap.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.stickyTracking">https://api.highcharts.com/highstock/plotOptions.treemap.stickyTracking</a>
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
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.treemap.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.stickyTracking">https://api.highcharts.com/highstock/plotOptions.treemap.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.threshold">https://api.highcharts.com/highcharts/plotOptions.treemap.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.threshold">https://api.highcharts.com/highstock/plotOptions.treemap.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.threshold">https://api.highcharts.com/highcharts/plotOptions.treemap.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.threshold">https://api.highcharts.com/highstock/plotOptions.treemap.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.tooltip">https://api.highcharts.com/highcharts/plotOptions.treemap.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.tooltip">https://api.highcharts.com/highstock/plotOptions.treemap.tooltip</a>
   *
   * @implspec tooltip?: PlotTreemapTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotTreemapTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.tooltip">https://api.highcharts.com/highcharts/plotOptions.treemap.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.tooltip">https://api.highcharts.com/highstock/plotOptions.treemap.tooltip</a>
   *
   * @implspec tooltip?: PlotTreemapTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotTreemapTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.turboThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.turboThreshold">https://api.highcharts.com/gantt/plotOptions.treemap.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.turboThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.treemap.turboThreshold">https://api.highcharts.com/gantt/plotOptions.treemap.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.visible">https://api.highcharts.com/highcharts/plotOptions.treemap.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.visible">https://api.highcharts.com/highcharts/plotOptions.treemap.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.zIndex">https://api.highcharts.com/highmaps/plotOptions.treemap.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.zIndex">https://api.highcharts.com/highmaps/plotOptions.treemap.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.treemap.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.zoneAxis">https://api.highcharts.com/highstock/plotOptions.treemap.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.treemap.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.zoneAxis">https://api.highcharts.com/highstock/plotOptions.treemap.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.zones">https://api.highcharts.com/highcharts/plotOptions.treemap.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.zones">https://api.highcharts.com/highstock/plotOptions.treemap.zones</a>
   *
   * @implspec zones?: Array<PlotTreemapZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotTreemapZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.zones">https://api.highcharts.com/highcharts/plotOptions.treemap.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.zones">https://api.highcharts.com/highstock/plotOptions.treemap.zones</a>
   *
   * @implspec zones?: Array<PlotTreemapZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotTreemapZonesOptions> value);

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
  abstract class LayoutAlgorithm extends JsEnum {
    public static final LayoutAlgorithm SQUARIFIED = JsEnum.of("squarified");

    public static final LayoutAlgorithm STRIP = JsEnum.of("strip");

    public static final LayoutAlgorithm STRIPES = JsEnum.of("stripes");

    public static final LayoutAlgorithm SLICEANDDICE = JsEnum.of("sliceAndDice");
  }

  /**
   */
  abstract class LayoutStartingDirection extends JsEnum {
    public static final LayoutStartingDirection HORIZONTAL = JsEnum.of("horizontal");

    public static final LayoutStartingDirection VERTICAL = JsEnum.of("vertical");
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
  abstract class Stacking extends JsEnum {
    public static final Stacking NORMAL = JsEnum.of("normal");

    public static final Stacking PERCENT = JsEnum.of("percent");
  }

  /**
   */
  abstract class Step extends JsEnum {
    public static final Step CENTER = JsEnum.of("center");

    public static final Step LEFT = JsEnum.of("left");

    public static final Step RIGHT = JsEnum.of("right");
  }
}
