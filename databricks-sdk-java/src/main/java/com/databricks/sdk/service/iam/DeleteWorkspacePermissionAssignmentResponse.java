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

@Generated
@JsonSerialize(
    using =
        DeleteWorkspacePermissionAssignmentResponse
            .DeleteWorkspacePermissionAssignmentResponseSerializer.class)
@JsonDeserialize(
    using =
        DeleteWorkspacePermissionAssignmentResponse
            .DeleteWorkspacePermissionAssignmentResponseDeserializer.class)
public class DeleteWorkspacePermissionAssignmentResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspacePermissionAssignmentResponse.class).toString();
  }

  DeleteWorkspacePermissionAssignmentResponsePb toPb() {
    DeleteWorkspacePermissionAssignmentResponsePb pb =
        new DeleteWorkspacePermissionAssignmentResponsePb();

    return pb;
  }

  static DeleteWorkspacePermissionAssignmentResponse fromPb(
      DeleteWorkspacePermissionAssignmentResponsePb pb) {
    DeleteWorkspacePermissionAssignmentResponse model =
        new DeleteWorkspacePermissionAssignmentResponse();

    return model;
  }

  public static class DeleteWorkspacePermissionAssignmentResponseSerializer
      extends JsonSerializer<DeleteWorkspacePermissionAssignmentResponse> {
    @Override
    public void serialize(
        DeleteWorkspacePermissionAssignmentResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteWorkspacePermissionAssignmentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWorkspacePermissionAssignmentResponseDeserializer
      extends JsonDeserializer<DeleteWorkspacePermissionAssignmentResponse> {
    @Override
    public DeleteWorkspacePermissionAssignmentResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWorkspacePermissionAssignmentResponsePb pb =
          mapper.readValue(p, DeleteWorkspacePermissionAssignmentResponsePb.class);
      return DeleteWorkspacePermissionAssignmentResponse.fromPb(pb);
    }
  }
}
