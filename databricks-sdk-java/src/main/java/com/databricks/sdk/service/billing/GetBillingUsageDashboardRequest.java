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

/** Get usage dashboard */
@Generated
@JsonSerialize(
    using = GetBillingUsageDashboardRequest.GetBillingUsageDashboardRequestSerializer.class)
@JsonDeserialize(
    using = GetBillingUsageDashboardRequest.GetBillingUsageDashboardRequestDeserializer.class)
public class GetBillingUsageDashboardRequest {
  /**
   * Workspace level usage dashboard shows usage data for the specified workspace ID. Global level
   * usage dashboard shows usage data for all workspaces in the account.
   */
  private UsageDashboardType dashboardType;

  /** The workspace ID of the workspace in which the usage dashboard is created. */
  private Long workspaceId;

  public GetBillingUsageDashboardRequest setDashboardType(UsageDashboardType dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }

  public UsageDashboardType getDashboardType() {
    return dashboardType;
  }

  public GetBillingUsageDashboardRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBillingUsageDashboardRequest that = (GetBillingUsageDashboardRequest) o;
    return Objects.equals(dashboardType, that.dashboardType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBillingUsageDashboardRequest.class)
        .add("dashboardType", dashboardType)
        .add("workspaceId", workspaceId)
        .toString();
  }

  GetBillingUsageDashboardRequestPb toPb() {
    GetBillingUsageDashboardRequestPb pb = new GetBillingUsageDashboardRequestPb();
    pb.setDashboardType(dashboardType);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static GetBillingUsageDashboardRequest fromPb(GetBillingUsageDashboardRequestPb pb) {
    GetBillingUsageDashboardRequest model = new GetBillingUsageDashboardRequest();
    model.setDashboardType(pb.getDashboardType());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class GetBillingUsageDashboardRequestSerializer
      extends JsonSerializer<GetBillingUsageDashboardRequest> {
    @Override
    public void serialize(
        GetBillingUsageDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBillingUsageDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBillingUsageDashboardRequestDeserializer
      extends JsonDeserializer<GetBillingUsageDashboardRequest> {
    @Override
    public GetBillingUsageDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBillingUsageDashboardRequestPb pb =
          mapper.readValue(p, GetBillingUsageDashboardRequestPb.class);
      return GetBillingUsageDashboardRequest.fromPb(pb);
    }
  }
}
