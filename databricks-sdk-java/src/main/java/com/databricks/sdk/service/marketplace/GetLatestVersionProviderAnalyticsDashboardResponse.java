// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

@Generated
@JsonSerialize(
    using =
        GetLatestVersionProviderAnalyticsDashboardResponse
            .GetLatestVersionProviderAnalyticsDashboardResponseSerializer.class)
@JsonDeserialize(
    using =
        GetLatestVersionProviderAnalyticsDashboardResponse
            .GetLatestVersionProviderAnalyticsDashboardResponseDeserializer.class)
public class GetLatestVersionProviderAnalyticsDashboardResponse {
  /** version here is latest logical version of the dashboard template */
  private Long version;

  public GetLatestVersionProviderAnalyticsDashboardResponse setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionProviderAnalyticsDashboardResponse that =
        (GetLatestVersionProviderAnalyticsDashboardResponse) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionProviderAnalyticsDashboardResponse.class)
        .add("version", version)
        .toString();
  }

  GetLatestVersionProviderAnalyticsDashboardResponsePb toPb() {
    GetLatestVersionProviderAnalyticsDashboardResponsePb pb =
        new GetLatestVersionProviderAnalyticsDashboardResponsePb();
    pb.setVersion(version);

    return pb;
  }

  static GetLatestVersionProviderAnalyticsDashboardResponse fromPb(
      GetLatestVersionProviderAnalyticsDashboardResponsePb pb) {
    GetLatestVersionProviderAnalyticsDashboardResponse model =
        new GetLatestVersionProviderAnalyticsDashboardResponse();
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class GetLatestVersionProviderAnalyticsDashboardResponseSerializer
      extends JsonSerializer<GetLatestVersionProviderAnalyticsDashboardResponse> {
    @Override
    public void serialize(
        GetLatestVersionProviderAnalyticsDashboardResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetLatestVersionProviderAnalyticsDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLatestVersionProviderAnalyticsDashboardResponseDeserializer
      extends JsonDeserializer<GetLatestVersionProviderAnalyticsDashboardResponse> {
    @Override
    public GetLatestVersionProviderAnalyticsDashboardResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLatestVersionProviderAnalyticsDashboardResponsePb pb =
          mapper.readValue(p, GetLatestVersionProviderAnalyticsDashboardResponsePb.class);
      return GetLatestVersionProviderAnalyticsDashboardResponse.fromPb(pb);
    }
  }
}
