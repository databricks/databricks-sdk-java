// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Delete a workspace */
@Generated
@JsonSerialize(using = DeleteWorkspaceRequest.DeleteWorkspaceRequestSerializer.class)
@JsonDeserialize(using = DeleteWorkspaceRequest.DeleteWorkspaceRequestDeserializer.class)
public class DeleteWorkspaceRequest {
  /** Workspace ID. */
  private Long workspaceId;

  public DeleteWorkspaceRequest setWorkspaceId(Long workspaceId) {
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
    DeleteWorkspaceRequest that = (DeleteWorkspaceRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceRequest.class).add("workspaceId", workspaceId).toString();
  }

  DeleteWorkspaceRequestPb toPb() {
    DeleteWorkspaceRequestPb pb = new DeleteWorkspaceRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static DeleteWorkspaceRequest fromPb(DeleteWorkspaceRequestPb pb) {
    DeleteWorkspaceRequest model = new DeleteWorkspaceRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class DeleteWorkspaceRequestSerializer
      extends JsonSerializer<DeleteWorkspaceRequest> {
    @Override
    public void serialize(
        DeleteWorkspaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWorkspaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWorkspaceRequestDeserializer
      extends JsonDeserializer<DeleteWorkspaceRequest> {
    @Override
    public DeleteWorkspaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWorkspaceRequestPb pb = mapper.readValue(p, DeleteWorkspaceRequestPb.class);
      return DeleteWorkspaceRequest.fromPb(pb);
    }
  }
}
