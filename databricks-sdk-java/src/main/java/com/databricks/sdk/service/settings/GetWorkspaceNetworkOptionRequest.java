// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Get workspace network option */
@Generated
@JsonSerialize(
    using = GetWorkspaceNetworkOptionRequest.GetWorkspaceNetworkOptionRequestSerializer.class)
@JsonDeserialize(
    using = GetWorkspaceNetworkOptionRequest.GetWorkspaceNetworkOptionRequestDeserializer.class)
public class GetWorkspaceNetworkOptionRequest {
  /** The workspace ID. */
  private Long workspaceId;

  public GetWorkspaceNetworkOptionRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceNetworkOptionRequest that = (GetWorkspaceNetworkOptionRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceNetworkOptionRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }

  GetWorkspaceNetworkOptionRequestPb toPb() {
    GetWorkspaceNetworkOptionRequestPb pb = new GetWorkspaceNetworkOptionRequestPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static GetWorkspaceNetworkOptionRequest fromPb(GetWorkspaceNetworkOptionRequestPb pb) {
    GetWorkspaceNetworkOptionRequest model = new GetWorkspaceNetworkOptionRequest();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class GetWorkspaceNetworkOptionRequestSerializer
      extends JsonSerializer<GetWorkspaceNetworkOptionRequest> {
    @Override
    public void serialize(
        GetWorkspaceNetworkOptionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceNetworkOptionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceNetworkOptionRequestDeserializer
      extends JsonDeserializer<GetWorkspaceNetworkOptionRequest> {
    @Override
    public GetWorkspaceNetworkOptionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceNetworkOptionRequestPb pb =
          mapper.readValue(p, GetWorkspaceNetworkOptionRequestPb.class);
      return GetWorkspaceNetworkOptionRequest.fromPb(pb);
    }
  }
}
