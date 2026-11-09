// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A custom three-stop diverging gradient ramp. */
@Generated
public class DashboardThemeContinuousGradientCustomDivergingRamp {
  /** The color at the end of the gradient (highest value). */
  @JsonProperty("end")
  private DashboardThemeDashboardThemeColor end;

  /** The color at the midpoint of the gradient. */
  @JsonProperty("mid")
  private DashboardThemeDashboardThemeColor mid;

  /** The color at the start of the gradient (lowest value). */
  @JsonProperty("start")
  private DashboardThemeDashboardThemeColor start;

  public DashboardThemeContinuousGradientCustomDivergingRamp setEnd(
      DashboardThemeDashboardThemeColor end) {
    this.end = end;
    return this;
  }

  public DashboardThemeDashboardThemeColor getEnd() {
    return end;
  }

  public DashboardThemeContinuousGradientCustomDivergingRamp setMid(
      DashboardThemeDashboardThemeColor mid) {
    this.mid = mid;
    return this;
  }

  public DashboardThemeDashboardThemeColor getMid() {
    return mid;
  }

  public DashboardThemeContinuousGradientCustomDivergingRamp setStart(
      DashboardThemeDashboardThemeColor start) {
    this.start = start;
    return this;
  }

  public DashboardThemeDashboardThemeColor getStart() {
    return start;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeContinuousGradientCustomDivergingRamp that =
        (DashboardThemeContinuousGradientCustomDivergingRamp) o;
    return Objects.equals(end, that.end)
        && Objects.equals(mid, that.mid)
        && Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, mid, start);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeContinuousGradientCustomDivergingRamp.class)
        .add("end", end)
        .add("mid", mid)
        .add("start", start)
        .toString();
  }
}
