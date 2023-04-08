// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionsChange {
  /** The set of privileges to add. */
  @JsonProperty("add")
  private java.util.List<Privilege> add;

  /** The principal whose privileges we are changing. */
  @JsonProperty("principal")
  private String principal;

  /** The set of privileges to remove. */
  @JsonProperty("remove")
  private java.util.List<Privilege> remove;

  public PermissionsChange setAdd(java.util.List<Privilege> add) {
    this.add = add;
    return this;
  }

  public java.util.List<Privilege> getAdd() {
    return add;
  }

  public PermissionsChange setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PermissionsChange setRemove(java.util.List<Privilege> remove) {
    this.remove = remove;
    return this;
  }

  public java.util.List<Privilege> getRemove() {
    return remove;
  }
}
