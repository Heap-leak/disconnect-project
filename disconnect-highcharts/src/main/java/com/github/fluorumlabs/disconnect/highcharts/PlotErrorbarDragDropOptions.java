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
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop</a>
 *
 */
public interface PlotErrorbarDragDropOptions extends Any {
  /**
   * (Highcharts, Highstock) Allow high value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableHigh</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableHigh">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  boolean getDraggableHigh();

  /**
   * (Highcharts, Highstock) Allow high value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableHigh</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableHigh">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  void setDraggableHigh(boolean value);

  /**
   * (Highcharts, Highstock) Allow low value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableLow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableLow">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  boolean getDraggableLow();

  /**
   * (Highcharts, Highstock) Allow low value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableLow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableLow">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  void setDraggableLow(boolean value);

  /**
   * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ1">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ1</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ1">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ1</a>
   *
   * @implspec draggableQ1?: boolean;
   *
   */
  @JSProperty("draggableQ1")
  boolean getDraggableQ1();

  /**
   * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ1">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ1</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ1">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ1</a>
   *
   * @implspec draggableQ1?: boolean;
   *
   */
  @JSProperty("draggableQ1")
  void setDraggableQ1(boolean value);

  /**
   * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ3">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ3</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ3">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ3</a>
   *
   * @implspec draggableQ3?: boolean;
   *
   */
  @JSProperty("draggableQ3")
  boolean getDraggableQ3();

  /**
   * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ3">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableQ3</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ3">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableQ3</a>
   *
   * @implspec draggableQ3?: boolean;
   *
   */
  @JSProperty("draggableQ3")
  void setDraggableQ3(boolean value);

  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotErrorbarDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotErrorbarDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotErrorbarDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotErrorbarDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highstock) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMaxY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragMinY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionX</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragPrecisionY</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragSensitivity</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.dragSensitivity</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.groupBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.groupBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotErrorbarDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotErrorbarDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotErrorbarDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotErrorbarDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highstock) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.liveRedraw</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
