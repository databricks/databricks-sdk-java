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
        UpdateProviderAnalyticsDashboardRequest.UpdateProviderAnalyticsDashboardRequestSerializer
            .class)
@JsonDeserialize(
    using =
        UpdateProviderAnalyticsDashboardRequest.UpdateProviderAnalyticsDashboardRequestDeserializer
            .class)
public class UpdateProviderAnalyticsDashboardRequest {
  /** id is immutable property and can't be updated. */
  private String id;

  /**
   * this is the version of the dashboard template we want to update our user to current expectation
   * is that it should be equal to latest version of the dashboard template
   */
  private Long version;

  public UpdateProviderAnalyticsDashboardRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderAnalyticsDashboardRequest setVersion(Long version) {
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
    UpdateProviderAnalyticsDashboardRequest that = (UpdateProviderAnalyticsDashboardRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderAnalyticsDashboardRequest.class)
        .add("id", id)
        .add("version", version)
        .toString();
  }

  UpdateProviderAnalyticsDashboardRequestPb toPb() {
    UpdateProviderAnalyticsDashboardRequestPb pb = new UpdateProviderAnalyticsDashboardRequestPb();
    pb.setId(id);
    pb.setVersion(version);

    return pb;
  }

  static UpdateProviderAnalyticsDashboardRequest fromPb(
      UpdateProviderAnalyticsDashboardRequestPb pb) {
    UpdateProviderAnalyticsDashboardRequest model = new UpdateProviderAnalyticsDashboardRequest();
    model.setId(pb.getId());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class UpdateProviderAnalyticsDashboardRequestSerializer
      extends JsonSerializer<UpdateProviderAnalyticsDashboardRequest> {
    @Override
    public void serialize(
        UpdateProviderAnalyticsDashboardRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateProviderAnalyticsDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProviderAnalyticsDashboardRequestDeserializer
      extends JsonDeserializer<UpdateProviderAnalyticsDashboardRequest> {
    @Override
    public UpdateProviderAnalyticsDashboardRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProviderAnalyticsDashboardRequestPb pb =
          mapper.readValue(p, UpdateProviderAnalyticsDashboardRequestPb.class);
      return UpdateProviderAnalyticsDashboardRequest.fromPb(pb);
    }
  }
}
