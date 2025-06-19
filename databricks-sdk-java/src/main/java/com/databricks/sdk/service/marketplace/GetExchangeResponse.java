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
@JsonSerialize(using = GetExchangeResponse.GetExchangeResponseSerializer.class)
@JsonDeserialize(using = GetExchangeResponse.GetExchangeResponseDeserializer.class)
public class GetExchangeResponse {
  /** */
  private Exchange exchange;

  public GetExchangeResponse setExchange(Exchange exchange) {
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
    GetExchangeResponse that = (GetExchangeResponse) o;
    return Objects.equals(exchange, that.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExchangeResponse.class).add("exchange", exchange).toString();
  }

  GetExchangeResponsePb toPb() {
    GetExchangeResponsePb pb = new GetExchangeResponsePb();
    pb.setExchange(exchange);

    return pb;
  }

  static GetExchangeResponse fromPb(GetExchangeResponsePb pb) {
    GetExchangeResponse model = new GetExchangeResponse();
    model.setExchange(pb.getExchange());

    return model;
  }

  public static class GetExchangeResponseSerializer extends JsonSerializer<GetExchangeResponse> {
    @Override
    public void serialize(GetExchangeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExchangeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExchangeResponseDeserializer
      extends JsonDeserializer<GetExchangeResponse> {
    @Override
    public GetExchangeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExchangeResponsePb pb = mapper.readValue(p, GetExchangeResponsePb.class);
      return GetExchangeResponse.fromPb(pb);
    }
  }
}
