// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
  /** Comment that describes the purpose of the token, specified by the token creator. */
  private String comment;

  /** User ID of the user that created the token. */
  private Long createdById;

  /** Username of the user that created the token. */
  private String createdByUsername;

  /** Timestamp when the token was created. */
  private Long creationTime;

  /** Timestamp when the token expires. */
  private Long expiryTime;

  /** Approximate timestamp for the day the token was last used. Accurate up to 1 day. */
  private Long lastUsedDay;

  /** User ID of the user that owns the token. */
  private Long ownerId;

  /** ID of the token. */
  private String tokenId;

  /** If applicable, the ID of the workspace that the token was created in. */
  private Long workspaceId;

  public TokenInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TokenInfo setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public TokenInfo setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  public String getCreatedByUsername() {
    return createdByUsername;
  }

  public TokenInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public TokenInfo setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public TokenInfo setLastUsedDay(Long lastUsedDay) {
    this.lastUsedDay = lastUsedDay;
    return this;
  }

  public Long getLastUsedDay() {
    return lastUsedDay;
  }

  public TokenInfo setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public TokenInfo setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  public TokenInfo setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenInfo that = (TokenInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(lastUsedDay, that.lastUsedDay)
        && Objects.equals(ownerId, that.ownerId)
        && Objects.equals(tokenId, that.tokenId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        createdById,
        createdByUsername,
        creationTime,
        expiryTime,
        lastUsedDay,
        ownerId,
        tokenId,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenInfo.class)
        .add("comment", comment)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("lastUsedDay", lastUsedDay)
        .add("ownerId", ownerId)
        .add("tokenId", tokenId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  TokenInfoPb toPb() {
    TokenInfoPb pb = new TokenInfoPb();
    pb.setComment(comment);
    pb.setCreatedById(createdById);
    pb.setCreatedByUsername(createdByUsername);
    pb.setCreationTime(creationTime);
    pb.setExpiryTime(expiryTime);
    pb.setLastUsedDay(lastUsedDay);
    pb.setOwnerId(ownerId);
    pb.setTokenId(tokenId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static TokenInfo fromPb(TokenInfoPb pb) {
    TokenInfo model = new TokenInfo();
    model.setComment(pb.getComment());
    model.setCreatedById(pb.getCreatedById());
    model.setCreatedByUsername(pb.getCreatedByUsername());
    model.setCreationTime(pb.getCreationTime());
    model.setExpiryTime(pb.getExpiryTime());
    model.setLastUsedDay(pb.getLastUsedDay());
    model.setOwnerId(pb.getOwnerId());
    model.setTokenId(pb.getTokenId());
    model.setWorkspaceId(pb.getWorkspaceId());

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
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenInfoPb pb = mapper.readValue(p, TokenInfoPb.class);
      return TokenInfo.fromPb(pb);
    }
  }
}
