// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get secret ACL details */
public class GetAcl {
  /** The principal to fetch ACL information for. */
  @QueryParam("principal")
  private String principal;

  /** The name of the scope to fetch ACL information from. */
  @QueryParam("scope")
  private String scope;

  public GetAcl setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetAcl setScope(String scope) {
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
    GetAcl that = (GetAcl) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAcl.class).add("principal", principal).add("scope", scope).toString();
  }
}
