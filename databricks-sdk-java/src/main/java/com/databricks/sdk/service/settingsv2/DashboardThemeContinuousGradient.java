// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for continuous color gradients, with separate values for light and dark mode. Each
 * mode's gradient can reference the visualization color palette via from_categorical_index, use a
 * named color scheme, or define a custom sequential or diverging ramp.
 */
@Generated
public class DashboardThemeContinuousGradient {
  /** Gradient value used when the dashboard is rendered in dark mode. */
  @JsonProperty("dark_mode")
  private DashboardThemeContinuousGradientGradientValue darkMode;

  /** Gradient value used when the dashboard is rendered in light mode. */
  @JsonProperty("light_mode")
  private DashboardThemeContinuousGradientGradientValue lightMode;

  public DashboardThemeContinuousGradient setDarkMode(
      DashboardThemeContinuousGradientGradientValue darkMode) {
    this.darkMode = darkMode;
    return this;
  }

  public DashboardThemeContinuousGradientGradientValue getDarkMode() {
    return darkMode;
  }

  public DashboardThemeContinuousGradient setLightMode(
      DashboardThemeContinuousGradientGradientValue lightMode) {
    this.lightMode = lightMode;
    return this;
  }

  public DashboardThemeContinuousGradientGradientValue getLightMode() {
    return lightMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeContinuousGradient that = (DashboardThemeContinuousGradient) o;
    return Objects.equals(darkMode, that.darkMode) && Objects.equals(lightMode, that.lightMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(darkMode, lightMode);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeContinuousGradient.class)
        .add("darkMode", darkMode)
        .add("lightMode", lightMode)
        .toString();
  }
}
