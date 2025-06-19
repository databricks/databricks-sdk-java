// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = AddResponse.AddResponseSerializer.class)
@JsonDeserialize(using = AddResponse.AddResponseDeserializer.class)
public class AddResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(AddResponse.class).toString();
  }

  AddResponsePb toPb() {
    AddResponsePb pb = new AddResponsePb();

    return pb;
  }

  static AddResponse fromPb(AddResponsePb pb) {
    AddResponse model = new AddResponse();

    return model;
  }

  public static class AddResponseSerializer extends JsonSerializer<AddResponse> {
    @Override
    public void serialize(AddResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddResponseDeserializer extends JsonDeserializer<AddResponse> {
    @Override
    public AddResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddResponsePb pb = mapper.readValue(p, AddResponsePb.class);
      return AddResponse.fromPb(pb);
    }
  }
}
