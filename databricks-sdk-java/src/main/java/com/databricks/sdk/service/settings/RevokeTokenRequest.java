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
@JsonSerialize(using = RevokeTokenRequest.RevokeTokenRequestSerializer.class)
@JsonDeserialize(using = RevokeTokenRequest.RevokeTokenRequestDeserializer.class)
public class RevokeTokenRequest {
  /** The ID of the token to be revoked. */
  private String tokenId;

  public RevokeTokenRequest setTokenId(String tokenId) {
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
    RevokeTokenRequest that = (RevokeTokenRequest) o;
    return Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(RevokeTokenRequest.class).add("tokenId", tokenId).toString();
  }

  RevokeTokenRequestPb toPb() {
    RevokeTokenRequestPb pb = new RevokeTokenRequestPb();
    pb.setTokenId(tokenId);

    return pb;
  }

  static RevokeTokenRequest fromPb(RevokeTokenRequestPb pb) {
    RevokeTokenRequest model = new RevokeTokenRequest();
    model.setTokenId(pb.getTokenId());

    return model;
  }

  public static class RevokeTokenRequestSerializer extends JsonSerializer<RevokeTokenRequest> {
    @Override
    public void serialize(RevokeTokenRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RevokeTokenRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RevokeTokenRequestDeserializer extends JsonDeserializer<RevokeTokenRequest> {
    @Override
    public RevokeTokenRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RevokeTokenRequestPb pb = mapper.readValue(p, RevokeTokenRequestPb.class);
      return RevokeTokenRequest.fromPb(pb);
    }
  }
}
