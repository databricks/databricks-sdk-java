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
@JsonSerialize(using = CreateTokenResponse.CreateTokenResponseSerializer.class)
@JsonDeserialize(using = CreateTokenResponse.CreateTokenResponseDeserializer.class)
public class CreateTokenResponse {
  /** The information for the new token. */
  private PublicTokenInfo tokenInfo;

  /** The value of the new token. */
  private String tokenValue;

  public CreateTokenResponse setTokenInfo(PublicTokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public PublicTokenInfo getTokenInfo() {
    return tokenInfo;
  }

  public CreateTokenResponse setTokenValue(String tokenValue) {
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
    CreateTokenResponse that = (CreateTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenResponse.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }

  CreateTokenResponsePb toPb() {
    CreateTokenResponsePb pb = new CreateTokenResponsePb();
    pb.setTokenInfo(tokenInfo);
    pb.setTokenValue(tokenValue);

    return pb;
  }

  static CreateTokenResponse fromPb(CreateTokenResponsePb pb) {
    CreateTokenResponse model = new CreateTokenResponse();
    model.setTokenInfo(pb.getTokenInfo());
    model.setTokenValue(pb.getTokenValue());

    return model;
  }

  public static class CreateTokenResponseSerializer extends JsonSerializer<CreateTokenResponse> {
    @Override
    public void serialize(CreateTokenResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateTokenResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateTokenResponseDeserializer
      extends JsonDeserializer<CreateTokenResponse> {
    @Override
    public CreateTokenResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateTokenResponsePb pb = mapper.readValue(p, CreateTokenResponsePb.class);
      return CreateTokenResponse.fromPb(pb);
    }
  }
}
