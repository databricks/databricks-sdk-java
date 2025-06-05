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
@JsonSerialize(using = EditResponse.EditResponseSerializer.class)
@JsonDeserialize(using = EditResponse.EditResponseDeserializer.class)
public class EditResponse {

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
    return new ToStringer(EditResponse.class).toString();
  }

  EditResponsePb toPb() {
    EditResponsePb pb = new EditResponsePb();

    return pb;
  }

  static EditResponse fromPb(EditResponsePb pb) {
    EditResponse model = new EditResponse();

    return model;
  }

  public static class EditResponseSerializer extends JsonSerializer<EditResponse> {
    @Override
    public void serialize(EditResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditResponseDeserializer extends JsonDeserializer<EditResponse> {
    @Override
    public EditResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditResponsePb pb = mapper.readValue(p, EditResponsePb.class);
      return EditResponse.fromPb(pb);
    }
  }
}
