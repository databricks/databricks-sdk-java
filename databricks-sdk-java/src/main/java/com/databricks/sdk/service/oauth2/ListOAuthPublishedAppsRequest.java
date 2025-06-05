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

/** Get all the published OAuth apps */
@Generated
@JsonSerialize(using = ListOAuthPublishedAppsRequest.ListOAuthPublishedAppsRequestSerializer.class)
@JsonDeserialize(
    using = ListOAuthPublishedAppsRequest.ListOAuthPublishedAppsRequestDeserializer.class)
public class ListOAuthPublishedAppsRequest {
  /** The max number of OAuth published apps to return in one page. */
  private Long pageSize;

  /** A token that can be used to get the next page of results. */
  private String pageToken;

  public ListOAuthPublishedAppsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListOAuthPublishedAppsRequest setPageToken(String pageToken) {
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
    ListOAuthPublishedAppsRequest that = (ListOAuthPublishedAppsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListOAuthPublishedAppsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListOAuthPublishedAppsRequestPb toPb() {
    ListOAuthPublishedAppsRequestPb pb = new ListOAuthPublishedAppsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListOAuthPublishedAppsRequest fromPb(ListOAuthPublishedAppsRequestPb pb) {
    ListOAuthPublishedAppsRequest model = new ListOAuthPublishedAppsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListOAuthPublishedAppsRequestSerializer
      extends JsonSerializer<ListOAuthPublishedAppsRequest> {
    @Override
    public void serialize(
        ListOAuthPublishedAppsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListOAuthPublishedAppsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListOAuthPublishedAppsRequestDeserializer
      extends JsonDeserializer<ListOAuthPublishedAppsRequest> {
    @Override
    public ListOAuthPublishedAppsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListOAuthPublishedAppsRequestPb pb =
          mapper.readValue(p, ListOAuthPublishedAppsRequestPb.class);
      return ListOAuthPublishedAppsRequest.fromPb(pb);
    }
  }
}
