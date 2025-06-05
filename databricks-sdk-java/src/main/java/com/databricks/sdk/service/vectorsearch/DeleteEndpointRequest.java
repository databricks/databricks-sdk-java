// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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

/** Delete an endpoint */
@Generated
@JsonSerialize(using = DeleteEndpointRequest.DeleteEndpointRequestSerializer.class)
@JsonDeserialize(using = DeleteEndpointRequest.DeleteEndpointRequestDeserializer.class)
public class DeleteEndpointRequest {
  /** Name of the vector search endpoint */
  private String endpointName;

  public DeleteEndpointRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteEndpointRequest that = (DeleteEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteEndpointRequest.class).add("endpointName", endpointName).toString();
  }

  DeleteEndpointRequestPb toPb() {
    DeleteEndpointRequestPb pb = new DeleteEndpointRequestPb();
    pb.setEndpointName(endpointName);

    return pb;
  }

  static DeleteEndpointRequest fromPb(DeleteEndpointRequestPb pb) {
    DeleteEndpointRequest model = new DeleteEndpointRequest();
    model.setEndpointName(pb.getEndpointName());

    return model;
  }

  public static class DeleteEndpointRequestSerializer
      extends JsonSerializer<DeleteEndpointRequest> {
    @Override
    public void serialize(
        DeleteEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteEndpointRequestDeserializer
      extends JsonDeserializer<DeleteEndpointRequest> {
    @Override
    public DeleteEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteEndpointRequestPb pb = mapper.readValue(p, DeleteEndpointRequestPb.class);
      return DeleteEndpointRequest.fromPb(pb);
    }
  }
}
