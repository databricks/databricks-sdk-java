// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Delete permissions assignment */
@Generated
@JsonSerialize(
    using = DeleteWorkspaceAssignmentRequest.DeleteWorkspaceAssignmentRequestSerializer.class)
@JsonDeserialize(
    using = DeleteWorkspaceAssignmentRequest.DeleteWorkspaceAssignmentRequestDeserializer.class)
public class DeleteWorkspaceAssignmentRequest {
  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID for the account. */
  private Long workspaceId;

  public DeleteWorkspaceAssignmentRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public DeleteWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    DeleteWorkspaceAssignmentRequest that = (DeleteWorkspaceAssignmentRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAssignmentRequest.class)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  DeleteWorkspaceAssignmentRequestPb toPb() {
    DeleteWorkspaceAssignmentRequestPb pb = new DeleteWorkspaceAssignmentRequestPb();
    pb.setPrincipalId(principalId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static DeleteWorkspaceAssignmentRequest fromPb(DeleteWorkspaceAssignmentRequestPb pb) {
    DeleteWorkspaceAssignmentRequest model = new DeleteWorkspaceAssignmentRequest();
    model.setPrincipalId(pb.getPrincipalId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class DeleteWorkspaceAssignmentRequestSerializer
      extends JsonSerializer<DeleteWorkspaceAssignmentRequest> {
    @Override
    public void serialize(
        DeleteWorkspaceAssignmentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWorkspaceAssignmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWorkspaceAssignmentRequestDeserializer
      extends JsonDeserializer<DeleteWorkspaceAssignmentRequest> {
    @Override
    public DeleteWorkspaceAssignmentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWorkspaceAssignmentRequestPb pb =
          mapper.readValue(p, DeleteWorkspaceAssignmentRequestPb.class);
      return DeleteWorkspaceAssignmentRequest.fromPb(pb);
    }
  }
}
