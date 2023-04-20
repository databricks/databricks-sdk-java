// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Lists ACLs */
public class ListAclsRequest {
  /** The name of the scope to fetch ACL information from. */
  @QueryParam("scope")
  private String scope;

  public ListAclsRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAclsRequest that = (ListAclsRequest) o;
    return Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAclsRequest.class).add("scope", scope).toString();
  }
}
