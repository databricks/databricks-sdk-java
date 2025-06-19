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

/** Get a single serving endpoint */
@Generated
@JsonSerialize(using = GetServingEndpointRequest.GetServingEndpointRequestSerializer.class)
@JsonDeserialize(using = GetServingEndpointRequest.GetServingEndpointRequestDeserializer.class)
public class GetServingEndpointRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  public GetServingEndpointRequest setName(String name) {
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
    GetServingEndpointRequest that = (GetServingEndpointRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServingEndpointRequest.class).add("name", name).toString();
  }

  GetServingEndpointRequestPb toPb() {
    GetServingEndpointRequestPb pb = new GetServingEndpointRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetServingEndpointRequest fromPb(GetServingEndpointRequestPb pb) {
    GetServingEndpointRequest model = new GetServingEndpointRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetServingEndpointRequestSerializer
      extends JsonSerializer<GetServingEndpointRequest> {
    @Override
    public void serialize(
        GetServingEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetServingEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServingEndpointRequestDeserializer
      extends JsonDeserializer<GetServingEndpointRequest> {
    @Override
    public GetServingEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServingEndpointRequestPb pb = mapper.readValue(p, GetServingEndpointRequestPb.class);
      return GetServingEndpointRequest.fromPb(pb);
    }
  }
}
