package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) The draggable-points module allows points to be moved
 * around or modified in the chart. In addition to the options mentioned under
 * the <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop</a>
 *
 */
public interface PlotTilemapDragDropOptions extends Any {
  /**
   * (Highcharts, Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highmaps) Enable dragging in the Y dimension. Note that this
   * is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highmaps) Enable dragging in the Y dimension. Note that this
   * is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragHandle">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotTilemapDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotTilemapDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragHandle">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotTilemapDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotTilemapDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highmaps) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highmaps) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highmaps) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highmaps) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highmaps) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highmaps) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highmaps) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highmaps) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highmaps) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highmaps) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highmaps) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highmaps) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highmaps) The amount of pixels to drag the pointer before it
   * counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highmaps) The amount of pixels to drag the pointer before it
   * counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highmaps) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.groupBy">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highmaps) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.groupBy">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts, Highmaps) Style options for the guide box. The guide box has
   * one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotTilemapDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highmaps) Style options for the guide box. The guide box has
   * one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotTilemapDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotTilemapDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highmaps) Style options for the guide box. The guide box has
   * one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotTilemapDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highmaps) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highmaps) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
