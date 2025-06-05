// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateProviderPb {
  @JsonProperty("comment")
  private String comment;

  @JsonIgnore private String name;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("recipient_profile_str")
  private String recipientProfileStr;

  public UpdateProviderPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateProviderPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateProviderPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateProviderPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateProviderPb setRecipientProfileStr(String recipientProfileStr) {
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
    UpdateProviderPb that = (UpdateProviderPb) o;
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
    return new ToStringer(UpdateProviderPb.class)
        .add("comment", comment)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }
}
