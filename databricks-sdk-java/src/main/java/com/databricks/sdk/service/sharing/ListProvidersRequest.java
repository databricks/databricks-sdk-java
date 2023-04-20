// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List providers */
public class ListProvidersRequest {
  /**
   * If not provided, all providers will be returned. If no providers exist with this ID, no results
   * will be returned.
   */
  @QueryParam("data_provider_global_metastore_id")
  private String dataProviderGlobalMetastoreId;

  public ListProvidersRequest setDataProviderGlobalMetastoreId(
      String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(dataProviderGlobalMetastoreId, that.dataProviderGlobalMetastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProviderGlobalMetastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .toString();
  }
}
