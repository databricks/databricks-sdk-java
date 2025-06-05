// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRegisteredModelRequestPb {
  @JsonProperty("comment")
  private String comment;

  @JsonIgnore private String fullName;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("owner")
  private String owner;

  public UpdateRegisteredModelRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateRegisteredModelRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateRegisteredModelRequestPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateRegisteredModelRequestPb setOwner(String owner) {
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
    UpdateRegisteredModelRequestPb that = (UpdateRegisteredModelRequestPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullName, newName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRegisteredModelRequestPb.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("newName", newName)
        .add("owner", owner)
        .toString();
  }
}
