// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateMetastore class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateMetastore {
  /**
   * The organization name of a Delta Sharing entity, to be used in Databricks-to-Databricks Delta
   * Sharing as the official name.
   */
  @JsonProperty("delta_sharing_organization_name")
  private String deltaSharingOrganizationName;

  /** The lifetime of delta sharing recipient token in seconds. */
  @JsonProperty("delta_sharing_recipient_token_lifetime_in_seconds")
  private Long deltaSharingRecipientTokenLifetimeInSeconds;

  /** The scope of Delta Sharing enabled for the metastore. */
  @JsonProperty("delta_sharing_scope")
  private UpdateMetastoreDeltaSharingScope deltaSharingScope;

  /** Unique ID of the metastore. */
  private String id;

  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /** The user-specified name of the metastore. */
  @JsonProperty("name")
  private String name;

  /** The owner of the metastore. */
  @JsonProperty("owner")
  private String owner;

  /** Privilege model version of the metastore, of the form `major.minor` (e.g., `1.0`). */
  @JsonProperty("privilege_model_version")
  private String privilegeModelVersion;

  /** UUID of storage credential to access the metastore storage_root. */
  @JsonProperty("storage_root_credential_id")
  private String storageRootCredentialId;

  /**
   * <p>Setter for the field <code>deltaSharingOrganizationName</code>.</p>
   *
   * @param deltaSharingOrganizationName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  /**
   * <p>Getter for the field <code>deltaSharingOrganizationName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  /**
   * <p>Setter for the field <code>deltaSharingRecipientTokenLifetimeInSeconds</code>.</p>
   *
   * @param deltaSharingRecipientTokenLifetimeInSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>deltaSharingRecipientTokenLifetimeInSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  /**
   * <p>Setter for the field <code>deltaSharingScope</code>.</p>
   *
   * @param deltaSharingScope a {@link com.databricks.sdk.service.catalog.UpdateMetastoreDeltaSharingScope} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setDeltaSharingScope(UpdateMetastoreDeltaSharingScope deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  /**
   * <p>Getter for the field <code>deltaSharingScope</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastoreDeltaSharingScope} object
   */
  public UpdateMetastoreDeltaSharingScope getDeltaSharingScope() {
    return deltaSharingScope;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setOwner(String owner) {
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
   * <p>Setter for the field <code>privilegeModelVersion</code>.</p>
   *
   * @param privilegeModelVersion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>privilegeModelVersion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  /**
   * <p>Setter for the field <code>storageRootCredentialId</code>.</p>
   *
   * @param storageRootCredentialId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   */
  public UpdateMetastore setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRootCredentialId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMetastore that = (UpdateMetastore) o;
    return Objects.equals(deltaSharingOrganizationName, that.deltaSharingOrganizationName)
        && Objects.equals(
            deltaSharingRecipientTokenLifetimeInSeconds,
            that.deltaSharingRecipientTokenLifetimeInSeconds)
        && Objects.equals(deltaSharingScope, that.deltaSharingScope)
        && Objects.equals(id, that.id)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(privilegeModelVersion, that.privilegeModelVersion)
        && Objects.equals(storageRootCredentialId, that.storageRootCredentialId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSharingOrganizationName,
        deltaSharingRecipientTokenLifetimeInSeconds,
        deltaSharingScope,
        id,
        metastoreId,
        name,
        owner,
        privilegeModelVersion,
        storageRootCredentialId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateMetastore.class)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
        .add("id", id)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("privilegeModelVersion", privilegeModelVersion)
        .add("storageRootCredentialId", storageRootCredentialId)
        .toString();
  }
}
