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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListEndpointsResponse.ListEndpointsResponseSerializer.class)
@JsonDeserialize(using = ListEndpointsResponse.ListEndpointsResponseDeserializer.class)
public class ListEndpointsResponse {
  /** The list of endpoints. */
  private Collection<ServingEndpoint> endpoints;

  public ListEndpointsResponse setEndpoints(Collection<ServingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<ServingEndpoint> getEndpoints() {
    return endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEndpointsResponse that = (ListEndpointsResponse) o;
    return Objects.equals(endpoints, that.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsResponse.class).add("endpoints", endpoints).toString();
  }

  ListEndpointsResponsePb toPb() {
    ListEndpointsResponsePb pb = new ListEndpointsResponsePb();
    pb.setEndpoints(endpoints);

    return pb;
  }

  static ListEndpointsResponse fromPb(ListEndpointsResponsePb pb) {
    ListEndpointsResponse model = new ListEndpointsResponse();
    model.setEndpoints(pb.getEndpoints());

    return model;
  }

  public static class ListEndpointsResponseSerializer
      extends JsonSerializer<ListEndpointsResponse> {
    @Override
    public void serialize(
        ListEndpointsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListEndpointsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListEndpointsResponseDeserializer
      extends JsonDeserializer<ListEndpointsResponse> {
    @Override
    public ListEndpointsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListEndpointsResponsePb pb = mapper.readValue(p, ListEndpointsResponsePb.class);
      return ListEndpointsResponse.fromPb(pb);
    }
  }
}
