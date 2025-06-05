// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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
@JsonSerialize(using = CollaboratorJobRunInfo.CollaboratorJobRunInfoSerializer.class)
@JsonDeserialize(using = CollaboratorJobRunInfo.CollaboratorJobRunInfoDeserializer.class)
public class CollaboratorJobRunInfo {
  /** Alias of the collaborator that triggered the task run. */
  private String collaboratorAlias;

  /** Job ID of the task run in the collaborator's workspace. */
  private Long collaboratorJobId;

  /** Job run ID of the task run in the collaborator's workspace. */
  private Long collaboratorJobRunId;

  /** Task run ID of the task run in the collaborator's workspace. */
  private Long collaboratorTaskRunId;

  /** ID of the collaborator's workspace that triggered the task run. */
  private Long collaboratorWorkspaceId;

  public CollaboratorJobRunInfo setCollaboratorAlias(String collaboratorAlias) {
    this.collaboratorAlias = collaboratorAlias;
    return this;
  }

  public String getCollaboratorAlias() {
    return collaboratorAlias;
  }

  public CollaboratorJobRunInfo setCollaboratorJobId(Long collaboratorJobId) {
    this.collaboratorJobId = collaboratorJobId;
    return this;
  }

  public Long getCollaboratorJobId() {
    return collaboratorJobId;
  }

  public CollaboratorJobRunInfo setCollaboratorJobRunId(Long collaboratorJobRunId) {
    this.collaboratorJobRunId = collaboratorJobRunId;
    return this;
  }

  public Long getCollaboratorJobRunId() {
    return collaboratorJobRunId;
  }

  public CollaboratorJobRunInfo setCollaboratorTaskRunId(Long collaboratorTaskRunId) {
    this.collaboratorTaskRunId = collaboratorTaskRunId;
    return this;
  }

  public Long getCollaboratorTaskRunId() {
    return collaboratorTaskRunId;
  }

  public CollaboratorJobRunInfo setCollaboratorWorkspaceId(Long collaboratorWorkspaceId) {
    this.collaboratorWorkspaceId = collaboratorWorkspaceId;
    return this;
  }

  public Long getCollaboratorWorkspaceId() {
    return collaboratorWorkspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollaboratorJobRunInfo that = (CollaboratorJobRunInfo) o;
    return Objects.equals(collaboratorAlias, that.collaboratorAlias)
        && Objects.equals(collaboratorJobId, that.collaboratorJobId)
        && Objects.equals(collaboratorJobRunId, that.collaboratorJobRunId)
        && Objects.equals(collaboratorTaskRunId, that.collaboratorTaskRunId)
        && Objects.equals(collaboratorWorkspaceId, that.collaboratorWorkspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collaboratorAlias,
        collaboratorJobId,
        collaboratorJobRunId,
        collaboratorTaskRunId,
        collaboratorWorkspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CollaboratorJobRunInfo.class)
        .add("collaboratorAlias", collaboratorAlias)
        .add("collaboratorJobId", collaboratorJobId)
        .add("collaboratorJobRunId", collaboratorJobRunId)
        .add("collaboratorTaskRunId", collaboratorTaskRunId)
        .add("collaboratorWorkspaceId", collaboratorWorkspaceId)
        .toString();
  }

  CollaboratorJobRunInfoPb toPb() {
    CollaboratorJobRunInfoPb pb = new CollaboratorJobRunInfoPb();
    pb.setCollaboratorAlias(collaboratorAlias);
    pb.setCollaboratorJobId(collaboratorJobId);
    pb.setCollaboratorJobRunId(collaboratorJobRunId);
    pb.setCollaboratorTaskRunId(collaboratorTaskRunId);
    pb.setCollaboratorWorkspaceId(collaboratorWorkspaceId);

    return pb;
  }

  static CollaboratorJobRunInfo fromPb(CollaboratorJobRunInfoPb pb) {
    CollaboratorJobRunInfo model = new CollaboratorJobRunInfo();
    model.setCollaboratorAlias(pb.getCollaboratorAlias());
    model.setCollaboratorJobId(pb.getCollaboratorJobId());
    model.setCollaboratorJobRunId(pb.getCollaboratorJobRunId());
    model.setCollaboratorTaskRunId(pb.getCollaboratorTaskRunId());
    model.setCollaboratorWorkspaceId(pb.getCollaboratorWorkspaceId());

    return model;
  }

  public static class CollaboratorJobRunInfoSerializer
      extends JsonSerializer<CollaboratorJobRunInfo> {
    @Override
    public void serialize(
        CollaboratorJobRunInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CollaboratorJobRunInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CollaboratorJobRunInfoDeserializer
      extends JsonDeserializer<CollaboratorJobRunInfo> {
    @Override
    public CollaboratorJobRunInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CollaboratorJobRunInfoPb pb = mapper.readValue(p, CollaboratorJobRunInfoPb.class);
      return CollaboratorJobRunInfo.fromPb(pb);
    }
  }
}
