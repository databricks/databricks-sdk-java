// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get a model */
public class GetRegisteredModelRequest {
  /** Registered model unique name identifier. */
  @QueryParam("name")
  private String name;

  public GetRegisteredModelRequest setName(String name) {
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
    GetRegisteredModelRequest that = (GetRegisteredModelRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelRequest.class).add("name", name).toString();
  }
}
