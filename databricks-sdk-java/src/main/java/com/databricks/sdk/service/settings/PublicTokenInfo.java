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
@JsonSerialize(using = PublicTokenInfo.PublicTokenInfoSerializer.class)
@JsonDeserialize(using = PublicTokenInfo.PublicTokenInfoDeserializer.class)
public class PublicTokenInfo {
  /** Comment the token was created with, if applicable. */
  private String comment;

  /** Server time (in epoch milliseconds) when the token was created. */
  private Long creationTime;

  /** Server time (in epoch milliseconds) when the token will expire, or -1 if not applicable. */
  private Long expiryTime;

  /** The ID of this token. */
  private String tokenId;

  public PublicTokenInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public PublicTokenInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public PublicTokenInfo setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public PublicTokenInfo setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicTokenInfo that = (PublicTokenInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, creationTime, expiryTime, tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublicTokenInfo.class)
        .add("comment", comment)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("tokenId", tokenId)
        .toString();
  }

  PublicTokenInfoPb toPb() {
    PublicTokenInfoPb pb = new PublicTokenInfoPb();
    pb.setComment(comment);
    pb.setCreationTime(creationTime);
    pb.setExpiryTime(expiryTime);
    pb.setTokenId(tokenId);

    return pb;
  }

  static PublicTokenInfo fromPb(PublicTokenInfoPb pb) {
    PublicTokenInfo model = new PublicTokenInfo();
    model.setComment(pb.getComment());
    model.setCreationTime(pb.getCreationTime());
    model.setExpiryTime(pb.getExpiryTime());
    model.setTokenId(pb.getTokenId());

    return model;
  }

  public static class PublicTokenInfoSerializer extends JsonSerializer<PublicTokenInfo> {
    @Override
    public void serialize(PublicTokenInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PublicTokenInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PublicTokenInfoDeserializer extends JsonDeserializer<PublicTokenInfo> {
    @Override
    public PublicTokenInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PublicTokenInfoPb pb = mapper.readValue(p, PublicTokenInfoPb.class);
      return PublicTokenInfo.fromPb(pb);
    }
  }
}
