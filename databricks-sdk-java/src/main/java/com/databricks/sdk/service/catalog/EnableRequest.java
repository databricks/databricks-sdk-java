// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnableRequest {
  /** the catalog for which the system schema is to enabled in */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The metastore ID under which the system schema lives. */
  @JsonIgnore private String metastoreId;

  /** Full name of the system schema. */
  @JsonIgnore private String schemaName;

  public EnableRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public EnableRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public EnableRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnableRequest that = (EnableRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableRequest.class)
        .add("catalogName", catalogName)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }
}
