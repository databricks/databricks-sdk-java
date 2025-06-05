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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = RepoPermissionsRequest.RepoPermissionsRequestSerializer.class)
@JsonDeserialize(using = RepoPermissionsRequest.RepoPermissionsRequestDeserializer.class)
public class RepoPermissionsRequest {
  /** */
  private Collection<RepoAccessControlRequest> accessControlList;

  /** The repo for which to get or manage permissions. */
  private String repoId;

  public RepoPermissionsRequest setAccessControlList(
      Collection<RepoAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RepoAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public RepoPermissionsRequest setRepoId(String repoId) {
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
    RepoPermissionsRequest that = (RepoPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("repoId", repoId)
        .toString();
  }

  RepoPermissionsRequestPb toPb() {
    RepoPermissionsRequestPb pb = new RepoPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setRepoId(repoId);

    return pb;
  }

  static RepoPermissionsRequest fromPb(RepoPermissionsRequestPb pb) {
    RepoPermissionsRequest model = new RepoPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setRepoId(pb.getRepoId());

    return model;
  }

  public static class RepoPermissionsRequestSerializer
      extends JsonSerializer<RepoPermissionsRequest> {
    @Override
    public void serialize(
        RepoPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepoPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepoPermissionsRequestDeserializer
      extends JsonDeserializer<RepoPermissionsRequest> {
    @Override
    public RepoPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoPermissionsRequestPb pb = mapper.readValue(p, RepoPermissionsRequestPb.class);
      return RepoPermissionsRequest.fromPb(pb);
    }
  }
}
