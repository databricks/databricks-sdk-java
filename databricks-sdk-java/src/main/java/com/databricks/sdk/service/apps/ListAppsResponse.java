// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = ListAppsResponse.ListAppsResponseSerializer.class)
@JsonDeserialize(using = ListAppsResponse.ListAppsResponseDeserializer.class)
public class ListAppsResponse {
  /** */
  private Collection<App> apps;

  /** Pagination token to request the next page of apps. */
  private String nextPageToken;

  public ListAppsResponse setApps(Collection<App> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<App> getApps() {
    return apps;
  }

  public ListAppsResponse setNextPageToken(String nextPageToken) {
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
    ListAppsResponse that = (ListAppsResponse) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppsResponse.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListAppsResponsePb toPb() {
    ListAppsResponsePb pb = new ListAppsResponsePb();
    pb.setApps(apps);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListAppsResponse fromPb(ListAppsResponsePb pb) {
    ListAppsResponse model = new ListAppsResponse();
    model.setApps(pb.getApps());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListAppsResponseSerializer extends JsonSerializer<ListAppsResponse> {
    @Override
    public void serialize(ListAppsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAppsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAppsResponseDeserializer extends JsonDeserializer<ListAppsResponse> {
    @Override
    public ListAppsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAppsResponsePb pb = mapper.readValue(p, ListAppsResponsePb.class);
      return ListAppsResponse.fromPb(pb);
    }
  }
}
