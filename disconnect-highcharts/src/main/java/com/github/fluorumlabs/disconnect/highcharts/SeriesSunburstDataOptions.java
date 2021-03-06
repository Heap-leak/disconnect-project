package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>treemap</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>value</code> options. Example:(see online documentation for
 * example)
 *
 * </li>
 * <li>
 * An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available.(see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data">https://api.highcharts.com/highcharts/series.sunburst.data</a>
 *
 */
public interface SeriesSunburstDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.className">https://api.highcharts.com/highcharts/series.sunburst.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.className">https://api.highcharts.com/gantt/series.sunburst.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.className">https://api.highcharts.com/highcharts/series.sunburst.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.className">https://api.highcharts.com/gantt/series.sunburst.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highmaps) The color of the point. In heat maps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.color">https://api.highcharts.com/highcharts/series.sunburst.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.color">https://api.highcharts.com/highmaps/series.sunburst.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highmaps) The color of the point. In heat maps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.color">https://api.highcharts.com/highcharts/series.sunburst.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.color">https://api.highcharts.com/highmaps/series.sunburst.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) The color of the point. In heat maps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.color">https://api.highcharts.com/highcharts/series.sunburst.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.color">https://api.highcharts.com/highmaps/series.sunburst.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highmaps) The color of the point. In heat maps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.color">https://api.highcharts.com/highcharts/series.sunburst.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.color">https://api.highcharts.com/highmaps/series.sunburst.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.colorIndex">https://api.highcharts.com/highcharts/series.sunburst.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.colorIndex">https://api.highcharts.com/gantt/series.sunburst.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.colorIndex">https://api.highcharts.com/highcharts/series.sunburst.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.colorIndex">https://api.highcharts.com/gantt/series.sunburst.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) Serves a purpose only if a <code>colorAxis</code> object is defined in
   * the chart options. This value will decide which color the point gets from
   * the scale of the colorAxis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.colorValue">https://api.highcharts.com/highcharts/series.sunburst.data.colorValue</a>
   *
   * @implspec colorValue?: number;
   *
   */
  @JSProperty("colorValue")
  double getColorValue();

  /**
   * (Highcharts) Serves a purpose only if a <code>colorAxis</code> object is defined in
   * the chart options. This value will decide which color the point gets from
   * the scale of the colorAxis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.colorValue">https://api.highcharts.com/highcharts/series.sunburst.data.colorValue</a>
   *
   * @implspec colorValue?: number;
   *
   */
  @JSProperty("colorValue")
  void setColorValue(double value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.dataLabels">https://api.highcharts.com/highcharts/series.sunburst.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.dataLabels">https://api.highcharts.com/highstock/series.sunburst.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.dataLabels">https://api.highcharts.com/gantt/series.sunburst.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.dataLabels">https://api.highcharts.com/highcharts/series.sunburst.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.dataLabels">https://api.highcharts.com/highstock/series.sunburst.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.dataLabels">https://api.highcharts.com/gantt/series.sunburst.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.description">https://api.highcharts.com/highcharts/series.sunburst.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.description">https://api.highcharts.com/highcharts/series.sunburst.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.dragDrop">https://api.highcharts.com/highcharts/series.sunburst.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.dragDrop">https://api.highcharts.com/highstock/series.sunburst.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.dragDrop">https://api.highcharts.com/highmaps/series.sunburst.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSunburstDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesSunburstDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.dragDrop">https://api.highcharts.com/highcharts/series.sunburst.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.dragDrop">https://api.highcharts.com/highstock/series.sunburst.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.dragDrop">https://api.highcharts.com/highmaps/series.sunburst.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSunburstDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesSunburstDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.drilldown">https://api.highcharts.com/highcharts/series.sunburst.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.drilldown">https://api.highcharts.com/highcharts/series.sunburst.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.events">https://api.highcharts.com/highcharts/series.sunburst.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.events">https://api.highcharts.com/highstock/series.sunburst.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.events">https://api.highcharts.com/gantt/series.sunburst.data.events</a>
   *
   * @implspec events?: SeriesSunburstDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesSunburstDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.events">https://api.highcharts.com/highcharts/series.sunburst.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.events">https://api.highcharts.com/highstock/series.sunburst.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.events">https://api.highcharts.com/gantt/series.sunburst.data.events</a>
   *
   * @implspec events?: SeriesSunburstDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesSunburstDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.id">https://api.highcharts.com/highcharts/series.sunburst.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.id">https://api.highcharts.com/highstock/series.sunburst.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.id">https://api.highcharts.com/gantt/series.sunburst.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.id">https://api.highcharts.com/highcharts/series.sunburst.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.id">https://api.highcharts.com/highstock/series.sunburst.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.id">https://api.highcharts.com/gantt/series.sunburst.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.labelrank">https://api.highcharts.com/highcharts/series.sunburst.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.labelrank">https://api.highcharts.com/highcharts/series.sunburst.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts) The name decides the text for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.name">https://api.highcharts.com/highcharts/series.sunburst.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts) The name decides the text for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.name">https://api.highcharts.com/highcharts/series.sunburst.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts) Only for treemap. Use this option to build a tree structure.
   * The value should be the id of the point which is the parent. If no points
   * has a matching id, or this option is undefined, then the parent will be
   * set to the root.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.parent">https://api.highcharts.com/highcharts/series.sunburst.data.parent</a>
   *
   * @implspec parent?: string;
   *
   */
  @JSProperty("parent")
  @Nullable
  String getParent();

  /**
   * (Highcharts) Only for treemap. Use this option to build a tree structure.
   * The value should be the id of the point which is the parent. If no points
   * has a matching id, or this option is undefined, then the parent will be
   * set to the root.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.parent">https://api.highcharts.com/highcharts/series.sunburst.data.parent</a>
   *
   * @implspec parent?: string;
   *
   */
  @JSProperty("parent")
  void setParent(String value);

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.pointPadding">https://api.highcharts.com/highcharts/series.sunburst.data.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.pointPadding">https://api.highcharts.com/highmaps/series.sunburst.data.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.pointPadding">https://api.highcharts.com/highcharts/series.sunburst.data.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sunburst.data.pointPadding">https://api.highcharts.com/highmaps/series.sunburst.data.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.selected">https://api.highcharts.com/highcharts/series.sunburst.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.selected">https://api.highcharts.com/highstock/series.sunburst.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.selected">https://api.highcharts.com/gantt/series.sunburst.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.selected">https://api.highcharts.com/highcharts/series.sunburst.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sunburst.data.selected">https://api.highcharts.com/highstock/series.sunburst.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sunburst.data.selected">https://api.highcharts.com/gantt/series.sunburst.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) Whether to display a slice offset from the center. When a
   * sunburst point is sliced, its children are also offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.sliced">https://api.highcharts.com/highcharts/series.sunburst.data.sliced</a>
   *
   * @implspec sliced?: boolean;
   *
   */
  @JSProperty("sliced")
  boolean getSliced();

  /**
   * (Highcharts) Whether to display a slice offset from the center. When a
   * sunburst point is sliced, its children are also offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.sliced">https://api.highcharts.com/highcharts/series.sunburst.data.sliced</a>
   *
   * @implspec sliced?: boolean;
   *
   */
  @JSProperty("sliced")
  void setSliced(boolean value);

  /**
   * (Highcharts) The value of the point, resulting in a relative area of the
   * point in the sunburst.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.value">https://api.highcharts.com/highcharts/series.sunburst.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts) The value of the point, resulting in a relative area of the
   * point in the sunburst.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.value">https://api.highcharts.com/highcharts/series.sunburst.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts) The weighting of a word. The weight decides the relative
   * size of a word compared to the rest of the collection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.weight">https://api.highcharts.com/highcharts/series.sunburst.data.weight</a>
   *
   * @implspec weight?: number;
   *
   */
  @JSProperty("weight")
  double getWeight();

  /**
   * (Highcharts) The weighting of a word. The weight decides the relative
   * size of a word compared to the rest of the collection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sunburst.data.weight">https://api.highcharts.com/highcharts/series.sunburst.data.weight</a>
   *
   * @implspec weight?: number;
   *
   */
  @JSProperty("weight")
  void setWeight(double value);
}
