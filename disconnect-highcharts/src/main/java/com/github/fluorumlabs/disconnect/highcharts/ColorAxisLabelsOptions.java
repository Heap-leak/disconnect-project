package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) The axis labels show the number for each tick.
 *
 * For more live examples on label options, see xAxis.labels in the Highcharts
 * API.
 *
 * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels">https://api.highcharts.com/highcharts/colorAxis.labels</a>
 * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels">https://api.highcharts.com/highmaps/colorAxis.labels</a>
 *
 */
public interface ColorAxisLabelsOptions extends Any {
  /**
   * (Highcharts, Highmaps) What part of the string the given position is
   * anchored to. If <code>left</code>, the left side of the string is at the axis
   * position. Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to an
   * intelligent guess based on which side of the chart the axis is on and the
   * rotation of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.align">https://api.highcharts.com/highcharts/colorAxis.labels.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.align">https://api.highcharts.com/highmaps/colorAxis.labels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highmaps) What part of the string the given position is
   * anchored to. If <code>left</code>, the left side of the string is at the axis
   * position. Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to an
   * intelligent guess based on which side of the chart the axis is on and the
   * rotation of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.align">https://api.highcharts.com/highcharts/colorAxis.labels.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.align">https://api.highcharts.com/highmaps/colorAxis.labels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.autoRotation">https://api.highcharts.com/highcharts/colorAxis.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.labels.autoRotation">https://api.highcharts.com/highstock/colorAxis.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.autoRotation">https://api.highcharts.com/gantt/colorAxis.labels.autoRotation</a>
   *
   * @implspec autoRotation?: Array<number>;
   *
   */
  @JSProperty("autoRotation")
  @Nullable
  double[] getAutoRotation();

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.autoRotation">https://api.highcharts.com/highcharts/colorAxis.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.labels.autoRotation">https://api.highcharts.com/highstock/colorAxis.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.autoRotation">https://api.highcharts.com/gantt/colorAxis.labels.autoRotation</a>
   *
   * @implspec autoRotation?: Array<number>;
   *
   */
  @JSProperty("autoRotation")
  void setAutoRotation(double[] value);

  /**
   * (Highcharts, Gantt) When each category width is more than this many
   * pixels, we don't apply auto rotation. Instead, we lay out the axis label
   * with word wrap. A lower limit makes sense when the label contains
   * multiple short words that don't extend the available horizontal space for
   * each label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.autoRotationLimit">https://api.highcharts.com/highcharts/colorAxis.labels.autoRotationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.autoRotationLimit">https://api.highcharts.com/gantt/colorAxis.labels.autoRotationLimit</a>
   *
   * @implspec autoRotationLimit?: number;
   *
   */
  @JSProperty("autoRotationLimit")
  double getAutoRotationLimit();

  /**
   * (Highcharts, Gantt) When each category width is more than this many
   * pixels, we don't apply auto rotation. Instead, we lay out the axis label
   * with word wrap. A lower limit makes sense when the label contains
   * multiple short words that don't extend the available horizontal space for
   * each label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.autoRotationLimit">https://api.highcharts.com/highcharts/colorAxis.labels.autoRotationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.autoRotationLimit">https://api.highcharts.com/gantt/colorAxis.labels.autoRotationLimit</a>
   *
   * @implspec autoRotationLimit?: number;
   *
   */
  @JSProperty("autoRotationLimit")
  void setAutoRotationLimit(double value);

  /**
   * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
   * the perimeter of the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.distance">https://api.highcharts.com/highcharts/colorAxis.labels.distance</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.distance">https://api.highcharts.com/gantt/colorAxis.labels.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
   * the perimeter of the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.distance">https://api.highcharts.com/highcharts/colorAxis.labels.distance</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.distance">https://api.highcharts.com/gantt/colorAxis.labels.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highmaps) Enable or disable the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.enabled">https://api.highcharts.com/highcharts/colorAxis.labels.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.enabled">https://api.highcharts.com/highmaps/colorAxis.labels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highmaps) Enable or disable the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.enabled">https://api.highcharts.com/highcharts/colorAxis.labels.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.enabled">https://api.highcharts.com/highmaps/colorAxis.labels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highmaps) A format string for the axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.format">https://api.highcharts.com/highcharts/colorAxis.labels.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.format">https://api.highcharts.com/highmaps/colorAxis.labels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highmaps) A format string for the axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.format">https://api.highcharts.com/highcharts/colorAxis.labels.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.format">https://api.highcharts.com/highmaps/colorAxis.labels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highcharts, Highmaps) Callback JavaScript function to format the label.
   * The value is given by <code>this.value</code>. Additional properties for <code>this</code> are
   * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label
   * formatter can be retrieved by calling
   * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.
   *
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.formatter">https://api.highcharts.com/highcharts/colorAxis.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.formatter">https://api.highcharts.com/highmaps/colorAxis.labels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<AxisLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<AxisLabelsFormatterContextObject> getFormatter();

  /**
   * (Highcharts, Highmaps) Callback JavaScript function to format the label.
   * The value is given by <code>this.value</code>. Additional properties for <code>this</code> are
   * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label
   * formatter can be retrieved by calling
   * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.
   *
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.formatter">https://api.highcharts.com/highcharts/colorAxis.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.formatter">https://api.highcharts.com/highmaps/colorAxis.labels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<AxisLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<AxisLabelsFormatterContextObject> value);

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.indentation">https://api.highcharts.com/gantt/colorAxis.labels.indentation</a>
   *
   * @implspec indentation?: number;
   *
   */
  @JSProperty("indentation")
  double getIndentation();

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.indentation">https://api.highcharts.com/gantt/colorAxis.labels.indentation</a>
   *
   * @implspec indentation?: number;
   *
   */
  @JSProperty("indentation")
  void setIndentation(double value);

  /**
   * (Highcharts, Highmaps) Horizontal axis only. When <code>staggerLines</code> is not
   * set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add
   * to automatically avoid overlapping X labels. Set to <code>1</code> to disable
   * overlap detection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.maxStaggerLines">https://api.highcharts.com/highcharts/colorAxis.labels.maxStaggerLines</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.maxStaggerLines">https://api.highcharts.com/highmaps/colorAxis.labels.maxStaggerLines</a>
   *
   * @implspec maxStaggerLines?: number;
   *
   */
  @JSProperty("maxStaggerLines")
  double getMaxStaggerLines();

  /**
   * (Highcharts, Highmaps) Horizontal axis only. When <code>staggerLines</code> is not
   * set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add
   * to automatically avoid overlapping X labels. Set to <code>1</code> to disable
   * overlap detection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.maxStaggerLines">https://api.highcharts.com/highcharts/colorAxis.labels.maxStaggerLines</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.maxStaggerLines">https://api.highcharts.com/highmaps/colorAxis.labels.maxStaggerLines</a>
   *
   * @implspec maxStaggerLines?: number;
   *
   */
  @JSProperty("maxStaggerLines")
  void setMaxStaggerLines(double value);

  /**
   * (Highcharts, Highmaps) How to handle overflowing labels on horizontal
   * color axis. Can be undefined or &quot;justify&quot;. If &quot;justify&quot;, labels will not
   * render outside the legend area. If there is room to move it, it will be
   * aligned to the edge, else it will be removed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.overflow">https://api.highcharts.com/highcharts/colorAxis.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.overflow">https://api.highcharts.com/highmaps/colorAxis.labels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts, Highmaps) How to handle overflowing labels on horizontal
   * color axis. Can be undefined or &quot;justify&quot;. If &quot;justify&quot;, labels will not
   * render outside the legend area. If there is room to move it, it will be
   * aligned to the edge, else it will be removed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.overflow">https://api.highcharts.com/highcharts/colorAxis.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.overflow">https://api.highcharts.com/highmaps/colorAxis.labels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  void setOverflow(Overflow value);

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.padding">https://api.highcharts.com/highcharts/colorAxis.labels.padding</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.padding">https://api.highcharts.com/gantt/colorAxis.labels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.padding">https://api.highcharts.com/highcharts/colorAxis.labels.padding</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.padding">https://api.highcharts.com/gantt/colorAxis.labels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts) Defines how the labels are be repositioned according to the
   * 3D chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.position3d">https://api.highcharts.com/highcharts/colorAxis.labels.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;);
   *
   */
  @JSProperty("position3d")
  @Nullable
  Position3d getPosition3d();

  /**
   * (Highcharts) Defines how the labels are be repositioned according to the
   * 3D chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.position3d">https://api.highcharts.com/highcharts/colorAxis.labels.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;);
   *
   */
  @JSProperty("position3d")
  void setPosition3d(Position3d value);

  /**
   * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
   * space is reserved for the labels in these cases:
   *
   * <ul>
   * <li>
   * On all horizontal axes.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>right</code> on a left-side axis or
   * <code>left</code> on a right-side axis.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>center</code>.
   *
   * </li>
   * </ul>
   * This can be turned off when for example the labels are rendered inside
   * the plot area instead of outside.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.reserveSpace">https://api.highcharts.com/highcharts/colorAxis.labels.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.reserveSpace">https://api.highcharts.com/gantt/colorAxis.labels.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  /**
   * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
   * space is reserved for the labels in these cases:
   *
   * <ul>
   * <li>
   * On all horizontal axes.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>right</code> on a left-side axis or
   * <code>left</code> on a right-side axis.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>center</code>.
   *
   * </li>
   * </ul>
   * This can be turned off when for example the labels are rendered inside
   * the plot area instead of outside.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.reserveSpace">https://api.highcharts.com/highcharts/colorAxis.labels.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.labels.reserveSpace">https://api.highcharts.com/gantt/colorAxis.labels.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * (Highcharts, Highmaps) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.rotation">https://api.highcharts.com/highcharts/colorAxis.labels.rotation</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.rotation">https://api.highcharts.com/highmaps/colorAxis.labels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highmaps) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.rotation">https://api.highcharts.com/highcharts/colorAxis.labels.rotation</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.rotation">https://api.highcharts.com/highmaps/colorAxis.labels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) If enabled, the axis labels will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>labels.position3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.skew3d">https://api.highcharts.com/highcharts/colorAxis.labels.skew3d</a>
   *
   * @implspec skew3d?: boolean;
   *
   */
  @JSProperty("skew3d")
  boolean getSkew3d();

  /**
   * (Highcharts) If enabled, the axis labels will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>labels.position3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.skew3d">https://api.highcharts.com/highcharts/colorAxis.labels.skew3d</a>
   *
   * @implspec skew3d?: boolean;
   *
   */
  @JSProperty("skew3d")
  void setSkew3d(boolean value);

  /**
   * (Highcharts, Highmaps) Horizontal axes only. The number of lines to
   * spread the labels over to make room or tighter labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.staggerLines">https://api.highcharts.com/highcharts/colorAxis.labels.staggerLines</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.staggerLines">https://api.highcharts.com/highmaps/colorAxis.labels.staggerLines</a>
   *
   * @implspec staggerLines?: number;
   *
   */
  @JSProperty("staggerLines")
  double getStaggerLines();

  /**
   * (Highcharts, Highmaps) Horizontal axes only. The number of lines to
   * spread the labels over to make room or tighter labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.staggerLines">https://api.highcharts.com/highcharts/colorAxis.labels.staggerLines</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.staggerLines">https://api.highcharts.com/highmaps/colorAxis.labels.staggerLines</a>
   *
   * @implspec staggerLines?: number;
   *
   */
  @JSProperty("staggerLines")
  void setStaggerLines(double value);

  /**
   * (Highcharts, Highmaps) To show only every <em>n</em>'th label on the axis, set
   * the step to <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.step">https://api.highcharts.com/highcharts/colorAxis.labels.step</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.step">https://api.highcharts.com/highmaps/colorAxis.labels.step</a>
   *
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * (Highcharts, Highmaps) To show only every <em>n</em>'th label on the axis, set
   * the step to <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.step">https://api.highcharts.com/highcharts/colorAxis.labels.step</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.step">https://api.highcharts.com/highmaps/colorAxis.labels.step</a>
   *
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highcharts, Highmaps) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.style">https://api.highcharts.com/highcharts/colorAxis.labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.style">https://api.highcharts.com/highmaps/colorAxis.labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highmaps) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.style">https://api.highcharts.com/highcharts/colorAxis.labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.style">https://api.highcharts.com/highmaps/colorAxis.labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highmaps) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.useHTML">https://api.highcharts.com/highcharts/colorAxis.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.useHTML">https://api.highcharts.com/highmaps/colorAxis.labels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highmaps) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.useHTML">https://api.highcharts.com/highcharts/colorAxis.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.useHTML">https://api.highcharts.com/highmaps/colorAxis.labels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highmaps) The x position offset of the label relative to the
   * tick position on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.x">https://api.highcharts.com/highcharts/colorAxis.labels.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.x">https://api.highcharts.com/highmaps/colorAxis.labels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highmaps) The x position offset of the label relative to the
   * tick position on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.x">https://api.highcharts.com/highcharts/colorAxis.labels.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.x">https://api.highcharts.com/highmaps/colorAxis.labels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highmaps) The y position offset of the label relative to the
   * tick position on the axis. The default makes it adapt to the font size on
   * bottom axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.y">https://api.highcharts.com/highcharts/colorAxis.labels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.y">https://api.highcharts.com/highmaps/colorAxis.labels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highmaps) The y position offset of the label relative to the
   * tick position on the axis. The default makes it adapt to the font size on
   * bottom axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.y">https://api.highcharts.com/highcharts/colorAxis.labels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.y">https://api.highcharts.com/highmaps/colorAxis.labels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highmaps) The Z index for the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.zIndex">https://api.highcharts.com/highcharts/colorAxis.labels.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.zIndex">https://api.highcharts.com/highmaps/colorAxis.labels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highmaps) The Z index for the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels.zIndex">https://api.highcharts.com/highcharts/colorAxis.labels.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels.zIndex">https://api.highcharts.com/highmaps/colorAxis.labels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }

  /**
   */
  abstract class Overflow extends JsEnum {
    public static final Overflow ALLOW = JsEnum.of("allow");

    public static final Overflow JUSTIFY = JsEnum.of("justify");
  }

  /**
   */
  abstract class Position3d extends JsEnum {
    public static final Position3d CHART = JsEnum.of("chart");

    public static final Position3d FLAP = JsEnum.of("flap");

    public static final Position3d OFFSET = JsEnum.of("offset");

    public static final Position3d ORTHO = JsEnum.of("ortho");
  }
}
