// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = DeleteModelResponse.DeleteModelResponseSerializer.class)
@JsonDeserialize(using = DeleteModelResponse.DeleteModelResponseDeserializer.class)
public class DeleteModelResponse {

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
    return new ToStringer(DeleteModelResponse.class).toString();
  }

  DeleteModelResponsePb toPb() {
    DeleteModelResponsePb pb = new DeleteModelResponsePb();

    return pb;
  }

  static DeleteModelResponse fromPb(DeleteModelResponsePb pb) {
    DeleteModelResponse model = new DeleteModelResponse();

    return model;
  }

  public static class DeleteModelResponseSerializer extends JsonSerializer<DeleteModelResponse> {
    @Override
    public void serialize(DeleteModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelResponseDeserializer
      extends JsonDeserializer<DeleteModelResponse> {
    @Override
    public DeleteModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelResponsePb pb = mapper.readValue(p, DeleteModelResponsePb.class);
      return DeleteModelResponse.fromPb(pb);
    }
  }
}
