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
@JsonSerialize(using = DeleteAclResponse.DeleteAclResponseSerializer.class)
@JsonDeserialize(using = DeleteAclResponse.DeleteAclResponseDeserializer.class)
public class DeleteAclResponse {

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
    return new ToStringer(DeleteAclResponse.class).toString();
  }

  DeleteAclResponsePb toPb() {
    DeleteAclResponsePb pb = new DeleteAclResponsePb();

    return pb;
  }

  static DeleteAclResponse fromPb(DeleteAclResponsePb pb) {
    DeleteAclResponse model = new DeleteAclResponse();

    return model;
  }

  public static class DeleteAclResponseSerializer extends JsonSerializer<DeleteAclResponse> {
    @Override
    public void serialize(DeleteAclResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAclResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAclResponseDeserializer extends JsonDeserializer<DeleteAclResponse> {
    @Override
    public DeleteAclResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAclResponsePb pb = mapper.readValue(p, DeleteAclResponsePb.class);
      return DeleteAclResponse.fromPb(pb);
    }
  }
}
