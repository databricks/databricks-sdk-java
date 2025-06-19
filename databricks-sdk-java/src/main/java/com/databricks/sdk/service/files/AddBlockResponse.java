// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = AddBlockResponse.AddBlockResponseSerializer.class)
@JsonDeserialize(using = AddBlockResponse.AddBlockResponseDeserializer.class)
public class AddBlockResponse {

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
    return new ToStringer(AddBlockResponse.class).toString();
  }

  AddBlockResponsePb toPb() {
    AddBlockResponsePb pb = new AddBlockResponsePb();

    return pb;
  }

  static AddBlockResponse fromPb(AddBlockResponsePb pb) {
    AddBlockResponse model = new AddBlockResponse();

    return model;
  }

  public static class AddBlockResponseSerializer extends JsonSerializer<AddBlockResponse> {
    @Override
    public void serialize(AddBlockResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddBlockResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddBlockResponseDeserializer extends JsonDeserializer<AddBlockResponse> {
    @Override
    public AddBlockResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddBlockResponsePb pb = mapper.readValue(p, AddBlockResponsePb.class);
      return AddBlockResponse.fromPb(pb);
    }
  }
}
