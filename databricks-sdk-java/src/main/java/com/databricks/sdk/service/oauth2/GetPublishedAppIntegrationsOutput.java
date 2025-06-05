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
@JsonSerialize(
    using = GetPublishedAppIntegrationsOutput.GetPublishedAppIntegrationsOutputSerializer.class)
@JsonDeserialize(
    using = GetPublishedAppIntegrationsOutput.GetPublishedAppIntegrationsOutputDeserializer.class)
public class GetPublishedAppIntegrationsOutput {
  /** List of Published OAuth App Integrations defined for the account. */
  private Collection<GetPublishedAppIntegrationOutput> apps;

  /** */
  private String nextPageToken;

  public GetPublishedAppIntegrationsOutput setApps(
      Collection<GetPublishedAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<GetPublishedAppIntegrationOutput> getApps() {
    return apps;
  }

  public GetPublishedAppIntegrationsOutput setNextPageToken(String nextPageToken) {
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
    GetPublishedAppIntegrationsOutput that = (GetPublishedAppIntegrationsOutput) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationsOutput.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetPublishedAppIntegrationsOutputPb toPb() {
    GetPublishedAppIntegrationsOutputPb pb = new GetPublishedAppIntegrationsOutputPb();
    pb.setApps(apps);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetPublishedAppIntegrationsOutput fromPb(GetPublishedAppIntegrationsOutputPb pb) {
    GetPublishedAppIntegrationsOutput model = new GetPublishedAppIntegrationsOutput();
    model.setApps(pb.getApps());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetPublishedAppIntegrationsOutputSerializer
      extends JsonSerializer<GetPublishedAppIntegrationsOutput> {
    @Override
    public void serialize(
        GetPublishedAppIntegrationsOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedAppIntegrationsOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedAppIntegrationsOutputDeserializer
      extends JsonDeserializer<GetPublishedAppIntegrationsOutput> {
    @Override
    public GetPublishedAppIntegrationsOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedAppIntegrationsOutputPb pb =
          mapper.readValue(p, GetPublishedAppIntegrationsOutputPb.class);
      return GetPublishedAppIntegrationsOutput.fromPb(pb);
    }
  }
}
