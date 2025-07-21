// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PollQueryStatusResponse {
  /** */
  @JsonProperty("data")
  private Collection<PollQueryStatusResponseData> data;

  public PollQueryStatusResponse setData(Collection<PollQueryStatusResponseData> data) {
    this.data = data;
    return this;
  }

  public Collection<PollQueryStatusResponseData> getData() {
    return data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PollQueryStatusResponse that = (PollQueryStatusResponse) o;
    return Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    return new ToStringer(PollQueryStatusResponse.class).add("data", data).toString();
  }
}
