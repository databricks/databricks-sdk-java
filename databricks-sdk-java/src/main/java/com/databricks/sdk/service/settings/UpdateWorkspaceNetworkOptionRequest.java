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

/** Update workspace network option */
@Generated
@JsonSerialize(
    using = UpdateWorkspaceNetworkOptionRequest.UpdateWorkspaceNetworkOptionRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateWorkspaceNetworkOptionRequest.UpdateWorkspaceNetworkOptionRequestDeserializer.class)
public class UpdateWorkspaceNetworkOptionRequest {
  /** The workspace ID. */
  private Long workspaceId;

  /** */
  private WorkspaceNetworkOption workspaceNetworkOption;

  public UpdateWorkspaceNetworkOptionRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  public UpdateWorkspaceNetworkOptionRequest setWorkspaceNetworkOption(
      WorkspaceNetworkOption workspaceNetworkOption) {
    this.workspaceNetworkOption = workspaceNetworkOption;
    return this;
  }

  public WorkspaceNetworkOption getWorkspaceNetworkOption() {
    return workspaceNetworkOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceNetworkOptionRequest that = (UpdateWorkspaceNetworkOptionRequest) o;
    return Objects.equals(workspaceId, that.workspaceId)
        && Objects.equals(workspaceNetworkOption, that.workspaceNetworkOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, workspaceNetworkOption);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceNetworkOptionRequest.class)
        .add("workspaceId", workspaceId)
        .add("workspaceNetworkOption", workspaceNetworkOption)
        .toString();
  }

  UpdateWorkspaceNetworkOptionRequestPb toPb() {
    UpdateWorkspaceNetworkOptionRequestPb pb = new UpdateWorkspaceNetworkOptionRequestPb();
    pb.setWorkspaceId(workspaceId);
    pb.setWorkspaceNetworkOption(workspaceNetworkOption);

    return pb;
  }

  static UpdateWorkspaceNetworkOptionRequest fromPb(UpdateWorkspaceNetworkOptionRequestPb pb) {
    UpdateWorkspaceNetworkOptionRequest model = new UpdateWorkspaceNetworkOptionRequest();
    model.setWorkspaceId(pb.getWorkspaceId());
    model.setWorkspaceNetworkOption(pb.getWorkspaceNetworkOption());

    return model;
  }

  public static class UpdateWorkspaceNetworkOptionRequestSerializer
      extends JsonSerializer<UpdateWorkspaceNetworkOptionRequest> {
    @Override
    public void serialize(
        UpdateWorkspaceNetworkOptionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceNetworkOptionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceNetworkOptionRequestDeserializer
      extends JsonDeserializer<UpdateWorkspaceNetworkOptionRequest> {
    @Override
    public UpdateWorkspaceNetworkOptionRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceNetworkOptionRequestPb pb =
          mapper.readValue(p, UpdateWorkspaceNetworkOptionRequestPb.class);
      return UpdateWorkspaceNetworkOptionRequest.fromPb(pb);
    }
  }
}
