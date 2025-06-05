// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = ProviderInfo.ProviderInfoSerializer.class)
@JsonDeserialize(using = ProviderInfo.ProviderInfoDeserializer.class)
public class ProviderInfo {
  /** The delta sharing authentication type. */
  private AuthenticationType authenticationType;

  /**
   * Cloud vendor of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  private String cloud;

  /** Description about the provider. */
  private String comment;

  /** Time at which this Provider was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of Provider creator. */
  private String createdBy;

  /**
   * The global UC metastore id of the data provider. This field is only present when the
   * __authentication_type__ is **DATABRICKS**. The identifier is of format
   * __cloud__:__region__:__metastore-uuid__.
   */
  private String dataProviderGlobalMetastoreId;

  /**
   * UUID of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  private String metastoreId;

  /** The name of the Provider. */
  private String name;

  /** Username of Provider owner. */
  private String owner;

  /**
   * The recipient profile. This field is only present when the authentication_type is `TOKEN` or
   * `OAUTH_CLIENT_CREDENTIALS`.
   */
  private RecipientProfile recipientProfile;

  /**
   * This field is required when the __authentication_type__ is **TOKEN**,
   * **OAUTH_CLIENT_CREDENTIALS** or not provided.
   */
  private String recipientProfileStr;

  /**
   * Cloud region of the provider's UC metastore. This field is only present when the
   * __authentication_type__ is **DATABRICKS**.
   */
  private String region;

  /** Time at which this Provider was created, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified Provider. */
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

  ProviderInfoPb toPb() {
    ProviderInfoPb pb = new ProviderInfoPb();
    pb.setAuthenticationType(authenticationType);
    pb.setCloud(cloud);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setDataProviderGlobalMetastoreId(dataProviderGlobalMetastoreId);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setRecipientProfile(recipientProfile);
    pb.setRecipientProfileStr(recipientProfileStr);
    pb.setRegion(region);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static ProviderInfo fromPb(ProviderInfoPb pb) {
    ProviderInfo model = new ProviderInfo();
    model.setAuthenticationType(pb.getAuthenticationType());
    model.setCloud(pb.getCloud());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setDataProviderGlobalMetastoreId(pb.getDataProviderGlobalMetastoreId());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setRecipientProfile(pb.getRecipientProfile());
    model.setRecipientProfileStr(pb.getRecipientProfileStr());
    model.setRegion(pb.getRegion());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class ProviderInfoSerializer extends JsonSerializer<ProviderInfo> {
    @Override
    public void serialize(ProviderInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ProviderInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ProviderInfoDeserializer extends JsonDeserializer<ProviderInfo> {
    @Override
    public ProviderInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ProviderInfoPb pb = mapper.readValue(p, ProviderInfoPb.class);
      return ProviderInfo.fromPb(pb);
    }
  }
}
