// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRegisteredModelRequest {
  /** The comment attached to the registered model */
  @JsonProperty("comment")
  private String comment;

  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** New name for the registered model. */
  @JsonProperty("new_name")
  private String newName;

  /** The identifier of the user who owns the registered model */
  @JsonProperty("owner")
  private String owner;

  public UpdateRegisteredModelRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateRegisteredModelRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateRegisteredModelRequest setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateRegisteredModelRequest setOwner(String owner) {
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
    UpdateRegisteredModelRequest that = (UpdateRegisteredModelRequest) o;
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
    return new ToStringer(UpdateRegisteredModelRequest.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("newName", newName)
        .add("owner", owner)
        .toString();
  }
}
