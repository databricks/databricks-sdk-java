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

/** Delete a connection */
@Generated
@JsonSerialize(using = DeleteConnectionRequest.DeleteConnectionRequestSerializer.class)
@JsonDeserialize(using = DeleteConnectionRequest.DeleteConnectionRequestDeserializer.class)
public class DeleteConnectionRequest {
  /** The name of the connection to be deleted. */
  private String name;

  public DeleteConnectionRequest setName(String name) {
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
    DeleteConnectionRequest that = (DeleteConnectionRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteConnectionRequest.class).add("name", name).toString();
  }

  DeleteConnectionRequestPb toPb() {
    DeleteConnectionRequestPb pb = new DeleteConnectionRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteConnectionRequest fromPb(DeleteConnectionRequestPb pb) {
    DeleteConnectionRequest model = new DeleteConnectionRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteConnectionRequestSerializer
      extends JsonSerializer<DeleteConnectionRequest> {
    @Override
    public void serialize(
        DeleteConnectionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteConnectionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteConnectionRequestDeserializer
      extends JsonDeserializer<DeleteConnectionRequest> {
    @Override
    public DeleteConnectionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteConnectionRequestPb pb = mapper.readValue(p, DeleteConnectionRequestPb.class);
      return DeleteConnectionRequest.fromPb(pb);
    }
  }
}
