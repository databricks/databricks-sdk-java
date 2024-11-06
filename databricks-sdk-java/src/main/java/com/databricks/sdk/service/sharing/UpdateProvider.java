// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProvider {
  /** Description about the provider. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the provider. */
  @JsonIgnore private String name;

  /** New name for the provider. */
  @JsonProperty("new_name")
  private String newName;

  /** Username of Provider owner. */
  @JsonProperty("owner")
  private String owner;

  /** This field is required when the __authentication_type__ is **TOKEN** or not provided. */
  @JsonProperty("recipient_profile_str")
  private String recipientProfileStr;

  public UpdateProvider setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateProvider setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateProvider setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateProvider setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateProvider setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProvider that = (UpdateProvider) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, newName, owner, recipientProfileStr);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProvider.class)
        .add("comment", comment)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }
}
