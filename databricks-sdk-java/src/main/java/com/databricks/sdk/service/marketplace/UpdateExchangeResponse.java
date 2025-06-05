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
@JsonSerialize(using = UpdateExchangeResponse.UpdateExchangeResponseSerializer.class)
@JsonDeserialize(using = UpdateExchangeResponse.UpdateExchangeResponseDeserializer.class)
public class UpdateExchangeResponse {
  /** */
  private Exchange exchange;

  public UpdateExchangeResponse setExchange(Exchange exchange) {
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
    UpdateExchangeResponse that = (UpdateExchangeResponse) o;
    return Objects.equals(exchange, that.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeResponse.class).add("exchange", exchange).toString();
  }

  UpdateExchangeResponsePb toPb() {
    UpdateExchangeResponsePb pb = new UpdateExchangeResponsePb();
    pb.setExchange(exchange);

    return pb;
  }

  static UpdateExchangeResponse fromPb(UpdateExchangeResponsePb pb) {
    UpdateExchangeResponse model = new UpdateExchangeResponse();
    model.setExchange(pb.getExchange());

    return model;
  }

  public static class UpdateExchangeResponseSerializer
      extends JsonSerializer<UpdateExchangeResponse> {
    @Override
    public void serialize(
        UpdateExchangeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExchangeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExchangeResponseDeserializer
      extends JsonDeserializer<UpdateExchangeResponse> {
    @Override
    public UpdateExchangeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExchangeResponsePb pb = mapper.readValue(p, UpdateExchangeResponsePb.class);
      return UpdateExchangeResponse.fromPb(pb);
    }
  }
}
