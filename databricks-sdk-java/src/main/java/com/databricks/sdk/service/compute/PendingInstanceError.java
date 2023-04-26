// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PendingInstanceError class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PendingInstanceError {
  /** */
  @JsonProperty("instance_id")
  private String instanceId;

  /** */
  @JsonProperty("message")
  private String message;

  /**
   * <p>Setter for the field <code>instanceId</code>.</p>
   *
   * @param instanceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PendingInstanceError} object
   */
  public PendingInstanceError setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PendingInstanceError} object
   */
  public PendingInstanceError setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingInstanceError that = (PendingInstanceError) o;
    return Objects.equals(instanceId, that.instanceId) && Objects.equals(message, that.message);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instanceId, message);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PendingInstanceError.class)
        .add("instanceId", instanceId)
        .add("message", message)
        .toString();
  }
}
