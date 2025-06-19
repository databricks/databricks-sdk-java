// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Stop a warehouse */
@Generated
@JsonSerialize(using = StopRequest.StopRequestSerializer.class)
@JsonDeserialize(using = StopRequest.StopRequestDeserializer.class)
public class StopRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public StopRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StopRequest that = (StopRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(StopRequest.class).add("id", id).toString();
  }

  StopRequestPb toPb() {
    StopRequestPb pb = new StopRequestPb();
    pb.setId(id);

    return pb;
  }

  static StopRequest fromPb(StopRequestPb pb) {
    StopRequest model = new StopRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class StopRequestSerializer extends JsonSerializer<StopRequest> {
    @Override
    public void serialize(StopRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StopRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StopRequestDeserializer extends JsonDeserializer<StopRequest> {
    @Override
    public StopRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StopRequestPb pb = mapper.readValue(p, StopRequestPb.class);
      return StopRequest.fromPb(pb);
    }
  }
}
