// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ExternalLocationInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExternalLocationInfo {
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

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setComment(String comment) {
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
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>credentialId</code>.</p>
   *
   * @param credentialId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialId() {
    return credentialId;
  }

  /**
   * <p>Setter for the field <code>credentialName</code>.</p>
   *
   * @param credentialName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setName(String name) {
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
   * <p>Setter for the field <code>owner</code>.</p>
   *
   * @param owner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Getter for the field <code>owner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwner() {
    return owner;
  }

  /**
   * <p>Setter for the field <code>readOnly</code>.</p>
   *
   * @param readOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>readOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  public ExternalLocationInfo setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLocationInfo that = (ExternalLocationInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(credentialId, that.credentialId)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(url, that.url);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        createdAt,
        createdBy,
        credentialId,
        credentialName,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        url);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExternalLocationInfo.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("credentialId", credentialId)
        .add("credentialName", credentialName)
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
