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
@JsonSerialize(using = DeleteTagResponse.DeleteTagResponseSerializer.class)
@JsonDeserialize(using = DeleteTagResponse.DeleteTagResponseDeserializer.class)
public class DeleteTagResponse {

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
    return new ToStringer(DeleteTagResponse.class).toString();
  }

  DeleteTagResponsePb toPb() {
    DeleteTagResponsePb pb = new DeleteTagResponsePb();

    return pb;
  }

  static DeleteTagResponse fromPb(DeleteTagResponsePb pb) {
    DeleteTagResponse model = new DeleteTagResponse();

    return model;
  }

  public static class DeleteTagResponseSerializer extends JsonSerializer<DeleteTagResponse> {
    @Override
    public void serialize(DeleteTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTagResponseDeserializer extends JsonDeserializer<DeleteTagResponse> {
    @Override
    public DeleteTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTagResponsePb pb = mapper.readValue(p, DeleteTagResponsePb.class);
      return DeleteTagResponse.fromPb(pb);
    }
  }
}
