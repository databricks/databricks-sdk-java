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

/** List workspace permissions */
@Generated
@JsonSerialize(using = GetWorkspaceAssignmentRequest.GetWorkspaceAssignmentRequestSerializer.class)
@JsonDeserialize(
    using = GetWorkspaceAssignmentRequest.GetWorkspaceAssignmentRequestDeserializer.class)
public class GetWorkspaceAssignmentRequest {
  /** The workspace ID. */
  private Long workspaceId;

  public GetWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceAssignmentRequest that = (GetWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }

  GetWorkspaceAssignmentRequestPb toPb() {
    GetWorkspaceAssignmentRequestPb pb = new GetWorkspaceAssignmentRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static GetWorkspaceAssignmentRequest fromPb(GetWorkspaceAssignmentRequestPb pb) {
    GetWorkspaceAssignmentRequest model = new GetWorkspaceAssignmentRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class GetWorkspaceAssignmentRequestSerializer
      extends JsonSerializer<GetWorkspaceAssignmentRequest> {
    @Override
    public void serialize(
        GetWorkspaceAssignmentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceAssignmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceAssignmentRequestDeserializer
      extends JsonDeserializer<GetWorkspaceAssignmentRequest> {
    @Override
    public GetWorkspaceAssignmentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceAssignmentRequestPb pb =
          mapper.readValue(p, GetWorkspaceAssignmentRequestPb.class);
      return GetWorkspaceAssignmentRequest.fromPb(pb);
    }
  }
}
