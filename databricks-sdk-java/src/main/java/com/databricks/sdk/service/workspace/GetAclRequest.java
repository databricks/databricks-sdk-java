// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get secret ACL details */
public class GetAclRequest {
  /** The principal to fetch ACL information for. */
  @QueryParam("principal")
  private String principal;

  /** The name of the scope to fetch ACL information from. */
  @QueryParam("scope")
  private String scope;

  public GetAclRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetAclRequest setScope(String scope) {
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
    GetAclRequest that = (GetAclRequest) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAclRequest.class)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
