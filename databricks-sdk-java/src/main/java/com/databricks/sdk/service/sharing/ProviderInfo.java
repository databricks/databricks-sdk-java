// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ProviderInfo {
  /** The delta sharing authentication type. */
  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  /**
   * Cloud vendor of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("cloud")
  private String cloud;

  /** Description about the provider. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this Provider was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of Provider creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * The global UC metastore id of the data provider. This field is only present when the
   * __authentication_type__ is **DATABRICKS**. The identifier is of format
   * __cloud__:__region__:__metastore-uuid__.
   */
  @JsonProperty("data_provider_global_metastore_id")
  private String dataProviderGlobalMetastoreId;

  /**
   * UUID of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The name of the Provider. */
  @JsonProperty("name")
  private String name;

  /** Username of Provider owner. */
  @JsonProperty("owner")
  private String owner;

  /**
   * The recipient profile. This field is only present when the authentication_type is `TOKEN` or
   * `OAUTH_CLIENT_CREDENTIALS`.
   */
  @JsonProperty("recipient_profile")
  private RecipientProfile recipientProfile;

  /**
   * This field is required when the __authentication_type__ is **TOKEN**,
   * **OAUTH_CLIENT_CREDENTIALS** or not provided.
   */
  @JsonProperty("recipient_profile_str")
  private String recipientProfileStr;

  /**
   * Cloud region of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("region")
  private String region;

  /** Time at which this Provider was created, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified Provider. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public ProviderInfo setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public ProviderInfo setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public ProviderInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ProviderInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ProviderInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ProviderInfo setDataProviderGlobalMetastoreId(String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  public ProviderInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ProviderInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ProviderInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ProviderInfo setRecipientProfile(RecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
    return this;
  }

  public RecipientProfile getRecipientProfile() {
    return recipientProfile;
  }

  public ProviderInfo setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  public ProviderInfo setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public ProviderInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ProviderInfo setUpdatedBy(String updatedBy) {
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
    ProviderInfo that = (ProviderInfo) o;
    return Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataProviderGlobalMetastoreId, that.dataProviderGlobalMetastoreId)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(recipientProfile, that.recipientProfile)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr)
        && Objects.equals(region, that.region)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authenticationType,
        cloud,
        comment,
        createdAt,
        createdBy,
        dataProviderGlobalMetastoreId,
        metastoreId,
        name,
        owner,
        recipientProfile,
        recipientProfileStr,
        region,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ProviderInfo.class)
        .add("authenticationType", authenticationType)
        .add("cloud", cloud)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("recipientProfile", recipientProfile)
        .add("recipientProfileStr", recipientProfileStr)
        .add("region", region)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
