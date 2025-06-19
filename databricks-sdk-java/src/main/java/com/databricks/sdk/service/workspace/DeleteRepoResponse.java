// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = DeleteRepoResponse.DeleteRepoResponseSerializer.class)
@JsonDeserialize(using = DeleteRepoResponse.DeleteRepoResponseDeserializer.class)
public class DeleteRepoResponse {

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
    return new ToStringer(DeleteRepoResponse.class).toString();
  }

  DeleteRepoResponsePb toPb() {
    DeleteRepoResponsePb pb = new DeleteRepoResponsePb();

    return pb;
  }

  static DeleteRepoResponse fromPb(DeleteRepoResponsePb pb) {
    DeleteRepoResponse model = new DeleteRepoResponse();

    return model;
  }

  public static class DeleteRepoResponseSerializer extends JsonSerializer<DeleteRepoResponse> {
    @Override
    public void serialize(DeleteRepoResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRepoResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRepoResponseDeserializer extends JsonDeserializer<DeleteRepoResponse> {
    @Override
    public DeleteRepoResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRepoResponsePb pb = mapper.readValue(p, DeleteRepoResponsePb.class);
      return DeleteRepoResponse.fromPb(pb);
    }
  }
}
