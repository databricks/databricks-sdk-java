// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List providers
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListProvidersRequest {
  /**
   * If not provided, all providers will be returned. If no providers exist with this ID, no results
   * will be returned.
   */
  @QueryParam("data_provider_global_metastore_id")
  private String dataProviderGlobalMetastoreId;

  /**
   * <p>Setter for the field <code>dataProviderGlobalMetastoreId</code>.</p>
   *
   * @param dataProviderGlobalMetastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProvidersRequest} object
   */
  public ListProvidersRequest setDataProviderGlobalMetastoreId(
      String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataProviderGlobalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(dataProviderGlobalMetastoreId, that.dataProviderGlobalMetastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dataProviderGlobalMetastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .toString();
  }
}
