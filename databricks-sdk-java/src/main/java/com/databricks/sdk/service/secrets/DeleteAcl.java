// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DeleteAcl {
  /** The principal to remove an existing ACL from. */
  @JsonProperty("principal")
  private String principal;

  /** The name of the scope to remove permissions from. */
  @JsonProperty("scope")
  private String scope;

  public DeleteAcl setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public DeleteAcl setScope(String scope) {
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
    DeleteAcl that = (DeleteAcl) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAcl.class)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
