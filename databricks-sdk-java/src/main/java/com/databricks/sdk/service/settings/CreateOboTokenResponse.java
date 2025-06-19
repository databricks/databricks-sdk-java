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

/** An on-behalf token was successfully created for the service principal. */
@Generated
@JsonSerialize(using = CreateOboTokenResponse.CreateOboTokenResponseSerializer.class)
@JsonDeserialize(using = CreateOboTokenResponse.CreateOboTokenResponseDeserializer.class)
public class CreateOboTokenResponse {
  /** */
  private TokenInfo tokenInfo;

  /** Value of the token. */
  private String tokenValue;

  public CreateOboTokenResponse setTokenInfo(TokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public TokenInfo getTokenInfo() {
    return tokenInfo;
  }

  public CreateOboTokenResponse setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
    return this;
  }

  public String getTokenValue() {
    return tokenValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOboTokenResponse that = (CreateOboTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenResponse.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }

  CreateOboTokenResponsePb toPb() {
    CreateOboTokenResponsePb pb = new CreateOboTokenResponsePb();
    pb.setTokenInfo(tokenInfo);
    pb.setTokenValue(tokenValue);

    return pb;
  }

  static CreateOboTokenResponse fromPb(CreateOboTokenResponsePb pb) {
    CreateOboTokenResponse model = new CreateOboTokenResponse();
    model.setTokenInfo(pb.getTokenInfo());
    model.setTokenValue(pb.getTokenValue());

    return model;
  }

  public static class CreateOboTokenResponseSerializer
      extends JsonSerializer<CreateOboTokenResponse> {
    @Override
    public void serialize(
        CreateOboTokenResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateOboTokenResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateOboTokenResponseDeserializer
      extends JsonDeserializer<CreateOboTokenResponse> {
    @Override
    public CreateOboTokenResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateOboTokenResponsePb pb = mapper.readValue(p, CreateOboTokenResponsePb.class);
      return CreateOboTokenResponse.fromPb(pb);
    }
  }
}
