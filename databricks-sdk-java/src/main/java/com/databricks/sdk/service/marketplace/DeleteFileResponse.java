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
@JsonSerialize(using = DeleteFileResponse.DeleteFileResponseSerializer.class)
@JsonDeserialize(using = DeleteFileResponse.DeleteFileResponseDeserializer.class)
public class DeleteFileResponse {

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
    return new ToStringer(DeleteFileResponse.class).toString();
  }

  DeleteFileResponsePb toPb() {
    DeleteFileResponsePb pb = new DeleteFileResponsePb();

    return pb;
  }

  static DeleteFileResponse fromPb(DeleteFileResponsePb pb) {
    DeleteFileResponse model = new DeleteFileResponse();

    return model;
  }

  public static class DeleteFileResponseSerializer extends JsonSerializer<DeleteFileResponse> {
    @Override
    public void serialize(DeleteFileResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteFileResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteFileResponseDeserializer extends JsonDeserializer<DeleteFileResponse> {
    @Override
    public DeleteFileResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteFileResponsePb pb = mapper.readValue(p, DeleteFileResponsePb.class);
      return DeleteFileResponse.fromPb(pb);
    }
  }
}
