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

/** List all endpoints */
@Generated
@JsonSerialize(using = ListEndpointsRequest.ListEndpointsRequestSerializer.class)
@JsonDeserialize(using = ListEndpointsRequest.ListEndpointsRequestDeserializer.class)
public class ListEndpointsRequest {
  /** Token for pagination */
  private String pageToken;

  public ListEndpointsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEndpointsRequest that = (ListEndpointsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsRequest.class).add("pageToken", pageToken).toString();
  }

  ListEndpointsRequestPb toPb() {
    ListEndpointsRequestPb pb = new ListEndpointsRequestPb();
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListEndpointsRequest fromPb(ListEndpointsRequestPb pb) {
    ListEndpointsRequest model = new ListEndpointsRequest();
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListEndpointsRequestSerializer extends JsonSerializer<ListEndpointsRequest> {
    @Override
    public void serialize(
        ListEndpointsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListEndpointsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListEndpointsRequestDeserializer
      extends JsonDeserializer<ListEndpointsRequest> {
    @Override
    public ListEndpointsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListEndpointsRequestPb pb = mapper.readValue(p, ListEndpointsRequestPb.class);
      return ListEndpointsRequest.fromPb(pb);
    }
  }
}
