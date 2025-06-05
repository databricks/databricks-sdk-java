// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SharedDataObjectPb {
  @JsonProperty("added_at")
  private Long addedAt;

  @JsonProperty("added_by")
  private String addedBy;

  @JsonProperty("cdf_enabled")
  private Boolean cdfEnabled;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("content")
  private String content;

  @JsonProperty("data_object_type")
  private SharedDataObjectDataObjectType dataObjectType;

  @JsonProperty("history_data_sharing_status")
  private SharedDataObjectHistoryDataSharingStatus historyDataSharingStatus;

  @JsonProperty("name")
  private String name;

  @JsonProperty("partitions")
  private Collection<Partition> partitions;

  @JsonProperty("shared_as")
  private String sharedAs;

  @JsonProperty("start_version")
  private Long startVersion;

  @JsonProperty("status")
  private SharedDataObjectStatus status;

  @JsonProperty("string_shared_as")
  private String stringSharedAs;

  public SharedDataObjectPb setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  public Long getAddedAt() {
    return addedAt;
  }

  public SharedDataObjectPb setAddedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

  public String getAddedBy() {
    return addedBy;
  }

  public SharedDataObjectPb setCdfEnabled(Boolean cdfEnabled) {
    this.cdfEnabled = cdfEnabled;
    return this;
  }

  public Boolean getCdfEnabled() {
    return cdfEnabled;
  }

  public SharedDataObjectPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public SharedDataObjectPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public SharedDataObjectPb setDataObjectType(SharedDataObjectDataObjectType dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  public SharedDataObjectDataObjectType getDataObjectType() {
    return dataObjectType;
  }

  public SharedDataObjectPb setHistoryDataSharingStatus(
      SharedDataObjectHistoryDataSharingStatus historyDataSharingStatus) {
    this.historyDataSharingStatus = historyDataSharingStatus;
    return this;
  }

  public SharedDataObjectHistoryDataSharingStatus getHistoryDataSharingStatus() {
    return historyDataSharingStatus;
  }

  public SharedDataObjectPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SharedDataObjectPb setPartitions(Collection<Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public Collection<Partition> getPartitions() {
    return partitions;
  }

  public SharedDataObjectPb setSharedAs(String sharedAs) {
    this.sharedAs = sharedAs;
    return this;
  }

  public String getSharedAs() {
    return sharedAs;
  }

  public SharedDataObjectPb setStartVersion(Long startVersion) {
    this.startVersion = startVersion;
    return this;
  }

  public Long getStartVersion() {
    return startVersion;
  }

  public SharedDataObjectPb setStatus(SharedDataObjectStatus status) {
    this.status = status;
    return this;
  }

  public SharedDataObjectStatus getStatus() {
    return status;
  }

  public SharedDataObjectPb setStringSharedAs(String stringSharedAs) {
    this.stringSharedAs = stringSharedAs;
    return this;
  }

  public String getStringSharedAs() {
    return stringSharedAs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SharedDataObjectPb that = (SharedDataObjectPb) o;
    return Objects.equals(addedAt, that.addedAt)
        && Objects.equals(addedBy, that.addedBy)
        && Objects.equals(cdfEnabled, that.cdfEnabled)
        && Objects.equals(comment, that.comment)
        && Objects.equals(content, that.content)
        && Objects.equals(dataObjectType, that.dataObjectType)
        && Objects.equals(historyDataSharingStatus, that.historyDataSharingStatus)
        && Objects.equals(name, that.name)
        && Objects.equals(partitions, that.partitions)
        && Objects.equals(sharedAs, that.sharedAs)
        && Objects.equals(startVersion, that.startVersion)
        && Objects.equals(status, that.status)
        && Objects.equals(stringSharedAs, that.stringSharedAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addedAt,
        addedBy,
        cdfEnabled,
        comment,
        content,
        dataObjectType,
        historyDataSharingStatus,
        name,
        partitions,
        sharedAs,
        startVersion,
        status,
        stringSharedAs);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectPb.class)
        .add("addedAt", addedAt)
        .add("addedBy", addedBy)
        .add("cdfEnabled", cdfEnabled)
        .add("comment", comment)
        .add("content", content)
        .add("dataObjectType", dataObjectType)
        .add("historyDataSharingStatus", historyDataSharingStatus)
        .add("name", name)
        .add("partitions", partitions)
        .add("sharedAs", sharedAs)
        .add("startVersion", startVersion)
        .add("status", status)
        .add("stringSharedAs", stringSharedAs)
        .toString();
  }
}
