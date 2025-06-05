// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CleanRoomPb {
  @JsonProperty("access_restricted")
  private CleanRoomAccessRestricted accessRestricted;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("local_collaborator_alias")
  private String localCollaboratorAlias;

  @JsonProperty("name")
  private String name;

  @JsonProperty("output_catalog")
  private CleanRoomOutputCatalog outputCatalog;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("remote_detailed_info")
  private CleanRoomRemoteDetail remoteDetailedInfo;

  @JsonProperty("status")
  private CleanRoomStatusEnum status;

  @JsonProperty("updated_at")
  private Long updatedAt;

  public CleanRoomPb setAccessRestricted(CleanRoomAccessRestricted accessRestricted) {
    this.accessRestricted = accessRestricted;
    return this;
  }

  public CleanRoomAccessRestricted getAccessRestricted() {
    return accessRestricted;
  }

  public CleanRoomPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CleanRoomPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CleanRoomPb setLocalCollaboratorAlias(String localCollaboratorAlias) {
    this.localCollaboratorAlias = localCollaboratorAlias;
    return this;
  }

  public String getLocalCollaboratorAlias() {
    return localCollaboratorAlias;
  }

  public CleanRoomPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomPb setOutputCatalog(CleanRoomOutputCatalog outputCatalog) {
    this.outputCatalog = outputCatalog;
    return this;
  }

  public CleanRoomOutputCatalog getOutputCatalog() {
    return outputCatalog;
  }

  public CleanRoomPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CleanRoomPb setRemoteDetailedInfo(CleanRoomRemoteDetail remoteDetailedInfo) {
    this.remoteDetailedInfo = remoteDetailedInfo;
    return this;
  }

  public CleanRoomRemoteDetail getRemoteDetailedInfo() {
    return remoteDetailedInfo;
  }

  public CleanRoomPb setStatus(CleanRoomStatusEnum status) {
    this.status = status;
    return this;
  }

  public CleanRoomStatusEnum getStatus() {
    return status;
  }

  public CleanRoomPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomPb that = (CleanRoomPb) o;
    return Objects.equals(accessRestricted, that.accessRestricted)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(localCollaboratorAlias, that.localCollaboratorAlias)
        && Objects.equals(name, that.name)
        && Objects.equals(outputCatalog, that.outputCatalog)
        && Objects.equals(owner, that.owner)
        && Objects.equals(remoteDetailedInfo, that.remoteDetailedInfo)
        && Objects.equals(status, that.status)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessRestricted,
        comment,
        createdAt,
        localCollaboratorAlias,
        name,
        outputCatalog,
        owner,
        remoteDetailedInfo,
        status,
        updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomPb.class)
        .add("accessRestricted", accessRestricted)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("localCollaboratorAlias", localCollaboratorAlias)
        .add("name", name)
        .add("outputCatalog", outputCatalog)
        .add("owner", owner)
        .add("remoteDetailedInfo", remoteDetailedInfo)
        .add("status", status)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
