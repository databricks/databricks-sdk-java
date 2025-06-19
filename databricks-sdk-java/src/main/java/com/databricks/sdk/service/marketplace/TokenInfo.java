// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = TokenInfo.TokenInfoSerializer.class)
@JsonDeserialize(using = TokenInfo.TokenInfoDeserializer.class)
public class TokenInfo {
  /**
   * Full activation url to retrieve the access token. It will be empty if the token is already
   * retrieved.
   */
  private String activationUrl;

  /** Time at which this Recipient Token was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of Recipient Token creator. */
  private String createdBy;

  /** Expiration timestamp of the token in epoch milliseconds. */
  private Long expirationTime;

  /** Unique id of the Recipient Token. */
  private String id;

  /** Time at which this Recipient Token was updated, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of Recipient Token updater. */
  private String updatedBy;

  public TokenInfo setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  public TokenInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public TokenInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public TokenInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public TokenInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TokenInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public TokenInfo setUpdatedBy(String updatedBy) {
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
    TokenInfo that = (TokenInfo) o;
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
    return new ToStringer(TokenInfo.class)
        .add("activationUrl", activationUrl)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("expirationTime", expirationTime)
        .add("id", id)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  TokenInfoPb toPb() {
    TokenInfoPb pb = new TokenInfoPb();
    pb.setActivationUrl(activationUrl);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setExpirationTime(expirationTime);
    pb.setId(id);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static TokenInfo fromPb(TokenInfoPb pb) {
    TokenInfo model = new TokenInfo();
    model.setActivationUrl(pb.getActivationUrl());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setExpirationTime(pb.getExpirationTime());
    model.setId(pb.getId());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class TokenInfoSerializer extends JsonSerializer<TokenInfo> {
    @Override
    public void serialize(TokenInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenInfoDeserializer extends JsonDeserializer<TokenInfo> {
    @Override
    public TokenInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenInfoPb pb = mapper.readValue(p, TokenInfoPb.class);
      return TokenInfo.fromPb(pb);
    }
  }
}
