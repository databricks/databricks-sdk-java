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

/** Get an endpoint */
@Generated
@JsonSerialize(using = GetEndpointRequest.GetEndpointRequestSerializer.class)
@JsonDeserialize(using = GetEndpointRequest.GetEndpointRequestDeserializer.class)
public class GetEndpointRequest {
  /** Name of the endpoint */
  private String endpointName;

  public GetEndpointRequest setEndpointName(String endpointName) {
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
    GetEndpointRequest that = (GetEndpointRequest) o;
    return Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEndpointRequest.class).add("endpointName", endpointName).toString();
  }

  GetEndpointRequestPb toPb() {
    GetEndpointRequestPb pb = new GetEndpointRequestPb();
    pb.setEndpointName(endpointName);

    return pb;
  }

  static GetEndpointRequest fromPb(GetEndpointRequestPb pb) {
    GetEndpointRequest model = new GetEndpointRequest();
    model.setEndpointName(pb.getEndpointName());

    return model;
  }

  public static class GetEndpointRequestSerializer extends JsonSerializer<GetEndpointRequest> {
    @Override
    public void serialize(GetEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetEndpointRequestDeserializer extends JsonDeserializer<GetEndpointRequest> {
    @Override
    public GetEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetEndpointRequestPb pb = mapper.readValue(p, GetEndpointRequestPb.class);
      return GetEndpointRequest.fromPb(pb);
    }
  }
}
