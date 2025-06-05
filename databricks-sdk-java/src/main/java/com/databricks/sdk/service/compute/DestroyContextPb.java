// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DestroyContextPb {
  @JsonProperty("clusterId")
  private String clusterId;

  @JsonProperty("contextId")
  private String contextId;

  public DestroyContextPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public DestroyContextPb setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DestroyContextPb that = (DestroyContextPb) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(DestroyContextPb.class)
        .add("clusterId", clusterId)
        .add("contextId", contextId)
        .toString();
  }
}
