// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListTransitionRequestsResponse {
  /** Array of open transition requests. */
  @JsonProperty("requests")
  private Collection<Activity> requests;

  public ListTransitionRequestsResponse setRequests(Collection<Activity> requests) {
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
    ListTransitionRequestsResponse that = (ListTransitionRequestsResponse) o;
    return Objects.equals(requests, that.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsResponse.class)
        .add("requests", requests)
        .toString();
  }
}
