// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.annotation.QueryParam;

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
}
