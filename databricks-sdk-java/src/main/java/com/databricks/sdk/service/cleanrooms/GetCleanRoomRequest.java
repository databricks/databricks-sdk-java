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

/** Get a clean room */
@Generated
@JsonSerialize(using = GetCleanRoomRequest.GetCleanRoomRequestSerializer.class)
@JsonDeserialize(using = GetCleanRoomRequest.GetCleanRoomRequestDeserializer.class)
public class GetCleanRoomRequest {
  /** */
  private String name;

  public GetCleanRoomRequest setName(String name) {
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
    GetCleanRoomRequest that = (GetCleanRoomRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCleanRoomRequest.class).add("name", name).toString();
  }

  GetCleanRoomRequestPb toPb() {
    GetCleanRoomRequestPb pb = new GetCleanRoomRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetCleanRoomRequest fromPb(GetCleanRoomRequestPb pb) {
    GetCleanRoomRequest model = new GetCleanRoomRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetCleanRoomRequestSerializer extends JsonSerializer<GetCleanRoomRequest> {
    @Override
    public void serialize(GetCleanRoomRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCleanRoomRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCleanRoomRequestDeserializer
      extends JsonDeserializer<GetCleanRoomRequest> {
    @Override
    public GetCleanRoomRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCleanRoomRequestPb pb = mapper.readValue(p, GetCleanRoomRequestPb.class);
      return GetCleanRoomRequest.fromPb(pb);
    }
  }
}
