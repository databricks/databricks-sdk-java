// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateVolumeRequestContent {
  /** The comment attached to the volume */
  @JsonProperty("comment")
  private String comment;

  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  /** The name of the volume */
  @JsonProperty("name")
  private String name;

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

  public UpdateVolumeRequestContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullNameArg, name, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVolumeRequestContent.class)
        .add("comment", comment)
        .add("fullNameArg", fullNameArg)
        .add("name", name)
        .add("owner", owner)
        .toString();
  }
}
