// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class WidgetPb {
  @JsonProperty("id")
  private String id;

  @JsonProperty("options")
  private WidgetOptions options;

  @JsonProperty("visualization")
  private LegacyVisualization visualization;

  @JsonProperty("width")
  private Long width;

  public WidgetPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public WidgetPb setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  public WidgetOptions getOptions() {
    return options;
  }

  public WidgetPb setVisualization(LegacyVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public LegacyVisualization getVisualization() {
    return visualization;
  }

  public WidgetPb setWidth(Long width) {
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
    WidgetPb that = (WidgetPb) o;
    return Objects.equals(id, that.id)
        && Objects.equals(options, that.options)
        && Objects.equals(visualization, that.visualization)
        && Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, options, visualization, width);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetPb.class)
        .add("id", id)
        .add("options", options)
        .add("visualization", visualization)
        .add("width", width)
        .toString();
  }
}
