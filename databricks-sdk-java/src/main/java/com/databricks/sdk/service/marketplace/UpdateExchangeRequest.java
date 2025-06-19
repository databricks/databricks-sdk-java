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
@JsonSerialize(using = UpdateExchangeRequest.UpdateExchangeRequestSerializer.class)
@JsonDeserialize(using = UpdateExchangeRequest.UpdateExchangeRequestDeserializer.class)
public class UpdateExchangeRequest {
  /** */
  private Exchange exchange;

  /** */
  private String id;

  public UpdateExchangeRequest setExchange(Exchange exchange) {
    this.exchange = exchange;
    return this;
  }

  public Exchange getExchange() {
    return exchange;
  }

  public UpdateExchangeRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExchangeRequest that = (UpdateExchangeRequest) o;
    return Objects.equals(exchange, that.exchange) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeRequest.class)
        .add("exchange", exchange)
        .add("id", id)
        .toString();
  }

  UpdateExchangeRequestPb toPb() {
    UpdateExchangeRequestPb pb = new UpdateExchangeRequestPb();
    pb.setExchange(exchange);
    pb.setId(id);

    return pb;
  }

  static UpdateExchangeRequest fromPb(UpdateExchangeRequestPb pb) {
    UpdateExchangeRequest model = new UpdateExchangeRequest();
    model.setExchange(pb.getExchange());
    model.setId(pb.getId());

    return model;
  }

  public static class UpdateExchangeRequestSerializer
      extends JsonSerializer<UpdateExchangeRequest> {
    @Override
    public void serialize(
        UpdateExchangeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExchangeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExchangeRequestDeserializer
      extends JsonDeserializer<UpdateExchangeRequest> {
    @Override
    public UpdateExchangeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExchangeRequestPb pb = mapper.readValue(p, UpdateExchangeRequestPb.class);
      return UpdateExchangeRequest.fromPb(pb);
    }
  }
}
