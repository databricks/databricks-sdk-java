// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateVolumeRequestContent {
  /** The comment attached to the volume */
  @JsonProperty("comment")
  private String comment;

  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  /** New name for the volume. */
  @JsonProperty("new_name")
  private String newName;

  /** The identifier of the user who owns the volume */
  @JsonProperty("owner")
  private String owner;

  public UpdateVolumeRequestContent setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateVolumeRequestContent setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  public String getFullNameArg() {
    return fullNameArg;
  }

  public UpdateVolumeRequestContent setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateVolumeRequestContent setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateVolumeRequestContent that = (UpdateVolumeRequestContent) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullNameArg, that.fullNameArg)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullNameArg, newName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVolumeRequestContent.class)
        .add("comment", comment)
        .add("fullNameArg", fullNameArg)
        .add("newName", newName)
        .add("owner", owner)
        .toString();
  }
}
