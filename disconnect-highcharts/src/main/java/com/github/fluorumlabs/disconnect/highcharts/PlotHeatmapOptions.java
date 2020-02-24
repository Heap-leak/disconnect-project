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
 * (Highcharts, Highmaps) A heatmap is a graphical representation of data where
 * the individual values contained in a matrix are represented as colors.
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
 * Options for all <code>heatmap</code> series are defined in plotOptions.heatmap.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap">https://api.highcharts.com/highcharts/plotOptions.heatmap</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap">https://api.highcharts.com/highmaps/plotOptions.heatmap</a>
 *
 */
public interface PlotHeatmapOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.allAreas">https://api.highcharts.com/highmaps/plotOptions.heatmap.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.allAreas">https://api.highcharts.com/highmaps/plotOptions.heatmap.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts, Highmaps) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.heatmap.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.allowPointSelect">https://api.highcharts.com/highmaps/plotOptions.heatmap.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts, Highmaps) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.heatmap.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.allowPointSelect">https://api.highcharts.com/highmaps/plotOptions.heatmap.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.animation">https://api.highcharts.com/highcharts/plotOptions.heatmap.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.animation">https://api.highcharts.com/highmaps/plotOptions.heatmap.animation</a>
   *
   * @implspec animation?: (boolean|PlotHeatmapAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.animation">https://api.highcharts.com/highcharts/plotOptions.heatmap.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.animation">https://api.highcharts.com/highmaps/plotOptions.heatmap.animation</a>
   *
   * @implspec animation?: (boolean|PlotHeatmapAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.animation">https://api.highcharts.com/highcharts/plotOptions.heatmap.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.animation">https://api.highcharts.com/highmaps/plotOptions.heatmap.animation</a>
   *
   * @implspec animation?: (boolean|PlotHeatmapAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotHeatmapAnimationOptions value);

  /**
   * (Highcharts, Highmaps) Set the point threshold for when a series should
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.boostThreshold">https://api.highcharts.com/highmaps/plotOptions.heatmap.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highcharts, Highmaps) Set the point threshold for when a series should
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.boostThreshold">https://api.highcharts.com/highmaps/plotOptions.heatmap.boostThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.borderColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.borderColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.borderColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.borderColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps, Highcharts) The border width for each heat map item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.borderWidth">https://api.highcharts.com/highmaps/plotOptions.heatmap.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.borderWidth">https://api.highcharts.com/highcharts/plotOptions.heatmap.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps, Highcharts) The border width for each heat map item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.borderWidth">https://api.highcharts.com/highmaps/plotOptions.heatmap.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.borderWidth">https://api.highcharts.com/highcharts/plotOptions.heatmap.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highmaps) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.className">https://api.highcharts.com/highcharts/plotOptions.heatmap.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.className">https://api.highcharts.com/highmaps/plotOptions.heatmap.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highmaps) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.className">https://api.highcharts.com/highcharts/plotOptions.heatmap.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.className">https://api.highcharts.com/highmaps/plotOptions.heatmap.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highmaps) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.clip">https://api.highcharts.com/highcharts/plotOptions.heatmap.clip</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.clip">https://api.highcharts.com/highmaps/plotOptions.heatmap.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts, Highmaps) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.clip">https://api.highcharts.com/highcharts/plotOptions.heatmap.clip</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.clip">https://api.highcharts.com/highmaps/plotOptions.heatmap.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts) The main color of the series. In heat maps this color is
   * rarely used, as we mostly use the color to denote the value of each
   * point. Unless options are set in the colorAxis, the default value is
   * pulled from the options.colors array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The main color of the series. In heat maps this color is
   * rarely used, as we mostly use the color to denote the value of each
   * point. Unless options are set in the colorAxis, the default value is
   * pulled from the options.colors array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The main color of the series. In heat maps this color is
   * rarely used, as we mostly use the color to denote the value of each
   * point. Unless options are set in the colorAxis, the default value is
   * pulled from the options.colors array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The main color of the series. In heat maps this color is
   * rarely used, as we mostly use the color to denote the value of each
   * point. Unless options are set in the colorAxis, the default value is
   * pulled from the options.colors array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colorAxis">https://api.highcharts.com/highmaps/plotOptions.heatmap.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colorAxis">https://api.highcharts.com/highmaps/plotOptions.heatmap.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highmaps) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.colorIndex">https://api.highcharts.com/highcharts/plotOptions.heatmap.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colorIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highmaps) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.colorIndex">https://api.highcharts.com/highcharts/plotOptions.heatmap.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colorIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highmaps) The column size - how many X axis units each
   * column in the heatmap should span.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.colsize">https://api.highcharts.com/highcharts/plotOptions.heatmap.colsize</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colsize">https://api.highcharts.com/highmaps/plotOptions.heatmap.colsize</a>
   *
   * @implspec colsize?: number;
   *
   */
  @JSProperty("colsize")
  double getColsize();

  /**
   * (Highcharts, Highmaps) The column size - how many X axis units each
   * column in the heatmap should span.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.colsize">https://api.highcharts.com/highcharts/plotOptions.heatmap.colsize</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.colsize">https://api.highcharts.com/highmaps/plotOptions.heatmap.colsize</a>
   *
   * @implspec colsize?: number;
   *
   */
  @JSProperty("colsize")
  void setColsize(double value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compare">https://api.highcharts.com/highstock/plotOptions.heatmap.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compare">https://api.highcharts.com/highstock/plotOptions.heatmap.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compareBase">https://api.highcharts.com/highstock/plotOptions.heatmap.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compareBase">https://api.highcharts.com/highstock/plotOptions.heatmap.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compareStart">https://api.highcharts.com/highstock/plotOptions.heatmap.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.compareStart">https://api.highcharts.com/highstock/plotOptions.heatmap.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.connectors">https://api.highcharts.com/gantt/plotOptions.heatmap.connectors</a>
   *
   * @implspec connectors?: PlotHeatmapConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotHeatmapConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.connectors">https://api.highcharts.com/gantt/plotOptions.heatmap.connectors</a>
   *
   * @implspec connectors?: PlotHeatmapConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotHeatmapConnectorsOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.cropThreshold">https://api.highcharts.com/highstock/plotOptions.heatmap.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.cropThreshold">https://api.highcharts.com/highstock/plotOptions.heatmap.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts, Highmaps) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor">https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor">https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts, Highmaps) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor">https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor">https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts, Highmaps) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor">https://api.highcharts.com/highcharts/plotOptions.heatmap.cursor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor">https://api.highcharts.com/highmaps/plotOptions.heatmap.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.dataGrouping">https://api.highcharts.com/highstock/plotOptions.heatmap.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotHeatmapDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotHeatmapDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.dataGrouping">https://api.highcharts.com/highstock/plotOptions.heatmap.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotHeatmapDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotHeatmapDataGroupingOptions value);

  /**
   * (Highcharts, Highmaps) Options for the series data labels, appearing next
   * to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dataLabels">https://api.highcharts.com/highcharts/plotOptions.heatmap.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dataLabels">https://api.highcharts.com/highmaps/plotOptions.heatmap.dataLabels</a>
   *
   * @implspec dataLabels?: PlotHeatmapDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotHeatmapDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highmaps) Options for the series data labels, appearing next
   * to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dataLabels">https://api.highcharts.com/highcharts/plotOptions.heatmap.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dataLabels">https://api.highcharts.com/highmaps/plotOptions.heatmap.dataLabels</a>
   *
   * @implspec dataLabels?: PlotHeatmapDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotHeatmapDataLabelsOptions value);

  /**
   * (Highcharts, Highmaps) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.description">https://api.highcharts.com/highcharts/plotOptions.heatmap.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.description">https://api.highcharts.com/highmaps/plotOptions.heatmap.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highmaps) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.description">https://api.highcharts.com/highcharts/plotOptions.heatmap.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.description">https://api.highcharts.com/highmaps/plotOptions.heatmap.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highmaps) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop</a>
   *
   * @implspec dragDrop?: PlotHeatmapDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotHeatmapDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highmaps) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop</a>
   *
   * @implspec dragDrop?: PlotHeatmapDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotHeatmapDragDropOptions value);

  /**
   * (Highcharts, Highmaps) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.heatmap.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.enableMouseTracking">https://api.highcharts.com/highmaps/plotOptions.heatmap.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highmaps) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.heatmap.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.enableMouseTracking">https://api.highcharts.com/highmaps/plotOptions.heatmap.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highmaps) General event handlers for the series items. These
   * event hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events">https://api.highcharts.com/highcharts/plotOptions.heatmap.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events">https://api.highcharts.com/highmaps/plotOptions.heatmap.events</a>
   *
   * @implspec events?: PlotHeatmapEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotHeatmapEventsOptions getEvents();

  /**
   * (Highcharts, Highmaps) General event handlers for the series items. These
   * event hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events">https://api.highcharts.com/highcharts/plotOptions.heatmap.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events">https://api.highcharts.com/highmaps/plotOptions.heatmap.events</a>
   *
   * @implspec events?: PlotHeatmapEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotHeatmapEventsOptions value);

  /**
   * (Highcharts, Highmaps) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.heatmap.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.exposeElementToA11y">https://api.highcharts.com/highmaps/plotOptions.heatmap.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts, Highmaps) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.heatmap.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.exposeElementToA11y">https://api.highcharts.com/highmaps/plotOptions.heatmap.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.gapSize">https://api.highcharts.com/highstock/plotOptions.heatmap.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.gapSize">https://api.highcharts.com/highstock/plotOptions.heatmap.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.gapUnit">https://api.highcharts.com/highstock/plotOptions.heatmap.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.gapUnit">https://api.highcharts.com/highstock/plotOptions.heatmap.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy">https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy">https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy">https://api.highcharts.com/highmaps/plotOptions.heatmap.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts, Highmaps) An array specifying which option maps to which key
   * in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.keys">https://api.highcharts.com/highcharts/plotOptions.heatmap.keys</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.keys">https://api.highcharts.com/highmaps/plotOptions.heatmap.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts, Highmaps) An array specifying which option maps to which key
   * in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.keys">https://api.highcharts.com/highcharts/plotOptions.heatmap.keys</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.keys">https://api.highcharts.com/highmaps/plotOptions.heatmap.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.label">https://api.highcharts.com/highcharts/plotOptions.heatmap.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.label">https://api.highcharts.com/highstock/plotOptions.heatmap.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.label">https://api.highcharts.com/gantt/plotOptions.heatmap.label</a>
   *
   * @implspec label?: PlotHeatmapLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotHeatmapLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.label">https://api.highcharts.com/highcharts/plotOptions.heatmap.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.label">https://api.highcharts.com/highstock/plotOptions.heatmap.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.label">https://api.highcharts.com/gantt/plotOptions.heatmap.label</a>
   *
   * @implspec label?: PlotHeatmapLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotHeatmapLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.linkedTo">https://api.highcharts.com/highcharts/plotOptions.heatmap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.linkedTo">https://api.highcharts.com/highstock/plotOptions.heatmap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.linkedTo">https://api.highcharts.com/gantt/plotOptions.heatmap.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.linkedTo">https://api.highcharts.com/highcharts/plotOptions.heatmap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.linkedTo">https://api.highcharts.com/highstock/plotOptions.heatmap.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.linkedTo">https://api.highcharts.com/gantt/plotOptions.heatmap.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.heatmap.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.heatmap.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts, Highmaps) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highcharts, Highmaps) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highcharts, Highmaps) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts, Highmaps) The color applied to null points. In styled mode,
   * a general CSS class is applied instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.nullColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.nullColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.nullColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.nullColor</a>
   *
   * @implspec nullColor?: ColorString;
   *
   */
  @JSProperty("nullColor")
  @Nullable
  String getNullColor();

  /**
   * (Highcharts, Highmaps) The color applied to null points. In styled mode,
   * a general CSS class is applied instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.nullColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.nullColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.nullColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.nullColor</a>
   *
   * @implspec nullColor?: ColorString;
   *
   */
  @JSProperty("nullColor")
  void setNullColor(String value);

  /**
   * (Highcharts, Highmaps) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.point">https://api.highcharts.com/highcharts/plotOptions.heatmap.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.point">https://api.highcharts.com/highmaps/plotOptions.heatmap.point</a>
   *
   * @implspec point?: PlotHeatmapPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotHeatmapPointOptions getPoint();

  /**
   * (Highcharts, Highmaps) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.point">https://api.highcharts.com/highcharts/plotOptions.heatmap.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.point">https://api.highcharts.com/highmaps/plotOptions.heatmap.point</a>
   *
   * @implspec point?: PlotHeatmapPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotHeatmapPointOptions value);

  /**
   * (Highcharts, Highmaps) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.heatmap.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.pointDescriptionFormatter">https://api.highcharts.com/highmaps/plotOptions.heatmap.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts, Highmaps) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.heatmap.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.pointDescriptionFormatter">https://api.highcharts.com/highmaps/plotOptions.heatmap.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts, Highmaps) Padding between the points in the heatmap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.pointPadding">https://api.highcharts.com/highcharts/plotOptions.heatmap.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.pointPadding">https://api.highcharts.com/highmaps/plotOptions.heatmap.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highmaps) Padding between the points in the heatmap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.pointPadding">https://api.highcharts.com/highcharts/plotOptions.heatmap.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.pointPadding">https://api.highcharts.com/highmaps/plotOptions.heatmap.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * (Highcharts, Highmaps) The row size - how many Y axis units each heatmap
   * row should span.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.rowsize">https://api.highcharts.com/highcharts/plotOptions.heatmap.rowsize</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.rowsize">https://api.highcharts.com/highmaps/plotOptions.heatmap.rowsize</a>
   *
   * @implspec rowsize?: number;
   *
   */
  @JSProperty("rowsize")
  double getRowsize();

  /**
   * (Highcharts, Highmaps) The row size - how many Y axis units each heatmap
   * row should span.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.rowsize">https://api.highcharts.com/highcharts/plotOptions.heatmap.rowsize</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.rowsize">https://api.highcharts.com/highmaps/plotOptions.heatmap.rowsize</a>
   *
   * @implspec rowsize?: number;
   *
   */
  @JSProperty("rowsize")
  void setRowsize(double value);

  /**
   * (Highcharts, Highmaps) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.selected">https://api.highcharts.com/highcharts/plotOptions.heatmap.selected</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.selected">https://api.highcharts.com/highmaps/plotOptions.heatmap.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highmaps) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.selected">https://api.highcharts.com/highcharts/plotOptions.heatmap.selected</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.selected">https://api.highcharts.com/highmaps/plotOptions.heatmap.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highmaps) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.heatmap.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.showCheckbox">https://api.highcharts.com/highmaps/plotOptions.heatmap.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highmaps) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.heatmap.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.showCheckbox">https://api.highcharts.com/highmaps/plotOptions.heatmap.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highmaps) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.showInLegend">https://api.highcharts.com/highcharts/plotOptions.heatmap.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.showInLegend">https://api.highcharts.com/highmaps/plotOptions.heatmap.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highmaps) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.showInLegend">https://api.highcharts.com/highcharts/plotOptions.heatmap.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.showInLegend">https://api.highcharts.com/highmaps/plotOptions.heatmap.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.showInNavigator">https://api.highcharts.com/highstock/plotOptions.heatmap.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.showInNavigator">https://api.highcharts.com/highstock/plotOptions.heatmap.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts, Highmaps) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.heatmap.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.skipKeyboardNavigation">https://api.highcharts.com/highmaps/plotOptions.heatmap.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highmaps) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.heatmap.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.skipKeyboardNavigation">https://api.highcharts.com/highmaps/plotOptions.heatmap.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts, Highmaps) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.states">https://api.highcharts.com/highcharts/plotOptions.heatmap.states</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states">https://api.highcharts.com/highmaps/plotOptions.heatmap.states</a>
   *
   * @implspec states?: PlotHeatmapStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotHeatmapStatesOptions getStates();

  /**
   * (Highcharts, Highmaps) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.states">https://api.highcharts.com/highcharts/plotOptions.heatmap.states</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states">https://api.highcharts.com/highmaps/plotOptions.heatmap.states</a>
   *
   * @implspec states?: PlotHeatmapStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotHeatmapStatesOptions value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.heatmap.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.stickyTracking">https://api.highcharts.com/highstock/plotOptions.heatmap.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.heatmap.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.stickyTracking">https://api.highcharts.com/highstock/plotOptions.heatmap.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.tooltip">https://api.highcharts.com/highcharts/plotOptions.heatmap.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.tooltip">https://api.highcharts.com/highstock/plotOptions.heatmap.tooltip</a>
   *
   * @implspec tooltip?: PlotHeatmapTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotHeatmapTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.tooltip">https://api.highcharts.com/highcharts/plotOptions.heatmap.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.tooltip">https://api.highcharts.com/highstock/plotOptions.heatmap.tooltip</a>
   *
   * @implspec tooltip?: PlotHeatmapTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotHeatmapTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/highstock/plotOptions.heatmap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/gantt/plotOptions.heatmap.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.heatmap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/highstock/plotOptions.heatmap.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.turboThreshold">https://api.highcharts.com/gantt/plotOptions.heatmap.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts, Highmaps) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.visible">https://api.highcharts.com/highcharts/plotOptions.heatmap.visible</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.visible">https://api.highcharts.com/highmaps/plotOptions.heatmap.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highmaps) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.visible">https://api.highcharts.com/highcharts/plotOptions.heatmap.visible</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.visible">https://api.highcharts.com/highmaps/plotOptions.heatmap.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.zIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.zIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.heatmap.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.zoneAxis">https://api.highcharts.com/highstock/plotOptions.heatmap.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.heatmap.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.zoneAxis">https://api.highcharts.com/highstock/plotOptions.heatmap.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.zones">https://api.highcharts.com/highcharts/plotOptions.heatmap.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.zones">https://api.highcharts.com/highstock/plotOptions.heatmap.zones</a>
   *
   * @implspec zones?: Array<PlotHeatmapZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotHeatmapZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.zones">https://api.highcharts.com/highcharts/plotOptions.heatmap.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.zones">https://api.highcharts.com/highstock/plotOptions.heatmap.zones</a>
   *
   * @implspec zones?: Array<PlotHeatmapZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotHeatmapZonesOptions> value);

  /**
   */
  abstract class CompareBase extends JsEnum {
    public static final CompareBase VALUE_0 = JsEnum.of(0);

    public static final CompareBase VALUE_100 = JsEnum.of(100);
  }

  /**
   */
  abstract class GapUnit extends JsEnum {
    public static final GapUnit RELATIVE = JsEnum.of("relative");

    public static final GapUnit VALUE = JsEnum.of("value");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }
}
