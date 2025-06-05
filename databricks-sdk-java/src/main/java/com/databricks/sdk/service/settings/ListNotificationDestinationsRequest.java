// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** List notification destinations */
@Generated
@JsonSerialize(
    using = ListNotificationDestinationsRequest.ListNotificationDestinationsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListNotificationDestinationsRequest.ListNotificationDestinationsRequestDeserializer.class)
public class ListNotificationDestinationsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListNotificationDestinationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListNotificationDestinationsRequest setPageToken(String pageToken) {
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
    ListNotificationDestinationsRequest that = (ListNotificationDestinationsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNotificationDestinationsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListNotificationDestinationsRequestPb toPb() {
    ListNotificationDestinationsRequestPb pb = new ListNotificationDestinationsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListNotificationDestinationsRequest fromPb(ListNotificationDestinationsRequestPb pb) {
    ListNotificationDestinationsRequest model = new ListNotificationDestinationsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListNotificationDestinationsRequestSerializer
      extends JsonSerializer<ListNotificationDestinationsRequest> {
    @Override
    public void serialize(
        ListNotificationDestinationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNotificationDestinationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNotificationDestinationsRequestDeserializer
      extends JsonDeserializer<ListNotificationDestinationsRequest> {
    @Override
    public ListNotificationDestinationsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNotificationDestinationsRequestPb pb =
          mapper.readValue(p, ListNotificationDestinationsRequestPb.class);
      return ListNotificationDestinationsRequest.fromPb(pb);
    }
  }
}
