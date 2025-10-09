// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDefaultBaseEnvironmentRequest {
  /** */
  @JsonProperty("default_base_environment")
  private DefaultBaseEnvironment defaultBaseEnvironment;

  /**
   * A unique identifier for this request. A random UUID is recommended. This request is only
   * idempotent if a `request_id` is provided.
   */
  @JsonProperty("request_id")
  private String requestId;

  public CreateDefaultBaseEnvironmentRequest setDefaultBaseEnvironment(
      DefaultBaseEnvironment defaultBaseEnvironment) {
    this.defaultBaseEnvironment = defaultBaseEnvironment;
    return this;
  }

  public DefaultBaseEnvironment getDefaultBaseEnvironment() {
    return defaultBaseEnvironment;
  }

  public CreateDefaultBaseEnvironmentRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDefaultBaseEnvironmentRequest that = (CreateDefaultBaseEnvironmentRequest) o;
    return Objects.equals(defaultBaseEnvironment, that.defaultBaseEnvironment)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBaseEnvironment, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDefaultBaseEnvironmentRequest.class)
        .add("defaultBaseEnvironment", defaultBaseEnvironment)
        .add("requestId", requestId)
        .toString();
  }
}
