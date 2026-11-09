// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a color value with optional overrides for light and dark modes. Authors can customize
 * colors separately to cater to each mode, based on the viewer's user-level theme preference.
 */
@Generated
public class DashboardThemeDashboardThemeColor {
  /** The color used when the dashboard is rendered in dark mode (for example, '#FF0000'). */
  @JsonProperty("dark")
  private String dark;

  /** The color used when the dashboard is rendered in light mode (for example, '#FF0000'). */
  @JsonProperty("light")
  private String light;

  public DashboardThemeDashboardThemeColor setDark(String dark) {
    this.dark = dark;
    return this;
  }

  public String getDark() {
    return dark;
  }

  public DashboardThemeDashboardThemeColor setLight(String light) {
    this.light = light;
    return this;
  }

  public String getLight() {
    return light;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeDashboardThemeColor that = (DashboardThemeDashboardThemeColor) o;
    return Objects.equals(dark, that.dark) && Objects.equals(light, that.light);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dark, light);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeDashboardThemeColor.class)
        .add("dark", dark)
        .add("light", light)
        .toString();
  }
}
