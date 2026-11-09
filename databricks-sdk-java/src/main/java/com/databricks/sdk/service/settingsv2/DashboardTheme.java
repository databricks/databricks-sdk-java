// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Theme settings for customizing AI/BI dashboard UI, including visualization colors, font colors,
 * background colors, and more.
 */
@Generated
public class DashboardTheme {
  /** Color of the zero-value grid line, making it visually distinct from other grid lines. */
  @JsonProperty("axis_line_color")
  private DashboardThemeDashboardThemeColor axisLineColor;

  /** The background color of the dashboard canvas. */
  @JsonProperty("canvas_background_color")
  private DashboardThemeDashboardThemeColor canvasBackgroundColor;

  /** The continuous gradient configuration for the dashboard. */
  @JsonProperty("continuous_gradient")
  private DashboardThemeContinuousGradient continuousGradient;

  /**
   * The default font color applied to all text in the dashboard. Superseded by
   * font_settings.base.font_color when font_settings is set. More specific font settings in turn
   * override base.
   */
  @JsonProperty("font_color")
  private DashboardThemeDashboardThemeColor fontColor;

  /**
   * Font family to customize all text within the dashboard. Unsupported font names fall back to the
   * default font. Superseded by font_settings.base.font_family when font_settings is set.
   */
  @JsonProperty("font_family")
  private String fontFamily;

  /** The per-category typography overrides for the dashboard. */
  @JsonProperty("font_settings")
  private DashboardThemeFontSettings fontSettings;

  /** Color of chart grid lines in visualizations (horizontal and vertical guide lines). */
  @JsonProperty("grid_line_color")
  private DashboardThemeDashboardThemeColor gridLineColor;

  /**
   * The corner radius in pixels for rectangular marks in visualizations (bars, columns, histogram
   * bins, etc.).
   */
  @JsonProperty("mark_corner_radius")
  private Long markCornerRadius;

  /** The highlight color for selected elements in widgets. */
  @JsonProperty("selection_color")
  private DashboardThemeDashboardThemeColor selectionColor;

  /** The sentiment color palette for the dashboard. */
  @JsonProperty("sentiment_colors")
  private DashboardThemeSentimentColors sentimentColors;

  /**
   * The default vertical alignment for all text box widgets in the dashboard. Individual text box
   * widgets can override this.
   */
  @JsonProperty("text_box_vertical_align")
  private DashboardThemeVerticalAlign textBoxVerticalAlign;

  /**
   * Color palette for visualizations. Colors are applied in order (visualization_color_01,
   * visualization_color_02, etc.). Invalid color values are preserved but ignored during rendering.
   */
  @JsonProperty("visualization_color_01")
  private String visualizationColor01;

  /** The color at position 2 in the visualization color palette. */
  @JsonProperty("visualization_color_02")
  private String visualizationColor02;

  /** The color at position 3 in the visualization color palette. */
  @JsonProperty("visualization_color_03")
  private String visualizationColor03;

  /** The color at position 4 in the visualization color palette. */
  @JsonProperty("visualization_color_04")
  private String visualizationColor04;

  /** The color at position 5 in the visualization color palette. */
  @JsonProperty("visualization_color_05")
  private String visualizationColor05;

  /** The color at position 6 in the visualization color palette. */
  @JsonProperty("visualization_color_06")
  private String visualizationColor06;

  /** The color at position 7 in the visualization color palette. */
  @JsonProperty("visualization_color_07")
  private String visualizationColor07;

  /** The color at position 8 in the visualization color palette. */
  @JsonProperty("visualization_color_08")
  private String visualizationColor08;

  /** The color at position 9 in the visualization color palette. */
  @JsonProperty("visualization_color_09")
  private String visualizationColor09;

  /** The color at position 10 in the visualization color palette. */
  @JsonProperty("visualization_color_10")
  private String visualizationColor10;

  /** The color at position 11 in the visualization color palette. */
  @JsonProperty("visualization_color_11")
  private String visualizationColor11;

  /** The color at position 12 in the visualization color palette. */
  @JsonProperty("visualization_color_12")
  private String visualizationColor12;

  /** The color at position 13 in the visualization color palette. */
  @JsonProperty("visualization_color_13")
  private String visualizationColor13;

  /** The color at position 14 in the visualization color palette. */
  @JsonProperty("visualization_color_14")
  private String visualizationColor14;

  /** The color at position 15 in the visualization color palette. */
  @JsonProperty("visualization_color_15")
  private String visualizationColor15;

  /** The color at position 16 in the visualization color palette. */
  @JsonProperty("visualization_color_16")
  private String visualizationColor16;

  /** The color at position 17 in the visualization color palette. */
  @JsonProperty("visualization_color_17")
  private String visualizationColor17;

  /** The color at position 18 in the visualization color palette. */
  @JsonProperty("visualization_color_18")
  private String visualizationColor18;

  /** The color at position 19 in the visualization color palette. */
  @JsonProperty("visualization_color_19")
  private String visualizationColor19;

  /** The color at position 20 in the visualization color palette. */
  @JsonProperty("visualization_color_20")
  private String visualizationColor20;

  /** The background color of widgets. */
  @JsonProperty("widget_background_color")
  private DashboardThemeDashboardThemeColor widgetBackgroundColor;

  /** The border color of widgets. */
  @JsonProperty("widget_border_color")
  private DashboardThemeDashboardThemeColor widgetBorderColor;

  /** The widget border radius in pixels. */
  @JsonProperty("widget_corner_radius")
  private Long widgetCornerRadius;

  /** Alignment setting for all widget titles and descriptions at the dashboard level. */
  @JsonProperty("widget_header_alignment")
  private DashboardThemeAlignment widgetHeaderAlignment;

  /** The gap between widgets in pixels. */
  @JsonProperty("widget_margin")
  private Long widgetMargin;

  /** The content padding inside each widget in pixels. */
  @JsonProperty("widget_padding")
  private Long widgetPadding;

  /**
   * The shadow intensity level applied to widgets (0 = no shadow, 100 = maximum). The actual CSS
   * box-shadow is computed at render time from this value, factoring in background colors and color
   * mode.
   */
  @JsonProperty("widget_shadow")
  private Long widgetShadow;

  public DashboardTheme setAxisLineColor(DashboardThemeDashboardThemeColor axisLineColor) {
    this.axisLineColor = axisLineColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getAxisLineColor() {
    return axisLineColor;
  }

  public DashboardTheme setCanvasBackgroundColor(
      DashboardThemeDashboardThemeColor canvasBackgroundColor) {
    this.canvasBackgroundColor = canvasBackgroundColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getCanvasBackgroundColor() {
    return canvasBackgroundColor;
  }

  public DashboardTheme setContinuousGradient(DashboardThemeContinuousGradient continuousGradient) {
    this.continuousGradient = continuousGradient;
    return this;
  }

  public DashboardThemeContinuousGradient getContinuousGradient() {
    return continuousGradient;
  }

  public DashboardTheme setFontColor(DashboardThemeDashboardThemeColor fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getFontColor() {
    return fontColor;
  }

  public DashboardTheme setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public DashboardTheme setFontSettings(DashboardThemeFontSettings fontSettings) {
    this.fontSettings = fontSettings;
    return this;
  }

  public DashboardThemeFontSettings getFontSettings() {
    return fontSettings;
  }

  public DashboardTheme setGridLineColor(DashboardThemeDashboardThemeColor gridLineColor) {
    this.gridLineColor = gridLineColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getGridLineColor() {
    return gridLineColor;
  }

  public DashboardTheme setMarkCornerRadius(Long markCornerRadius) {
    this.markCornerRadius = markCornerRadius;
    return this;
  }

  public Long getMarkCornerRadius() {
    return markCornerRadius;
  }

  public DashboardTheme setSelectionColor(DashboardThemeDashboardThemeColor selectionColor) {
    this.selectionColor = selectionColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getSelectionColor() {
    return selectionColor;
  }

  public DashboardTheme setSentimentColors(DashboardThemeSentimentColors sentimentColors) {
    this.sentimentColors = sentimentColors;
    return this;
  }

  public DashboardThemeSentimentColors getSentimentColors() {
    return sentimentColors;
  }

  public DashboardTheme setTextBoxVerticalAlign(DashboardThemeVerticalAlign textBoxVerticalAlign) {
    this.textBoxVerticalAlign = textBoxVerticalAlign;
    return this;
  }

  public DashboardThemeVerticalAlign getTextBoxVerticalAlign() {
    return textBoxVerticalAlign;
  }

  public DashboardTheme setVisualizationColor01(String visualizationColor01) {
    this.visualizationColor01 = visualizationColor01;
    return this;
  }

  public String getVisualizationColor01() {
    return visualizationColor01;
  }

  public DashboardTheme setVisualizationColor02(String visualizationColor02) {
    this.visualizationColor02 = visualizationColor02;
    return this;
  }

  public String getVisualizationColor02() {
    return visualizationColor02;
  }

  public DashboardTheme setVisualizationColor03(String visualizationColor03) {
    this.visualizationColor03 = visualizationColor03;
    return this;
  }

  public String getVisualizationColor03() {
    return visualizationColor03;
  }

  public DashboardTheme setVisualizationColor04(String visualizationColor04) {
    this.visualizationColor04 = visualizationColor04;
    return this;
  }

  public String getVisualizationColor04() {
    return visualizationColor04;
  }

  public DashboardTheme setVisualizationColor05(String visualizationColor05) {
    this.visualizationColor05 = visualizationColor05;
    return this;
  }

  public String getVisualizationColor05() {
    return visualizationColor05;
  }

  public DashboardTheme setVisualizationColor06(String visualizationColor06) {
    this.visualizationColor06 = visualizationColor06;
    return this;
  }

  public String getVisualizationColor06() {
    return visualizationColor06;
  }

  public DashboardTheme setVisualizationColor07(String visualizationColor07) {
    this.visualizationColor07 = visualizationColor07;
    return this;
  }

  public String getVisualizationColor07() {
    return visualizationColor07;
  }

  public DashboardTheme setVisualizationColor08(String visualizationColor08) {
    this.visualizationColor08 = visualizationColor08;
    return this;
  }

  public String getVisualizationColor08() {
    return visualizationColor08;
  }

  public DashboardTheme setVisualizationColor09(String visualizationColor09) {
    this.visualizationColor09 = visualizationColor09;
    return this;
  }

  public String getVisualizationColor09() {
    return visualizationColor09;
  }

  public DashboardTheme setVisualizationColor10(String visualizationColor10) {
    this.visualizationColor10 = visualizationColor10;
    return this;
  }

  public String getVisualizationColor10() {
    return visualizationColor10;
  }

  public DashboardTheme setVisualizationColor11(String visualizationColor11) {
    this.visualizationColor11 = visualizationColor11;
    return this;
  }

  public String getVisualizationColor11() {
    return visualizationColor11;
  }

  public DashboardTheme setVisualizationColor12(String visualizationColor12) {
    this.visualizationColor12 = visualizationColor12;
    return this;
  }

  public String getVisualizationColor12() {
    return visualizationColor12;
  }

  public DashboardTheme setVisualizationColor13(String visualizationColor13) {
    this.visualizationColor13 = visualizationColor13;
    return this;
  }

  public String getVisualizationColor13() {
    return visualizationColor13;
  }

  public DashboardTheme setVisualizationColor14(String visualizationColor14) {
    this.visualizationColor14 = visualizationColor14;
    return this;
  }

  public String getVisualizationColor14() {
    return visualizationColor14;
  }

  public DashboardTheme setVisualizationColor15(String visualizationColor15) {
    this.visualizationColor15 = visualizationColor15;
    return this;
  }

  public String getVisualizationColor15() {
    return visualizationColor15;
  }

  public DashboardTheme setVisualizationColor16(String visualizationColor16) {
    this.visualizationColor16 = visualizationColor16;
    return this;
  }

  public String getVisualizationColor16() {
    return visualizationColor16;
  }

  public DashboardTheme setVisualizationColor17(String visualizationColor17) {
    this.visualizationColor17 = visualizationColor17;
    return this;
  }

  public String getVisualizationColor17() {
    return visualizationColor17;
  }

  public DashboardTheme setVisualizationColor18(String visualizationColor18) {
    this.visualizationColor18 = visualizationColor18;
    return this;
  }

  public String getVisualizationColor18() {
    return visualizationColor18;
  }

  public DashboardTheme setVisualizationColor19(String visualizationColor19) {
    this.visualizationColor19 = visualizationColor19;
    return this;
  }

  public String getVisualizationColor19() {
    return visualizationColor19;
  }

  public DashboardTheme setVisualizationColor20(String visualizationColor20) {
    this.visualizationColor20 = visualizationColor20;
    return this;
  }

  public String getVisualizationColor20() {
    return visualizationColor20;
  }

  public DashboardTheme setWidgetBackgroundColor(
      DashboardThemeDashboardThemeColor widgetBackgroundColor) {
    this.widgetBackgroundColor = widgetBackgroundColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getWidgetBackgroundColor() {
    return widgetBackgroundColor;
  }

  public DashboardTheme setWidgetBorderColor(DashboardThemeDashboardThemeColor widgetBorderColor) {
    this.widgetBorderColor = widgetBorderColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getWidgetBorderColor() {
    return widgetBorderColor;
  }

  public DashboardTheme setWidgetCornerRadius(Long widgetCornerRadius) {
    this.widgetCornerRadius = widgetCornerRadius;
    return this;
  }

  public Long getWidgetCornerRadius() {
    return widgetCornerRadius;
  }

  public DashboardTheme setWidgetHeaderAlignment(DashboardThemeAlignment widgetHeaderAlignment) {
    this.widgetHeaderAlignment = widgetHeaderAlignment;
    return this;
  }

  public DashboardThemeAlignment getWidgetHeaderAlignment() {
    return widgetHeaderAlignment;
  }

  public DashboardTheme setWidgetMargin(Long widgetMargin) {
    this.widgetMargin = widgetMargin;
    return this;
  }

  public Long getWidgetMargin() {
    return widgetMargin;
  }

  public DashboardTheme setWidgetPadding(Long widgetPadding) {
    this.widgetPadding = widgetPadding;
    return this;
  }

  public Long getWidgetPadding() {
    return widgetPadding;
  }

  public DashboardTheme setWidgetShadow(Long widgetShadow) {
    this.widgetShadow = widgetShadow;
    return this;
  }

  public Long getWidgetShadow() {
    return widgetShadow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardTheme that = (DashboardTheme) o;
    return Objects.equals(axisLineColor, that.axisLineColor)
        && Objects.equals(canvasBackgroundColor, that.canvasBackgroundColor)
        && Objects.equals(continuousGradient, that.continuousGradient)
        && Objects.equals(fontColor, that.fontColor)
        && Objects.equals(fontFamily, that.fontFamily)
        && Objects.equals(fontSettings, that.fontSettings)
        && Objects.equals(gridLineColor, that.gridLineColor)
        && Objects.equals(markCornerRadius, that.markCornerRadius)
        && Objects.equals(selectionColor, that.selectionColor)
        && Objects.equals(sentimentColors, that.sentimentColors)
        && Objects.equals(textBoxVerticalAlign, that.textBoxVerticalAlign)
        && Objects.equals(visualizationColor01, that.visualizationColor01)
        && Objects.equals(visualizationColor02, that.visualizationColor02)
        && Objects.equals(visualizationColor03, that.visualizationColor03)
        && Objects.equals(visualizationColor04, that.visualizationColor04)
        && Objects.equals(visualizationColor05, that.visualizationColor05)
        && Objects.equals(visualizationColor06, that.visualizationColor06)
        && Objects.equals(visualizationColor07, that.visualizationColor07)
        && Objects.equals(visualizationColor08, that.visualizationColor08)
        && Objects.equals(visualizationColor09, that.visualizationColor09)
        && Objects.equals(visualizationColor10, that.visualizationColor10)
        && Objects.equals(visualizationColor11, that.visualizationColor11)
        && Objects.equals(visualizationColor12, that.visualizationColor12)
        && Objects.equals(visualizationColor13, that.visualizationColor13)
        && Objects.equals(visualizationColor14, that.visualizationColor14)
        && Objects.equals(visualizationColor15, that.visualizationColor15)
        && Objects.equals(visualizationColor16, that.visualizationColor16)
        && Objects.equals(visualizationColor17, that.visualizationColor17)
        && Objects.equals(visualizationColor18, that.visualizationColor18)
        && Objects.equals(visualizationColor19, that.visualizationColor19)
        && Objects.equals(visualizationColor20, that.visualizationColor20)
        && Objects.equals(widgetBackgroundColor, that.widgetBackgroundColor)
        && Objects.equals(widgetBorderColor, that.widgetBorderColor)
        && Objects.equals(widgetCornerRadius, that.widgetCornerRadius)
        && Objects.equals(widgetHeaderAlignment, that.widgetHeaderAlignment)
        && Objects.equals(widgetMargin, that.widgetMargin)
        && Objects.equals(widgetPadding, that.widgetPadding)
        && Objects.equals(widgetShadow, that.widgetShadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        axisLineColor,
        canvasBackgroundColor,
        continuousGradient,
        fontColor,
        fontFamily,
        fontSettings,
        gridLineColor,
        markCornerRadius,
        selectionColor,
        sentimentColors,
        textBoxVerticalAlign,
        visualizationColor01,
        visualizationColor02,
        visualizationColor03,
        visualizationColor04,
        visualizationColor05,
        visualizationColor06,
        visualizationColor07,
        visualizationColor08,
        visualizationColor09,
        visualizationColor10,
        visualizationColor11,
        visualizationColor12,
        visualizationColor13,
        visualizationColor14,
        visualizationColor15,
        visualizationColor16,
        visualizationColor17,
        visualizationColor18,
        visualizationColor19,
        visualizationColor20,
        widgetBackgroundColor,
        widgetBorderColor,
        widgetCornerRadius,
        widgetHeaderAlignment,
        widgetMargin,
        widgetPadding,
        widgetShadow);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTheme.class)
        .add("axisLineColor", axisLineColor)
        .add("canvasBackgroundColor", canvasBackgroundColor)
        .add("continuousGradient", continuousGradient)
        .add("fontColor", fontColor)
        .add("fontFamily", fontFamily)
        .add("fontSettings", fontSettings)
        .add("gridLineColor", gridLineColor)
        .add("markCornerRadius", markCornerRadius)
        .add("selectionColor", selectionColor)
        .add("sentimentColors", sentimentColors)
        .add("textBoxVerticalAlign", textBoxVerticalAlign)
        .add("visualizationColor01", visualizationColor01)
        .add("visualizationColor02", visualizationColor02)
        .add("visualizationColor03", visualizationColor03)
        .add("visualizationColor04", visualizationColor04)
        .add("visualizationColor05", visualizationColor05)
        .add("visualizationColor06", visualizationColor06)
        .add("visualizationColor07", visualizationColor07)
        .add("visualizationColor08", visualizationColor08)
        .add("visualizationColor09", visualizationColor09)
        .add("visualizationColor10", visualizationColor10)
        .add("visualizationColor11", visualizationColor11)
        .add("visualizationColor12", visualizationColor12)
        .add("visualizationColor13", visualizationColor13)
        .add("visualizationColor14", visualizationColor14)
        .add("visualizationColor15", visualizationColor15)
        .add("visualizationColor16", visualizationColor16)
        .add("visualizationColor17", visualizationColor17)
        .add("visualizationColor18", visualizationColor18)
        .add("visualizationColor19", visualizationColor19)
        .add("visualizationColor20", visualizationColor20)
        .add("widgetBackgroundColor", widgetBackgroundColor)
        .add("widgetBorderColor", widgetBorderColor)
        .add("widgetCornerRadius", widgetCornerRadius)
        .add("widgetHeaderAlignment", widgetHeaderAlignment)
        .add("widgetMargin", widgetMargin)
        .add("widgetPadding", widgetPadding)
        .add("widgetShadow", widgetShadow)
        .toString();
  }
}
