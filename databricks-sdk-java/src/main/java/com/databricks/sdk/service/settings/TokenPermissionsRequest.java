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

@Generated
@JsonSerialize(using = TokenPermissionsRequest.TokenPermissionsRequestSerializer.class)
@JsonDeserialize(using = TokenPermissionsRequest.TokenPermissionsRequestDeserializer.class)
public class TokenPermissionsRequest {
  /** */
  private Collection<TokenAccessControlRequest> accessControlList;

  public TokenPermissionsRequest setAccessControlList(
      Collection<TokenAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<TokenAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenPermissionsRequest that = (TokenPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .toString();
  }

  TokenPermissionsRequestPb toPb() {
    TokenPermissionsRequestPb pb = new TokenPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);

    return pb;
  }

  static TokenPermissionsRequest fromPb(TokenPermissionsRequestPb pb) {
    TokenPermissionsRequest model = new TokenPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());

    return model;
  }

  public static class TokenPermissionsRequestSerializer
      extends JsonSerializer<TokenPermissionsRequest> {
    @Override
    public void serialize(
        TokenPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenPermissionsRequestDeserializer
      extends JsonDeserializer<TokenPermissionsRequest> {
    @Override
    public TokenPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenPermissionsRequestPb pb = mapper.readValue(p, TokenPermissionsRequestPb.class);
      return TokenPermissionsRequest.fromPb(pb);
    }
  }
}
