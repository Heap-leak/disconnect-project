package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox</a>
 *
 */
public interface PlotPyramidDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotPyramidDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotPyramidDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotPyramidDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotPyramidDragDropGuideBoxDefaultOptions value);
}
