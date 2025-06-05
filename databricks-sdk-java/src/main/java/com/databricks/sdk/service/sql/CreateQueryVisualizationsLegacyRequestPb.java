// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Add visualization to a query */
@Generated
class CreateQueryVisualizationsLegacyRequestPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private Object options;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("type")
  private String typeValue;

  public CreateQueryVisualizationsLegacyRequestPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateQueryVisualizationsLegacyRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateQueryVisualizationsLegacyRequestPb setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public CreateQueryVisualizationsLegacyRequestPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateQueryVisualizationsLegacyRequestPb setType(String typeValue) {
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
    CreateQueryVisualizationsLegacyRequestPb that = (CreateQueryVisualizationsLegacyRequestPb) o;
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
    return new ToStringer(CreateQueryVisualizationsLegacyRequestPb.class)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("typeValue", typeValue)
        .toString();
  }
}
