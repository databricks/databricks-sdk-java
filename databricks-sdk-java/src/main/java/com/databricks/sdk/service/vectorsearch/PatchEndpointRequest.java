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
   * Min QPS for the endpoint. Positive integer sets QPS target; -1 resets to default scaling
   * behavior.
   */
  @JsonProperty("min_qps")
  private Long minQps;

  public PatchEndpointRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public PatchEndpointRequest setMinQps(Long minQps) {
    this.minQps = minQps;
    return this;
  }

  public Long getMinQps() {
    return minQps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointRequest that = (PatchEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName) && Objects.equals(minQps, that.minQps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, minQps);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointRequest.class)
        .add("endpointName", endpointName)
        .add("minQps", minQps)
        .toString();
  }
}
