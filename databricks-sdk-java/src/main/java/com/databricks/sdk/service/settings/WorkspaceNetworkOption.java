// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = WorkspaceNetworkOption.WorkspaceNetworkOptionSerializer.class)
@JsonDeserialize(using = WorkspaceNetworkOption.WorkspaceNetworkOptionDeserializer.class)
public class WorkspaceNetworkOption {
  /**
   * The network policy ID to apply to the workspace. This controls the network access rules for all
   * serverless compute resources in the workspace. Each workspace can only be linked to one policy
   * at a time. If no policy is explicitly assigned, the workspace will use 'default-policy'.
   */
  private String networkPolicyId;

  /** The workspace ID. */
  private Long workspaceId;

  public WorkspaceNetworkOption setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  public WorkspaceNetworkOption setWorkspaceId(Long workspaceId) {
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
    WorkspaceNetworkOption that = (WorkspaceNetworkOption) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceNetworkOption.class)
        .add("networkPolicyId", networkPolicyId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  WorkspaceNetworkOptionPb toPb() {
    WorkspaceNetworkOptionPb pb = new WorkspaceNetworkOptionPb();
    pb.setNetworkPolicyId(networkPolicyId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static WorkspaceNetworkOption fromPb(WorkspaceNetworkOptionPb pb) {
    WorkspaceNetworkOption model = new WorkspaceNetworkOption();
    model.setNetworkPolicyId(pb.getNetworkPolicyId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class WorkspaceNetworkOptionSerializer
      extends JsonSerializer<WorkspaceNetworkOption> {
    @Override
    public void serialize(
        WorkspaceNetworkOption value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceNetworkOptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceNetworkOptionDeserializer
      extends JsonDeserializer<WorkspaceNetworkOption> {
    @Override
    public WorkspaceNetworkOption deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceNetworkOptionPb pb = mapper.readValue(p, WorkspaceNetworkOptionPb.class);
      return WorkspaceNetworkOption.fromPb(pb);
    }
  }
}
