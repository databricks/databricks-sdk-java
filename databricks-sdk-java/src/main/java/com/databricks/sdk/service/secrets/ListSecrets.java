// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.annotation.QueryParam;

/** List secret keys */
public class ListSecrets {
  /** The name of the scope to list secrets within. */
  @QueryParam("scope")
  private String scope;

  public ListSecrets setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }
}
