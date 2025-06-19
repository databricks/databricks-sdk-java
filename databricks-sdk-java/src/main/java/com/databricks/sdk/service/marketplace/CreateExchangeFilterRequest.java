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
@JsonSerialize(using = CreateExchangeFilterRequest.CreateExchangeFilterRequestSerializer.class)
@JsonDeserialize(using = CreateExchangeFilterRequest.CreateExchangeFilterRequestDeserializer.class)
public class CreateExchangeFilterRequest {
  /** */
  private ExchangeFilter filter;

  public CreateExchangeFilterRequest setFilter(ExchangeFilter filter) {
    this.filter = filter;
    return this;
  }

  public ExchangeFilter getFilter() {
    return filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeFilterRequest that = (CreateExchangeFilterRequest) o;
    return Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeFilterRequest.class).add("filter", filter).toString();
  }

  CreateExchangeFilterRequestPb toPb() {
    CreateExchangeFilterRequestPb pb = new CreateExchangeFilterRequestPb();
    pb.setFilter(filter);

    return pb;
  }

  static CreateExchangeFilterRequest fromPb(CreateExchangeFilterRequestPb pb) {
    CreateExchangeFilterRequest model = new CreateExchangeFilterRequest();
    model.setFilter(pb.getFilter());

    return model;
  }

  public static class CreateExchangeFilterRequestSerializer
      extends JsonSerializer<CreateExchangeFilterRequest> {
    @Override
    public void serialize(
        CreateExchangeFilterRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExchangeFilterRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExchangeFilterRequestDeserializer
      extends JsonDeserializer<CreateExchangeFilterRequest> {
    @Override
    public CreateExchangeFilterRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExchangeFilterRequestPb pb = mapper.readValue(p, CreateExchangeFilterRequestPb.class);
      return CreateExchangeFilterRequest.fromPb(pb);
    }
  }
}
