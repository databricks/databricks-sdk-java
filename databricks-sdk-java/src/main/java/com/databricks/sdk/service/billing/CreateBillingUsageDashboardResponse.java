// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
    using = CreateBillingUsageDashboardResponse.CreateBillingUsageDashboardResponseSerializer.class)
@JsonDeserialize(
    using =
        CreateBillingUsageDashboardResponse.CreateBillingUsageDashboardResponseDeserializer.class)
public class CreateBillingUsageDashboardResponse {
  /** The unique id of the usage dashboard. */
  private String dashboardId;

  public CreateBillingUsageDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBillingUsageDashboardResponse that = (CreateBillingUsageDashboardResponse) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBillingUsageDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .toString();
  }

  CreateBillingUsageDashboardResponsePb toPb() {
    CreateBillingUsageDashboardResponsePb pb = new CreateBillingUsageDashboardResponsePb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static CreateBillingUsageDashboardResponse fromPb(CreateBillingUsageDashboardResponsePb pb) {
    CreateBillingUsageDashboardResponse model = new CreateBillingUsageDashboardResponse();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class CreateBillingUsageDashboardResponseSerializer
      extends JsonSerializer<CreateBillingUsageDashboardResponse> {
    @Override
    public void serialize(
        CreateBillingUsageDashboardResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBillingUsageDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBillingUsageDashboardResponseDeserializer
      extends JsonDeserializer<CreateBillingUsageDashboardResponse> {
    @Override
    public CreateBillingUsageDashboardResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBillingUsageDashboardResponsePb pb =
          mapper.readValue(p, CreateBillingUsageDashboardResponsePb.class);
      return CreateBillingUsageDashboardResponse.fromPb(pb);
    }
  }
}
