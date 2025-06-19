// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/** Delete a clean room */
@Generated
@JsonSerialize(using = DeleteCleanRoomRequest.DeleteCleanRoomRequestSerializer.class)
@JsonDeserialize(using = DeleteCleanRoomRequest.DeleteCleanRoomRequestDeserializer.class)
public class DeleteCleanRoomRequest {
  /** Name of the clean room. */
  private String name;

  public DeleteCleanRoomRequest setName(String name) {
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
    DeleteCleanRoomRequest that = (DeleteCleanRoomRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCleanRoomRequest.class).add("name", name).toString();
  }

  DeleteCleanRoomRequestPb toPb() {
    DeleteCleanRoomRequestPb pb = new DeleteCleanRoomRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteCleanRoomRequest fromPb(DeleteCleanRoomRequestPb pb) {
    DeleteCleanRoomRequest model = new DeleteCleanRoomRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteCleanRoomRequestSerializer
      extends JsonSerializer<DeleteCleanRoomRequest> {
    @Override
    public void serialize(
        DeleteCleanRoomRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCleanRoomRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCleanRoomRequestDeserializer
      extends JsonDeserializer<DeleteCleanRoomRequest> {
    @Override
    public DeleteCleanRoomRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCleanRoomRequestPb pb = mapper.readValue(p, DeleteCleanRoomRequestPb.class);
      return DeleteCleanRoomRequest.fromPb(pb);
    }
  }
}
