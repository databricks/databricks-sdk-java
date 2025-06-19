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
@JsonSerialize(using = DeleteRunResponse.DeleteRunResponseSerializer.class)
@JsonDeserialize(using = DeleteRunResponse.DeleteRunResponseDeserializer.class)
public class DeleteRunResponse {

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
    return new ToStringer(DeleteRunResponse.class).toString();
  }

  DeleteRunResponsePb toPb() {
    DeleteRunResponsePb pb = new DeleteRunResponsePb();

    return pb;
  }

  static DeleteRunResponse fromPb(DeleteRunResponsePb pb) {
    DeleteRunResponse model = new DeleteRunResponse();

    return model;
  }

  public static class DeleteRunResponseSerializer extends JsonSerializer<DeleteRunResponse> {
    @Override
    public void serialize(DeleteRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRunResponseDeserializer extends JsonDeserializer<DeleteRunResponse> {
    @Override
    public DeleteRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRunResponsePb pb = mapper.readValue(p, DeleteRunResponsePb.class);
      return DeleteRunResponse.fromPb(pb);
    }
  }
}
