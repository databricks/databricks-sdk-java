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

/** Create a clean room */
@Generated
@JsonSerialize(using = CreateCleanRoomRequest.CreateCleanRoomRequestSerializer.class)
@JsonDeserialize(using = CreateCleanRoomRequest.CreateCleanRoomRequestDeserializer.class)
public class CreateCleanRoomRequest {
  /** */
  private CleanRoom cleanRoom;

  public CreateCleanRoomRequest setCleanRoom(CleanRoom cleanRoom) {
    this.cleanRoom = cleanRoom;
    return this;
  }

  public CleanRoom getCleanRoom() {
    return cleanRoom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomRequest that = (CreateCleanRoomRequest) o;
    return Objects.equals(cleanRoom, that.cleanRoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoom);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomRequest.class).add("cleanRoom", cleanRoom).toString();
  }

  CreateCleanRoomRequestPb toPb() {
    CreateCleanRoomRequestPb pb = new CreateCleanRoomRequestPb();
    pb.setCleanRoom(cleanRoom);

    return pb;
  }

  static CreateCleanRoomRequest fromPb(CreateCleanRoomRequestPb pb) {
    CreateCleanRoomRequest model = new CreateCleanRoomRequest();
    model.setCleanRoom(pb.getCleanRoom());

    return model;
  }

  public static class CreateCleanRoomRequestSerializer
      extends JsonSerializer<CreateCleanRoomRequest> {
    @Override
    public void serialize(
        CreateCleanRoomRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCleanRoomRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCleanRoomRequestDeserializer
      extends JsonDeserializer<CreateCleanRoomRequest> {
    @Override
    public CreateCleanRoomRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCleanRoomRequestPb pb = mapper.readValue(p, CreateCleanRoomRequestPb.class);
      return CreateCleanRoomRequest.fromPb(pb);
    }
  }
}
