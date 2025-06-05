// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configurable event log parameters. */
@Generated
class EventLogSpecPb {
  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schema")
  private String schema;

  public EventLogSpecPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public EventLogSpecPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EventLogSpecPb setSchema(String schema) {
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
    EventLogSpecPb that = (EventLogSpecPb) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, name, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(EventLogSpecPb.class)
        .add("catalog", catalog)
        .add("name", name)
        .add("schema", schema)
        .toString();
  }
}
