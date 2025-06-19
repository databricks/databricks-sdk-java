// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Delete a serving endpoint */
@Generated
@JsonSerialize(using = DeleteServingEndpointRequest.DeleteServingEndpointRequestSerializer.class)
@JsonDeserialize(
    using = DeleteServingEndpointRequest.DeleteServingEndpointRequestDeserializer.class)
public class DeleteServingEndpointRequest {
  /** */
  private String name;

  public DeleteServingEndpointRequest setName(String name) {
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
    DeleteServingEndpointRequest that = (DeleteServingEndpointRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServingEndpointRequest.class).add("name", name).toString();
  }

  DeleteServingEndpointRequestPb toPb() {
    DeleteServingEndpointRequestPb pb = new DeleteServingEndpointRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteServingEndpointRequest fromPb(DeleteServingEndpointRequestPb pb) {
    DeleteServingEndpointRequest model = new DeleteServingEndpointRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteServingEndpointRequestSerializer
      extends JsonSerializer<DeleteServingEndpointRequest> {
    @Override
    public void serialize(
        DeleteServingEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteServingEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteServingEndpointRequestDeserializer
      extends JsonDeserializer<DeleteServingEndpointRequest> {
    @Override
    public DeleteServingEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteServingEndpointRequestPb pb = mapper.readValue(p, DeleteServingEndpointRequestPb.class);
      return DeleteServingEndpointRequest.fromPb(pb);
    }
  }
}
