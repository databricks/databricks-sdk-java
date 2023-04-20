// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ShareInfo {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this share was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of share creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  /** A list of shared data objects within the share. */
  @JsonProperty("objects")
  private Collection<SharedDataObject> objects;

  /** Username of current owner of share. */
  @JsonProperty("owner")
  private String owner;

  /** Time at which this share was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of share updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public ShareInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ShareInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ShareInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ShareInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ShareInfo setObjects(Collection<SharedDataObject> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<SharedDataObject> getObjects() {
    return objects;
  }

  public ShareInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ShareInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ShareInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareInfo that = (ShareInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(name, that.name)
        && Objects.equals(objects, that.objects)
        && Objects.equals(owner, that.owner)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdAt, createdBy, name, objects, owner, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareInfo.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("name", name)
        .add("objects", objects)
        .add("owner", owner)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
