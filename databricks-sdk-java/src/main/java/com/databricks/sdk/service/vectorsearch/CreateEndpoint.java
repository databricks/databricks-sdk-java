// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEndpoint {
  /** Type of endpoint. */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** Name of endpoint */
  @JsonProperty("name")
  private String name;

  public CreateEndpoint setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public CreateEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpoint that = (CreateEndpoint) o;
    return Objects.equals(endpointType, that.endpointType) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpoint.class)
        .add("endpointType", endpointType)
        .add("name", name)
        .toString();
  }
}
