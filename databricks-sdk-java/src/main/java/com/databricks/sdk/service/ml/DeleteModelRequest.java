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

/** Delete a model */
@Generated
@JsonSerialize(using = DeleteModelRequest.DeleteModelRequestSerializer.class)
@JsonDeserialize(using = DeleteModelRequest.DeleteModelRequestDeserializer.class)
public class DeleteModelRequest {
  /** Registered model unique name identifier. */
  private String name;

  public DeleteModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelRequest that = (DeleteModelRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelRequest.class).add("name", name).toString();
  }

  DeleteModelRequestPb toPb() {
    DeleteModelRequestPb pb = new DeleteModelRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteModelRequest fromPb(DeleteModelRequestPb pb) {
    DeleteModelRequest model = new DeleteModelRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteModelRequestSerializer extends JsonSerializer<DeleteModelRequest> {
    @Override
    public void serialize(DeleteModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelRequestDeserializer extends JsonDeserializer<DeleteModelRequest> {
    @Override
    public DeleteModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelRequestPb pb = mapper.readValue(p, DeleteModelRequestPb.class);
      return DeleteModelRequest.fromPb(pb);
    }
  }
}
