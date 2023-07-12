// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomInfo {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this clean room was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of clean room creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Catalog aliases shared by the current collaborator with asset details. */
  @JsonProperty("local_catalogs")
  private Collection<CleanRoomCatalog> localCatalogs;

  /** Name of the clean room. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of clean room. */
  @JsonProperty("owner")
  private String owner;

  /** Central clean room details. */
  @JsonProperty("remote_detailed_info")
  private CentralCleanRoomInfo remoteDetailedInfo;

  /** Time at which this clean room was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of clean room updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public CleanRoomInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CleanRoomInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CleanRoomInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public CleanRoomInfo setLocalCatalogs(Collection<CleanRoomCatalog> localCatalogs) {
    this.localCatalogs = localCatalogs;
    return this;
  }

  public Collection<CleanRoomCatalog> getLocalCatalogs() {
    return localCatalogs;
  }

  public CleanRoomInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CleanRoomInfo setRemoteDetailedInfo(CentralCleanRoomInfo remoteDetailedInfo) {
    this.remoteDetailedInfo = remoteDetailedInfo;
    return this;
  }

  public CentralCleanRoomInfo getRemoteDetailedInfo() {
    return remoteDetailedInfo;
  }

  public CleanRoomInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public CleanRoomInfo setUpdatedBy(String updatedBy) {
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
    CleanRoomInfo that = (CleanRoomInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(localCatalogs, that.localCatalogs)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(remoteDetailedInfo, that.remoteDetailedInfo)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        createdAt,
        createdBy,
        localCatalogs,
        name,
        owner,
        remoteDetailedInfo,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomInfo.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("localCatalogs", localCatalogs)
        .add("name", name)
        .add("owner", owner)
        .add("remoteDetailedInfo", remoteDetailedInfo)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
