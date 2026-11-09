// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A custom two-stop sequential gradient ramp. */
@Generated
public class DashboardThemeContinuousGradientCustomSequentialRamp {
  /** The color at the end of the gradient (highest value). */
  @JsonProperty("end")
  private DashboardThemeDashboardThemeColor end;

  /** The color at the start of the gradient (lowest value). */
  @JsonProperty("start")
  private DashboardThemeDashboardThemeColor start;

  public DashboardThemeContinuousGradientCustomSequentialRamp setEnd(
      DashboardThemeDashboardThemeColor end) {
    this.end = end;
    return this;
  }

  public DashboardThemeDashboardThemeColor getEnd() {
    return end;
  }

  public DashboardThemeContinuousGradientCustomSequentialRamp setStart(
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
    DashboardThemeContinuousGradientCustomSequentialRamp that =
        (DashboardThemeContinuousGradientCustomSequentialRamp) o;
    return Objects.equals(end, that.end) && Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeContinuousGradientCustomSequentialRamp.class)
        .add("end", end)
        .add("start", start)
        .toString();
  }
}
