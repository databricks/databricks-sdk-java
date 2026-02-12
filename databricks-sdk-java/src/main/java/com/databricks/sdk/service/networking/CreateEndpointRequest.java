// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEndpointRequest {
  /** */
  @JsonProperty("endpoint")
  private Endpoint endpoint;

  /** */
  @JsonIgnore private String parent;

  public CreateEndpointRequest setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public CreateEndpointRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpointRequest that = (CreateEndpointRequest) o;
    return Objects.equals(endpoint, that.endpoint) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpointRequest.class)
        .add("endpoint", endpoint)
        .add("parent", parent)
        .toString();
  }
}
