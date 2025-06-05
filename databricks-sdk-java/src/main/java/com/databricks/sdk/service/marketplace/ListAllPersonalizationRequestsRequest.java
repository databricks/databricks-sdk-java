// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** List all personalization requests */
@Generated
@JsonSerialize(
    using =
        ListAllPersonalizationRequestsRequest.ListAllPersonalizationRequestsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListAllPersonalizationRequestsRequest.ListAllPersonalizationRequestsRequestDeserializer
            .class)
public class ListAllPersonalizationRequestsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListAllPersonalizationRequestsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAllPersonalizationRequestsRequest setPageToken(String pageToken) {
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
    ListAllPersonalizationRequestsRequest that = (ListAllPersonalizationRequestsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllPersonalizationRequestsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAllPersonalizationRequestsRequestPb toPb() {
    ListAllPersonalizationRequestsRequestPb pb = new ListAllPersonalizationRequestsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAllPersonalizationRequestsRequest fromPb(ListAllPersonalizationRequestsRequestPb pb) {
    ListAllPersonalizationRequestsRequest model = new ListAllPersonalizationRequestsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAllPersonalizationRequestsRequestSerializer
      extends JsonSerializer<ListAllPersonalizationRequestsRequest> {
    @Override
    public void serialize(
        ListAllPersonalizationRequestsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAllPersonalizationRequestsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAllPersonalizationRequestsRequestDeserializer
      extends JsonDeserializer<ListAllPersonalizationRequestsRequest> {
    @Override
    public ListAllPersonalizationRequestsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAllPersonalizationRequestsRequestPb pb =
          mapper.readValue(p, ListAllPersonalizationRequestsRequestPb.class);
      return ListAllPersonalizationRequestsRequest.fromPb(pb);
    }
  }
}
