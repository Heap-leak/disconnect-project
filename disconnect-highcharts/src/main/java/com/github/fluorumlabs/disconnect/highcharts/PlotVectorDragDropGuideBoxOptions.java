package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Style options for the guide box. The guide box has
 * one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox</a>
 *
 */
public interface PlotVectorDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotVectorDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotVectorDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.vector.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotVectorDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotVectorDragDropGuideBoxDefaultOptions value);
}
