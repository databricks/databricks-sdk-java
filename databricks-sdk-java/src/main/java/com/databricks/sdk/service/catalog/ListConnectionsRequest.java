// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** List connections */
@Generated
@JsonSerialize(using = ListConnectionsRequest.ListConnectionsRequestSerializer.class)
@JsonDeserialize(using = ListConnectionsRequest.ListConnectionsRequestDeserializer.class)
public class ListConnectionsRequest {
  /**
   * Maximum number of connections to return. - If not set, all connections are returned (not
   * recommended). - when set to a value greater than 0, the page length is the minimum of this
   * value and a server configured value; - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value less than 0, an invalid parameter error
   * is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListConnectionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListConnectionsRequest setPageToken(String pageToken) {
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
    ListConnectionsRequest that = (ListConnectionsRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListConnectionsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListConnectionsRequestPb toPb() {
    ListConnectionsRequestPb pb = new ListConnectionsRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListConnectionsRequest fromPb(ListConnectionsRequestPb pb) {
    ListConnectionsRequest model = new ListConnectionsRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListConnectionsRequestSerializer
      extends JsonSerializer<ListConnectionsRequest> {
    @Override
    public void serialize(
        ListConnectionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListConnectionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListConnectionsRequestDeserializer
      extends JsonDeserializer<ListConnectionsRequest> {
    @Override
    public ListConnectionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListConnectionsRequestPb pb = mapper.readValue(p, ListConnectionsRequestPb.class);
      return ListConnectionsRequest.fromPb(pb);
    }
  }
}
