// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get status */
@Generated
class ContextStatusRequestPb {
  @JsonIgnore
  @QueryParam("clusterId")
  private String clusterId;

  @JsonIgnore
  @QueryParam("contextId")
  private String contextId;

  public ContextStatusRequestPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ContextStatusRequestPb setContextId(String contextId) {
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
    ContextStatusRequestPb that = (ContextStatusRequestPb) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusRequestPb.class)
        .add("clusterId", clusterId)
        .add("contextId", contextId)
        .toString();
  }
}
