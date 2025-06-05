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
@JsonSerialize(using = RecipientTokenInfo.RecipientTokenInfoSerializer.class)
@JsonDeserialize(using = RecipientTokenInfo.RecipientTokenInfoDeserializer.class)
public class RecipientTokenInfo {
  /**
   * Full activation URL to retrieve the access token. It will be empty if the token is already
   * retrieved.
   */
  private String activationUrl;

  /** Time at which this recipient token was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of recipient token creator. */
  private String createdBy;

  /** Expiration timestamp of the token in epoch milliseconds. */
  private Long expirationTime;

  /** Unique ID of the recipient token. */
  private String id;

  /** Time at which this recipient token was updated, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of recipient token updater. */
  private String updatedBy;

  public RecipientTokenInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  public RecipientTokenInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RecipientTokenInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RecipientTokenInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public RecipientTokenInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RecipientTokenInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RecipientTokenInfo setUpdatedBy(String updatedBy) {
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
    RecipientTokenInfo that = (RecipientTokenInfo) o;
    return Objects.equals(activationUrl, that.activationUrl)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(id, that.id)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activationUrl, createdAt, createdBy, expirationTime, id, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(RecipientTokenInfo.class)
        .add("activationUrl", activationUrl)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("expirationTime", expirationTime)
        .add("id", id)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  RecipientTokenInfoPb toPb() {
    RecipientTokenInfoPb pb = new RecipientTokenInfoPb();
    pb.setActivationUrl(activationUrl);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setExpirationTime(expirationTime);
    pb.setId(id);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static RecipientTokenInfo fromPb(RecipientTokenInfoPb pb) {
    RecipientTokenInfo model = new RecipientTokenInfo();
    model.setActivationUrl(pb.getActivationUrl());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setExpirationTime(pb.getExpirationTime());
    model.setId(pb.getId());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class RecipientTokenInfoSerializer extends JsonSerializer<RecipientTokenInfo> {
    @Override
    public void serialize(RecipientTokenInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RecipientTokenInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RecipientTokenInfoDeserializer extends JsonDeserializer<RecipientTokenInfo> {
    @Override
    public RecipientTokenInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RecipientTokenInfoPb pb = mapper.readValue(p, RecipientTokenInfoPb.class);
      return RecipientTokenInfo.fromPb(pb);
    }
  }
}
