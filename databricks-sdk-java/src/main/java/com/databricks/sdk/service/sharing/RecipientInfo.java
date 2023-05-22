// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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
  private Object dataRecipientGlobalMetastoreId;

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
  private SecurablePropertiesKvPairs propertiesKvpairs;

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

  public RecipientInfo setActivated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  public Boolean getActivated() {
    return activated;
  }

  public RecipientInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  public RecipientInfo setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public RecipientInfo setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public RecipientInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public RecipientInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RecipientInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RecipientInfo setDataRecipientGlobalMetastoreId(Object dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public Object getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public RecipientInfo setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public RecipientInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public RecipientInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RecipientInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public RecipientInfo setPropertiesKvpairs(SecurablePropertiesKvPairs propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public SecurablePropertiesKvPairs getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  public RecipientInfo setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public RecipientInfo setSharingCode(String sharingCode) {
    this.sharingCode = sharingCode;
    return this;
  }

  public String getSharingCode() {
    return sharingCode;
  }

  public RecipientInfo setTokens(Collection<RecipientTokenInfo> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Collection<RecipientTokenInfo> getTokens() {
    return tokens;
  }

  public RecipientInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RecipientInfo setUpdatedBy(String updatedBy) {
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
