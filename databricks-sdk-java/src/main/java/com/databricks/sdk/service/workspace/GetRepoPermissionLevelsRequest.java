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

/** Get repo permission levels */
@Generated
@JsonSerialize(
    using = GetRepoPermissionLevelsRequest.GetRepoPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using = GetRepoPermissionLevelsRequest.GetRepoPermissionLevelsRequestDeserializer.class)
public class GetRepoPermissionLevelsRequest {
  /** The repo for which to get or manage permissions. */
  private String repoId;

  public GetRepoPermissionLevelsRequest setRepoId(String repoId) {
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
    GetRepoPermissionLevelsRequest that = (GetRepoPermissionLevelsRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoPermissionLevelsRequest.class).add("repoId", repoId).toString();
  }

  GetRepoPermissionLevelsRequestPb toPb() {
    GetRepoPermissionLevelsRequestPb pb = new GetRepoPermissionLevelsRequestPb();
    pb.setRepoId(repoId);

    return pb;
  }

  static GetRepoPermissionLevelsRequest fromPb(GetRepoPermissionLevelsRequestPb pb) {
    GetRepoPermissionLevelsRequest model = new GetRepoPermissionLevelsRequest();
    model.setRepoId(pb.getRepoId());

    return model;
  }

  public static class GetRepoPermissionLevelsRequestSerializer
      extends JsonSerializer<GetRepoPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetRepoPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRepoPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRepoPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetRepoPermissionLevelsRequest> {
    @Override
    public GetRepoPermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRepoPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetRepoPermissionLevelsRequestPb.class);
      return GetRepoPermissionLevelsRequest.fromPb(pb);
    }
  }
}
