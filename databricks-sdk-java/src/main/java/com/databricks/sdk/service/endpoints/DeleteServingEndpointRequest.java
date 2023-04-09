// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a serving endpoint */
public class DeleteServingEndpointRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  public DeleteServingEndpointRequest setName(String name) {
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
    DeleteServingEndpointRequest that = (DeleteServingEndpointRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServingEndpointRequest.class).add("name", name).toString();
  }
}
