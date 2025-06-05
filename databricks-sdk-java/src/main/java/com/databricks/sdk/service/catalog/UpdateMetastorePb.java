// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateMetastorePb {
  @JsonProperty("delta_sharing_organization_name")
  private String deltaSharingOrganizationName;

  @JsonProperty("delta_sharing_recipient_token_lifetime_in_seconds")
  private Long deltaSharingRecipientTokenLifetimeInSeconds;

  @JsonProperty("delta_sharing_scope")
  private DeltaSharingScopeEnum deltaSharingScope;

  @JsonIgnore private String id;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("privilege_model_version")
  private String privilegeModelVersion;

  @JsonProperty("storage_root_credential_id")
  private String storageRootCredentialId;

  public UpdateMetastorePb setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public UpdateMetastorePb setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public UpdateMetastorePb setDeltaSharingScope(DeltaSharingScopeEnum deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public DeltaSharingScopeEnum getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public UpdateMetastorePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateMetastorePb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateMetastorePb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateMetastorePb setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public UpdateMetastorePb setStorageRootCredentialId(String storageRootCredentialId) {
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
    UpdateMetastorePb that = (UpdateMetastorePb) o;
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
    return new ToStringer(UpdateMetastorePb.class)
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
