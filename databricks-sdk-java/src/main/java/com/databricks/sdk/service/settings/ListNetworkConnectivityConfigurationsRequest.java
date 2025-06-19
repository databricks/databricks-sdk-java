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

/** List network connectivity configurations */
@Generated
@JsonSerialize(
    using =
        ListNetworkConnectivityConfigurationsRequest
            .ListNetworkConnectivityConfigurationsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListNetworkConnectivityConfigurationsRequest
            .ListNetworkConnectivityConfigurationsRequestDeserializer.class)
public class ListNetworkConnectivityConfigurationsRequest {
  /** Pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListNetworkConnectivityConfigurationsRequest setPageToken(String pageToken) {
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
    ListNetworkConnectivityConfigurationsRequest that =
        (ListNetworkConnectivityConfigurationsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkConnectivityConfigurationsRequest.class)
        .add("pageToken", pageToken)
        .toString();
  }

  ListNetworkConnectivityConfigurationsRequestPb toPb() {
    ListNetworkConnectivityConfigurationsRequestPb pb =
        new ListNetworkConnectivityConfigurationsRequestPb();
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListNetworkConnectivityConfigurationsRequest fromPb(
      ListNetworkConnectivityConfigurationsRequestPb pb) {
    ListNetworkConnectivityConfigurationsRequest model =
        new ListNetworkConnectivityConfigurationsRequest();
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListNetworkConnectivityConfigurationsRequestSerializer
      extends JsonSerializer<ListNetworkConnectivityConfigurationsRequest> {
    @Override
    public void serialize(
        ListNetworkConnectivityConfigurationsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListNetworkConnectivityConfigurationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNetworkConnectivityConfigurationsRequestDeserializer
      extends JsonDeserializer<ListNetworkConnectivityConfigurationsRequest> {
    @Override
    public ListNetworkConnectivityConfigurationsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNetworkConnectivityConfigurationsRequestPb pb =
          mapper.readValue(p, ListNetworkConnectivityConfigurationsRequestPb.class);
      return ListNetworkConnectivityConfigurationsRequest.fromPb(pb);
    }
  }
}
