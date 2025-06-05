// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PermissionsChangePb {
  @JsonProperty("add")
  private Collection<Privilege> add;

  @JsonProperty("principal")
  private String principal;

  @JsonProperty("remove")
  private Collection<Privilege> remove;

  public PermissionsChangePb setAdd(Collection<Privilege> add) {
    this.add = add;
    return this;
  }

  public Collection<Privilege> getAdd() {
    return add;
  }

  public PermissionsChangePb setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PermissionsChangePb setRemove(Collection<Privilege> remove) {
    this.remove = remove;
    return this;
  }

  public Collection<Privilege> getRemove() {
    return remove;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsChangePb that = (PermissionsChangePb) o;
    return Objects.equals(add, that.add)
        && Objects.equals(principal, that.principal)
        && Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, principal, remove);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsChangePb.class)
        .add("add", add)
        .add("principal", principal)
        .add("remove", remove)
        .toString();
  }
}
