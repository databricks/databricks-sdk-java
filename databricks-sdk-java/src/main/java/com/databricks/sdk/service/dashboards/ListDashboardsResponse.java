// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = ListDashboardsResponse.ListDashboardsResponseSerializer.class)
@JsonDeserialize(using = ListDashboardsResponse.ListDashboardsResponseDeserializer.class)
public class ListDashboardsResponse {
  /** */
  private Collection<Dashboard> dashboards;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent dashboards.
   */
  private String nextPageToken;

  public ListDashboardsResponse setDashboards(Collection<Dashboard> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public Collection<Dashboard> getDashboards() {
    return dashboards;
  }

  public ListDashboardsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDashboardsResponse that = (ListDashboardsResponse) o;
    return Objects.equals(dashboards, that.dashboards)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsResponse.class)
        .add("dashboards", dashboards)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListDashboardsResponsePb toPb() {
    ListDashboardsResponsePb pb = new ListDashboardsResponsePb();
    pb.setDashboards(dashboards);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListDashboardsResponse fromPb(ListDashboardsResponsePb pb) {
    ListDashboardsResponse model = new ListDashboardsResponse();
    model.setDashboards(pb.getDashboards());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListDashboardsResponseSerializer
      extends JsonSerializer<ListDashboardsResponse> {
    @Override
    public void serialize(
        ListDashboardsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDashboardsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDashboardsResponseDeserializer
      extends JsonDeserializer<ListDashboardsResponse> {
    @Override
    public ListDashboardsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDashboardsResponsePb pb = mapper.readValue(p, ListDashboardsResponsePb.class);
      return ListDashboardsResponse.fromPb(pb);
    }
  }
}
