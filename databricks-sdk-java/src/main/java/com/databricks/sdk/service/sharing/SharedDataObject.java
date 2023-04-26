// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SharedDataObject class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /** A user-provided comment when adding the data object to the share. [Update:OPT] */
  @JsonProperty("comment")
  private String comment;

  /** The type of the data object. */
  @JsonProperty("data_object_type")
  private String dataObjectType;

  /**
   * A fully qualified name that uniquely identifies a data object.
   *
   * For example, a table's fully qualified name is in the format of
   * `<catalog>.<schema>.<table>`.
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
   * <p>Setter for the field <code>addedAt</code>.</p>
   *
   * @param addedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>addedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAddedAt() {
    return addedAt;
  }

  /**
   * <p>Setter for the field <code>addedBy</code>.</p>
   *
   * @param addedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setAddedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>addedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAddedBy() {
    return addedBy;
  }

  /**
   * <p>Setter for the field <code>cdfEnabled</code>.</p>
   *
   * @param cdfEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setCdfEnabled(Boolean cdfEnabled) {
    this.cdfEnabled = cdfEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>cdfEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCdfEnabled() {
    return cdfEnabled;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>dataObjectType</code>.</p>
   *
   * @param dataObjectType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setDataObjectType(String dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataObjectType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDataObjectType() {
    return dataObjectType;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>partitions</code>.</p>
   *
   * @param partitions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setPartitions(Collection<Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  /**
   * <p>Getter for the field <code>partitions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Partition> getPartitions() {
    return partitions;
  }

  /**
   * <p>Setter for the field <code>sharedAs</code>.</p>
   *
   * @param sharedAs a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setSharedAs(String sharedAs) {
    this.sharedAs = sharedAs;
    return this;
  }

  /**
   * <p>Getter for the field <code>sharedAs</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSharedAs() {
    return sharedAs;
  }

  /**
   * <p>Setter for the field <code>startVersion</code>.</p>
   *
   * @param startVersion a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setStartVersion(Long startVersion) {
    this.startVersion = startVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>startVersion</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartVersion() {
    return startVersion;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.sharing.SharedDataObjectStatus} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject setStatus(SharedDataObjectStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObjectStatus} object
   */
  public SharedDataObjectStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SharedDataObject that = (SharedDataObject) o;
    return Objects.equals(addedAt, that.addedAt)
        && Objects.equals(addedBy, that.addedBy)
        && Objects.equals(cdfEnabled, that.cdfEnabled)
        && Objects.equals(comment, that.comment)
        && Objects.equals(dataObjectType, that.dataObjectType)
        && Objects.equals(name, that.name)
        && Objects.equals(partitions, that.partitions)
        && Objects.equals(sharedAs, that.sharedAs)
        && Objects.equals(startVersion, that.startVersion)
        && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        addedAt,
        addedBy,
        cdfEnabled,
        comment,
        dataObjectType,
        name,
        partitions,
        sharedAs,
        startVersion,
        status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SharedDataObject.class)
        .add("addedAt", addedAt)
        .add("addedBy", addedBy)
        .add("cdfEnabled", cdfEnabled)
        .add("comment", comment)
        .add("dataObjectType", dataObjectType)
        .add("name", name)
        .add("partitions", partitions)
        .add("sharedAs", sharedAs)
        .add("startVersion", startVersion)
        .add("status", status)
        .toString();
  }
}
