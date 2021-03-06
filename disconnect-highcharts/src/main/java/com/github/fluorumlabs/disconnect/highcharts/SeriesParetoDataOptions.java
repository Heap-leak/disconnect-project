package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>pareto</code> series
 * type, points are calculated dynamically.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data">https://api.highcharts.com/highcharts/series.pareto.data</a>
 *
 */
public interface SeriesParetoDataOptions extends Any {
  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.borderColor">https://api.highcharts.com/highcharts/series.pareto.data.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.borderColor">https://api.highcharts.com/highstock/series.pareto.data.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.borderColor">https://api.highcharts.com/highcharts/series.pareto.data.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.borderColor">https://api.highcharts.com/highstock/series.pareto.data.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock) The width of the border surrounding the column or
   * bar.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.borderWidth">https://api.highcharts.com/highcharts/series.pareto.data.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.borderWidth">https://api.highcharts.com/highstock/series.pareto.data.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock) The width of the border surrounding the column or
   * bar.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.borderWidth">https://api.highcharts.com/highcharts/series.pareto.data.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.borderWidth">https://api.highcharts.com/highstock/series.pareto.data.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.className">https://api.highcharts.com/highcharts/series.pareto.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.className">https://api.highcharts.com/gantt/series.pareto.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.className">https://api.highcharts.com/highcharts/series.pareto.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.className">https://api.highcharts.com/gantt/series.pareto.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.color">https://api.highcharts.com/highcharts/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.color">https://api.highcharts.com/highstock/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.color">https://api.highcharts.com/gantt/series.pareto.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.color">https://api.highcharts.com/highcharts/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.color">https://api.highcharts.com/highstock/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.color">https://api.highcharts.com/gantt/series.pareto.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.color">https://api.highcharts.com/highcharts/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.color">https://api.highcharts.com/highstock/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.color">https://api.highcharts.com/gantt/series.pareto.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.color">https://api.highcharts.com/highcharts/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.color">https://api.highcharts.com/highstock/series.pareto.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.color">https://api.highcharts.com/gantt/series.pareto.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.colorIndex">https://api.highcharts.com/highcharts/series.pareto.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.colorIndex">https://api.highcharts.com/gantt/series.pareto.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.colorIndex">https://api.highcharts.com/highcharts/series.pareto.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.colorIndex">https://api.highcharts.com/gantt/series.pareto.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.dataLabels">https://api.highcharts.com/highcharts/series.pareto.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.dataLabels">https://api.highcharts.com/highstock/series.pareto.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.dataLabels">https://api.highcharts.com/gantt/series.pareto.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.dataLabels">https://api.highcharts.com/highcharts/series.pareto.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.dataLabels">https://api.highcharts.com/highstock/series.pareto.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.dataLabels">https://api.highcharts.com/gantt/series.pareto.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.description">https://api.highcharts.com/highcharts/series.pareto.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.description">https://api.highcharts.com/highcharts/series.pareto.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.dragDrop">https://api.highcharts.com/highcharts/series.pareto.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.dragDrop">https://api.highcharts.com/highstock/series.pareto.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.pareto.data.dragDrop">https://api.highcharts.com/highmaps/series.pareto.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesParetoDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesParetoDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.dragDrop">https://api.highcharts.com/highcharts/series.pareto.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.dragDrop">https://api.highcharts.com/highstock/series.pareto.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.pareto.data.dragDrop">https://api.highcharts.com/highmaps/series.pareto.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesParetoDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesParetoDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.drilldown">https://api.highcharts.com/highcharts/series.pareto.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.drilldown">https://api.highcharts.com/highcharts/series.pareto.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.events">https://api.highcharts.com/highcharts/series.pareto.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.events">https://api.highcharts.com/highstock/series.pareto.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.events">https://api.highcharts.com/gantt/series.pareto.data.events</a>
   *
   * @implspec events?: SeriesParetoDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesParetoDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.events">https://api.highcharts.com/highcharts/series.pareto.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.events">https://api.highcharts.com/highstock/series.pareto.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.events">https://api.highcharts.com/gantt/series.pareto.data.events</a>
   *
   * @implspec events?: SeriesParetoDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesParetoDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.id">https://api.highcharts.com/highcharts/series.pareto.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.id">https://api.highcharts.com/highstock/series.pareto.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.id">https://api.highcharts.com/gantt/series.pareto.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.id">https://api.highcharts.com/highcharts/series.pareto.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.id">https://api.highcharts.com/highstock/series.pareto.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.id">https://api.highcharts.com/gantt/series.pareto.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.labelrank">https://api.highcharts.com/highcharts/series.pareto.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.labelrank">https://api.highcharts.com/highcharts/series.pareto.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.name">https://api.highcharts.com/highcharts/series.pareto.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.name">https://api.highcharts.com/highcharts/series.pareto.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * the column or bar. Overrides pointWidth on the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.pointWidth">https://api.highcharts.com/highcharts/series.pareto.data.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.pointWidth">https://api.highcharts.com/highstock/series.pareto.data.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.pointWidth">https://api.highcharts.com/gantt/series.pareto.data.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  double getPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * the column or bar. Overrides pointWidth on the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.pointWidth">https://api.highcharts.com/highcharts/series.pareto.data.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.pointWidth">https://api.highcharts.com/highstock/series.pareto.data.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.pointWidth">https://api.highcharts.com/gantt/series.pareto.data.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.selected">https://api.highcharts.com/highcharts/series.pareto.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.selected">https://api.highcharts.com/highstock/series.pareto.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.selected">https://api.highcharts.com/gantt/series.pareto.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.selected">https://api.highcharts.com/highcharts/series.pareto.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.selected">https://api.highcharts.com/highstock/series.pareto.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.pareto.data.selected">https://api.highcharts.com/gantt/series.pareto.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.x">https://api.highcharts.com/highcharts/series.pareto.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.x">https://api.highcharts.com/highstock/series.pareto.data.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.x">https://api.highcharts.com/highcharts/series.pareto.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.x">https://api.highcharts.com/highstock/series.pareto.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.y">https://api.highcharts.com/highcharts/series.pareto.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.y">https://api.highcharts.com/highstock/series.pareto.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.pareto.data.y">https://api.highcharts.com/highcharts/series.pareto.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.pareto.data.y">https://api.highcharts.com/highstock/series.pareto.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
