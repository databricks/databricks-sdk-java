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
@JsonSerialize(using = CreateClusterResponse.CreateClusterResponseSerializer.class)
@JsonDeserialize(using = CreateClusterResponse.CreateClusterResponseDeserializer.class)
public class CreateClusterResponse {
  /** */
  private String clusterId;

  public CreateClusterResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateClusterResponse that = (CreateClusterResponse) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateClusterResponse.class).add("clusterId", clusterId).toString();
  }

  CreateClusterResponsePb toPb() {
    CreateClusterResponsePb pb = new CreateClusterResponsePb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static CreateClusterResponse fromPb(CreateClusterResponsePb pb) {
    CreateClusterResponse model = new CreateClusterResponse();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class CreateClusterResponseSerializer
      extends JsonSerializer<CreateClusterResponse> {
    @Override
    public void serialize(
        CreateClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateClusterResponseDeserializer
      extends JsonDeserializer<CreateClusterResponse> {
    @Override
    public CreateClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateClusterResponsePb pb = mapper.readValue(p, CreateClusterResponsePb.class);
      return CreateClusterResponse.fromPb(pb);
    }
  }
}
