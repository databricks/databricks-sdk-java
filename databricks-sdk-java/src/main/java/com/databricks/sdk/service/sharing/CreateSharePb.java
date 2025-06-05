// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateSharePb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("name")
  private String name;

  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateSharePb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateSharePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateSharePb setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSharePb that = (CreateSharePb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSharePb.class)
        .add("comment", comment)
        .add("name", name)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
