// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryOptions {
  /** The name of the catalog to execute this query in. */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * The timestamp when this query was moved to trash. Only present when the `is_archived` property
   * is `true`. Trashed items are deleted after thirty days.
   */
  @JsonProperty("moved_to_trash_at")
  private String movedToTrashAt;

  /** */
  @JsonProperty("parameters")
  private Collection<Parameter> parameters;

  /** The name of the schema to execute this query in. */
  @JsonProperty("schema")
  private String schema;

  public QueryOptions setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public QueryOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  public QueryOptions setParameters(Collection<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<Parameter> getParameters() {
    return parameters;
  }

  public QueryOptions setSchema(String schema) {
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
    QueryOptions that = (QueryOptions) o;
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
    return new ToStringer(QueryOptions.class)
        .add("catalog", catalog)
        .add("movedToTrashAt", movedToTrashAt)
        .add("parameters", parameters)
        .add("schema", schema)
        .toString();
  }
}
