// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DestroyContext class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DestroyContext {
  /** */
  @JsonProperty("clusterId")
  private String clusterId;

  /** */
  @JsonProperty("contextId")
  private String contextId;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DestroyContext} object
   */
  public DestroyContext setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>contextId</code>.</p>
   *
   * @param contextId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DestroyContext} object
   */
  public DestroyContext setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * <p>Getter for the field <code>contextId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getContextId() {
    return contextId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DestroyContext that = (DestroyContext) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(contextId, that.contextId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DestroyContext.class)
        .add("clusterId", clusterId)
        .add("contextId", contextId)
        .toString();
  }
}
