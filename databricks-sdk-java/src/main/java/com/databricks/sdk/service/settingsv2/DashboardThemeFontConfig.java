// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Defines the typography settings for a single text category. */
@Generated
public class DashboardThemeFontConfig {
  /** The font color applied to text in this category. */
  @JsonProperty("font_color")
  private DashboardThemeDashboardThemeColor fontColor;

  /** The font family name used for text in this category. */
  @JsonProperty("font_family")
  private String fontFamily;

  /** The font size in pixels. */
  @JsonProperty("font_size")
  private Long fontSize;

  /** The font style (slant) applied to text in this category. */
  @JsonProperty("font_style")
  private DashboardThemeFontStyle fontStyle;

  /** The font weight value (for example, 400 for normal, 700 for bold). */
  @JsonProperty("font_weight")
  private Long fontWeight;

  /** The text case transformation applied to text in this category. */
  @JsonProperty("text_case")
  private DashboardThemeTextCase textCase;

  /** The text decoration applied to text in this category. */
  @JsonProperty("text_decoration")
  private DashboardThemeTextDecoration textDecoration;

  public DashboardThemeFontConfig setFontColor(DashboardThemeDashboardThemeColor fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  public DashboardThemeDashboardThemeColor getFontColor() {
    return fontColor;
  }

  public DashboardThemeFontConfig setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public DashboardThemeFontConfig setFontSize(Long fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  public Long getFontSize() {
    return fontSize;
  }

  public DashboardThemeFontConfig setFontStyle(DashboardThemeFontStyle fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

  public DashboardThemeFontStyle getFontStyle() {
    return fontStyle;
  }

  public DashboardThemeFontConfig setFontWeight(Long fontWeight) {
    this.fontWeight = fontWeight;
    return this;
  }

  public Long getFontWeight() {
    return fontWeight;
  }

  public DashboardThemeFontConfig setTextCase(DashboardThemeTextCase textCase) {
    this.textCase = textCase;
    return this;
  }

  public DashboardThemeTextCase getTextCase() {
    return textCase;
  }

  public DashboardThemeFontConfig setTextDecoration(DashboardThemeTextDecoration textDecoration) {
    this.textDecoration = textDecoration;
    return this;
  }

  public DashboardThemeTextDecoration getTextDecoration() {
    return textDecoration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeFontConfig that = (DashboardThemeFontConfig) o;
    return Objects.equals(fontColor, that.fontColor)
        && Objects.equals(fontFamily, that.fontFamily)
        && Objects.equals(fontSize, that.fontSize)
        && Objects.equals(fontStyle, that.fontStyle)
        && Objects.equals(fontWeight, that.fontWeight)
        && Objects.equals(textCase, that.textCase)
        && Objects.equals(textDecoration, that.textDecoration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fontColor, fontFamily, fontSize, fontStyle, fontWeight, textCase, textDecoration);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeFontConfig.class)
        .add("fontColor", fontColor)
        .add("fontFamily", fontFamily)
        .add("fontSize", fontSize)
        .add("fontStyle", fontStyle)
        .add("fontWeight", fontWeight)
        .add("textCase", textCase)
        .add("textDecoration", textDecoration)
        .toString();
  }
}
