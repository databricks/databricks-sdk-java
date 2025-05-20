// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateSharePermissions {
  /** Array of permission changes. */
  @JsonProperty("changes")
  private Collection<PermissionsChange> changes;

  /** The name of the share. */
  @JsonIgnore private String name;

  /** Optional. Whether to return the latest permissions list of the share in the response. */
  @JsonProperty("omit_permissions_list")
  private Boolean omitPermissionsList;

  public UpdateSharePermissions setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  public UpdateSharePermissions setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSharePermissions setOmitPermissionsList(Boolean omitPermissionsList) {
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
    UpdateSharePermissions that = (UpdateSharePermissions) o;
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
    return new ToStringer(UpdateSharePermissions.class)
        .add("changes", changes)
        .add("name", name)
        .add("omitPermissionsList", omitPermissionsList)
        .toString();
  }
}
