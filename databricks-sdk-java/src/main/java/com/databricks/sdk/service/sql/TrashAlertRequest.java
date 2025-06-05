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

/** Delete an alert */
@Generated
@JsonSerialize(using = TrashAlertRequest.TrashAlertRequestSerializer.class)
@JsonDeserialize(using = TrashAlertRequest.TrashAlertRequestDeserializer.class)
public class TrashAlertRequest {
  /** */
  private String id;

  public TrashAlertRequest setId(String id) {
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
    TrashAlertRequest that = (TrashAlertRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(TrashAlertRequest.class).add("id", id).toString();
  }

  TrashAlertRequestPb toPb() {
    TrashAlertRequestPb pb = new TrashAlertRequestPb();
    pb.setId(id);

    return pb;
  }

  static TrashAlertRequest fromPb(TrashAlertRequestPb pb) {
    TrashAlertRequest model = new TrashAlertRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class TrashAlertRequestSerializer extends JsonSerializer<TrashAlertRequest> {
    @Override
    public void serialize(TrashAlertRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrashAlertRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrashAlertRequestDeserializer extends JsonDeserializer<TrashAlertRequest> {
    @Override
    public TrashAlertRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrashAlertRequestPb pb = mapper.readValue(p, TrashAlertRequestPb.class);
      return TrashAlertRequest.fromPb(pb);
    }
  }
}
