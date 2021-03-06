package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The draggable-points module allows points to be moved around or
 * modified in the chart. In addition to the options mentioned under the
 * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop</a>
 *
 */
public interface PlotBoxplotDragDropOptions extends Any {
  /**
   * (Highcharts) Allow high value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  boolean getDraggableHigh();

  /**
   * (Highcharts) Allow high value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  void setDraggableHigh(boolean value);

  /**
   * (Highcharts) Allow low value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  boolean getDraggableLow();

  /**
   * (Highcharts) Allow low value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  void setDraggableLow(boolean value);

  /**
   * (Highcharts) Allow Q1 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ1">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ1</a>
   *
   * @implspec draggableQ1?: boolean;
   *
   */
  @JSProperty("draggableQ1")
  boolean getDraggableQ1();

  /**
   * (Highcharts) Allow Q1 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ1">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ1</a>
   *
   * @implspec draggableQ1?: boolean;
   *
   */
  @JSProperty("draggableQ1")
  void setDraggableQ1(boolean value);

  /**
   * (Highcharts) Allow Q3 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ3">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ3</a>
   *
   * @implspec draggableQ3?: boolean;
   *
   */
  @JSProperty("draggableQ3")
  boolean getDraggableQ3();

  /**
   * (Highcharts) Allow Q3 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ3">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableQ3</a>
   *
   * @implspec draggableQ3?: boolean;
   *
   */
  @JSProperty("draggableQ3")
  void setDraggableQ3(boolean value);

  /**
   * (Highcharts) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotBoxplotDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotBoxplotDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotBoxplotDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotBoxplotDragDropDragHandleOptions value);

  /**
   * (Highcharts) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts) The X precision value to drag to for this series. Set to 0
   * to disable. By default this is disabled, except for category axes, where
   * the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts) The X precision value to drag to for this series. Set to 0
   * to disable. By default this is disabled, except for category axes, where
   * the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts) The Y precision value to drag to for this series. Set to 0
   * to disable. By default this is disabled, except for category axes, where
   * the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts) The Y precision value to drag to for this series. Set to 0
   * to disable. By default this is disabled, except for category axes, where
   * the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts) The amount of pixels to drag the pointer before it counts as
   * a drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts) The amount of pixels to drag the pointer before it counts as
   * a drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts) Group the points by a property. Points with the same
   * property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts) Group the points by a property. Points with the same
   * property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotBoxplotDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotBoxplotDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotBoxplotDragDropGuideBoxOptions value);

  /**
   * (Highcharts) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotBoxplotDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
