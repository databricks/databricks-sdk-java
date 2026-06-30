// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A secret stored in Unity Catalog. Secrets are three-level namespace objects
 * (catalog.schema.secret) that securely store sensitive credential data such as passwords, tokens,
 * and keys.
 */
@Generated
public class Secret {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the **BROWSE** privilege when **include_browse** is enabled in the request.
   */
  @JsonProperty("browse_only")
  private Boolean browseOnly;

  /** The name of the catalog where the schema and the secret reside. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description of the secret. */
  @JsonProperty("comment")
  private String comment;

  /** The time at which this secret was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The principal that created the secret. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * The effective owner of the secret, which may differ from the directly-set **owner** due to
   * inheritance.
   */
  @JsonProperty("effective_owner")
  private String effectiveOwner;

  /**
   * The secret value. Only populated in responses when you have the **READ_SECRET** privilege and
   * **include_value** is set to true in the request. The maximum size is 60 KiB.
   */
  @JsonProperty("effective_value")
  private String effectiveValue;

  /**
   * User-provided expiration time of the secret. This field indicates when the secret should no
   * longer be used and may be displayed as a warning in the UI. It is purely informational and does
   * not trigger any automatic actions or affect the secret's lifecycle.
   */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /** */
  @JsonProperty("external_secret_id")
  private String externalSecretId;

  /**
   * The three-level (fully qualified) name of the secret, in the form of
   * **catalog_name.schema_name.secret_name**.
   */
  @JsonProperty("full_name")
  private String fullName;

  /** Unique identifier of the metastore hosting the secret. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The name of the secret, relative to its parent schema. */
  @JsonProperty("name")
  private String name;

  /**
   * The owner of the secret. Defaults to the creating principal on creation. Can be updated to
   * transfer ownership of the secret to another principal.
   */
  @JsonProperty("owner")
  private String owner;

  /** The name of the schema where the secret resides. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The time at which this secret was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** The principal that last updated the secret. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * The secret value to store. This field is input-only and is not returned in responses — use the
   * **effective_value** field (via GetSecret with **include_value** set to true) to read the secret
   * value. The maximum size is 60 KiB (pre-encryption). Accepted content includes passwords,
   * tokens, keys, and other sensitive credential data.
   */
  @JsonProperty("value")
  private String value;

  public Secret setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public Secret setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public Secret setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Secret setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Secret setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Secret setEffectiveOwner(String effectiveOwner) {
    this.effectiveOwner = effectiveOwner;
    return this;
  }

  public String getEffectiveOwner() {
    return effectiveOwner;
  }

  public Secret setEffectiveValue(String effectiveValue) {
    this.effectiveValue = effectiveValue;
    return this;
  }

  public String getEffectiveValue() {
    return effectiveValue;
  }

  public Secret setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public Secret setExternalSecretId(String externalSecretId) {
    this.externalSecretId = externalSecretId;
    return this;
  }

  public String getExternalSecretId() {
    return externalSecretId;
  }

  public Secret setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public Secret setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public Secret setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Secret setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public Secret setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public Secret setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Secret setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public Secret setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Secret that = (Secret) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveOwner, that.effectiveOwner)
        && Objects.equals(effectiveValue, that.effectiveValue)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(externalSecretId, that.externalSecretId)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogName,
        comment,
        createTime,
        createdBy,
        effectiveOwner,
        effectiveValue,
        expireTime,
        externalSecretId,
        fullName,
        metastoreId,
        name,
        owner,
        schemaName,
        updateTime,
        updatedBy,
        value);
  }

  @Override
  public String toString() {
    return new ToStringer(Secret.class)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("effectiveOwner", effectiveOwner)
        .add("effectiveValue", effectiveValue)
        .add("expireTime", expireTime)
        .add("externalSecretId", externalSecretId)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("schemaName", schemaName)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("value", value)
        .toString();
  }
}
