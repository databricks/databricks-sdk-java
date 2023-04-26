// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a network configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteNetworkRequest {
  /** Databricks Account API network configuration ID. */
  private String networkId;

  /**
   * <p>Setter for the field <code>networkId</code>.</p>
   *
   * @param networkId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.DeleteNetworkRequest} object
   */
  public DeleteNetworkRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkId() {
    return networkId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteNetworkRequest that = (DeleteNetworkRequest) o;
    return Objects.equals(networkId, that.networkId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(networkId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkRequest.class).add("networkId", networkId).toString();
  }
}
