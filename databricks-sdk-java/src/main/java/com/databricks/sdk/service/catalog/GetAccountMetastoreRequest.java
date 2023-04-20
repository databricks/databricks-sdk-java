// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a metastore */
public class GetAccountMetastoreRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  public GetAccountMetastoreRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountMetastoreRequest that = (GetAccountMetastoreRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountMetastoreRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }
}
