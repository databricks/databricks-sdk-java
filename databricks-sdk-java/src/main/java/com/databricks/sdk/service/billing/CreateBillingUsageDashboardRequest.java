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
    using = CreateBillingUsageDashboardRequest.CreateBillingUsageDashboardRequestSerializer.class)
@JsonDeserialize(
    using = CreateBillingUsageDashboardRequest.CreateBillingUsageDashboardRequestDeserializer.class)
public class CreateBillingUsageDashboardRequest {
  /**
   * Workspace level usage dashboard shows usage data for the specified workspace ID. Global level
   * usage dashboard shows usage data for all workspaces in the account.
   */
  private UsageDashboardType dashboardType;

  /** The workspace ID of the workspace in which the usage dashboard is created. */
  private Long workspaceId;

  public CreateBillingUsageDashboardRequest setDashboardType(UsageDashboardType dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }

  public UsageDashboardType getDashboardType() {
    return dashboardType;
  }

  public CreateBillingUsageDashboardRequest setWorkspaceId(Long workspaceId) {
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
    CreateBillingUsageDashboardRequest that = (CreateBillingUsageDashboardRequest) o;
    return Objects.equals(dashboardType, that.dashboardType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBillingUsageDashboardRequest.class)
        .add("dashboardType", dashboardType)
        .add("workspaceId", workspaceId)
        .toString();
  }

  CreateBillingUsageDashboardRequestPb toPb() {
    CreateBillingUsageDashboardRequestPb pb = new CreateBillingUsageDashboardRequestPb();
    pb.setDashboardType(dashboardType);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static CreateBillingUsageDashboardRequest fromPb(CreateBillingUsageDashboardRequestPb pb) {
    CreateBillingUsageDashboardRequest model = new CreateBillingUsageDashboardRequest();
    model.setDashboardType(pb.getDashboardType());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class CreateBillingUsageDashboardRequestSerializer
      extends JsonSerializer<CreateBillingUsageDashboardRequest> {
    @Override
    public void serialize(
        CreateBillingUsageDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBillingUsageDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBillingUsageDashboardRequestDeserializer
      extends JsonDeserializer<CreateBillingUsageDashboardRequest> {
    @Override
    public CreateBillingUsageDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBillingUsageDashboardRequestPb pb =
          mapper.readValue(p, CreateBillingUsageDashboardRequestPb.class);
      return CreateBillingUsageDashboardRequest.fromPb(pb);
    }
  }
}
