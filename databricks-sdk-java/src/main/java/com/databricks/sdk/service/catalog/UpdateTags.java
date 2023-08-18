// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateTags {
  /** Desired changes to be made to the tag assignments on the entity */
  @JsonProperty("changes")
  private TagChanges changes;

  /** The fully qualified name of the unity catalog securable entity. */
  private String fullName;

  /** The type of the unity catalog securable entity. */
  private UpdateSecurableType securableType;

  /** The name of subentity associated with the securable entity */
  private String subentityName;

  public UpdateTags setChanges(TagChanges changes) {
    this.changes = changes;
    return this;
  }

  public TagChanges getChanges() {
    return changes;
  }

  public UpdateTags setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateTags setSecurableType(UpdateSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public UpdateSecurableType getSecurableType() {
    return securableType;
  }

  public UpdateTags setSubentityName(String subentityName) {
    this.subentityName = subentityName;
    return this;
  }

  public String getSubentityName() {
    return subentityName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateTags that = (UpdateTags) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(subentityName, that.subentityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, fullName, securableType, subentityName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateTags.class)
        .add("changes", changes)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .add("subentityName", subentityName)
        .toString();
  }
}
