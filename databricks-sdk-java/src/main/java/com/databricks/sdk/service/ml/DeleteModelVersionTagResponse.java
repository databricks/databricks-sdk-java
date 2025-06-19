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
@JsonSerialize(using = DeleteModelVersionTagResponse.DeleteModelVersionTagResponseSerializer.class)
@JsonDeserialize(
    using = DeleteModelVersionTagResponse.DeleteModelVersionTagResponseDeserializer.class)
public class DeleteModelVersionTagResponse {

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
    return new ToStringer(DeleteModelVersionTagResponse.class).toString();
  }

  DeleteModelVersionTagResponsePb toPb() {
    DeleteModelVersionTagResponsePb pb = new DeleteModelVersionTagResponsePb();

    return pb;
  }

  static DeleteModelVersionTagResponse fromPb(DeleteModelVersionTagResponsePb pb) {
    DeleteModelVersionTagResponse model = new DeleteModelVersionTagResponse();

    return model;
  }

  public static class DeleteModelVersionTagResponseSerializer
      extends JsonSerializer<DeleteModelVersionTagResponse> {
    @Override
    public void serialize(
        DeleteModelVersionTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelVersionTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelVersionTagResponseDeserializer
      extends JsonDeserializer<DeleteModelVersionTagResponse> {
    @Override
    public DeleteModelVersionTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelVersionTagResponsePb pb =
          mapper.readValue(p, DeleteModelVersionTagResponsePb.class);
      return DeleteModelVersionTagResponse.fromPb(pb);
    }
  }
}
