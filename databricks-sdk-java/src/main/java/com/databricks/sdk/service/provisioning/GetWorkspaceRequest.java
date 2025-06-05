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

/** Get a workspace */
@Generated
@JsonSerialize(using = GetWorkspaceRequest.GetWorkspaceRequestSerializer.class)
@JsonDeserialize(using = GetWorkspaceRequest.GetWorkspaceRequestDeserializer.class)
public class GetWorkspaceRequest {
  /** Workspace ID. */
  private Long workspaceId;

  public GetWorkspaceRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceRequest that = (GetWorkspaceRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceRequest.class).add("workspaceId", workspaceId).toString();
  }

  GetWorkspaceRequestPb toPb() {
    GetWorkspaceRequestPb pb = new GetWorkspaceRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static GetWorkspaceRequest fromPb(GetWorkspaceRequestPb pb) {
    GetWorkspaceRequest model = new GetWorkspaceRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class GetWorkspaceRequestSerializer extends JsonSerializer<GetWorkspaceRequest> {
    @Override
    public void serialize(GetWorkspaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceRequestDeserializer
      extends JsonDeserializer<GetWorkspaceRequest> {
    @Override
    public GetWorkspaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceRequestPb pb = mapper.readValue(p, GetWorkspaceRequestPb.class);
      return GetWorkspaceRequest.fromPb(pb);
    }
  }
}
