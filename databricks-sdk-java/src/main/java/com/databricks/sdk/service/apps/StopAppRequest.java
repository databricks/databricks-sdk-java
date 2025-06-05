// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = StopAppRequest.StopAppRequestSerializer.class)
@JsonDeserialize(using = StopAppRequest.StopAppRequestDeserializer.class)
public class StopAppRequest {
  /** The name of the app. */
  private String name;

  public StopAppRequest setName(String name) {
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
    StopAppRequest that = (StopAppRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(StopAppRequest.class).add("name", name).toString();
  }

  StopAppRequestPb toPb() {
    StopAppRequestPb pb = new StopAppRequestPb();
    pb.setName(name);

    return pb;
  }

  static StopAppRequest fromPb(StopAppRequestPb pb) {
    StopAppRequest model = new StopAppRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class StopAppRequestSerializer extends JsonSerializer<StopAppRequest> {
    @Override
    public void serialize(StopAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StopAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StopAppRequestDeserializer extends JsonDeserializer<StopAppRequest> {
    @Override
    public StopAppRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StopAppRequestPb pb = mapper.readValue(p, StopAppRequestPb.class);
      return StopAppRequest.fromPb(pb);
    }
  }
}
