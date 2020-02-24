package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The draggable-points module allows points to be moved
 * around or modified in the chart. In addition to the options mentioned under
 * the <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop</a>
 *
 */
public interface PlotSplineDragDropOptions extends Any {
  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highstock) Enable dragging in the Y dimension. Note that
   * this is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highstock) Enable dragging in the Y dimension. Note that
   * this is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotSplineDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotSplineDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotSplineDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotSplineDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highstock) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highstock) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highstock) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highstock) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highstock) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highstock) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highstock) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highstock) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highstock) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highstock) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highstock) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highstock) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highstock) The amount of pixels to drag the pointer before
   * it counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highstock) The amount of pixels to drag the pointer before
   * it counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highstock) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highstock) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotSplineDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotSplineDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotSplineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotSplineDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highstock) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highstock) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.spline.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.spline.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
