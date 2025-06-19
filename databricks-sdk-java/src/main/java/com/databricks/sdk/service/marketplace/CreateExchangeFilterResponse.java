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
@JsonSerialize(using = CreateExchangeFilterResponse.CreateExchangeFilterResponseSerializer.class)
@JsonDeserialize(
    using = CreateExchangeFilterResponse.CreateExchangeFilterResponseDeserializer.class)
public class CreateExchangeFilterResponse {
  /** */
  private String filterId;

  public CreateExchangeFilterResponse setFilterId(String filterId) {
    this.filterId = filterId;
    return this;
  }

  public String getFilterId() {
    return filterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeFilterResponse that = (CreateExchangeFilterResponse) o;
    return Objects.equals(filterId, that.filterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeFilterResponse.class).add("filterId", filterId).toString();
  }

  CreateExchangeFilterResponsePb toPb() {
    CreateExchangeFilterResponsePb pb = new CreateExchangeFilterResponsePb();
    pb.setFilterId(filterId);

    return pb;
  }

  static CreateExchangeFilterResponse fromPb(CreateExchangeFilterResponsePb pb) {
    CreateExchangeFilterResponse model = new CreateExchangeFilterResponse();
    model.setFilterId(pb.getFilterId());

    return model;
  }

  public static class CreateExchangeFilterResponseSerializer
      extends JsonSerializer<CreateExchangeFilterResponse> {
    @Override
    public void serialize(
        CreateExchangeFilterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExchangeFilterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExchangeFilterResponseDeserializer
      extends JsonDeserializer<CreateExchangeFilterResponse> {
    @Override
    public CreateExchangeFilterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExchangeFilterResponsePb pb = mapper.readValue(p, CreateExchangeFilterResponsePb.class);
      return CreateExchangeFilterResponse.fromPb(pb);
    }
  }
}
