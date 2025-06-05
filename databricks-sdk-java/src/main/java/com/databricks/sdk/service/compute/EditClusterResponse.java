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
@JsonSerialize(using = EditClusterResponse.EditClusterResponseSerializer.class)
@JsonDeserialize(using = EditClusterResponse.EditClusterResponseDeserializer.class)
public class EditClusterResponse {

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
    return new ToStringer(EditClusterResponse.class).toString();
  }

  EditClusterResponsePb toPb() {
    EditClusterResponsePb pb = new EditClusterResponsePb();

    return pb;
  }

  static EditClusterResponse fromPb(EditClusterResponsePb pb) {
    EditClusterResponse model = new EditClusterResponse();

    return model;
  }

  public static class EditClusterResponseSerializer extends JsonSerializer<EditClusterResponse> {
    @Override
    public void serialize(EditClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditClusterResponseDeserializer
      extends JsonDeserializer<EditClusterResponse> {
    @Override
    public EditClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditClusterResponsePb pb = mapper.readValue(p, EditClusterResponsePb.class);
      return EditClusterResponse.fromPb(pb);
    }
  }
}
