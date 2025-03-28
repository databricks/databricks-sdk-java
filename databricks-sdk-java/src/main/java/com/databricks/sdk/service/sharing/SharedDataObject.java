// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SharedDataObject {
  /** The time when this data object is added to the share, in epoch milliseconds. */
  @JsonProperty("added_at")
  private Long addedAt;

  /** Username of the sharer. */
  @JsonProperty("added_by")
  private String addedBy;

  /** Whether to enable cdf or indicate if cdf is enabled on the shared object. */
  @JsonProperty("cdf_enabled")
  private Boolean cdfEnabled;

  /** A user-provided comment when adding the data object to the share. */
  @JsonProperty("comment")
  private String comment;

  /**
   * The content of the notebook file when the data object type is NOTEBOOK_FILE. This should be
   * base64 encoded. Required for adding a NOTEBOOK_FILE, optional for updating, ignored for other
   * types.
   */
  @JsonProperty("content")
  private String content;

  /** The type of the data object. */
  @JsonProperty("data_object_type")
  private SharedDataObjectDataObjectType dataObjectType;

  /**
   * Whether to enable or disable sharing of data history. If not specified, the default is
   * **DISABLED**.
   */
  @JsonProperty("history_data_sharing_status")
  private SharedDataObjectHistoryDataSharingStatus historyDataSharingStatus;

  /**
   * A fully qualified name that uniquely identifies a data object. For example,
   * a table's fully qualified name is in the format of
   * `<catalog>.<schema>.<table>`,
   */
  @JsonProperty("name")
  private String name;

  /** Array of partitions for the shared data. */
  @JsonProperty("partitions")
  private Collection<Partition> partitions;

  /**
   * A user-provided new name for the data object within the share. If this new
   * name is not provided, the object's original name will be used as the
   * `shared_as` name. The `shared_as` name must be unique within a share. For
   * tables, the new name must follow the format of `<schema>.<table>`.
   */
  @JsonProperty("shared_as")
  private String sharedAs;

  /**
   * The start version associated with the object. This allows data providers to control the lowest
   * object version that is accessible by clients. If specified, clients can query snapshots or
   * changes for versions >= start_version. If not specified, clients can only query starting from
   * the version of the object at the time it was added to the share.
   *
   * <p>NOTE: The start_version should be <= the `current` version of the object.
   */
  @JsonProperty("start_version")
  private Long startVersion;

  /** One of: **ACTIVE**, **PERMISSION_DENIED**. */
  @JsonProperty("status")
  private SharedDataObjectStatus status;

  /**
   * A user-provided new name for the shared object within the share. If this new name is not not
   * provided, the object's original name will be used as the `string_shared_as` name. The
   * `string_shared_as` name must be unique for objects of the same type within a Share. For
   * notebooks, the new name should be the new notebook file name.
   */
  @JsonProperty("string_shared_as")
  private String stringSharedAs;

  public SharedDataObject setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  public Long getAddedAt() {
    return addedAt;
  }

  public SharedDataObject setAddedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

  public String getAddedBy() {
    return addedBy;
  }

  public SharedDataObject setCdfEnabled(Boolean cdfEnabled) {
    this.cdfEnabled = cdfEnabled;
    return this;
  }

  public Boolean getCdfEnabled() {
    return cdfEnabled;
  }

  public SharedDataObject setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public SharedDataObject setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public SharedDataObject setDataObjectType(SharedDataObjectDataObjectType dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  public SharedDataObjectDataObjectType getDataObjectType() {
    return dataObjectType;
  }

  public SharedDataObject setHistoryDataSharingStatus(
      SharedDataObjectHistoryDataSharingStatus historyDataSharingStatus) {
    this.historyDataSharingStatus = historyDataSharingStatus;
    return this;
  }

  public SharedDataObjectHistoryDataSharingStatus getHistoryDataSharingStatus() {
    return historyDataSharingStatus;
  }

  public SharedDataObject setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SharedDataObject setPartitions(Collection<Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public Collection<Partition> getPartitions() {
    return partitions;
  }

  public SharedDataObject setSharedAs(String sharedAs) {
    this.sharedAs = sharedAs;
    return this;
  }

  public String getSharedAs() {
    return sharedAs;
  }

  public SharedDataObject setStartVersion(Long startVersion) {
    this.startVersion = startVersion;
    return this;
  }

  public Long getStartVersion() {
    return startVersion;
  }

  public SharedDataObject setStatus(SharedDataObjectStatus status) {
    this.status = status;
    return this;
  }

  public SharedDataObjectStatus getStatus() {
    return status;
  }

  public SharedDataObject setStringSharedAs(String stringSharedAs) {
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
    SharedDataObject that = (SharedDataObject) o;
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
    return new ToStringer(SharedDataObject.class)
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
