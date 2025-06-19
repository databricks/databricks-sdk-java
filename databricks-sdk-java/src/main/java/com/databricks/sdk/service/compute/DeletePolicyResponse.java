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
@JsonSerialize(using = DeletePolicyResponse.DeletePolicyResponseSerializer.class)
@JsonDeserialize(using = DeletePolicyResponse.DeletePolicyResponseDeserializer.class)
public class DeletePolicyResponse {

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
    return new ToStringer(DeletePolicyResponse.class).toString();
  }

  DeletePolicyResponsePb toPb() {
    DeletePolicyResponsePb pb = new DeletePolicyResponsePb();

    return pb;
  }

  static DeletePolicyResponse fromPb(DeletePolicyResponsePb pb) {
    DeletePolicyResponse model = new DeletePolicyResponse();

    return model;
  }

  public static class DeletePolicyResponseSerializer extends JsonSerializer<DeletePolicyResponse> {
    @Override
    public void serialize(
        DeletePolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePolicyResponseDeserializer
      extends JsonDeserializer<DeletePolicyResponse> {
    @Override
    public DeletePolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePolicyResponsePb pb = mapper.readValue(p, DeletePolicyResponsePb.class);
      return DeletePolicyResponse.fromPb(pb);
    }
  }
}
