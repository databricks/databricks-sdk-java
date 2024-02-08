// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  /** New name for the metastore. */
  @JsonProperty("new_name")
  private String newName;

  /** The owner of the metastore. */
  @JsonProperty("owner")
  private String owner;

  /** Privilege model version of the metastore, of the form `major.minor` (e.g., `1.0`). */
  @JsonProperty("privilege_model_version")
  private String privilegeModelVersion;

  /** UUID of storage credential to access the metastore storage_root. */
  @JsonProperty("storage_root_credential_id")
  private String storageRootCredentialId;

  public UpdateMetastore setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public UpdateMetastore setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public UpdateMetastore setDeltaSharingScope(UpdateMetastoreDeltaSharingScope deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public UpdateMetastoreDeltaSharingScope getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public UpdateMetastore setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateMetastore setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateMetastore setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateMetastore setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public UpdateMetastore setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

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
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(privilegeModelVersion, that.privilegeModelVersion)
        && Objects.equals(storageRootCredentialId, that.storageRootCredentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSharingOrganizationName,
        deltaSharingRecipientTokenLifetimeInSeconds,
        deltaSharingScope,
        id,
        newName,
        owner,
        privilegeModelVersion,
        storageRootCredentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMetastore.class)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
        .add("id", id)
        .add("newName", newName)
        .add("owner", owner)
        .add("privilegeModelVersion", privilegeModelVersion)
        .add("storageRootCredentialId", storageRootCredentialId)
        .toString();
  }
}
