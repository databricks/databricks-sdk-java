// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspaceconf;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Check configuration status */
public class GetStatusRequest {
  /** */
  @QueryParam("keys")
  private String keys;

  public GetStatusRequest setKeys(String keys) {
    this.keys = keys;
    return this;
  }

  public String getKeys() {
    return keys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatusRequest that = (GetStatusRequest) o;
    return Objects.equals(keys, that.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatusRequest.class).add("keys", keys).toString();
  }
}
