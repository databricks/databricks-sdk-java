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
@JsonSerialize(using = StartAppRequest.StartAppRequestSerializer.class)
@JsonDeserialize(using = StartAppRequest.StartAppRequestDeserializer.class)
public class StartAppRequest {
  /** The name of the app. */
  private String name;

  public StartAppRequest setName(String name) {
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
    StartAppRequest that = (StartAppRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(StartAppRequest.class).add("name", name).toString();
  }

  StartAppRequestPb toPb() {
    StartAppRequestPb pb = new StartAppRequestPb();
    pb.setName(name);

    return pb;
  }

  static StartAppRequest fromPb(StartAppRequestPb pb) {
    StartAppRequest model = new StartAppRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class StartAppRequestSerializer extends JsonSerializer<StartAppRequest> {
    @Override
    public void serialize(StartAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartAppRequestDeserializer extends JsonDeserializer<StartAppRequest> {
    @Override
    public StartAppRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartAppRequestPb pb = mapper.readValue(p, StartAppRequestPb.class);
      return StartAppRequest.fromPb(pb);
    }
  }
}
