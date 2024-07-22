// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Add visualization to a query */
@Generated
public class CreateQueryVisualizationsLegacyRequest {
  /** A short description of this visualization. This is not displayed in the UI. */
  @JsonProperty("description")
  private String description;

  /** The name of the visualization that appears on dashboards and the query screen. */
  @JsonProperty("name")
  private String name;

  /**
   * The options object varies widely from one visualization type to the next and is unsupported.
   * Databricks does not recommend modifying visualization settings in JSON.
   */
  @JsonProperty("options")
  private Object options;

  /** The identifier returned by :method:queries/create */
  @JsonProperty("query_id")
  private String queryId;

  /** The type of visualization: chart, table, pivot table, and so on. */
  @JsonProperty("type")
  private String typeValue;

  public CreateQueryVisualizationsLegacyRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateQueryVisualizationsLegacyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateQueryVisualizationsLegacyRequest setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public CreateQueryVisualizationsLegacyRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateQueryVisualizationsLegacyRequest setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQueryVisualizationsLegacyRequest that = (CreateQueryVisualizationsLegacyRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, options, queryId, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryVisualizationsLegacyRequest.class)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("typeValue", typeValue)
        .toString();
  }
}
