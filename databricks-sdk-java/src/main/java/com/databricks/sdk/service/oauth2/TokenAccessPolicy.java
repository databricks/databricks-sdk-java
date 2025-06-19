// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(using = TokenAccessPolicy.TokenAccessPolicySerializer.class)
@JsonDeserialize(using = TokenAccessPolicy.TokenAccessPolicyDeserializer.class)
public class TokenAccessPolicy {
  /** access token time to live in minutes */
  private Long accessTokenTtlInMinutes;

  /** refresh token time to live in minutes */
  private Long refreshTokenTtlInMinutes;

  public TokenAccessPolicy setAccessTokenTtlInMinutes(Long accessTokenTtlInMinutes) {
    this.accessTokenTtlInMinutes = accessTokenTtlInMinutes;
    return this;
  }

  public Long getAccessTokenTtlInMinutes() {
    return accessTokenTtlInMinutes;
  }

  public TokenAccessPolicy setRefreshTokenTtlInMinutes(Long refreshTokenTtlInMinutes) {
    this.refreshTokenTtlInMinutes = refreshTokenTtlInMinutes;
    return this;
  }

  public Long getRefreshTokenTtlInMinutes() {
    return refreshTokenTtlInMinutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenAccessPolicy that = (TokenAccessPolicy) o;
    return Objects.equals(accessTokenTtlInMinutes, that.accessTokenTtlInMinutes)
        && Objects.equals(refreshTokenTtlInMinutes, that.refreshTokenTtlInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenTtlInMinutes, refreshTokenTtlInMinutes);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenAccessPolicy.class)
        .add("accessTokenTtlInMinutes", accessTokenTtlInMinutes)
        .add("refreshTokenTtlInMinutes", refreshTokenTtlInMinutes)
        .toString();
  }

  TokenAccessPolicyPb toPb() {
    TokenAccessPolicyPb pb = new TokenAccessPolicyPb();
    pb.setAccessTokenTtlInMinutes(accessTokenTtlInMinutes);
    pb.setRefreshTokenTtlInMinutes(refreshTokenTtlInMinutes);

    return pb;
  }

  static TokenAccessPolicy fromPb(TokenAccessPolicyPb pb) {
    TokenAccessPolicy model = new TokenAccessPolicy();
    model.setAccessTokenTtlInMinutes(pb.getAccessTokenTtlInMinutes());
    model.setRefreshTokenTtlInMinutes(pb.getRefreshTokenTtlInMinutes());

    return model;
  }

  public static class TokenAccessPolicySerializer extends JsonSerializer<TokenAccessPolicy> {
    @Override
    public void serialize(TokenAccessPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenAccessPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenAccessPolicyDeserializer extends JsonDeserializer<TokenAccessPolicy> {
    @Override
    public TokenAccessPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenAccessPolicyPb pb = mapper.readValue(p, TokenAccessPolicyPb.class);
      return TokenAccessPolicy.fromPb(pb);
    }
  }
}
