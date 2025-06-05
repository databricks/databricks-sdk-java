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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetPublishedAppsOutput.GetPublishedAppsOutputSerializer.class)
@JsonDeserialize(using = GetPublishedAppsOutput.GetPublishedAppsOutputDeserializer.class)
public class GetPublishedAppsOutput {
  /** List of Published OAuth Apps. */
  private Collection<PublishedAppOutput> apps;

  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  private String nextPageToken;

  public GetPublishedAppsOutput setApps(Collection<PublishedAppOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<PublishedAppOutput> getApps() {
    return apps;
  }

  public GetPublishedAppsOutput setNextPageToken(String nextPageToken) {
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
    GetPublishedAppsOutput that = (GetPublishedAppsOutput) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppsOutput.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetPublishedAppsOutputPb toPb() {
    GetPublishedAppsOutputPb pb = new GetPublishedAppsOutputPb();
    pb.setApps(apps);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetPublishedAppsOutput fromPb(GetPublishedAppsOutputPb pb) {
    GetPublishedAppsOutput model = new GetPublishedAppsOutput();
    model.setApps(pb.getApps());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetPublishedAppsOutputSerializer
      extends JsonSerializer<GetPublishedAppsOutput> {
    @Override
    public void serialize(
        GetPublishedAppsOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedAppsOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedAppsOutputDeserializer
      extends JsonDeserializer<GetPublishedAppsOutput> {
    @Override
    public GetPublishedAppsOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedAppsOutputPb pb = mapper.readValue(p, GetPublishedAppsOutputPb.class);
      return GetPublishedAppsOutput.fromPb(pb);
    }
  }
}
