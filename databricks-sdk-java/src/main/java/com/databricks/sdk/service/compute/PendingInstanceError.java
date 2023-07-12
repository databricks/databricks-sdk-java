// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PendingInstanceError {
  /** */
  @JsonProperty("instance_id")
  private String instanceId;

  /** */
  @JsonProperty("message")
  private String message;

  public PendingInstanceError setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public PendingInstanceError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingInstanceError that = (PendingInstanceError) o;
    return Objects.equals(instanceId, that.instanceId) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, message);
  }

  @Override
  public String toString() {
    return new ToStringer(PendingInstanceError.class)
        .add("instanceId", instanceId)
        .add("message", message)
        .toString();
  }
}
