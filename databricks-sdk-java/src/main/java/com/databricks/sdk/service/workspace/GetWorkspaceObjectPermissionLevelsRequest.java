// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Get workspace object permission levels */
@Generated
@JsonSerialize(
    using =
        GetWorkspaceObjectPermissionLevelsRequest
            .GetWorkspaceObjectPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetWorkspaceObjectPermissionLevelsRequest
            .GetWorkspaceObjectPermissionLevelsRequestDeserializer.class)
public class GetWorkspaceObjectPermissionLevelsRequest {
  /** The workspace object for which to get or manage permissions. */
  private String workspaceObjectId;

  /** The workspace object type for which to get or manage permissions. */
  private String workspaceObjectType;

  public GetWorkspaceObjectPermissionLevelsRequest setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public GetWorkspaceObjectPermissionLevelsRequest setWorkspaceObjectType(
      String workspaceObjectType) {
    this.workspaceObjectType = workspaceObjectType;
    return this;
  }

  public String getWorkspaceObjectType() {
    return workspaceObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceObjectPermissionLevelsRequest that = (GetWorkspaceObjectPermissionLevelsRequest) o;
    return Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceObjectPermissionLevelsRequest.class)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }

  GetWorkspaceObjectPermissionLevelsRequestPb toPb() {
    GetWorkspaceObjectPermissionLevelsRequestPb pb =
        new GetWorkspaceObjectPermissionLevelsRequestPb();
    pb.setWorkspaceObjectId(workspaceObjectId);
    pb.setWorkspaceObjectType(workspaceObjectType);

    return pb;
  }

  static GetWorkspaceObjectPermissionLevelsRequest fromPb(
      GetWorkspaceObjectPermissionLevelsRequestPb pb) {
    GetWorkspaceObjectPermissionLevelsRequest model =
        new GetWorkspaceObjectPermissionLevelsRequest();
    model.setWorkspaceObjectId(pb.getWorkspaceObjectId());
    model.setWorkspaceObjectType(pb.getWorkspaceObjectType());

    return model;
  }

  public static class GetWorkspaceObjectPermissionLevelsRequestSerializer
      extends JsonSerializer<GetWorkspaceObjectPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetWorkspaceObjectPermissionLevelsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetWorkspaceObjectPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceObjectPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetWorkspaceObjectPermissionLevelsRequest> {
    @Override
    public GetWorkspaceObjectPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceObjectPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetWorkspaceObjectPermissionLevelsRequestPb.class);
      return GetWorkspaceObjectPermissionLevelsRequest.fromPb(pb);
    }
  }
}
