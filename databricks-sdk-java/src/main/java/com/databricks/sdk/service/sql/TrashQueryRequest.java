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

/** Delete a query */
@Generated
@JsonSerialize(using = TrashQueryRequest.TrashQueryRequestSerializer.class)
@JsonDeserialize(using = TrashQueryRequest.TrashQueryRequestDeserializer.class)
public class TrashQueryRequest {
  /** */
  private String id;

  public TrashQueryRequest setId(String id) {
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
    TrashQueryRequest that = (TrashQueryRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(TrashQueryRequest.class).add("id", id).toString();
  }

  TrashQueryRequestPb toPb() {
    TrashQueryRequestPb pb = new TrashQueryRequestPb();
    pb.setId(id);

    return pb;
  }

  static TrashQueryRequest fromPb(TrashQueryRequestPb pb) {
    TrashQueryRequest model = new TrashQueryRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class TrashQueryRequestSerializer extends JsonSerializer<TrashQueryRequest> {
    @Override
    public void serialize(TrashQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrashQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrashQueryRequestDeserializer extends JsonDeserializer<TrashQueryRequest> {
    @Override
    public TrashQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrashQueryRequestPb pb = mapper.readValue(p, TrashQueryRequestPb.class);
      return TrashQueryRequest.fromPb(pb);
    }
  }
}
