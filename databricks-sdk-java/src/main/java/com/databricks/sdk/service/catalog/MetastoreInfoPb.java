// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MetastoreInfoPb {
  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("default_data_access_config_id")
  private String defaultDataAccessConfigId;

  @JsonProperty("delta_sharing_organization_name")
  private String deltaSharingOrganizationName;

  @JsonProperty("delta_sharing_recipient_token_lifetime_in_seconds")
  private Long deltaSharingRecipientTokenLifetimeInSeconds;

  @JsonProperty("delta_sharing_scope")
  private DeltaSharingScopeEnum deltaSharingScope;

  @JsonProperty("external_access_enabled")
  private Boolean externalAccessEnabled;

  @JsonProperty("global_metastore_id")
  private String globalMetastoreId;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("privilege_model_version")
  private String privilegeModelVersion;

  @JsonProperty("region")
  private String region;

  @JsonProperty("storage_root")
  private String storageRoot;

  @JsonProperty("storage_root_credential_id")
  private String storageRootCredentialId;

  @JsonProperty("storage_root_credential_name")
  private String storageRootCredentialName;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  public MetastoreInfoPb setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public MetastoreInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public MetastoreInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public MetastoreInfoPb setDefaultDataAccessConfigId(String defaultDataAccessConfigId) {
    this.defaultDataAccessConfigId = defaultDataAccessConfigId;
    return this;
  }

  public String getDefaultDataAccessConfigId() {
    return defaultDataAccessConfigId;
  }

  public MetastoreInfoPb setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public MetastoreInfoPb setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public MetastoreInfoPb setDeltaSharingScope(DeltaSharingScopeEnum deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public DeltaSharingScopeEnum getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public MetastoreInfoPb setExternalAccessEnabled(Boolean externalAccessEnabled) {
    this.externalAccessEnabled = externalAccessEnabled;
    return this;
  }

  public Boolean getExternalAccessEnabled() {
    return externalAccessEnabled;
  }

  public MetastoreInfoPb setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public MetastoreInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public MetastoreInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MetastoreInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public MetastoreInfoPb setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public MetastoreInfoPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public MetastoreInfoPb setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public MetastoreInfoPb setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

  public MetastoreInfoPb setStorageRootCredentialName(String storageRootCredentialName) {
    this.storageRootCredentialName = storageRootCredentialName;
    return this;
  }

  public String getStorageRootCredentialName() {
    return storageRootCredentialName;
  }

  public MetastoreInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public MetastoreInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetastoreInfoPb that = (MetastoreInfoPb) o;
    return Objects.equals(cloud, that.cloud)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(defaultDataAccessConfigId, that.defaultDataAccessConfigId)
        && Objects.equals(deltaSharingOrganizationName, that.deltaSharingOrganizationName)
        && Objects.equals(
            deltaSharingRecipientTokenLifetimeInSeconds,
            that.deltaSharingRecipientTokenLifetimeInSeconds)
        && Objects.equals(deltaSharingScope, that.deltaSharingScope)
        && Objects.equals(externalAccessEnabled, that.externalAccessEnabled)
        && Objects.equals(globalMetastoreId, that.globalMetastoreId)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(privilegeModelVersion, that.privilegeModelVersion)
        && Objects.equals(region, that.region)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(storageRootCredentialId, that.storageRootCredentialId)
        && Objects.equals(storageRootCredentialName, that.storageRootCredentialName)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cloud,
        createdAt,
        createdBy,
        defaultDataAccessConfigId,
        deltaSharingOrganizationName,
        deltaSharingRecipientTokenLifetimeInSeconds,
        deltaSharingScope,
        externalAccessEnabled,
        globalMetastoreId,
        metastoreId,
        name,
        owner,
        privilegeModelVersion,
        region,
        storageRoot,
        storageRootCredentialId,
        storageRootCredentialName,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(MetastoreInfoPb.class)
        .add("cloud", cloud)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("defaultDataAccessConfigId", defaultDataAccessConfigId)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
        .add("externalAccessEnabled", externalAccessEnabled)
        .add("globalMetastoreId", globalMetastoreId)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("privilegeModelVersion", privilegeModelVersion)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .add("storageRootCredentialId", storageRootCredentialId)
        .add("storageRootCredentialName", storageRootCredentialName)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
