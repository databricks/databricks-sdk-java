// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ProviderInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
   * <cloud>:<region>:<metastore-uuid>.
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

  /** The recipient profile. This field is only present when the authentication_type is `TOKEN`. */
  @JsonProperty("recipient_profile")
  private RecipientProfile recipientProfile;

  /** This field is only present when the authentication_type is `TOKEN` or not provided. */
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

  /** Username of user who last modified Share. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * <p>Setter for the field <code>authenticationType</code>.</p>
   *
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * <p>Getter for the field <code>authenticationType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   */
  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  /**
   * <p>Setter for the field <code>cloud</code>.</p>
   *
   * @param cloud a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setCloud(String cloud) {
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
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setCreatedAt(Long createdAt) {
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
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setCreatedBy(String createdBy) {
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
   * <p>Setter for the field <code>dataProviderGlobalMetastoreId</code>.</p>
   *
   * @param dataProviderGlobalMetastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setDataProviderGlobalMetastoreId(String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataProviderGlobalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setOwner(String owner) {
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
   * <p>Setter for the field <code>recipientProfile</code>.</p>
   *
   * @param recipientProfile a {@link com.databricks.sdk.service.sharing.RecipientProfile} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setRecipientProfile(RecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
    return this;
  }

  /**
   * <p>Getter for the field <code>recipientProfile</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.RecipientProfile} object
   */
  public RecipientProfile getRecipientProfile() {
    return recipientProfile;
  }

  /**
   * <p>Setter for the field <code>recipientProfileStr</code>.</p>
   *
   * @param recipientProfileStr a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  /**
   * <p>Getter for the field <code>recipientProfileStr</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  /**
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setRegion(String region) {
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
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setUpdatedAt(Long updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo setUpdatedBy(String updatedBy) {
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
