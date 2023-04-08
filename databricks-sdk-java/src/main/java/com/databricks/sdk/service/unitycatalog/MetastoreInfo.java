// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetastoreInfo {
  /** Cloud vendor of the metastore home shard (e.g., `aws`, `azure`, `gcp`). */
  @JsonProperty("cloud")
  private String cloud;

  /** Time at which this metastore was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of metastore creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Unique identifier of the metastore's (Default) Data Access Configuration. */
  @JsonProperty("default_data_access_config_id")
  private String defaultDataAccessConfigId;

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
  private MetastoreInfoDeltaSharingScope deltaSharingScope;

  /**
   * Globally unique metastore ID across clouds and regions, of the form
   * `cloud:region:metastore_id`.
   */
  @JsonProperty("global_metastore_id")
  private String globalMetastoreId;

  /** Unique identifier of metastore. */
  @JsonProperty("metastore_id")
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

  /** Cloud region which the metastore serves (e.g., `us-west-2`, `westus`). */
  @JsonProperty("region")
  private String region;

  /** The storage root URL for metastore */
  @JsonProperty("storage_root")
  private String storageRoot;

  /** UUID of storage credential to access the metastore storage_root. */
  @JsonProperty("storage_root_credential_id")
  private String storageRootCredentialId;

  /** Name of the storage credential to access the metastore storage_root. */
  @JsonProperty("storage_root_credential_name")
  private String storageRootCredentialName;

  /** Time at which the metastore was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified the metastore. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public MetastoreInfo setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public MetastoreInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public MetastoreInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public MetastoreInfo setDefaultDataAccessConfigId(String defaultDataAccessConfigId) {
    this.defaultDataAccessConfigId = defaultDataAccessConfigId;
    return this;
  }

  public String getDefaultDataAccessConfigId() {
    return defaultDataAccessConfigId;
  }

  public MetastoreInfo setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public MetastoreInfo setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public MetastoreInfo setDeltaSharingScope(MetastoreInfoDeltaSharingScope deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public MetastoreInfoDeltaSharingScope getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public MetastoreInfo setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public MetastoreInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public MetastoreInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MetastoreInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public MetastoreInfo setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public MetastoreInfo setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public MetastoreInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public MetastoreInfo setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

  public MetastoreInfo setStorageRootCredentialName(String storageRootCredentialName) {
    this.storageRootCredentialName = storageRootCredentialName;
    return this;
  }

  public String getStorageRootCredentialName() {
    return storageRootCredentialName;
  }

  public MetastoreInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public MetastoreInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }
}
