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

/** Get repo permissions */
@Generated
@JsonSerialize(using = GetRepoPermissionsRequest.GetRepoPermissionsRequestSerializer.class)
@JsonDeserialize(using = GetRepoPermissionsRequest.GetRepoPermissionsRequestDeserializer.class)
public class GetRepoPermissionsRequest {
  /** The repo for which to get or manage permissions. */
  private String repoId;

  public GetRepoPermissionsRequest setRepoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  public String getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoPermissionsRequest that = (GetRepoPermissionsRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoPermissionsRequest.class).add("repoId", repoId).toString();
  }

  GetRepoPermissionsRequestPb toPb() {
    GetRepoPermissionsRequestPb pb = new GetRepoPermissionsRequestPb();
    pb.setRepoId(repoId);

    return pb;
  }

  static GetRepoPermissionsRequest fromPb(GetRepoPermissionsRequestPb pb) {
    GetRepoPermissionsRequest model = new GetRepoPermissionsRequest();
    model.setRepoId(pb.getRepoId());

    return model;
  }

  public static class GetRepoPermissionsRequestSerializer
      extends JsonSerializer<GetRepoPermissionsRequest> {
    @Override
    public void serialize(
        GetRepoPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRepoPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRepoPermissionsRequestDeserializer
      extends JsonDeserializer<GetRepoPermissionsRequest> {
    @Override
    public GetRepoPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRepoPermissionsRequestPb pb = mapper.readValue(p, GetRepoPermissionsRequestPb.class);
      return GetRepoPermissionsRequest.fromPb(pb);
    }
  }
}
