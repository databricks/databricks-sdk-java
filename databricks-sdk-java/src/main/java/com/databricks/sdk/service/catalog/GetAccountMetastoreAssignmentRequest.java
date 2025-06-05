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

/** Gets the metastore assignment for a workspace */
@Generated
@JsonSerialize(
    using =
        GetAccountMetastoreAssignmentRequest.GetAccountMetastoreAssignmentRequestSerializer.class)
@JsonDeserialize(
    using =
        GetAccountMetastoreAssignmentRequest.GetAccountMetastoreAssignmentRequestDeserializer.class)
public class GetAccountMetastoreAssignmentRequest {
  /** Workspace ID. */
  private Long workspaceId;

  public GetAccountMetastoreAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    GetAccountMetastoreAssignmentRequest that = (GetAccountMetastoreAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountMetastoreAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }

  GetAccountMetastoreAssignmentRequestPb toPb() {
    GetAccountMetastoreAssignmentRequestPb pb = new GetAccountMetastoreAssignmentRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static GetAccountMetastoreAssignmentRequest fromPb(GetAccountMetastoreAssignmentRequestPb pb) {
    GetAccountMetastoreAssignmentRequest model = new GetAccountMetastoreAssignmentRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class GetAccountMetastoreAssignmentRequestSerializer
      extends JsonSerializer<GetAccountMetastoreAssignmentRequest> {
    @Override
    public void serialize(
        GetAccountMetastoreAssignmentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountMetastoreAssignmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountMetastoreAssignmentRequestDeserializer
      extends JsonDeserializer<GetAccountMetastoreAssignmentRequest> {
    @Override
    public GetAccountMetastoreAssignmentRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountMetastoreAssignmentRequestPb pb =
          mapper.readValue(p, GetAccountMetastoreAssignmentRequestPb.class);
      return GetAccountMetastoreAssignmentRequest.fromPb(pb);
    }
  }
}
