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

  /** Custom description of the widget */
  @JsonProperty("description")
  private String description;

  /** Whether this widget is hidden on the dashboard. */
  @JsonProperty("isHidden")
  private Boolean isHidden;

  /**
   * How parameters used by the visualization in this widget relate to other widgets on the
   * dashboard. Databricks does not recommend modifying this definition in JSON.
   */
  @JsonProperty("parameterMappings")
  private Object parameterMappings;

  /**
   * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
   * unsupported.
   */
  @JsonProperty("position")
  private WidgetPosition position;

  /** Custom title of the widget */
  @JsonProperty("title")
  private String title;

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

  public WidgetOptions setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WidgetOptions setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public WidgetOptions setParameterMappings(Object parameterMappings) {
    this.parameterMappings = parameterMappings;
    return this;
  }

  public Object getParameterMappings() {
    return parameterMappings;
  }

  public WidgetOptions setPosition(WidgetPosition position) {
    this.position = position;
    return this;
  }

  public WidgetPosition getPosition() {
    return position;
  }

  public WidgetOptions setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
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
        && Objects.equals(description, that.description)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(parameterMappings, that.parameterMappings)
        && Objects.equals(position, that.position)
        && Objects.equals(title, that.title)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, description, isHidden, parameterMappings, position, title, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetOptions.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("isHidden", isHidden)
        .add("parameterMappings", parameterMappings)
        .add("position", position)
        .add("title", title)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
