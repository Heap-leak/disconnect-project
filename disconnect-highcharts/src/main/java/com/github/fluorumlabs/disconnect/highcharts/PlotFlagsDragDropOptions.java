package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The draggable-points module allows points to be moved around or
 * modified in the chart. In addition to the options mentioned under the
 * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop</a>
 *
 */
public interface PlotFlagsDragDropOptions extends Any {
  /**
   * (Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highstock) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highstock) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotFlagsDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotFlagsDragDropDragHandleOptions getDragHandle();

  /**
   * (Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotFlagsDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotFlagsDragDropDragHandleOptions value);

  /**
   * (Highstock) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highstock) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highstock) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highstock) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highstock) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highstock) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highstock) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highstock) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highstock) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highstock) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highstock) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highstock) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highstock) The amount of pixels to drag the pointer before it counts as
   * a drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highstock) The amount of pixels to drag the pointer before it counts as
   * a drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highstock) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highstock) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highstock) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotFlagsDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highstock) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotFlagsDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotFlagsDragDropGuideBoxOptions value);

  /**
   * (Highstock) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotFlagsDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highstock) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highstock) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.flags.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
