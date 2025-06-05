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
@JsonSerialize(using = DeleteLoggedModelTagResponse.DeleteLoggedModelTagResponseSerializer.class)
@JsonDeserialize(
    using = DeleteLoggedModelTagResponse.DeleteLoggedModelTagResponseDeserializer.class)
public class DeleteLoggedModelTagResponse {

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
    return new ToStringer(DeleteLoggedModelTagResponse.class).toString();
  }

  DeleteLoggedModelTagResponsePb toPb() {
    DeleteLoggedModelTagResponsePb pb = new DeleteLoggedModelTagResponsePb();

    return pb;
  }

  static DeleteLoggedModelTagResponse fromPb(DeleteLoggedModelTagResponsePb pb) {
    DeleteLoggedModelTagResponse model = new DeleteLoggedModelTagResponse();

    return model;
  }

  public static class DeleteLoggedModelTagResponseSerializer
      extends JsonSerializer<DeleteLoggedModelTagResponse> {
    @Override
    public void serialize(
        DeleteLoggedModelTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteLoggedModelTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteLoggedModelTagResponseDeserializer
      extends JsonDeserializer<DeleteLoggedModelTagResponse> {
    @Override
    public DeleteLoggedModelTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteLoggedModelTagResponsePb pb = mapper.readValue(p, DeleteLoggedModelTagResponsePb.class);
      return DeleteLoggedModelTagResponse.fromPb(pb);
    }
  }
}
