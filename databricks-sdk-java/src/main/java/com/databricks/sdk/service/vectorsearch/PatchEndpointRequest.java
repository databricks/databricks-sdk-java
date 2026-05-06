// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PatchEndpointRequest {
  /** Name of the vector search endpoint */
  @JsonIgnore private String endpointName;

  /**
   * Target QPS for the endpoint. Best-effort; the system does not guarantee this QPS will be
   * achieved.
   */
  @JsonProperty("target_qps")
  private Long targetQps;

  public PatchEndpointRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public PatchEndpointRequest setTargetQps(Long targetQps) {
    this.targetQps = targetQps;
    return this;
  }

  public Long getTargetQps() {
    return targetQps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointRequest that = (PatchEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName)
        && Objects.equals(targetQps, that.targetQps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, targetQps);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointRequest.class)
        .add("endpointName", endpointName)
        .add("targetQps", targetQps)
        .toString();
  }
}
