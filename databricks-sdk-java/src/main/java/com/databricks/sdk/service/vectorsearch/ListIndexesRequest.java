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

/** List indexes */
@Generated
@JsonSerialize(using = ListIndexesRequest.ListIndexesRequestSerializer.class)
@JsonDeserialize(using = ListIndexesRequest.ListIndexesRequestDeserializer.class)
public class ListIndexesRequest {
  /** Name of the endpoint */
  private String endpointName;

  /** Token for pagination */
  private String pageToken;

  public ListIndexesRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public ListIndexesRequest setPageToken(String pageToken) {
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
    ListIndexesRequest that = (ListIndexesRequest) o;
    return Objects.equals(endpointName, that.endpointName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListIndexesRequest.class)
        .add("endpointName", endpointName)
        .add("pageToken", pageToken)
        .toString();
  }

  ListIndexesRequestPb toPb() {
    ListIndexesRequestPb pb = new ListIndexesRequestPb();
    pb.setEndpointName(endpointName);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListIndexesRequest fromPb(ListIndexesRequestPb pb) {
    ListIndexesRequest model = new ListIndexesRequest();
    model.setEndpointName(pb.getEndpointName());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListIndexesRequestSerializer extends JsonSerializer<ListIndexesRequest> {
    @Override
    public void serialize(ListIndexesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListIndexesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListIndexesRequestDeserializer extends JsonDeserializer<ListIndexesRequest> {
    @Override
    public ListIndexesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListIndexesRequestPb pb = mapper.readValue(p, ListIndexesRequestPb.class);
      return ListIndexesRequest.fromPb(pb);
    }
  }
}
