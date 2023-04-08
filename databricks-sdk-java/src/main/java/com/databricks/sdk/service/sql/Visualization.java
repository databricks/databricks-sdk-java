// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The visualization description API changes frequently and is unsupported. You can duplicate a
 * visualization by copying description objects received _from the API_ and then using them to
 * create a new one with a POST request to the same endpoint. Databricks does not recommend
 * constructing ad-hoc visualizations entirely in JSON.
 */
public class Visualization {
  /** */
  @JsonProperty("created_at")
  private String createdAt;

  /** A short description of this visualization. This is not displayed in the UI. */
  @JsonProperty("description")
  private String description;

  /** The UUID for this visualization. */
  @JsonProperty("id")
  private String id;

  /** The name of the visualization that appears on dashboards and the query screen. */
  @JsonProperty("name")
  private String name;

  /**
   * The options object varies widely from one visualization type to the next and is unsupported.
   * Databricks does not recommend modifying visualization settings in JSON.
   */
  @JsonProperty("options")
  private Object /* MISSING TYPE */ options;

  /** The type of visualization: chart, table, pivot table, and so on. */
  @JsonProperty("type")
  private String typeValue;

  /** */
  @JsonProperty("updated_at")
  private String updatedAt;

  public Visualization setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public Visualization setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Visualization setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Visualization setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Visualization setOptions(Object /* MISSING TYPE */ options) {
    this.options = options;
    return this;
  }

  public Object /* MISSING TYPE */ getOptions() {
    return options;
  }

  public Visualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public Visualization setUpdatedAt(String updatedAt) {
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
    Visualization that = (Visualization) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, name, options, typeValue, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(Visualization.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("id", id)
        .add("name", name)
        .add("options", options)
        .add("typeValue", typeValue)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
