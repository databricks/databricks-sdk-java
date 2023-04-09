// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get a schema */
public class GetSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  public GetSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSchemaRequest that = (GetSchemaRequest) o;
    return Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSchemaRequest.class).add("fullName", fullName).toString();
  }
}
