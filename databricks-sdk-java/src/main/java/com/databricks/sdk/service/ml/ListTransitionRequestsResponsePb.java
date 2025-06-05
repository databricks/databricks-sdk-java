// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListTransitionRequestsResponsePb {
  @JsonProperty("requests")
  private Collection<Activity> requests;

  public ListTransitionRequestsResponsePb setRequests(Collection<Activity> requests) {
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
    ListTransitionRequestsResponsePb that = (ListTransitionRequestsResponsePb) o;
    return Objects.equals(requests, that.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsResponsePb.class)
        .add("requests", requests)
        .toString();
  }
}
