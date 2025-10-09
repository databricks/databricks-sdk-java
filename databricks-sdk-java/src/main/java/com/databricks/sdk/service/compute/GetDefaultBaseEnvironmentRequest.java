// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetDefaultBaseEnvironmentRequest {
  /** */
  @JsonIgnore
  @QueryParam("id")
  private String id;

  /** */
  @JsonIgnore
  @QueryParam("trace_id")
  private String traceId;

  public GetDefaultBaseEnvironmentRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GetDefaultBaseEnvironmentRequest setTraceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  public String getTraceId() {
    return traceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDefaultBaseEnvironmentRequest that = (GetDefaultBaseEnvironmentRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(traceId, that.traceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, traceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDefaultBaseEnvironmentRequest.class)
        .add("id", id)
        .add("traceId", traceId)
        .toString();
  }
}
