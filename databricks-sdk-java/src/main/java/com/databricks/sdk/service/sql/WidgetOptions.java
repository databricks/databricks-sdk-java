// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WidgetOptions {
  /** Timestamp when this object was created */
  @JsonProperty("created_at")
  private String createdAt;

  /** The dashboard ID to which this widget belongs. Each widget can belong to one dashboard. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Whether this widget is hidden on the dashboard. */
  @JsonProperty("isHidden")
  private Boolean isHidden;

  /**
   * How parameters used by the visualization in this widget relate to other widgets on the
   * dashboard. Databricks does not recommend modifying this definition in JSON.
   */
  @JsonProperty("parameterMappings")
  private Object /* MISSING TYPE */ parameterMappings;

  /**
   * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
   * unsupported.
   */
  @JsonProperty("position")
  private Object /* MISSING TYPE */ position;

  /**
   * If this is a textbox widget, the application displays this text. This field is ignored if the
   * widget contains a visualization in the `visualization` field.
   */
  @JsonProperty("text")
  private String text;

  /** Timestamp of the last time this object was updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  public WidgetOptions setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public WidgetOptions setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public WidgetOptions setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public WidgetOptions setParameterMappings(Object /* MISSING TYPE */ parameterMappings) {
    this.parameterMappings = parameterMappings;
    return this;
  }

  public Object /* MISSING TYPE */ getParameterMappings() {
    return parameterMappings;
  }

  public WidgetOptions setPosition(Object /* MISSING TYPE */ position) {
    this.position = position;
    return this;
  }

  public Object /* MISSING TYPE */ getPosition() {
    return position;
  }

  public WidgetOptions setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  public WidgetOptions setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WidgetOptions that = (WidgetOptions) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(parameterMappings, that.parameterMappings)
        && Objects.equals(position, that.position)
        && Objects.equals(text, that.text)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, dashboardId, isHidden, parameterMappings, position, text, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetOptions.class)
        .add("createdAt", createdAt)
        .add("dashboardId", dashboardId)
        .add("isHidden", isHidden)
        .add("parameterMappings", parameterMappings)
        .add("position", position)
        .add("text", text)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
