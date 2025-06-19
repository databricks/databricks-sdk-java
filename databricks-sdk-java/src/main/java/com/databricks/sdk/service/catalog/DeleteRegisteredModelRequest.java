// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Delete a Registered Model */
@Generated
@JsonSerialize(using = DeleteRegisteredModelRequest.DeleteRegisteredModelRequestSerializer.class)
@JsonDeserialize(
    using = DeleteRegisteredModelRequest.DeleteRegisteredModelRequestDeserializer.class)
public class DeleteRegisteredModelRequest {
  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  public DeleteRegisteredModelRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRegisteredModelRequest that = (DeleteRegisteredModelRequest) o;
    return Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRegisteredModelRequest.class).add("fullName", fullName).toString();
  }

  DeleteRegisteredModelRequestPb toPb() {
    DeleteRegisteredModelRequestPb pb = new DeleteRegisteredModelRequestPb();
    pb.setFullName(fullName);

    return pb;
  }

  static DeleteRegisteredModelRequest fromPb(DeleteRegisteredModelRequestPb pb) {
    DeleteRegisteredModelRequest model = new DeleteRegisteredModelRequest();
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class DeleteRegisteredModelRequestSerializer
      extends JsonSerializer<DeleteRegisteredModelRequest> {
    @Override
    public void serialize(
        DeleteRegisteredModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRegisteredModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRegisteredModelRequestDeserializer
      extends JsonDeserializer<DeleteRegisteredModelRequest> {
    @Override
    public DeleteRegisteredModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRegisteredModelRequestPb pb = mapper.readValue(p, DeleteRegisteredModelRequestPb.class);
      return DeleteRegisteredModelRequest.fromPb(pb);
    }
  }
}
