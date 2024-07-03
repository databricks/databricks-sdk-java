// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalLocationInfo {
  /** The AWS access point to use when accesing s3 for this external location. */
  @JsonProperty("access_point")
  private String accessPoint;

  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  @JsonProperty("browse_only")
  private Boolean browseOnly;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this external location was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of external location creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Unique ID of the location's storage credential. */
  @JsonProperty("credential_id")
  private String credentialId;

  /** Name of the storage credential used with this location. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** Encryption options that apply to clients connecting to cloud storage. */
  @JsonProperty("encryption_details")
  private EncryptionDetails encryptionDetails;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Unique identifier of metastore hosting the external location. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of the external location. */
  @JsonProperty("name")
  private String name;

  /** The owner of the external location. */
  @JsonProperty("owner")
  private String owner;

  /** Indicates whether the external location is read-only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Time at which external location this was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified the external location. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** Path URL of the external location. */
  @JsonProperty("url")
  private String url;

  public ExternalLocationInfo setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public ExternalLocationInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public ExternalLocationInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ExternalLocationInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExternalLocationInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExternalLocationInfo setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public ExternalLocationInfo setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public ExternalLocationInfo setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public ExternalLocationInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public ExternalLocationInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ExternalLocationInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalLocationInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ExternalLocationInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ExternalLocationInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ExternalLocationInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ExternalLocationInfo setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLocationInfo that = (ExternalLocationInfo) o;
    return Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(credentialId, that.credentialId)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessPoint,
        browseOnly,
        comment,
        createdAt,
        createdBy,
        credentialId,
        credentialName,
        encryptionDetails,
        isolationMode,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLocationInfo.class)
        .add("accessPoint", accessPoint)
        .add("browseOnly", browseOnly)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("credentialId", credentialId)
        .add("credentialName", credentialName)
        .add("encryptionDetails", encryptionDetails)
        .add("isolationMode", isolationMode)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("url", url)
        .toString();
  }
}
