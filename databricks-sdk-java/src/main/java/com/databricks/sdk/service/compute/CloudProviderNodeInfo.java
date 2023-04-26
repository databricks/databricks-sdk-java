// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CloudProviderNodeInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CloudProviderNodeInfo {
  /** */
  @JsonProperty("status")
  private Collection<CloudProviderNodeStatus> status;

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.CloudProviderNodeInfo} object
   */
  public CloudProviderNodeInfo setStatus(Collection<CloudProviderNodeStatus> status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<CloudProviderNodeStatus> getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudProviderNodeInfo that = (CloudProviderNodeInfo) o;
    return Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CloudProviderNodeInfo.class).add("status", status).toString();
  }
}
