// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListResponse {
  /** Array of open transition requests. */
  @JsonProperty("requests")
  private Collection<Activity> requests;

  public ListResponse setRequests(Collection<Activity> requests) {
    this.requests = requests;
    return this;
  }

  public Collection<Activity> getRequests() {
    return requests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(requests, that.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResponse.class).add("requests", requests).toString();
  }
}
