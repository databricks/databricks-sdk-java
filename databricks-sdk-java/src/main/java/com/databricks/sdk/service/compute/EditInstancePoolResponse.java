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
@JsonSerialize(using = EditInstancePoolResponse.EditInstancePoolResponseSerializer.class)
@JsonDeserialize(using = EditInstancePoolResponse.EditInstancePoolResponseDeserializer.class)
public class EditInstancePoolResponse {

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
    return new ToStringer(EditInstancePoolResponse.class).toString();
  }

  EditInstancePoolResponsePb toPb() {
    EditInstancePoolResponsePb pb = new EditInstancePoolResponsePb();

    return pb;
  }

  static EditInstancePoolResponse fromPb(EditInstancePoolResponsePb pb) {
    EditInstancePoolResponse model = new EditInstancePoolResponse();

    return model;
  }

  public static class EditInstancePoolResponseSerializer
      extends JsonSerializer<EditInstancePoolResponse> {
    @Override
    public void serialize(
        EditInstancePoolResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditInstancePoolResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditInstancePoolResponseDeserializer
      extends JsonDeserializer<EditInstancePoolResponse> {
    @Override
    public EditInstancePoolResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditInstancePoolResponsePb pb = mapper.readValue(p, EditInstancePoolResponsePb.class);
      return EditInstancePoolResponse.fromPb(pb);
    }
  }
}
