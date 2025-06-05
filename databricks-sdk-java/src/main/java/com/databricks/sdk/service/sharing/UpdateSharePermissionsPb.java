// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateSharePermissionsPb {
  @JsonProperty("changes")
  private Collection<PermissionsChange> changes;

  @JsonIgnore private String name;

  @JsonProperty("omit_permissions_list")
  private Boolean omitPermissionsList;

  public UpdateSharePermissionsPb setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  public UpdateSharePermissionsPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSharePermissionsPb setOmitPermissionsList(Boolean omitPermissionsList) {
    this.omitPermissionsList = omitPermissionsList;
    return this;
  }

  public Boolean getOmitPermissionsList() {
    return omitPermissionsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSharePermissionsPb that = (UpdateSharePermissionsPb) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(name, that.name)
        && Objects.equals(omitPermissionsList, that.omitPermissionsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, name, omitPermissionsList);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissionsPb.class)
        .add("changes", changes)
        .add("name", name)
        .add("omitPermissionsList", omitPermissionsList)
        .toString();
  }
}
