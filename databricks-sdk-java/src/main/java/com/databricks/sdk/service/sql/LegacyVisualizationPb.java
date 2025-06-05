// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The visualization description API changes frequently and is unsupported. You can duplicate a
 * visualization by copying description objects received _from the API_ and then using them to
 * create a new one with a POST request to the same endpoint. Databricks does not recommend
 * constructing ad-hoc visualizations entirely in JSON.
 */
@Generated
class LegacyVisualizationPb {
  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private Object options;

  @JsonProperty("query")
  private LegacyQuery query;

  @JsonProperty("type")
  private String typeValue;

  @JsonProperty("updated_at")
  private String updatedAt;

  public LegacyVisualizationPb setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyVisualizationPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public LegacyVisualizationPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyVisualizationPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyVisualizationPb setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public LegacyVisualizationPb setQuery(LegacyQuery query) {
    this.query = query;
    return this;
  }

  public LegacyQuery getQuery() {
    return query;
  }

  public LegacyVisualizationPb setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public LegacyVisualizationPb setUpdatedAt(String updatedAt) {
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
    LegacyVisualizationPb that = (LegacyVisualizationPb) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(query, that.query)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, name, options, query, typeValue, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(LegacyVisualizationPb.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("id", id)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("typeValue", typeValue)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
