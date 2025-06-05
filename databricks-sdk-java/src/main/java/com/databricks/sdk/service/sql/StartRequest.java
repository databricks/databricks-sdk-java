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

/** Start a warehouse */
@Generated
@JsonSerialize(using = StartRequest.StartRequestSerializer.class)
@JsonDeserialize(using = StartRequest.StartRequestDeserializer.class)
public class StartRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public StartRequest setId(String id) {
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
    StartRequest that = (StartRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(StartRequest.class).add("id", id).toString();
  }

  StartRequestPb toPb() {
    StartRequestPb pb = new StartRequestPb();
    pb.setId(id);

    return pb;
  }

  static StartRequest fromPb(StartRequestPb pb) {
    StartRequest model = new StartRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class StartRequestSerializer extends JsonSerializer<StartRequest> {
    @Override
    public void serialize(StartRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartRequestDeserializer extends JsonDeserializer<StartRequest> {
    @Override
    public StartRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartRequestPb pb = mapper.readValue(p, StartRequestPb.class);
      return StartRequest.fromPb(pb);
    }
  }
}
