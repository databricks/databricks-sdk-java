// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get an endpoint */
@Generated
public class GetEndpointRequest {
  /** Name of the endpoint */
  @JsonIgnore private String endpointName;

  public GetEndpointRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEndpointRequest that = (GetEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEndpointRequest.class).add("endpointName", endpointName).toString();
  }
}
