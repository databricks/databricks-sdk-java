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

/** Get token info */
@Generated
@JsonSerialize(using = GetTokenManagementRequest.GetTokenManagementRequestSerializer.class)
@JsonDeserialize(using = GetTokenManagementRequest.GetTokenManagementRequestDeserializer.class)
public class GetTokenManagementRequest {
  /** The ID of the token to get. */
  private String tokenId;

  public GetTokenManagementRequest setTokenId(String tokenId) {
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
    GetTokenManagementRequest that = (GetTokenManagementRequest) o;
    return Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTokenManagementRequest.class).add("tokenId", tokenId).toString();
  }

  GetTokenManagementRequestPb toPb() {
    GetTokenManagementRequestPb pb = new GetTokenManagementRequestPb();
    pb.setTokenId(tokenId);

    return pb;
  }

  static GetTokenManagementRequest fromPb(GetTokenManagementRequestPb pb) {
    GetTokenManagementRequest model = new GetTokenManagementRequest();
    model.setTokenId(pb.getTokenId());

    return model;
  }

  public static class GetTokenManagementRequestSerializer
      extends JsonSerializer<GetTokenManagementRequest> {
    @Override
    public void serialize(
        GetTokenManagementRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetTokenManagementRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetTokenManagementRequestDeserializer
      extends JsonDeserializer<GetTokenManagementRequest> {
    @Override
    public GetTokenManagementRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetTokenManagementRequestPb pb = mapper.readValue(p, GetTokenManagementRequestPb.class);
      return GetTokenManagementRequest.fromPb(pb);
    }
  }
}
