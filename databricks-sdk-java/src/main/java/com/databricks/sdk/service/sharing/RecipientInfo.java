// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RecipientInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RecipientInfo {
  /**
   * A boolean status field showing whether the Recipient's activation URL has been exercised or
   * not.
   */
  @JsonProperty("activated")
  private Boolean activated;

  /**
   * Full activation url to retrieve the access token. It will be empty if the token is already
   * retrieved.
   */
  @JsonProperty("activation_url")
  private String activationUrl;

  /** The delta sharing authentication type. */
  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  /**
   * Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**`.
   */
  @JsonProperty("cloud")
  private String cloud;

  /** Description about the recipient. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this recipient was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of recipient creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * The global Unity Catalog metastore id provided by the data recipient.
   *
   * <p>This field is only present when the __authentication_type__ is **DATABRICKS**.
   *
   * <p>The identifier is of format __cloud__:__region__:__metastore-uuid__.
   */
  @JsonProperty("data_recipient_global_metastore_id")
  private Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId;

  /** IP Access List */
  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  /**
   * Unique identifier of recipient's Unity Catalog metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**
   */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of Recipient. */
  @JsonProperty("name")
  private String name;

  /** Username of the recipient owner. */
  @JsonProperty("owner")
  private String owner;

  /** Recipient properties as map of string key-value pairs. */
  @JsonProperty("properties_kvpairs")
  private Object /* MISSING TYPE */ propertiesKvpairs;

  /**
   * Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("region")
  private String region;

  /**
   * The one-time sharing code provided by the data recipient. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("sharing_code")
  private String sharingCode;

  /** This field is only present when the __authentication_type__ is **TOKEN**. */
  @JsonProperty("tokens")
  private Collection<RecipientTokenInfo> tokens;

  /** Time at which the recipient was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of recipient updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * <p>Setter for the field <code>activated</code>.</p>
   *
   * @param activated a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setActivated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  /**
   * <p>Getter for the field <code>activated</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getActivated() {
    return activated;
  }

  /**
   * <p>Setter for the field <code>activationUrl</code>.</p>
   *
   * @param activationUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>activationUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getActivationUrl() {
    return activationUrl;
  }

  /**
   * <p>Setter for the field <code>authenticationType</code>.</p>
   *
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setAuthenticationType(AuthenticationType authenticationType) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setCloud(String cloud) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setCreatedAt(Long createdAt) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setCreatedBy(String createdBy) {
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
   * <p>Setter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @param dataRecipientGlobalMetastoreId a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setDataRecipientGlobalMetastoreId(
      Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  /**
   * <p>Setter for the field <code>ipAccessList</code>.</p>
   *
   * @param ipAccessList a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessList</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   */
  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setOwner(String owner) {
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
   * <p>Setter for the field <code>propertiesKvpairs</code>.</p>
   *
   * @param propertiesKvpairs a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setPropertiesKvpairs(Object /* MISSING TYPE */ propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  /**
   * <p>Getter for the field <code>propertiesKvpairs</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  /**
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setRegion(String region) {
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
   * <p>Setter for the field <code>sharingCode</code>.</p>
   *
   * @param sharingCode a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setSharingCode(String sharingCode) {
    this.sharingCode = sharingCode;
    return this;
  }

  /**
   * <p>Getter for the field <code>sharingCode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSharingCode() {
    return sharingCode;
  }

  /**
   * <p>Setter for the field <code>tokens</code>.</p>
   *
   * @param tokens a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setTokens(Collection<RecipientTokenInfo> tokens) {
    this.tokens = tokens;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokens</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RecipientTokenInfo> getTokens() {
    return tokens;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setUpdatedAt(Long updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo setUpdatedBy(String updatedBy) {
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
    RecipientInfo that = (RecipientInfo) o;
    return Objects.equals(activated, that.activated)
        && Objects.equals(activationUrl, that.activationUrl)
        && Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(ipAccessList, that.ipAccessList)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs)
        && Objects.equals(region, that.region)
        && Objects.equals(sharingCode, that.sharingCode)
        && Objects.equals(tokens, that.tokens)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        activated,
        activationUrl,
        authenticationType,
        cloud,
        comment,
        createdAt,
        createdBy,
        dataRecipientGlobalMetastoreId,
        ipAccessList,
        metastoreId,
        name,
        owner,
        propertiesKvpairs,
        region,
        sharingCode,
        tokens,
        updatedAt,
        updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RecipientInfo.class)
        .add("activated", activated)
        .add("activationUrl", activationUrl)
        .add("authenticationType", authenticationType)
        .add("cloud", cloud)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("ipAccessList", ipAccessList)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .add("region", region)
        .add("sharingCode", sharingCode)
        .add("tokens", tokens)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
