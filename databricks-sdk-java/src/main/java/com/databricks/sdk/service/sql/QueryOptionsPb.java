// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class QueryOptionsPb {
  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("moved_to_trash_at")
  private String movedToTrashAt;

  @JsonProperty("parameters")
  private Collection<Parameter> parameters;

  @JsonProperty("schema")
  private String schema;

  public QueryOptionsPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public QueryOptionsPb setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  public QueryOptionsPb setParameters(Collection<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<Parameter> getParameters() {
    return parameters;
  }

  public QueryOptionsPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryOptionsPb that = (QueryOptionsPb) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(movedToTrashAt, that.movedToTrashAt)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, movedToTrashAt, parameters, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryOptionsPb.class)
        .add("catalog", catalog)
        .add("movedToTrashAt", movedToTrashAt)
        .add("parameters", parameters)
        .add("schema", schema)
        .toString();
  }
}
