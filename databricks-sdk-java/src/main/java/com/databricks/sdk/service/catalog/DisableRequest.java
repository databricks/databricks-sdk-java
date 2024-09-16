// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Disable a system schema */
@Generated
public class DisableRequest {
  /** The metastore ID under which the system schema lives. */
  @JsonIgnore private String metastoreId;

  /** Full name of the system schema. */
  @JsonIgnore private String schemaName;

  public DisableRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DisableRequest setSchemaName(String schemaName) {
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
    DisableRequest that = (DisableRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableRequest.class)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }
}
