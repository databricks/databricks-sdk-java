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
import java.util.Collection;
import java.util.Objects;

/** The exchange token is the result of the token exchange with the IdP */
@Generated
@JsonSerialize(using = ExchangeToken.ExchangeTokenSerializer.class)
@JsonDeserialize(using = ExchangeToken.ExchangeTokenDeserializer.class)
public class ExchangeToken {
  /** The requested token. */
  private String credential;

  /** The end-of-life timestamp of the token. The value is in milliseconds since the Unix epoch. */
  private Long credentialEolTime;

  /** User ID of the user that owns this token. */
  private Long ownerId;

  /** The scopes of access granted in the token. */
  private Collection<String> scopes;

  /** The type of this exchange token */
  private TokenType tokenType;

  public ExchangeToken setCredential(String credential) {
    this.credential = credential;
    return this;
  }

  public String getCredential() {
    return credential;
  }

  public ExchangeToken setCredentialEolTime(Long credentialEolTime) {
    this.credentialEolTime = credentialEolTime;
    return this;
  }

  public Long getCredentialEolTime() {
    return credentialEolTime;
  }

  public ExchangeToken setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public ExchangeToken setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeToken setTokenType(TokenType tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public TokenType getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeToken that = (ExchangeToken) o;
    return Objects.equals(credential, that.credential)
        && Objects.equals(credentialEolTime, that.credentialEolTime)
        && Objects.equals(ownerId, that.ownerId)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenType, that.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, credentialEolTime, ownerId, scopes, tokenType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeToken.class)
        .add("credential", credential)
        .add("credentialEolTime", credentialEolTime)
        .add("ownerId", ownerId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }

  ExchangeTokenPb toPb() {
    ExchangeTokenPb pb = new ExchangeTokenPb();
    pb.setCredential(credential);
    pb.setCredentialEolTime(credentialEolTime);
    pb.setOwnerId(ownerId);
    pb.setScopes(scopes);
    pb.setTokenType(tokenType);

    return pb;
  }

  static ExchangeToken fromPb(ExchangeTokenPb pb) {
    ExchangeToken model = new ExchangeToken();
    model.setCredential(pb.getCredential());
    model.setCredentialEolTime(pb.getCredentialEolTime());
    model.setOwnerId(pb.getOwnerId());
    model.setScopes(pb.getScopes());
    model.setTokenType(pb.getTokenType());

    return model;
  }

  public static class ExchangeTokenSerializer extends JsonSerializer<ExchangeToken> {
    @Override
    public void serialize(ExchangeToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangeTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeTokenDeserializer extends JsonDeserializer<ExchangeToken> {
    @Override
    public ExchangeToken deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangeTokenPb pb = mapper.readValue(p, ExchangeTokenPb.class);
      return ExchangeToken.fromPb(pb);
    }
  }
}
