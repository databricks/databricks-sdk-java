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
@JsonSerialize(using = TokenDetail.TokenDetailSerializer.class)
@JsonDeserialize(using = TokenDetail.TokenDetailDeserializer.class)
public class TokenDetail {
  /** */
  private String bearerToken;

  /** */
  private String endpoint;

  /** */
  private String expirationTime;

  /**
   * These field names must follow the delta sharing protocol. Original message:
   * RetrieveToken.Response in managed-catalog/api/messages/recipient.proto
   */
  private Long shareCredentialsVersion;

  public TokenDetail setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public TokenDetail setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public TokenDetail setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public String getExpirationTime() {
    return expirationTime;
  }

  public TokenDetail setShareCredentialsVersion(Long shareCredentialsVersion) {
    this.shareCredentialsVersion = shareCredentialsVersion;
    return this;
  }

  public Long getShareCredentialsVersion() {
    return shareCredentialsVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenDetail that = (TokenDetail) o;
    return Objects.equals(bearerToken, that.bearerToken)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(shareCredentialsVersion, that.shareCredentialsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, endpoint, expirationTime, shareCredentialsVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenDetail.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("expirationTime", expirationTime)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }

  TokenDetailPb toPb() {
    TokenDetailPb pb = new TokenDetailPb();
    pb.setBearerToken(bearerToken);
    pb.setEndpoint(endpoint);
    pb.setExpirationTime(expirationTime);
    pb.setShareCredentialsVersion(shareCredentialsVersion);

    return pb;
  }

  static TokenDetail fromPb(TokenDetailPb pb) {
    TokenDetail model = new TokenDetail();
    model.setBearerToken(pb.getBearerToken());
    model.setEndpoint(pb.getEndpoint());
    model.setExpirationTime(pb.getExpirationTime());
    model.setShareCredentialsVersion(pb.getShareCredentialsVersion());

    return model;
  }

  public static class TokenDetailSerializer extends JsonSerializer<TokenDetail> {
    @Override
    public void serialize(TokenDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenDetailDeserializer extends JsonDeserializer<TokenDetail> {
    @Override
    public TokenDetail deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenDetailPb pb = mapper.readValue(p, TokenDetailPb.class);
      return TokenDetail.fromPb(pb);
    }
  }
}
