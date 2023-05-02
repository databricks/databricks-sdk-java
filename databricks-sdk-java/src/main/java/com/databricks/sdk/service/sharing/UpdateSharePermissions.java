// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateSharePermissions {
  /** Array of permission changes. */
  @JsonProperty("changes")
  private Collection<Object /* MISSING TYPE */> changes;

  /** The name of the share. */
  private String name;

  public UpdateSharePermissions setChanges(Collection<Object /* MISSING TYPE */> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getChanges() {
    return changes;
  }

  public UpdateSharePermissions setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSharePermissions that = (UpdateSharePermissions) o;
    return Objects.equals(changes, that.changes) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissions.class)
        .add("changes", changes)
        .add("name", name)
        .toString();
  }
}
