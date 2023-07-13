// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateCleanRoom {
  /** Array of shared data object updates. */
  @JsonProperty("catalog_updates")
  private Collection<CleanRoomCatalogUpdate> catalogUpdates;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the clean room. */
  @JsonProperty("name")
  private String name;

  /** The name of the clean room. */
  private String nameArg;

  /** Username of current owner of clean room. */
  @JsonProperty("owner")
  private String owner;

  public UpdateCleanRoom setCatalogUpdates(Collection<CleanRoomCatalogUpdate> catalogUpdates) {
    this.catalogUpdates = catalogUpdates;
    return this;
  }

  public Collection<CleanRoomCatalogUpdate> getCatalogUpdates() {
    return catalogUpdates;
  }

  public UpdateCleanRoom setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCleanRoom setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCleanRoom setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  public UpdateCleanRoom setOwner(String owner) {
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
    UpdateCleanRoom that = (UpdateCleanRoom) o;
    return Objects.equals(catalogUpdates, that.catalogUpdates)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(nameArg, that.nameArg)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogUpdates, comment, name, nameArg, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoom.class)
        .add("catalogUpdates", catalogUpdates)
        .add("comment", comment)
        .add("name", name)
        .add("nameArg", nameArg)
        .add("owner", owner)
        .toString();
  }
}
