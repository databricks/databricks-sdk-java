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

@Generated
@JsonSerialize(using = UpdateCleanRoomRequest.UpdateCleanRoomRequestSerializer.class)
@JsonDeserialize(using = UpdateCleanRoomRequest.UpdateCleanRoomRequestDeserializer.class)
public class UpdateCleanRoomRequest {
  /** */
  private CleanRoom cleanRoom;

  /** Name of the clean room. */
  private String name;

  public UpdateCleanRoomRequest setCleanRoom(CleanRoom cleanRoom) {
    this.cleanRoom = cleanRoom;
    return this;
  }

  public CleanRoom getCleanRoom() {
    return cleanRoom;
  }

  public UpdateCleanRoomRequest setName(String name) {
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
    UpdateCleanRoomRequest that = (UpdateCleanRoomRequest) o;
    return Objects.equals(cleanRoom, that.cleanRoom) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoom, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoomRequest.class)
        .add("cleanRoom", cleanRoom)
        .add("name", name)
        .toString();
  }

  UpdateCleanRoomRequestPb toPb() {
    UpdateCleanRoomRequestPb pb = new UpdateCleanRoomRequestPb();
    pb.setCleanRoom(cleanRoom);
    pb.setName(name);

    return pb;
  }

  static UpdateCleanRoomRequest fromPb(UpdateCleanRoomRequestPb pb) {
    UpdateCleanRoomRequest model = new UpdateCleanRoomRequest();
    model.setCleanRoom(pb.getCleanRoom());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateCleanRoomRequestSerializer
      extends JsonSerializer<UpdateCleanRoomRequest> {
    @Override
    public void serialize(
        UpdateCleanRoomRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCleanRoomRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCleanRoomRequestDeserializer
      extends JsonDeserializer<UpdateCleanRoomRequest> {
    @Override
    public UpdateCleanRoomRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCleanRoomRequestPb pb = mapper.readValue(p, UpdateCleanRoomRequestPb.class);
      return UpdateCleanRoomRequest.fromPb(pb);
    }
  }
}
