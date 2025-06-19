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
@JsonSerialize(using = CreateExchangeResponse.CreateExchangeResponseSerializer.class)
@JsonDeserialize(using = CreateExchangeResponse.CreateExchangeResponseDeserializer.class)
public class CreateExchangeResponse {
  /** */
  private String exchangeId;

  public CreateExchangeResponse setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeResponse that = (CreateExchangeResponse) o;
    return Objects.equals(exchangeId, that.exchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeResponse.class).add("exchangeId", exchangeId).toString();
  }

  CreateExchangeResponsePb toPb() {
    CreateExchangeResponsePb pb = new CreateExchangeResponsePb();
    pb.setExchangeId(exchangeId);

    return pb;
  }

  static CreateExchangeResponse fromPb(CreateExchangeResponsePb pb) {
    CreateExchangeResponse model = new CreateExchangeResponse();
    model.setExchangeId(pb.getExchangeId());

    return model;
  }

  public static class CreateExchangeResponseSerializer
      extends JsonSerializer<CreateExchangeResponse> {
    @Override
    public void serialize(
        CreateExchangeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExchangeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExchangeResponseDeserializer
      extends JsonDeserializer<CreateExchangeResponse> {
    @Override
    public CreateExchangeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExchangeResponsePb pb = mapper.readValue(p, CreateExchangeResponsePb.class);
      return CreateExchangeResponse.fromPb(pb);
    }
  }
}
