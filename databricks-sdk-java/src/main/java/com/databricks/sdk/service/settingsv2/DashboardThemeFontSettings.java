// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Per-category typography overrides. When font_settings.base is set, it takes precedence over the
 * top-level font_family and font_color. More specific categories (widget_title, widget_description,
 * field_title, field_value) in turn override base.
 */
@Generated
public class DashboardThemeFontSettings {
  /** The default font config applied to all text unless overridden by a more specific category. */
  @JsonProperty("base")
  private DashboardThemeFontConfig base;

  /** The font config applied to field titles (for example, axis titles, table heading titles). */
  @JsonProperty("field_title")
  private DashboardThemeFontConfig fieldTitle;

  /**
   * The font config applied to field values (for example, axis tick labels, table cell values,
   * tooltip values).
   */
  @JsonProperty("field_value")
  private DashboardThemeFontConfig fieldValue;

  /** The font config applied to widget descriptions. */
  @JsonProperty("widget_description")
  private DashboardThemeFontConfig widgetDescription;

  /** The font config applied to widget titles. */
  @JsonProperty("widget_title")
  private DashboardThemeFontConfig widgetTitle;

  public DashboardThemeFontSettings setBase(DashboardThemeFontConfig base) {
    this.base = base;
    return this;
  }

  public DashboardThemeFontConfig getBase() {
    return base;
  }

  public DashboardThemeFontSettings setFieldTitle(DashboardThemeFontConfig fieldTitle) {
    this.fieldTitle = fieldTitle;
    return this;
  }

  public DashboardThemeFontConfig getFieldTitle() {
    return fieldTitle;
  }

  public DashboardThemeFontSettings setFieldValue(DashboardThemeFontConfig fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  public DashboardThemeFontConfig getFieldValue() {
    return fieldValue;
  }

  public DashboardThemeFontSettings setWidgetDescription(
      DashboardThemeFontConfig widgetDescription) {
    this.widgetDescription = widgetDescription;
    return this;
  }

  public DashboardThemeFontConfig getWidgetDescription() {
    return widgetDescription;
  }

  public DashboardThemeFontSettings setWidgetTitle(DashboardThemeFontConfig widgetTitle) {
    this.widgetTitle = widgetTitle;
    return this;
  }

  public DashboardThemeFontConfig getWidgetTitle() {
    return widgetTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardThemeFontSettings that = (DashboardThemeFontSettings) o;
    return Objects.equals(base, that.base)
        && Objects.equals(fieldTitle, that.fieldTitle)
        && Objects.equals(fieldValue, that.fieldValue)
        && Objects.equals(widgetDescription, that.widgetDescription)
        && Objects.equals(widgetTitle, that.widgetTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, fieldTitle, fieldValue, widgetDescription, widgetTitle);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardThemeFontSettings.class)
        .add("base", base)
        .add("fieldTitle", fieldTitle)
        .add("fieldValue", fieldValue)
        .add("widgetDescription", widgetDescription)
        .add("widgetTitle", widgetTitle)
        .toString();
  }
}
