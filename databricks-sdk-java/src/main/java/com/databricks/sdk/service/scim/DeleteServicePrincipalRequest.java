// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a service principal */
public class DeleteServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks Account. */
  private String id;

  public DeleteServicePrincipalRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteServicePrincipalRequest that = (DeleteServicePrincipalRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalRequest.class).add("id", id).toString();
  }
}
