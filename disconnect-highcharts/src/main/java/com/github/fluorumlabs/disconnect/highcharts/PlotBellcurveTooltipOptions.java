package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.lang.Unknown;
import js.util.StringRecord;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts) A configuration object for the tooltip rendering of each single
 * series. Properties are inherited from tooltip, but only the following
 * properties can be defined on a series level.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip</a>
 *
 */
public interface PlotBellcurveTooltipOptions extends Any {
  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.changeDecimals">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.changeDecimals</a>
   *
   * @implspec changeDecimals?: number;
   *
   */
  @JSProperty("changeDecimals")
  double getChangeDecimals();

  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.changeDecimals">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.changeDecimals</a>
   *
   * @implspec changeDecimals?: number;
   *
   */
  @JSProperty("changeDecimals")
  void setChangeDecimals(double value);

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (PlotBellcurveTooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  Unknown getDateTimeLabelFormats();

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (PlotBellcurveTooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(StringRecord value);

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (PlotBellcurveTooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(PlotBellcurveTooltipDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts) Whether the tooltip should follow the mouse as it moves
   * across columns, pie slices and other point types with an extent. By
   * default it behaves this way for scatter, bubble and pie series by
   * override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followPointer">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followPointer</a>
   *
   * @implspec followPointer?: boolean;
   *
   */
  @JSProperty("followPointer")
  boolean getFollowPointer();

  /**
   * (Highcharts) Whether the tooltip should follow the mouse as it moves
   * across columns, pie slices and other point types with an extent. By
   * default it behaves this way for scatter, bubble and pie series by
   * override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followPointer">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followPointer</a>
   *
   * @implspec followPointer?: boolean;
   *
   */
  @JSProperty("followPointer")
  void setFollowPointer(boolean value);

  /**
   * (Highcharts) Whether the tooltip should update as the finger moves on a
   * touch device. If this is <code>true</code> and chart.panning is
   * set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followTouchMove">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followTouchMove</a>
   *
   * @implspec followTouchMove?: boolean;
   *
   */
  @JSProperty("followTouchMove")
  boolean getFollowTouchMove();

  /**
   * (Highcharts) Whether the tooltip should update as the finger moves on a
   * touch device. If this is <code>true</code> and chart.panning is
   * set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followTouchMove">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.followTouchMove</a>
   *
   * @implspec followTouchMove?: boolean;
   *
   */
  @JSProperty("followTouchMove")
  void setFollowTouchMove(boolean value);

  /**
   * (Highcharts) A string to append to the tooltip format.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.footerFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.footerFormat</a>
   *
   * @implspec footerFormat?: string;
   *
   */
  @JSProperty("footerFormat")
  @Nullable
  String getFooterFormat();

  /**
   * (Highcharts) A string to append to the tooltip format.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.footerFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.footerFormat</a>
   *
   * @implspec footerFormat?: string;
   *
   */
  @JSProperty("footerFormat")
  void setFooterFormat(String value);

  /**
   * (Highcharts) The HTML of the tooltip header line. Variables are enclosed
   * by curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
   * <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.
   * The <code>point.key</code> variable contains the category name, x value or datetime
   * string depending on the type of axis. For datetime axes, the <code>point.key</code>
   * date format can be set using <code>tooltip.xDateFormat</code>. To access the
   * original point use <code>point.point</code>.
   *
   * Set an empty string to avoid header on a shared or split tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.headerFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.headerFormat</a>
   *
   * @implspec headerFormat?: string;
   *
   */
  @JSProperty("headerFormat")
  @Nullable
  String getHeaderFormat();

  /**
   * (Highcharts) The HTML of the tooltip header line. Variables are enclosed
   * by curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
   * <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.
   * The <code>point.key</code> variable contains the category name, x value or datetime
   * string depending on the type of axis. For datetime axes, the <code>point.key</code>
   * date format can be set using <code>tooltip.xDateFormat</code>. To access the
   * original point use <code>point.point</code>.
   *
   * Set an empty string to avoid header on a shared or split tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.headerFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.headerFormat</a>
   *
   * @implspec headerFormat?: string;
   *
   */
  @JSProperty("headerFormat")
  void setHeaderFormat(String value);

  /**
   * (Highcharts) The number of milliseconds to wait until the tooltip is
   * hidden when mouse out from a point or chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.hideDelay">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.hideDelay</a>
   *
   * @implspec hideDelay?: number;
   *
   */
  @JSProperty("hideDelay")
  double getHideDelay();

  /**
   * (Highcharts) The number of milliseconds to wait until the tooltip is
   * hidden when mouse out from a point or chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.hideDelay">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.hideDelay</a>
   *
   * @implspec hideDelay?: number;
   *
   */
  @JSProperty("hideDelay")
  void setHideDelay(double value);

  /**
   * (Highcharts) Whether to allow the tooltip to render outside the chart's
   * SVG element box. By default (<code>false</code>), the tooltip is rendered within the
   * chart's SVG element, which results in the tooltip being aligned inside
   * the chart area. For small charts, this may result in clipping or
   * overlapping. When <code>true</code>, a separate SVG element is created and overlaid
   * on the page, allowing the tooltip to be aligned inside the page itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.outside">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.outside</a>
   *
   * @implspec outside?: boolean;
   *
   */
  @JSProperty("outside")
  boolean getOutside();

  /**
   * (Highcharts) Whether to allow the tooltip to render outside the chart's
   * SVG element box. By default (<code>false</code>), the tooltip is rendered within the
   * chart's SVG element, which results in the tooltip being aligned inside
   * the chart area. For small charts, this may result in clipping or
   * overlapping. When <code>true</code>, a separate SVG element is created and overlaid
   * on the page, allowing the tooltip to be aligned inside the page itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.outside">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.outside</a>
   *
   * @implspec outside?: boolean;
   *
   */
  @JSProperty("outside")
  void setOutside(boolean value);

  /**
   * (Highcharts) Padding inside the tooltip, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.padding">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts) Padding inside the tooltip, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.padding">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts) The HTML of the point's line in the tooltip. Variables are
   * enclosed by curly brackets. Available variables are point.x, point.y,
   * series. name and series.color and other properties on the same form.
   * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code> and
   * <code>tooltip.valueSuffix</code> variables. This can also be overridden for each
   * series, which makes it a good hook for displaying units.
   *
   * Set an empty string to leave out a series from a shared or split tooltip.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormat</a>
   *
   * @implspec pointFormat?: string;
   *
   */
  @JSProperty("pointFormat")
  @Nullable
  String getPointFormat();

  /**
   * (Highcharts) The HTML of the point's line in the tooltip. Variables are
   * enclosed by curly brackets. Available variables are point.x, point.y,
   * series. name and series.color and other properties on the same form.
   * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code> and
   * <code>tooltip.valueSuffix</code> variables. This can also be overridden for each
   * series, which makes it a good hook for displaying units.
   *
   * Set an empty string to leave out a series from a shared or split tooltip.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormat</a>
   *
   * @implspec pointFormat?: string;
   *
   */
  @JSProperty("pointFormat")
  void setPointFormat(String value);

  /**
   * (Highcharts) A callback function for formatting the HTML output for a
   * single point in the tooltip. Like the <code>pointFormat</code> string, but with more
   * flexibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormatter">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormatter</a>
   *
   * @implspec pointFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointFormatter")
  @Nullable
  PointFormatter getPointFormatter();

  /**
   * (Highcharts) A callback function for formatting the HTML output for a
   * single point in the tooltip. Like the <code>pointFormat</code> string, but with more
   * flexibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormatter">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.pointFormatter</a>
   *
   * @implspec pointFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointFormatter")
  void setPointFormatter(PointFormatter value);

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.split">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.split</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.split">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.split</a>
   *
   * @implspec split?: boolean;
   *
   */
  @JSProperty("split")
  boolean getSplit();

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.split">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.split</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.split">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.split</a>
   *
   * @implspec split?: boolean;
   *
   */
  @JSProperty("split")
  void setSplit(boolean value);

  /**
   * (Highcharts) How many decimals to show in each series' y value. This is
   * overridable in each series' tooltip options object. The default is to
   * preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueDecimals">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueDecimals</a>
   *
   * @implspec valueDecimals?: number;
   *
   */
  @JSProperty("valueDecimals")
  double getValueDecimals();

  /**
   * (Highcharts) How many decimals to show in each series' y value. This is
   * overridable in each series' tooltip options object. The default is to
   * preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueDecimals">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueDecimals</a>
   *
   * @implspec valueDecimals?: number;
   *
   */
  @JSProperty("valueDecimals")
  void setValueDecimals(double value);

  /**
   * (Highcharts) A string to prepend to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valuePrefix">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valuePrefix</a>
   *
   * @implspec valuePrefix?: string;
   *
   */
  @JSProperty("valuePrefix")
  @Nullable
  String getValuePrefix();

  /**
   * (Highcharts) A string to prepend to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valuePrefix">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valuePrefix</a>
   *
   * @implspec valuePrefix?: string;
   *
   */
  @JSProperty("valuePrefix")
  void setValuePrefix(String value);

  /**
   * (Highcharts) A string to append to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueSuffix">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueSuffix</a>
   *
   * @implspec valueSuffix?: string;
   *
   */
  @JSProperty("valueSuffix")
  @Nullable
  String getValueSuffix();

  /**
   * (Highcharts) A string to append to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueSuffix">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.valueSuffix</a>
   *
   * @implspec valueSuffix?: string;
   *
   */
  @JSProperty("valueSuffix")
  void setValueSuffix(String value);

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.xDateFormat</a>
   *
   * @implspec xDateFormat?: string;
   *
   */
  @JSProperty("xDateFormat")
  @Nullable
  String getXDateFormat();

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/highstock/plotOptions.bellcurve.tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.xDateFormat">https://api.highcharts.com/gantt/plotOptions.bellcurve.tooltip.xDateFormat</a>
   *
   * @implspec xDateFormat?: string;
   *
   */
  @JSProperty("xDateFormat")
  void setXDateFormat(String value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointFormatter extends Any {
    void apply();
  }
}
