// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Shared sentiment colors reusable across visualizations, primarily for conditional formatting,
 * ensuring consistent positive, negative, and neutral meaning throughout the dashboard.
 */
@Generated
public class DashboardThemeSentimentColors {
  /** The color applied to negative sentiment values. */
  @JsonProperty("negative")
  private DashboardThemeDashboardThemeColor negative;

  /** The color applied to neutral sentiment values. */
  @JsonProperty("neutral")
  private DashboardThemeDashboardThemeColor neutral;

  /** The color applied to positive sentiment values. */
  @JsonProperty("positive")
  private DashboardThemeDashboardThemeColor positive;

  public DashboardThemeSentimentColors setNegative(DashboardThemeDashboardThemeColor negative) {
    this.negative = negative;
    return this;
  }

  public DashboardThemeDashboardThemeColor getNegative() {
    return negative;
  }

  public DashboardThemeSentimentColors setNeutral(DashboardThemeDashboardThemeColor neutral) {
    this.neutral = neutral;
    return this;
  }

  public DashboardThemeDashboardThemeColor getNeutral() {
    return neutral;
  }

  public DashboardThemeSentimentColors setPositive(DashboardThemeDashboardThemeColor positive) {
    this.positive = positive;
    return this;
  }

  public DashboardThemeDashboardThemeColor getPositive() {
    return positive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeSentimentColors that = (DashboardThemeSentimentColors) o;
    return Objects.equals(negative, that.negative)
        && Objects.equals(neutral, that.neutral)
        && Objects.equals(positive, that.positive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negative, neutral, positive);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeSentimentColors.class)
        .add("negative", negative)
        .add("neutral", neutral)
        .add("positive", positive)
        .toString();
  }
}
