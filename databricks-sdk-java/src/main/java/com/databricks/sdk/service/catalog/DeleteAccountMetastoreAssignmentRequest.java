// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Delete a metastore assignment */
@Generated
@JsonSerialize(
    using =
        DeleteAccountMetastoreAssignmentRequest.DeleteAccountMetastoreAssignmentRequestSerializer
            .class)
@JsonDeserialize(
    using =
        DeleteAccountMetastoreAssignmentRequest.DeleteAccountMetastoreAssignmentRequestDeserializer
            .class)
public class DeleteAccountMetastoreAssignmentRequest {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  public DeleteAccountMetastoreAssignmentRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DeleteAccountMetastoreAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    DeleteAccountMetastoreAssignmentRequest that = (DeleteAccountMetastoreAssignmentRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountMetastoreAssignmentRequest.class)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  DeleteAccountMetastoreAssignmentRequestPb toPb() {
    DeleteAccountMetastoreAssignmentRequestPb pb = new DeleteAccountMetastoreAssignmentRequestPb();
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static DeleteAccountMetastoreAssignmentRequest fromPb(
      DeleteAccountMetastoreAssignmentRequestPb pb) {
    DeleteAccountMetastoreAssignmentRequest model = new DeleteAccountMetastoreAssignmentRequest();
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class DeleteAccountMetastoreAssignmentRequestSerializer
      extends JsonSerializer<DeleteAccountMetastoreAssignmentRequest> {
    @Override
    public void serialize(
        DeleteAccountMetastoreAssignmentRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteAccountMetastoreAssignmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountMetastoreAssignmentRequestDeserializer
      extends JsonDeserializer<DeleteAccountMetastoreAssignmentRequest> {
    @Override
    public DeleteAccountMetastoreAssignmentRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountMetastoreAssignmentRequestPb pb =
          mapper.readValue(p, DeleteAccountMetastoreAssignmentRequestPb.class);
      return DeleteAccountMetastoreAssignmentRequest.fromPb(pb);
    }
  }
}
