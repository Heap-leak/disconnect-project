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
 * (Highcharts) A waterfall chart displays sequentially introduced positive or
 * negative values in cumulative columns.
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
 * Options for all <code>waterfall</code> series are defined in plotOptions.waterfall.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall">https://api.highcharts.com/highcharts/plotOptions.waterfall</a>
 *
 */
public interface PlotWaterfallOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.allAreas">https://api.highcharts.com/highmaps/plotOptions.waterfall.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.allAreas">https://api.highcharts.com/highmaps/plotOptions.waterfall.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.waterfall.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.waterfall.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animation">https://api.highcharts.com/highcharts/plotOptions.waterfall.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWaterfallAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animation">https://api.highcharts.com/highcharts/plotOptions.waterfall.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWaterfallAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animation">https://api.highcharts.com/highcharts/plotOptions.waterfall.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWaterfallAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotWaterfallAnimationOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animation">https://api.highcharts.com/highcharts/plotOptions.waterfall.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWaterfallAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animationLimit">https://api.highcharts.com/highcharts/plotOptions.waterfall.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.animationLimit">https://api.highcharts.com/highcharts/plotOptions.waterfall.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.boostThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highcharts) The color of the border of each waterfall column.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The color of the border of each waterfall column.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderRadius">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.borderRadius">https://api.highcharts.com/highstock/plotOptions.waterfall.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.borderRadius">https://api.highcharts.com/gantt/plotOptions.waterfall.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderRadius">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.borderRadius">https://api.highcharts.com/highstock/plotOptions.waterfall.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.borderRadius">https://api.highcharts.com/gantt/plotOptions.waterfall.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Gantt) The width of the border surrounding each
   * column or bar. Defaults to <code>1</code> when there is room for a border, but to
   * <code>0</code> when the columns are so dense that a border would cover the next
   * column.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.borderWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.borderWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Gantt) The width of the border surrounding each
   * column or bar. Defaults to <code>1</code> when there is room for a border, but to
   * <code>0</code> when the columns are so dense that a border would cover the next
   * column.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.borderWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.borderWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.borderWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.className">https://api.highcharts.com/highcharts/plotOptions.waterfall.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.className">https://api.highcharts.com/highcharts/plotOptions.waterfall.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.clip">https://api.highcharts.com/highcharts/plotOptions.waterfall.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.clip">https://api.highcharts.com/highcharts/plotOptions.waterfall.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.color">https://api.highcharts.com/highcharts/plotOptions.waterfall.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.color">https://api.highcharts.com/highcharts/plotOptions.waterfall.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.color">https://api.highcharts.com/highcharts/plotOptions.waterfall.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.color">https://api.highcharts.com/highcharts/plotOptions.waterfall.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.colorAxis">https://api.highcharts.com/highmaps/plotOptions.waterfall.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.colorAxis">https://api.highcharts.com/highmaps/plotOptions.waterfall.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
   * from the global colors or series-specific plotOptions.column.colors
   * collections, this option determines whether the chart should receive one
   * color per series or one color per point.
   *
   * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
   * and instead this option gives the points individual color class names on
   * the form <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.waterfall.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/highstock/plotOptions.waterfall.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/gantt/plotOptions.waterfall.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
   * from the global colors or series-specific plotOptions.column.colors
   * collections, this option determines whether the chart should receive one
   * color per series or one color per point.
   *
   * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
   * and instead this option gives the points individual color class names on
   * the form <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.waterfall.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/highstock/plotOptions.waterfall.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.colorByPoint">https://api.highcharts.com/gantt/plotOptions.waterfall.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colorIndex">https://api.highcharts.com/highcharts/plotOptions.waterfall.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colorIndex">https://api.highcharts.com/highcharts/plotOptions.waterfall.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colors">https://api.highcharts.com/highcharts/plotOptions.waterfall.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.colors">https://api.highcharts.com/highstock/plotOptions.waterfall.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.colors">https://api.highcharts.com/gantt/plotOptions.waterfall.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.colors">https://api.highcharts.com/highcharts/plotOptions.waterfall.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.colors">https://api.highcharts.com/highstock/plotOptions.waterfall.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.colors">https://api.highcharts.com/gantt/plotOptions.waterfall.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compare">https://api.highcharts.com/highstock/plotOptions.waterfall.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compare">https://api.highcharts.com/highstock/plotOptions.waterfall.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compareBase">https://api.highcharts.com/highstock/plotOptions.waterfall.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compareBase">https://api.highcharts.com/highstock/plotOptions.waterfall.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compareStart">https://api.highcharts.com/highstock/plotOptions.waterfall.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.compareStart">https://api.highcharts.com/highstock/plotOptions.waterfall.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.connectors">https://api.highcharts.com/gantt/plotOptions.waterfall.connectors</a>
   *
   * @implspec connectors?: PlotWaterfallConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotWaterfallConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.connectors">https://api.highcharts.com/gantt/plotOptions.waterfall.connectors</a>
   *
   * @implspec connectors?: PlotWaterfallConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotWaterfallConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When true, each column edge is rounded to
   * its nearest pixel in order to render sharp on screen. In some cases, when
   * there are a lot of densely packed columns, this leads to visible
   * difference in column widths or distance between columns. In these cases,
   * setting <code>crisp</code> to <code>false</code> may look better, even though each column is
   * rendered blurry.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.crisp">https://api.highcharts.com/highcharts/plotOptions.waterfall.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.crisp">https://api.highcharts.com/highstock/plotOptions.waterfall.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.crisp">https://api.highcharts.com/gantt/plotOptions.waterfall.crisp</a>
   *
   * @implspec crisp?: boolean;
   *
   */
  @JSProperty("crisp")
  boolean getCrisp();

  /**
   * (Highcharts, Highstock, Gantt) When true, each column edge is rounded to
   * its nearest pixel in order to render sharp on screen. In some cases, when
   * there are a lot of densely packed columns, this leads to visible
   * difference in column widths or distance between columns. In these cases,
   * setting <code>crisp</code> to <code>false</code> may look better, even though each column is
   * rendered blurry.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.crisp">https://api.highcharts.com/highcharts/plotOptions.waterfall.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.crisp">https://api.highcharts.com/highstock/plotOptions.waterfall.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.crisp">https://api.highcharts.com/gantt/plotOptions.waterfall.crisp</a>
   *
   * @implspec crisp?: boolean;
   *
   */
  @JSProperty("crisp")
  void setCrisp(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When the series contains less points than
   * the crop threshold, all points are drawn, event if the points fall
   * outside the visible plot area at the current zoom. The advantage of
   * drawing all points (including markers and columns), is that animation is
   * performed on updates. On the other hand, when the series contains more
   * points than the crop threshold, the series data is cropped to only
   * contain points that fall within the plot area. The advantage of cropping
   * away invisible points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/gantt/plotOptions.waterfall.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  double getCropThreshold();

  /**
   * (Highcharts, Highstock, Gantt) When the series contains less points than
   * the crop threshold, all points are drawn, event if the points fall
   * outside the visible plot area at the current zoom. The advantage of
   * drawing all points (including markers and columns), is that animation is
   * performed on updates. On the other hand, when the series contains more
   * points than the crop threshold, the series data is cropped to only
   * contain points that fall within the plot area. The advantage of cropping
   * away invisible points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.cropThreshold">https://api.highcharts.com/gantt/plotOptions.waterfall.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor">https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor">https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor">https://api.highcharts.com/highcharts/plotOptions.waterfall.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) A name for the dash style to use for the line connecting the
   * columns of the waterfall series. Possible values: Dash, DashDot, Dot,
   * LongDash, LongDashDot, LongDashDotDot, ShortDash, ShortDashDot,
   * ShortDashDotDot, ShortDot, Solid
   *
   * In styled mode, the stroke dash-array can be set with the
   * <code>.highcharts-graph</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dashStyle">https://api.highcharts.com/highcharts/plotOptions.waterfall.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts) A name for the dash style to use for the line connecting the
   * columns of the waterfall series. Possible values: Dash, DashDot, Dot,
   * LongDash, LongDashDot, LongDashDotDot, ShortDash, ShortDashDot,
   * ShortDashDotDot, ShortDot, Solid
   *
   * In styled mode, the stroke dash-array can be set with the
   * <code>.highcharts-graph</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dashStyle">https://api.highcharts.com/highcharts/plotOptions.waterfall.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.dataGrouping">https://api.highcharts.com/highstock/plotOptions.waterfall.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotWaterfallDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotWaterfallDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.dataGrouping">https://api.highcharts.com/highstock/plotOptions.waterfall.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotWaterfallDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotWaterfallDataGroupingOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dataLabels">https://api.highcharts.com/highcharts/plotOptions.waterfall.dataLabels</a>
   *
   * @implspec dataLabels?: PlotWaterfallDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotWaterfallDataLabelsOptions getDataLabels();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dataLabels">https://api.highcharts.com/highcharts/plotOptions.waterfall.dataLabels</a>
   *
   * @implspec dataLabels?: PlotWaterfallDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotWaterfallDataLabelsOptions value);

  /**
   * (Highcharts) Depth of the columns in a 3D column chart. Requires
   * <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.depth">https://api.highcharts.com/highcharts/plotOptions.waterfall.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) Depth of the columns in a 3D column chart. Requires
   * <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.depth">https://api.highcharts.com/highcharts/plotOptions.waterfall.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.description">https://api.highcharts.com/highcharts/plotOptions.waterfall.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.description">https://api.highcharts.com/highcharts/plotOptions.waterfall.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop">https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop</a>
   *
   * @implspec dragDrop?: PlotWaterfallDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotWaterfallDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop">https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop</a>
   *
   * @implspec dragDrop?: PlotWaterfallDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotWaterfallDragDropOptions value);

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeColor</a>
   *
   * @implspec edgeColor?: ColorString;
   *
   */
  @JSProperty("edgeColor")
  @Nullable
  String getEdgeColor();

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeColor</a>
   *
   * @implspec edgeColor?: ColorString;
   *
   */
  @JSProperty("edgeColor")
  void setEdgeColor(String value);

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  double getEdgeWidth();

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  void setEdgeWidth(double value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.waterfall.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.waterfall.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.events">https://api.highcharts.com/highcharts/plotOptions.waterfall.events</a>
   *
   * @implspec events?: PlotWaterfallEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWaterfallEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.events">https://api.highcharts.com/highcharts/plotOptions.waterfall.events</a>
   *
   * @implspec events?: PlotWaterfallEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWaterfallEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.waterfall.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.waterfall.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.waterfall.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.waterfall.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(FindNearestPointBy value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.waterfall.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.waterfall.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.waterfall.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.waterfall.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.waterfall.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.waterfall.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.grouping">https://api.highcharts.com/highcharts/plotOptions.waterfall.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.grouping">https://api.highcharts.com/highstock/plotOptions.waterfall.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.grouping">https://api.highcharts.com/gantt/plotOptions.waterfall.grouping</a>
   *
   * @implspec grouping?: boolean;
   *
   */
  @JSProperty("grouping")
  boolean getGrouping();

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.grouping">https://api.highcharts.com/highcharts/plotOptions.waterfall.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.grouping">https://api.highcharts.com/highstock/plotOptions.waterfall.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.grouping">https://api.highcharts.com/gantt/plotOptions.waterfall.grouping</a>
   *
   * @implspec grouping?: boolean;
   *
   */
  @JSProperty("grouping")
  void setGrouping(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.groupPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.groupPadding">https://api.highcharts.com/highstock/plotOptions.waterfall.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.groupPadding">https://api.highcharts.com/gantt/plotOptions.waterfall.groupPadding</a>
   *
   * @implspec groupPadding?: number;
   *
   */
  @JSProperty("groupPadding")
  double getGroupPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.groupPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.groupPadding">https://api.highcharts.com/highstock/plotOptions.waterfall.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.groupPadding">https://api.highcharts.com/gantt/plotOptions.waterfall.groupPadding</a>
   *
   * @implspec groupPadding?: number;
   *
   */
  @JSProperty("groupPadding")
  void setGroupPadding(double value);

  /**
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   * Requires <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.groupZPadding</a>
   *
   * @implspec groupZPadding?: number;
   *
   */
  @JSProperty("groupZPadding")
  double getGroupZPadding();

  /**
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   * Requires <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.groupZPadding</a>
   *
   * @implspec groupZPadding?: number;
   *
   */
  @JSProperty("groupZPadding")
  void setGroupZPadding(double value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy">https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy">https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy">https://api.highcharts.com/highmaps/plotOptions.waterfall.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.keys">https://api.highcharts.com/highcharts/plotOptions.waterfall.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.keys">https://api.highcharts.com/highcharts/plotOptions.waterfall.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.label">https://api.highcharts.com/highcharts/plotOptions.waterfall.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.label">https://api.highcharts.com/highstock/plotOptions.waterfall.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.label">https://api.highcharts.com/gantt/plotOptions.waterfall.label</a>
   *
   * @implspec label?: PlotWaterfallLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotWaterfallLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.label">https://api.highcharts.com/highcharts/plotOptions.waterfall.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.label">https://api.highcharts.com/highstock/plotOptions.waterfall.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.label">https://api.highcharts.com/gantt/plotOptions.waterfall.label</a>
   *
   * @implspec label?: PlotWaterfallLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotWaterfallLabelOptions value);

  /**
   * (Highcharts) The color of the line that connects columns in a waterfall
   * series.
   *
   * In styled mode, the stroke can be set with the <code>.highcharts-graph</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.lineColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts) The color of the line that connects columns in a waterfall
   * series.
   *
   * In styled mode, the stroke can be set with the <code>.highcharts-graph</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.lineColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts) The width of the line connecting waterfall columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.lineWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts) The width of the line connecting waterfall columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.lineWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.linkedTo">https://api.highcharts.com/highcharts/plotOptions.waterfall.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.linkedTo">https://api.highcharts.com/highstock/plotOptions.waterfall.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.linkedTo">https://api.highcharts.com/gantt/plotOptions.waterfall.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.linkedTo">https://api.highcharts.com/highcharts/plotOptions.waterfall.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.linkedTo">https://api.highcharts.com/highstock/plotOptions.waterfall.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.linkedTo">https://api.highcharts.com/gantt/plotOptions.waterfall.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
   * column, translated to the height of a bar in a bar chart. This prevents
   * the columns from becoming too wide when there is a small number of points
   * in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.maxPointWidth</a>
   *
   * @implspec maxPointWidth?: number;
   *
   */
  @JSProperty("maxPointWidth")
  double getMaxPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
   * column, translated to the height of a bar in a bar chart. This prevents
   * the columns from becoming too wide when there is a small number of points
   * in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.maxPointWidth</a>
   *
   * @implspec maxPointWidth?: number;
   *
   */
  @JSProperty("maxPointWidth")
  void setMaxPointWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.minPointLength">https://api.highcharts.com/highcharts/plotOptions.waterfall.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.minPointLength">https://api.highcharts.com/highstock/plotOptions.waterfall.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.minPointLength">https://api.highcharts.com/gantt/plotOptions.waterfall.minPointLength</a>
   *
   * @implspec minPointLength?: number;
   *
   */
  @JSProperty("minPointLength")
  double getMinPointLength();

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.minPointLength">https://api.highcharts.com/highcharts/plotOptions.waterfall.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.minPointLength">https://api.highcharts.com/highstock/plotOptions.waterfall.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.minPointLength">https://api.highcharts.com/gantt/plotOptions.waterfall.minPointLength</a>
   *
   * @implspec minPointLength?: number;
   *
   */
  @JSProperty("minPointLength")
  void setMinPointLength(double value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.waterfall.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.waterfall.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.point">https://api.highcharts.com/highcharts/plotOptions.waterfall.point</a>
   *
   * @implspec point?: PlotWaterfallPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotWaterfallPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.point">https://api.highcharts.com/highcharts/plotOptions.waterfall.point</a>
   *
   * @implspec point?: PlotWaterfallPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotWaterfallPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointInterval">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointInterval">https://api.highcharts.com/highstock/plotOptions.waterfall.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointInterval">https://api.highcharts.com/gantt/plotOptions.waterfall.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointInterval">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointInterval">https://api.highcharts.com/highstock/plotOptions.waterfall.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointInterval">https://api.highcharts.com/gantt/plotOptions.waterfall.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.waterfall.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.waterfall.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.waterfall.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.waterfall.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(PointIntervalUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointPadding">https://api.highcharts.com/highstock/plotOptions.waterfall.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointPadding">https://api.highcharts.com/gantt/plotOptions.waterfall.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPadding">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointPadding">https://api.highcharts.com/highstock/plotOptions.waterfall.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointPadding">https://api.highcharts.com/gantt/plotOptions.waterfall.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/highstock/plotOptions.waterfall.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement">https://api.highcharts.com/gantt/plotOptions.waterfall.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(String value);

  /**
   * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
   * for. This determines the width of the column. On a categorized axis, the
   * range will be 1 by default (one category unit). On linear and datetime
   * axes, the range will be computed as the distance between the two closest
   * data points.
   *
   * The default <code>null</code> means it is computed automatically, but this option
   * can be used to override the automatic value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointRange">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointRange">https://api.highcharts.com/highstock/plotOptions.waterfall.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointRange">https://api.highcharts.com/gantt/plotOptions.waterfall.pointRange</a>
   *
   * @implspec pointRange?: (number|null);
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
   * for. This determines the width of the column. On a categorized axis, the
   * range will be 1 by default (one category unit). On linear and datetime
   * axes, the range will be computed as the distance between the two closest
   * data points.
   *
   * The default <code>null</code> means it is computed automatically, but this option
   * can be used to override the automatic value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointRange">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointRange">https://api.highcharts.com/highstock/plotOptions.waterfall.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointRange">https://api.highcharts.com/gantt/plotOptions.waterfall.pointRange</a>
   *
   * @implspec pointRange?: (number|null);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointStart">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointStart">https://api.highcharts.com/highstock/plotOptions.waterfall.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointStart">https://api.highcharts.com/gantt/plotOptions.waterfall.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointStart">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointStart">https://api.highcharts.com/highstock/plotOptions.waterfall.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointStart">https://api.highcharts.com/gantt/plotOptions.waterfall.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  double getPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.pointWidth">https://api.highcharts.com/highcharts/plotOptions.waterfall.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.pointWidth">https://api.highcharts.com/highstock/plotOptions.waterfall.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.pointWidth">https://api.highcharts.com/gantt/plotOptions.waterfall.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.selected">https://api.highcharts.com/highcharts/plotOptions.waterfall.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.selected">https://api.highcharts.com/highcharts/plotOptions.waterfall.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow">https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow">https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow">https://api.highcharts.com/highcharts/plotOptions.waterfall.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.waterfall.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.waterfall.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.showInLegend">https://api.highcharts.com/highcharts/plotOptions.waterfall.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.showInLegend">https://api.highcharts.com/highcharts/plotOptions.waterfall.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.showInNavigator">https://api.highcharts.com/highstock/plotOptions.waterfall.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.showInNavigator">https://api.highcharts.com/highstock/plotOptions.waterfall.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.waterfall.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.waterfall.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.softThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.softThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.softThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.softThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.softThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>. When stacking is enabled, data must be
   * sorted in ascending X order. A special stacking option is with the
   * streamgraph series type, where the stacking option is set to <code>&quot;stream&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.stacking">https://api.highcharts.com/highcharts/plotOptions.waterfall.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.stacking">https://api.highcharts.com/highstock/plotOptions.waterfall.stacking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.stacking">https://api.highcharts.com/highcharts/plotOptions.waterfall.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.stacking">https://api.highcharts.com/highstock/plotOptions.waterfall.stacking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states">https://api.highcharts.com/highcharts/plotOptions.waterfall.states</a>
   *
   * @implspec states?: PlotWaterfallStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotWaterfallStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states">https://api.highcharts.com/highcharts/plotOptions.waterfall.states</a>
   *
   * @implspec states?: PlotWaterfallStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotWaterfallStatesOptions value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.waterfall.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.waterfall.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.threshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.threshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.tooltip">https://api.highcharts.com/highcharts/plotOptions.waterfall.tooltip</a>
   *
   * @implspec tooltip?: PlotWaterfallTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotWaterfallTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.tooltip">https://api.highcharts.com/highcharts/plotOptions.waterfall.tooltip</a>
   *
   * @implspec tooltip?: PlotWaterfallTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotWaterfallTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/gantt/plotOptions.waterfall.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.waterfall.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/highstock/plotOptions.waterfall.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.turboThreshold">https://api.highcharts.com/gantt/plotOptions.waterfall.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) The color used specifically for positive point columns. When
   * not specified, the general series color is used.
   *
   * In styled mode, the waterfall colors can be set with the
   * <code>.highcharts-point-negative</code>, <code>.highcharts-sum</code> and
   * <code>.highcharts-intermediate-sum</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor</a>
   *
   * @implspec upColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("upColor")
  @Nullable
  Unknown getUpColor();

  /**
   * (Highcharts) The color used specifically for positive point columns. When
   * not specified, the general series color is used.
   *
   * In styled mode, the waterfall colors can be set with the
   * <code>.highcharts-point-negative</code>, <code>.highcharts-sum</code> and
   * <code>.highcharts-intermediate-sum</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor</a>
   *
   * @implspec upColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("upColor")
  void setUpColor(GradientColorObject value);

  /**
   * (Highcharts) The color used specifically for positive point columns. When
   * not specified, the general series color is used.
   *
   * In styled mode, the waterfall colors can be set with the
   * <code>.highcharts-point-negative</code>, <code>.highcharts-sum</code> and
   * <code>.highcharts-intermediate-sum</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor">https://api.highcharts.com/highcharts/plotOptions.waterfall.upColor</a>
   *
   * @implspec upColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("upColor")
  void setUpColor(String value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.visible">https://api.highcharts.com/highcharts/plotOptions.waterfall.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.visible">https://api.highcharts.com/highcharts/plotOptions.waterfall.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.zIndex">https://api.highcharts.com/highmaps/plotOptions.waterfall.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.zIndex">https://api.highcharts.com/highmaps/plotOptions.waterfall.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.waterfall.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.zoneAxis">https://api.highcharts.com/highstock/plotOptions.waterfall.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.waterfall.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.zoneAxis">https://api.highcharts.com/highstock/plotOptions.waterfall.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.zones">https://api.highcharts.com/highcharts/plotOptions.waterfall.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.zones">https://api.highcharts.com/highstock/plotOptions.waterfall.zones</a>
   *
   * @implspec zones?: Array<PlotWaterfallZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotWaterfallZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.zones">https://api.highcharts.com/highcharts/plotOptions.waterfall.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.zones">https://api.highcharts.com/highstock/plotOptions.waterfall.zones</a>
   *
   * @implspec zones?: Array<PlotWaterfallZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotWaterfallZonesOptions> value);

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
}
