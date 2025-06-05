// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class WidgetOptionsPb {
  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isHidden")
  private Boolean isHidden;

  @JsonProperty("parameterMappings")
  private Object parameterMappings;

  @JsonProperty("position")
  private WidgetPosition position;

  @JsonProperty("title")
  private String title;

  @JsonProperty("updated_at")
  private String updatedAt;

  public WidgetOptionsPb setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public WidgetOptionsPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WidgetOptionsPb setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public WidgetOptionsPb setParameterMappings(Object parameterMappings) {
    this.parameterMappings = parameterMappings;
    return this;
  }

  public Object getParameterMappings() {
    return parameterMappings;
  }

  public WidgetOptionsPb setPosition(WidgetPosition position) {
    this.position = position;
    return this;
  }

  public WidgetPosition getPosition() {
    return position;
  }

  public WidgetOptionsPb setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public WidgetOptionsPb setUpdatedAt(String updatedAt) {
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
    WidgetOptionsPb that = (WidgetOptionsPb) o;
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
    return new ToStringer(WidgetOptionsPb.class)
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
