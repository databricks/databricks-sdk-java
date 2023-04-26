// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetMetastoreSummaryResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetMetastoreSummaryResponse {
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
  private GetMetastoreSummaryResponseDeltaSharingScope deltaSharingScope;

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

  /**
   * <p>Setter for the field <code>cloud</code>.</p>
   *
   * @param cloud a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * <p>Getter for the field <code>cloud</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCloud() {
    return cloud;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setCreatedAt(Long createdAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setCreatedBy(String createdBy) {
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
   * <p>Setter for the field <code>defaultDataAccessConfigId</code>.</p>
   *
   * @param defaultDataAccessConfigId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setDefaultDataAccessConfigId(
      String defaultDataAccessConfigId) {
    this.defaultDataAccessConfigId = defaultDataAccessConfigId;
    return this;
  }

  /**
   * <p>Getter for the field <code>defaultDataAccessConfigId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDefaultDataAccessConfigId() {
    return defaultDataAccessConfigId;
  }

  /**
   * <p>Setter for the field <code>deltaSharingOrganizationName</code>.</p>
   *
   * @param deltaSharingOrganizationName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setDeltaSharingOrganizationName(
      String deltaSharingOrganizationName) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setDeltaSharingRecipientTokenLifetimeInSeconds(
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
   * @param deltaSharingScope a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponseDeltaSharingScope} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setDeltaSharingScope(
      GetMetastoreSummaryResponseDeltaSharingScope deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  /**
   * <p>Getter for the field <code>deltaSharingScope</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponseDeltaSharingScope} object
   */
  public GetMetastoreSummaryResponseDeltaSharingScope getDeltaSharingScope() {
    return deltaSharingScope;
  }

  /**
   * <p>Setter for the field <code>globalMetastoreId</code>.</p>
   *
   * @param globalMetastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>globalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setOwner(String owner) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setPrivilegeModelVersion(String privilegeModelVersion) {
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
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setRegion(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>Getter for the field <code>region</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegion() {
    return region;
  }

  /**
   * <p>Setter for the field <code>storageRoot</code>.</p>
   *
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRoot</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRoot() {
    return storageRoot;
  }

  /**
   * <p>Setter for the field <code>storageRootCredentialId</code>.</p>
   *
   * @param storageRootCredentialId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setStorageRootCredentialId(String storageRootCredentialId) {
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

  /**
   * <p>Setter for the field <code>storageRootCredentialName</code>.</p>
   *
   * @param storageRootCredentialName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setStorageRootCredentialName(
      String storageRootCredentialName) {
    this.storageRootCredentialName = storageRootCredentialName;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRootCredentialName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRootCredentialName() {
    return storageRootCredentialName;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setUpdatedAt(Long updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse setUpdatedBy(String updatedBy) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetastoreSummaryResponse that = (GetMetastoreSummaryResponse) o;
    return Objects.equals(cloud, that.cloud)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(defaultDataAccessConfigId, that.defaultDataAccessConfigId)
        && Objects.equals(deltaSharingOrganizationName, that.deltaSharingOrganizationName)
        && Objects.equals(
            deltaSharingRecipientTokenLifetimeInSeconds,
            that.deltaSharingRecipientTokenLifetimeInSeconds)
        && Objects.equals(deltaSharingScope, that.deltaSharingScope)
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetMetastoreSummaryResponse.class)
        .add("cloud", cloud)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("defaultDataAccessConfigId", defaultDataAccessConfigId)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
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
