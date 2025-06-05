// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RecipientInfoPb {
  @JsonProperty("activated")
  private Boolean activated;

  @JsonProperty("activation_url")
  private String activationUrl;

  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("data_recipient_global_metastore_id")
  private String dataRecipientGlobalMetastoreId;

  @JsonProperty("expiration_time")
  private Long expirationTime;

  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("properties_kvpairs")
  private SecurablePropertiesKvPairs propertiesKvpairs;

  @JsonProperty("region")
  private String region;

  @JsonProperty("sharing_code")
  private String sharingCode;

  @JsonProperty("tokens")
  private Collection<RecipientTokenInfo> tokens;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  public RecipientInfoPb setActivated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  public Boolean getActivated() {
    return activated;
  }

  public RecipientInfoPb setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  public RecipientInfoPb setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public RecipientInfoPb setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public RecipientInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public RecipientInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RecipientInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RecipientInfoPb setDataRecipientGlobalMetastoreId(String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public RecipientInfoPb setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public RecipientInfoPb setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public RecipientInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public RecipientInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RecipientInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public RecipientInfoPb setPropertiesKvpairs(SecurablePropertiesKvPairs propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public SecurablePropertiesKvPairs getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  public RecipientInfoPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public RecipientInfoPb setSharingCode(String sharingCode) {
    this.sharingCode = sharingCode;
    return this;
  }

  public String getSharingCode() {
    return sharingCode;
  }

  public RecipientInfoPb setTokens(Collection<RecipientTokenInfo> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Collection<RecipientTokenInfo> getTokens() {
    return tokens;
  }

  public RecipientInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RecipientInfoPb setUpdatedBy(String updatedBy) {
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
    RecipientInfoPb that = (RecipientInfoPb) o;
    return Objects.equals(activated, that.activated)
        && Objects.equals(activationUrl, that.activationUrl)
        && Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(expirationTime, that.expirationTime)
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
        expirationTime,
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
    return new ToStringer(RecipientInfoPb.class)
        .add("activated", activated)
        .add("activationUrl", activationUrl)
        .add("authenticationType", authenticationType)
        .add("cloud", cloud)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("expirationTime", expirationTime)
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
