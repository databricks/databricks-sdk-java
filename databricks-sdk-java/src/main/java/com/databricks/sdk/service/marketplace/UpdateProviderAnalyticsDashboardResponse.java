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
        UpdateProviderAnalyticsDashboardResponse.UpdateProviderAnalyticsDashboardResponseSerializer
            .class)
@JsonDeserialize(
    using =
        UpdateProviderAnalyticsDashboardResponse
            .UpdateProviderAnalyticsDashboardResponseDeserializer.class)
public class UpdateProviderAnalyticsDashboardResponse {
  /** this is newly created Lakeview dashboard for the user */
  private String dashboardId;

  /** id & version should be the same as the request */
  private String id;

  /** */
  private Long version;

  public UpdateProviderAnalyticsDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateProviderAnalyticsDashboardResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderAnalyticsDashboardResponse setVersion(Long version) {
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
    UpdateProviderAnalyticsDashboardResponse that = (UpdateProviderAnalyticsDashboardResponse) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(id, that.id)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderAnalyticsDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("version", version)
        .toString();
  }

  UpdateProviderAnalyticsDashboardResponsePb toPb() {
    UpdateProviderAnalyticsDashboardResponsePb pb =
        new UpdateProviderAnalyticsDashboardResponsePb();
    pb.setDashboardId(dashboardId);
    pb.setId(id);
    pb.setVersion(version);

    return pb;
  }

  static UpdateProviderAnalyticsDashboardResponse fromPb(
      UpdateProviderAnalyticsDashboardResponsePb pb) {
    UpdateProviderAnalyticsDashboardResponse model = new UpdateProviderAnalyticsDashboardResponse();
    model.setDashboardId(pb.getDashboardId());
    model.setId(pb.getId());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class UpdateProviderAnalyticsDashboardResponseSerializer
      extends JsonSerializer<UpdateProviderAnalyticsDashboardResponse> {
    @Override
    public void serialize(
        UpdateProviderAnalyticsDashboardResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateProviderAnalyticsDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProviderAnalyticsDashboardResponseDeserializer
      extends JsonDeserializer<UpdateProviderAnalyticsDashboardResponse> {
    @Override
    public UpdateProviderAnalyticsDashboardResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProviderAnalyticsDashboardResponsePb pb =
          mapper.readValue(p, UpdateProviderAnalyticsDashboardResponsePb.class);
      return UpdateProviderAnalyticsDashboardResponse.fromPb(pb);
    }
  }
}
