// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete an endpoint */
@Generated
public class DeleteEndpointRequest {
  /** Name of the endpoint */
  private String endpointName;

  /** Name of the endpoint to delete */
  private String name;

  public DeleteEndpointRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public DeleteEndpointRequest setName(String name) {
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
    DeleteEndpointRequest that = (DeleteEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteEndpointRequest.class)
        .add("endpointName", endpointName)
        .add("name", name)
        .toString();
  }
}
