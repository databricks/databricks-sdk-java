// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListEndpointsResponsePb {
  @JsonProperty("endpoints")
  private Collection<ServingEndpoint> endpoints;

  public ListEndpointsResponsePb setEndpoints(Collection<ServingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<ServingEndpoint> getEndpoints() {
    return endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEndpointsResponsePb that = (ListEndpointsResponsePb) o;
    return Objects.equals(endpoints, that.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsResponsePb.class).add("endpoints", endpoints).toString();
  }
}
