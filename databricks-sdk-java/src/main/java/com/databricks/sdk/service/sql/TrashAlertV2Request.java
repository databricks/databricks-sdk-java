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
@JsonSerialize(using = TrashAlertV2Request.TrashAlertV2RequestSerializer.class)
@JsonDeserialize(using = TrashAlertV2Request.TrashAlertV2RequestDeserializer.class)
public class TrashAlertV2Request {
  /** */
  private String id;

  public TrashAlertV2Request setId(String id) {
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
    TrashAlertV2Request that = (TrashAlertV2Request) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(TrashAlertV2Request.class).add("id", id).toString();
  }

  TrashAlertV2RequestPb toPb() {
    TrashAlertV2RequestPb pb = new TrashAlertV2RequestPb();
    pb.setId(id);

    return pb;
  }

  static TrashAlertV2Request fromPb(TrashAlertV2RequestPb pb) {
    TrashAlertV2Request model = new TrashAlertV2Request();
    model.setId(pb.getId());

    return model;
  }

  public static class TrashAlertV2RequestSerializer extends JsonSerializer<TrashAlertV2Request> {
    @Override
    public void serialize(TrashAlertV2Request value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrashAlertV2RequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrashAlertV2RequestDeserializer
      extends JsonDeserializer<TrashAlertV2Request> {
    @Override
    public TrashAlertV2Request deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrashAlertV2RequestPb pb = mapper.readValue(p, TrashAlertV2RequestPb.class);
      return TrashAlertV2Request.fromPb(pb);
    }
  }
}
