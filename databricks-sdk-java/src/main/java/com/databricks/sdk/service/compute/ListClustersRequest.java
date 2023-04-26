// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List all clusters
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListClustersRequest {
  /**
   * Filter clusters based on what type of client it can be used for. Could be either NOTEBOOKS or
   * JOBS. No input for this field will get all clusters in the workspace without filtering on its
   * supported client
   */
  @QueryParam("can_use_client")
  private String canUseClient;

  /**
   * <p>Setter for the field <code>canUseClient</code>.</p>
   *
   * @param canUseClient a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ListClustersRequest} object
   */
  public ListClustersRequest setCanUseClient(String canUseClient) {
    this.canUseClient = canUseClient;
    return this;
  }

  /**
   * <p>Getter for the field <code>canUseClient</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCanUseClient() {
    return canUseClient;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersRequest that = (ListClustersRequest) o;
    return Objects.equals(canUseClient, that.canUseClient);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(canUseClient);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListClustersRequest.class).add("canUseClient", canUseClient).toString();
  }
}
