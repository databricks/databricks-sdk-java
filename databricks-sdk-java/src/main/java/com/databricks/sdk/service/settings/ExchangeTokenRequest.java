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

/** Exchange a token with the IdP */
@Generated
@JsonSerialize(using = ExchangeTokenRequest.ExchangeTokenRequestSerializer.class)
@JsonDeserialize(using = ExchangeTokenRequest.ExchangeTokenRequestDeserializer.class)
public class ExchangeTokenRequest {
  /** The partition of Credentials store */
  private PartitionId partitionId;

  /** Array of scopes for the token request. */
  private Collection<String> scopes;

  /** A list of token types being requested */
  private Collection<TokenType> tokenType;

  public ExchangeTokenRequest setPartitionId(PartitionId partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  public PartitionId getPartitionId() {
    return partitionId;
  }

  public ExchangeTokenRequest setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeTokenRequest setTokenType(Collection<TokenType> tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public Collection<TokenType> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeTokenRequest that = (ExchangeTokenRequest) o;
    return Objects.equals(partitionId, that.partitionId)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenType, that.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partitionId, scopes, tokenType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeTokenRequest.class)
        .add("partitionId", partitionId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }

  ExchangeTokenRequestPb toPb() {
    ExchangeTokenRequestPb pb = new ExchangeTokenRequestPb();
    pb.setPartitionId(partitionId);
    pb.setScopes(scopes);
    pb.setTokenType(tokenType);

    return pb;
  }

  static ExchangeTokenRequest fromPb(ExchangeTokenRequestPb pb) {
    ExchangeTokenRequest model = new ExchangeTokenRequest();
    model.setPartitionId(pb.getPartitionId());
    model.setScopes(pb.getScopes());
    model.setTokenType(pb.getTokenType());

    return model;
  }

  public static class ExchangeTokenRequestSerializer extends JsonSerializer<ExchangeTokenRequest> {
    @Override
    public void serialize(
        ExchangeTokenRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangeTokenRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeTokenRequestDeserializer
      extends JsonDeserializer<ExchangeTokenRequest> {
    @Override
    public ExchangeTokenRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangeTokenRequestPb pb = mapper.readValue(p, ExchangeTokenRequestPb.class);
      return ExchangeTokenRequest.fromPb(pb);
    }
  }
}
