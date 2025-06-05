// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PollQueryStatusResponseDataPb {
  @JsonProperty("status")
  private QueryResponseStatus status;

  public PollQueryStatusResponseDataPb setStatus(QueryResponseStatus status) {
    this.status = status;
    return this;
  }

  public QueryResponseStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PollQueryStatusResponseDataPb that = (PollQueryStatusResponseDataPb) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(PollQueryStatusResponseDataPb.class).add("status", status).toString();
  }
}
