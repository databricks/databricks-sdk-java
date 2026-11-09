// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The gradient for one color mode. Set at most one field. */
@Generated
public class DashboardThemeContinuousGradientGradientValue {
  /** A static color string (for example, '#FF0000'). */
  @JsonProperty("color")
  private String color;

  /** A named color scheme (for example, 'blues', 'viridis', 'spectral'). */
  @JsonProperty("color_scheme")
  private String colorScheme;

  /** A custom three-stop diverging gradient. */
  @JsonProperty("custom_diverging")
  private DashboardThemeContinuousGradientCustomDivergingRamp customDiverging;

  /** A custom two-stop sequential gradient. */
  @JsonProperty("custom_sequential")
  private DashboardThemeContinuousGradientCustomSequentialRamp customSequential;

  /**
   * A 0-based index into the visualization color palette, where 0 is visualization_color_01. Valid
   * values are 0 to 19.
   */
  @JsonProperty("from_categorical_index")
  private Long fromCategoricalIndex;

  public DashboardThemeContinuousGradientGradientValue setColor(String color) {
    this.color = color;
    return this;
  }

  public String getColor() {
    return color;
  }

  public DashboardThemeContinuousGradientGradientValue setColorScheme(String colorScheme) {
    this.colorScheme = colorScheme;
    return this;
  }

  public String getColorScheme() {
    return colorScheme;
  }

  public DashboardThemeContinuousGradientGradientValue setCustomDiverging(
      DashboardThemeContinuousGradientCustomDivergingRamp customDiverging) {
    this.customDiverging = customDiverging;
    return this;
  }

  public DashboardThemeContinuousGradientCustomDivergingRamp getCustomDiverging() {
    return customDiverging;
  }

  public DashboardThemeContinuousGradientGradientValue setCustomSequential(
      DashboardThemeContinuousGradientCustomSequentialRamp customSequential) {
    this.customSequential = customSequential;
    return this;
  }

  public DashboardThemeContinuousGradientCustomSequentialRamp getCustomSequential() {
    return customSequential;
  }

  public DashboardThemeContinuousGradientGradientValue setFromCategoricalIndex(
      Long fromCategoricalIndex) {
    this.fromCategoricalIndex = fromCategoricalIndex;
    return this;
  }

  public Long getFromCategoricalIndex() {
    return fromCategoricalIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeContinuousGradientGradientValue that =
        (DashboardThemeContinuousGradientGradientValue) o;
    return Objects.equals(color, that.color)
        && Objects.equals(colorScheme, that.colorScheme)
        && Objects.equals(customDiverging, that.customDiverging)
        && Objects.equals(customSequential, that.customSequential)
        && Objects.equals(fromCategoricalIndex, that.fromCategoricalIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        color, colorScheme, customDiverging, customSequential, fromCategoricalIndex);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeContinuousGradientGradientValue.class)
        .add("color", color)
        .add("colorScheme", colorScheme)
        .add("customDiverging", customDiverging)
        .add("customSequential", customSequential)
        .add("fromCategoricalIndex", fromCategoricalIndex)
        .toString();
  }
}
