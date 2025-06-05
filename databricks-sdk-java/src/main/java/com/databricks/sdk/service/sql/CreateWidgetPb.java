// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateWidgetPb {
  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonIgnore private String id;

  @JsonProperty("options")
  private WidgetOptions options;

  @JsonProperty("text")
  private String text;

  @JsonProperty("visualization_id")
  private String visualizationId;

  @JsonProperty("width")
  private Long width;

  public CreateWidgetPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateWidgetPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateWidgetPb setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  public WidgetOptions getOptions() {
    return options;
  }

  public CreateWidgetPb setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  public CreateWidgetPb setVisualizationId(String visualizationId) {
    this.visualizationId = visualizationId;
    return this;
  }

  public String getVisualizationId() {
    return visualizationId;
  }

  public CreateWidgetPb setWidth(Long width) {
    this.width = width;
    return this;
  }

  public Long getWidth() {
    return width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWidgetPb that = (CreateWidgetPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(id, that.id)
        && Objects.equals(options, that.options)
        && Objects.equals(text, that.text)
        && Objects.equals(visualizationId, that.visualizationId)
        && Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, id, options, text, visualizationId, width);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWidgetPb.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("options", options)
        .add("text", text)
        .add("visualizationId", visualizationId)
        .add("width", width)
        .toString();
  }
}
