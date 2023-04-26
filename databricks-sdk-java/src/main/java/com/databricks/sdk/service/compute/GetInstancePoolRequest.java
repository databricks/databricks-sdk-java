// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get instance pool information
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetInstancePoolRequest {
  /** The canonical unique identifier for the instance pool. */
  @QueryParam("instance_pool_id")
  private String instancePoolId;

  /**
   * <p>Setter for the field <code>instancePoolId</code>.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GetInstancePoolRequest} object
   */
  public GetInstancePoolRequest setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstancePoolId() {
    return instancePoolId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetInstancePoolRequest that = (GetInstancePoolRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolRequest.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }
}
