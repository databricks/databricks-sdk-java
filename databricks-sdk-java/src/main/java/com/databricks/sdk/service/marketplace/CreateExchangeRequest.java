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
@JsonSerialize(using = CreateExchangeRequest.CreateExchangeRequestSerializer.class)
@JsonDeserialize(using = CreateExchangeRequest.CreateExchangeRequestDeserializer.class)
public class CreateExchangeRequest {
  /** */
  private Exchange exchange;

  public CreateExchangeRequest setExchange(Exchange exchange) {
    this.exchange = exchange;
    return this;
  }

  public Exchange getExchange() {
    return exchange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeRequest that = (CreateExchangeRequest) o;
    return Objects.equals(exchange, that.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeRequest.class).add("exchange", exchange).toString();
  }

  CreateExchangeRequestPb toPb() {
    CreateExchangeRequestPb pb = new CreateExchangeRequestPb();
    pb.setExchange(exchange);

    return pb;
  }

  static CreateExchangeRequest fromPb(CreateExchangeRequestPb pb) {
    CreateExchangeRequest model = new CreateExchangeRequest();
    model.setExchange(pb.getExchange());

    return model;
  }

  public static class CreateExchangeRequestSerializer
      extends JsonSerializer<CreateExchangeRequest> {
    @Override
    public void serialize(
        CreateExchangeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExchangeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExchangeRequestDeserializer
      extends JsonDeserializer<CreateExchangeRequest> {
    @Override
    public CreateExchangeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExchangeRequestPb pb = mapper.readValue(p, CreateExchangeRequestPb.class);
      return CreateExchangeRequest.fromPb(pb);
    }
  }
}
