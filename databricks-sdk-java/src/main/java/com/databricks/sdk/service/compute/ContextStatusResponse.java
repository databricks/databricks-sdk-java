// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ContextStatusResponse.ContextStatusResponseSerializer.class)
@JsonDeserialize(using = ContextStatusResponse.ContextStatusResponseDeserializer.class)
public class ContextStatusResponse {
  /** */
  private String id;

  /** */
  private ContextStatus status;

  public ContextStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ContextStatusResponse setStatus(ContextStatus status) {
    this.status = status;
    return this;
  }

  public ContextStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextStatusResponse that = (ContextStatusResponse) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusResponse.class)
        .add("id", id)
        .add("status", status)
        .toString();
  }

  ContextStatusResponsePb toPb() {
    ContextStatusResponsePb pb = new ContextStatusResponsePb();
    pb.setId(id);
    pb.setStatus(status);

    return pb;
  }

  static ContextStatusResponse fromPb(ContextStatusResponsePb pb) {
    ContextStatusResponse model = new ContextStatusResponse();
    model.setId(pb.getId());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class ContextStatusResponseSerializer
      extends JsonSerializer<ContextStatusResponse> {
    @Override
    public void serialize(
        ContextStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ContextStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ContextStatusResponseDeserializer
      extends JsonDeserializer<ContextStatusResponse> {
    @Override
    public ContextStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ContextStatusResponsePb pb = mapper.readValue(p, ContextStatusResponsePb.class);
      return ContextStatusResponse.fromPb(pb);
    }
  }
}
