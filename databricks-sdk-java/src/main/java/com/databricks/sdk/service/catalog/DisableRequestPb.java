// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Disable a system schema */
@Generated
class DisableRequestPb {
  @JsonIgnore private String metastoreId;

  @JsonIgnore private String schemaName;

  public DisableRequestPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DisableRequestPb setSchemaName(String schemaName) {
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
    DisableRequestPb that = (DisableRequestPb) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableRequestPb.class)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }
}
