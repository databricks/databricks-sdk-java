// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a provider */
public class DeleteProviderRequest {
  /** Name of the provider. */
  private String name;

  public DeleteProviderRequest setName(String name) {
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
    DeleteProviderRequest that = (DeleteProviderRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteProviderRequest.class).add("name", name).toString();
  }
}
