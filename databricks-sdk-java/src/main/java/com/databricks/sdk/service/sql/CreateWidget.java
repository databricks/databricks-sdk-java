// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWidget {
  /** Dashboard ID returned by :method:dashboards/create. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Widget ID returned by :method:dashboardwidgets/create */
  @JsonIgnore private String id;

  /** */
  @JsonProperty("options")
  private WidgetOptions options;

  /**
   * If this is a textbox widget, the application displays this text. This field is ignored if the
   * widget contains a visualization in the `visualization` field.
   */
  @JsonProperty("text")
  private String text;

  /** Query Vizualization ID returned by :method:queryvisualizations/create. */
  @JsonProperty("visualization_id")
  private String visualizationId;

  /** Width of a widget */
  @JsonProperty("width")
  private Long width;

  public CreateWidget setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateWidget setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateWidget setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  public WidgetOptions getOptions() {
    return options;
  }

  public CreateWidget setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  public CreateWidget setVisualizationId(String visualizationId) {
    this.visualizationId = visualizationId;
    return this;
  }

  public String getVisualizationId() {
    return visualizationId;
  }

  public CreateWidget setWidth(Long width) {
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
    CreateWidget that = (CreateWidget) o;
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
    return new ToStringer(CreateWidget.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("options", options)
        .add("text", text)
        .add("visualizationId", visualizationId)
        .add("width", width)
        .toString();
  }
}
