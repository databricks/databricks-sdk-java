// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Enable a system schema */
@Generated
public class EnableRequest {
  /** The metastore ID under which the system schema lives. */
  private String metastoreId;

  /** Full name of the system schema. */
  private EnableSchemaName schemaName;

  public EnableRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public EnableRequest setSchemaName(EnableSchemaName schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public EnableSchemaName getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnableRequest that = (EnableRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableRequest.class)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }
}
