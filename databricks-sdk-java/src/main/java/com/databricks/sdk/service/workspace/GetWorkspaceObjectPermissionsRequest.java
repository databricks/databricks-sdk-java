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

/** Get workspace object permissions */
@Generated
@JsonSerialize(
    using =
        GetWorkspaceObjectPermissionsRequest.GetWorkspaceObjectPermissionsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetWorkspaceObjectPermissionsRequest.GetWorkspaceObjectPermissionsRequestDeserializer.class)
public class GetWorkspaceObjectPermissionsRequest {
  /** The workspace object for which to get or manage permissions. */
  private String workspaceObjectId;

  /** The workspace object type for which to get or manage permissions. */
  private String workspaceObjectType;

  public GetWorkspaceObjectPermissionsRequest setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public GetWorkspaceObjectPermissionsRequest setWorkspaceObjectType(String workspaceObjectType) {
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
    GetWorkspaceObjectPermissionsRequest that = (GetWorkspaceObjectPermissionsRequest) o;
    return Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceObjectPermissionsRequest.class)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }

  GetWorkspaceObjectPermissionsRequestPb toPb() {
    GetWorkspaceObjectPermissionsRequestPb pb = new GetWorkspaceObjectPermissionsRequestPb();
    pb.setWorkspaceObjectId(workspaceObjectId);
    pb.setWorkspaceObjectType(workspaceObjectType);

    return pb;
  }

  static GetWorkspaceObjectPermissionsRequest fromPb(GetWorkspaceObjectPermissionsRequestPb pb) {
    GetWorkspaceObjectPermissionsRequest model = new GetWorkspaceObjectPermissionsRequest();
    model.setWorkspaceObjectId(pb.getWorkspaceObjectId());
    model.setWorkspaceObjectType(pb.getWorkspaceObjectType());

    return model;
  }

  public static class GetWorkspaceObjectPermissionsRequestSerializer
      extends JsonSerializer<GetWorkspaceObjectPermissionsRequest> {
    @Override
    public void serialize(
        GetWorkspaceObjectPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceObjectPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceObjectPermissionsRequestDeserializer
      extends JsonDeserializer<GetWorkspaceObjectPermissionsRequest> {
    @Override
    public GetWorkspaceObjectPermissionsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceObjectPermissionsRequestPb pb =
          mapper.readValue(p, GetWorkspaceObjectPermissionsRequestPb.class);
      return GetWorkspaceObjectPermissionsRequest.fromPb(pb);
    }
  }
}
