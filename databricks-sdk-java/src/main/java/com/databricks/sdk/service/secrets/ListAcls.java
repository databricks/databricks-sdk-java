// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Lists ACLs */
public class ListAcls {
  /** The name of the scope to fetch ACL information from. */
  @QueryParam("scope")
  private String scope;

  public ListAcls setScope(String scope) {
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
    ListAcls that = (ListAcls) o;
    return Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAcls.class).add("scope", scope).toString();
  }
}
