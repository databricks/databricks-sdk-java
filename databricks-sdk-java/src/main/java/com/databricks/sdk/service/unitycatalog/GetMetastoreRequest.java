// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a metastore */
public class GetMetastoreRequest {
  /** Unique ID of the metastore. */
  private String id;

  public GetMetastoreRequest setId(String id) {
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
    GetMetastoreRequest that = (GetMetastoreRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetastoreRequest.class).add("id", id).toString();
  }
}
