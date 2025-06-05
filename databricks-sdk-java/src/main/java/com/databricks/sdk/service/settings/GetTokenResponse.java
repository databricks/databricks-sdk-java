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

/** Token with specified Token ID was successfully returned. */
@Generated
@JsonSerialize(using = GetTokenResponse.GetTokenResponseSerializer.class)
@JsonDeserialize(using = GetTokenResponse.GetTokenResponseDeserializer.class)
public class GetTokenResponse {
  /** */
  private TokenInfo tokenInfo;

  public GetTokenResponse setTokenInfo(TokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public TokenInfo getTokenInfo() {
    return tokenInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTokenResponse that = (GetTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTokenResponse.class).add("tokenInfo", tokenInfo).toString();
  }

  GetTokenResponsePb toPb() {
    GetTokenResponsePb pb = new GetTokenResponsePb();
    pb.setTokenInfo(tokenInfo);

    return pb;
  }

  static GetTokenResponse fromPb(GetTokenResponsePb pb) {
    GetTokenResponse model = new GetTokenResponse();
    model.setTokenInfo(pb.getTokenInfo());

    return model;
  }

  public static class GetTokenResponseSerializer extends JsonSerializer<GetTokenResponse> {
    @Override
    public void serialize(GetTokenResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetTokenResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetTokenResponseDeserializer extends JsonDeserializer<GetTokenResponse> {
    @Override
    public GetTokenResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetTokenResponsePb pb = mapper.readValue(p, GetTokenResponsePb.class);
      return GetTokenResponse.fromPb(pb);
    }
  }
}
