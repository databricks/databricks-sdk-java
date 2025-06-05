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
import java.util.Objects;

/** Create dashboard */
@Generated
@JsonSerialize(using = CreateDashboardRequest.CreateDashboardRequestSerializer.class)
@JsonDeserialize(using = CreateDashboardRequest.CreateDashboardRequestDeserializer.class)
public class CreateDashboardRequest {
  /** */
  private Dashboard dashboard;

  public CreateDashboardRequest setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(dashboard, that.dashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class).add("dashboard", dashboard).toString();
  }

  CreateDashboardRequestPb toPb() {
    CreateDashboardRequestPb pb = new CreateDashboardRequestPb();
    pb.setDashboard(dashboard);

    return pb;
  }

  static CreateDashboardRequest fromPb(CreateDashboardRequestPb pb) {
    CreateDashboardRequest model = new CreateDashboardRequest();
    model.setDashboard(pb.getDashboard());

    return model;
  }

  public static class CreateDashboardRequestSerializer
      extends JsonSerializer<CreateDashboardRequest> {
    @Override
    public void serialize(
        CreateDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDashboardRequestDeserializer
      extends JsonDeserializer<CreateDashboardRequest> {
    @Override
    public CreateDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDashboardRequestPb pb = mapper.readValue(p, CreateDashboardRequestPb.class);
      return CreateDashboardRequest.fromPb(pb);
    }
  }
}
