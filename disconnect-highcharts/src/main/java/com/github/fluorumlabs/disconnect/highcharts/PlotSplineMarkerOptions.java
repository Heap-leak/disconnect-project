package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the point markers of line-like series.
 * Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
 * appearance of the markers. Other series types, like column series, don't have
 * markers, but have visual options on the series level instead.
 *
 * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
 * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker">https://api.highcharts.com/highcharts/plotOptions.spline.marker</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker">https://api.highcharts.com/highstock/plotOptions.spline.marker</a>
 *
 */
public interface PlotSplineMarkerOptions extends Any {
  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.enabled">https://api.highcharts.com/highstock/plotOptions.spline.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.enabled">https://api.highcharts.com/highstock/plotOptions.spline.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.spline.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.spline.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.spline.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.height">https://api.highcharts.com/highcharts/plotOptions.spline.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.height">https://api.highcharts.com/highstock/plotOptions.spline.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.height">https://api.highcharts.com/highcharts/plotOptions.spline.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.height">https://api.highcharts.com/highstock/plotOptions.spline.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.spline.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.spline.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.spline.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.spline.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.radius">https://api.highcharts.com/highcharts/plotOptions.spline.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.radius">https://api.highcharts.com/highstock/plotOptions.spline.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.radius">https://api.highcharts.com/highcharts/plotOptions.spline.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.radius">https://api.highcharts.com/highstock/plotOptions.spline.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states">https://api.highcharts.com/highstock/plotOptions.spline.marker.states</a>
   *
   * @implspec states?: PlotSplineMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotSplineMarkerStatesOptions getStates();

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states">https://api.highcharts.com/highstock/plotOptions.spline.marker.states</a>
   *
   * @implspec states?: PlotSplineMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotSplineMarkerStatesOptions value);

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.spline.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.symbol">https://api.highcharts.com/highstock/plotOptions.spline.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.spline.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.symbol">https://api.highcharts.com/highstock/plotOptions.spline.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.width">https://api.highcharts.com/highcharts/plotOptions.spline.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.width">https://api.highcharts.com/highstock/plotOptions.spline.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.width">https://api.highcharts.com/highcharts/plotOptions.spline.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.width">https://api.highcharts.com/highstock/plotOptions.spline.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
