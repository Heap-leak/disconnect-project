package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>bellcurve</code>
 * series type, points are calculated dynamically.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data">https://api.highcharts.com/highcharts/series.bellcurve.data</a>
 *
 */
public interface SeriesBellcurveDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.className">https://api.highcharts.com/highcharts/series.bellcurve.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.className">https://api.highcharts.com/gantt/series.bellcurve.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.className">https://api.highcharts.com/highcharts/series.bellcurve.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.className">https://api.highcharts.com/gantt/series.bellcurve.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.color">https://api.highcharts.com/highcharts/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.color">https://api.highcharts.com/highstock/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.color">https://api.highcharts.com/gantt/series.bellcurve.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.color">https://api.highcharts.com/highcharts/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.color">https://api.highcharts.com/highstock/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.color">https://api.highcharts.com/gantt/series.bellcurve.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.color">https://api.highcharts.com/highcharts/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.color">https://api.highcharts.com/highstock/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.color">https://api.highcharts.com/gantt/series.bellcurve.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.color">https://api.highcharts.com/highcharts/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.color">https://api.highcharts.com/highstock/series.bellcurve.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.color">https://api.highcharts.com/gantt/series.bellcurve.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.colorIndex">https://api.highcharts.com/highcharts/series.bellcurve.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.colorIndex">https://api.highcharts.com/gantt/series.bellcurve.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.colorIndex">https://api.highcharts.com/highcharts/series.bellcurve.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.colorIndex">https://api.highcharts.com/gantt/series.bellcurve.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.dataLabels">https://api.highcharts.com/highcharts/series.bellcurve.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.dataLabels">https://api.highcharts.com/highstock/series.bellcurve.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.dataLabels">https://api.highcharts.com/gantt/series.bellcurve.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotSeriesDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.dataLabels">https://api.highcharts.com/highcharts/series.bellcurve.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.dataLabels">https://api.highcharts.com/highstock/series.bellcurve.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.dataLabels">https://api.highcharts.com/gantt/series.bellcurve.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSeriesDataLabelsOptions value);

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.description">https://api.highcharts.com/highcharts/series.bellcurve.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.description">https://api.highcharts.com/highcharts/series.bellcurve.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.dragDrop">https://api.highcharts.com/highcharts/series.bellcurve.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.dragDrop">https://api.highcharts.com/highstock/series.bellcurve.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.dragDrop">https://api.highcharts.com/highmaps/series.bellcurve.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesBellcurveDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesBellcurveDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.dragDrop">https://api.highcharts.com/highcharts/series.bellcurve.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.dragDrop">https://api.highcharts.com/highstock/series.bellcurve.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.dragDrop">https://api.highcharts.com/highmaps/series.bellcurve.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesBellcurveDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesBellcurveDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.drilldown">https://api.highcharts.com/highcharts/series.bellcurve.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.drilldown">https://api.highcharts.com/highcharts/series.bellcurve.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.events">https://api.highcharts.com/highcharts/series.bellcurve.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.events">https://api.highcharts.com/highstock/series.bellcurve.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.events">https://api.highcharts.com/gantt/series.bellcurve.data.events</a>
   *
   * @implspec events?: SeriesBellcurveDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesBellcurveDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.events">https://api.highcharts.com/highcharts/series.bellcurve.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.events">https://api.highcharts.com/highstock/series.bellcurve.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.events">https://api.highcharts.com/gantt/series.bellcurve.data.events</a>
   *
   * @implspec events?: SeriesBellcurveDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesBellcurveDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.id">https://api.highcharts.com/highcharts/series.bellcurve.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.id">https://api.highcharts.com/highstock/series.bellcurve.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.id">https://api.highcharts.com/gantt/series.bellcurve.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.id">https://api.highcharts.com/highcharts/series.bellcurve.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.id">https://api.highcharts.com/highstock/series.bellcurve.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.id">https://api.highcharts.com/gantt/series.bellcurve.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.labelrank">https://api.highcharts.com/highcharts/series.bellcurve.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.labelrank">https://api.highcharts.com/highcharts/series.bellcurve.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

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
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker">https://api.highcharts.com/highcharts/series.bellcurve.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker">https://api.highcharts.com/highstock/series.bellcurve.data.marker</a>
   *
   * @implspec marker?: SeriesBellcurveDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  SeriesBellcurveDataMarkerOptions getMarker();

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
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker">https://api.highcharts.com/highcharts/series.bellcurve.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker">https://api.highcharts.com/highstock/series.bellcurve.data.marker</a>
   *
   * @implspec marker?: SeriesBellcurveDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(SeriesBellcurveDataMarkerOptions value);

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.name">https://api.highcharts.com/highcharts/series.bellcurve.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.name">https://api.highcharts.com/highcharts/series.bellcurve.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.selected">https://api.highcharts.com/highcharts/series.bellcurve.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.selected">https://api.highcharts.com/highstock/series.bellcurve.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.selected">https://api.highcharts.com/gantt/series.bellcurve.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.selected">https://api.highcharts.com/highcharts/series.bellcurve.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.selected">https://api.highcharts.com/highstock/series.bellcurve.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.bellcurve.data.selected">https://api.highcharts.com/gantt/series.bellcurve.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.x">https://api.highcharts.com/highcharts/series.bellcurve.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.x">https://api.highcharts.com/highstock/series.bellcurve.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.x">https://api.highcharts.com/highcharts/series.bellcurve.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.x">https://api.highcharts.com/highstock/series.bellcurve.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.y">https://api.highcharts.com/highcharts/series.bellcurve.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.y">https://api.highcharts.com/highstock/series.bellcurve.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.y">https://api.highcharts.com/highcharts/series.bellcurve.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.y">https://api.highcharts.com/highstock/series.bellcurve.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
