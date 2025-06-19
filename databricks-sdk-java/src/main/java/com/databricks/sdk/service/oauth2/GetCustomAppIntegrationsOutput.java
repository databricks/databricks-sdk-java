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
    using = GetCustomAppIntegrationsOutput.GetCustomAppIntegrationsOutputSerializer.class)
@JsonDeserialize(
    using = GetCustomAppIntegrationsOutput.GetCustomAppIntegrationsOutputDeserializer.class)
public class GetCustomAppIntegrationsOutput {
  /** List of Custom OAuth App Integrations defined for the account. */
  private Collection<GetCustomAppIntegrationOutput> apps;

  /** */
  private String nextPageToken;

  public GetCustomAppIntegrationsOutput setApps(Collection<GetCustomAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<GetCustomAppIntegrationOutput> getApps() {
    return apps;
  }

  public GetCustomAppIntegrationsOutput setNextPageToken(String nextPageToken) {
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
    GetCustomAppIntegrationsOutput that = (GetCustomAppIntegrationsOutput) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationsOutput.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetCustomAppIntegrationsOutputPb toPb() {
    GetCustomAppIntegrationsOutputPb pb = new GetCustomAppIntegrationsOutputPb();
    pb.setApps(apps);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetCustomAppIntegrationsOutput fromPb(GetCustomAppIntegrationsOutputPb pb) {
    GetCustomAppIntegrationsOutput model = new GetCustomAppIntegrationsOutput();
    model.setApps(pb.getApps());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetCustomAppIntegrationsOutputSerializer
      extends JsonSerializer<GetCustomAppIntegrationsOutput> {
    @Override
    public void serialize(
        GetCustomAppIntegrationsOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCustomAppIntegrationsOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCustomAppIntegrationsOutputDeserializer
      extends JsonDeserializer<GetCustomAppIntegrationsOutput> {
    @Override
    public GetCustomAppIntegrationsOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCustomAppIntegrationsOutputPb pb =
          mapper.readValue(p, GetCustomAppIntegrationsOutputPb.class);
      return GetCustomAppIntegrationsOutput.fromPb(pb);
    }
  }
}
