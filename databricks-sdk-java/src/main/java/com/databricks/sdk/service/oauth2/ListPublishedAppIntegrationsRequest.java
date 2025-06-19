// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** Get published oauth app integrations */
@Generated
@JsonSerialize(
    using = ListPublishedAppIntegrationsRequest.ListPublishedAppIntegrationsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListPublishedAppIntegrationsRequest.ListPublishedAppIntegrationsRequestDeserializer.class)
public class ListPublishedAppIntegrationsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListPublishedAppIntegrationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListPublishedAppIntegrationsRequest setPageToken(String pageToken) {
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
    ListPublishedAppIntegrationsRequest that = (ListPublishedAppIntegrationsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPublishedAppIntegrationsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListPublishedAppIntegrationsRequestPb toPb() {
    ListPublishedAppIntegrationsRequestPb pb = new ListPublishedAppIntegrationsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListPublishedAppIntegrationsRequest fromPb(ListPublishedAppIntegrationsRequestPb pb) {
    ListPublishedAppIntegrationsRequest model = new ListPublishedAppIntegrationsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListPublishedAppIntegrationsRequestSerializer
      extends JsonSerializer<ListPublishedAppIntegrationsRequest> {
    @Override
    public void serialize(
        ListPublishedAppIntegrationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPublishedAppIntegrationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPublishedAppIntegrationsRequestDeserializer
      extends JsonDeserializer<ListPublishedAppIntegrationsRequest> {
    @Override
    public ListPublishedAppIntegrationsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPublishedAppIntegrationsRequestPb pb =
          mapper.readValue(p, ListPublishedAppIntegrationsRequestPb.class);
      return ListPublishedAppIntegrationsRequest.fromPb(pb);
    }
  }
}
