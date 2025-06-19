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

/** Get permission assignments */
@Generated
@JsonSerialize(
    using = ListWorkspaceAssignmentRequest.ListWorkspaceAssignmentRequestSerializer.class)
@JsonDeserialize(
    using = ListWorkspaceAssignmentRequest.ListWorkspaceAssignmentRequestDeserializer.class)
public class ListWorkspaceAssignmentRequest {
  /** The workspace ID for the account. */
  private Long workspaceId;

  public ListWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    ListWorkspaceAssignmentRequest that = (ListWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }

  ListWorkspaceAssignmentRequestPb toPb() {
    ListWorkspaceAssignmentRequestPb pb = new ListWorkspaceAssignmentRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static ListWorkspaceAssignmentRequest fromPb(ListWorkspaceAssignmentRequestPb pb) {
    ListWorkspaceAssignmentRequest model = new ListWorkspaceAssignmentRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class ListWorkspaceAssignmentRequestSerializer
      extends JsonSerializer<ListWorkspaceAssignmentRequest> {
    @Override
    public void serialize(
        ListWorkspaceAssignmentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListWorkspaceAssignmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListWorkspaceAssignmentRequestDeserializer
      extends JsonDeserializer<ListWorkspaceAssignmentRequest> {
    @Override
    public ListWorkspaceAssignmentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListWorkspaceAssignmentRequestPb pb =
          mapper.readValue(p, ListWorkspaceAssignmentRequestPb.class);
      return ListWorkspaceAssignmentRequest.fromPb(pb);
    }
  }
}
