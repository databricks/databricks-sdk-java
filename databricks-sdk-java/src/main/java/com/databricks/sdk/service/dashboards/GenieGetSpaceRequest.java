// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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

/** Get Genie Space */
@Generated
@JsonSerialize(using = GenieGetSpaceRequest.GenieGetSpaceRequestSerializer.class)
@JsonDeserialize(using = GenieGetSpaceRequest.GenieGetSpaceRequestDeserializer.class)
public class GenieGetSpaceRequest {
  /** The ID associated with the Genie space */
  private String spaceId;

  public GenieGetSpaceRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGetSpaceRequest that = (GenieGetSpaceRequest) o;
    return Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetSpaceRequest.class).add("spaceId", spaceId).toString();
  }

  GenieGetSpaceRequestPb toPb() {
    GenieGetSpaceRequestPb pb = new GenieGetSpaceRequestPb();
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieGetSpaceRequest fromPb(GenieGetSpaceRequestPb pb) {
    GenieGetSpaceRequest model = new GenieGetSpaceRequest();
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieGetSpaceRequestSerializer extends JsonSerializer<GenieGetSpaceRequest> {
    @Override
    public void serialize(
        GenieGetSpaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieGetSpaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetSpaceRequestDeserializer
      extends JsonDeserializer<GenieGetSpaceRequest> {
    @Override
    public GenieGetSpaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetSpaceRequestPb pb = mapper.readValue(p, GenieGetSpaceRequestPb.class);
      return GenieGetSpaceRequest.fromPb(pb);
    }
  }
}
