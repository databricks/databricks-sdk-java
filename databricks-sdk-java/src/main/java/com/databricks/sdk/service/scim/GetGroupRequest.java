// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get group details */
public class GetGroupRequest {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  public GetGroupRequest setId(String id) {
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
    GetGroupRequest that = (GetGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGroupRequest.class).add("id", id).toString();
  }
}
