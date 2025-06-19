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

/** Get a repo */
@Generated
@JsonSerialize(using = GetRepoRequest.GetRepoRequestSerializer.class)
@JsonDeserialize(using = GetRepoRequest.GetRepoRequestDeserializer.class)
public class GetRepoRequest {
  /** ID of the Git folder (repo) object in the workspace. */
  private Long repoId;

  public GetRepoRequest setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoRequest that = (GetRepoRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoRequest.class).add("repoId", repoId).toString();
  }

  GetRepoRequestPb toPb() {
    GetRepoRequestPb pb = new GetRepoRequestPb();
    pb.setRepoId(repoId);

    return pb;
  }

  static GetRepoRequest fromPb(GetRepoRequestPb pb) {
    GetRepoRequest model = new GetRepoRequest();
    model.setRepoId(pb.getRepoId());

    return model;
  }

  public static class GetRepoRequestSerializer extends JsonSerializer<GetRepoRequest> {
    @Override
    public void serialize(GetRepoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRepoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRepoRequestDeserializer extends JsonDeserializer<GetRepoRequest> {
    @Override
    public GetRepoRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRepoRequestPb pb = mapper.readValue(p, GetRepoRequestPb.class);
      return GetRepoRequest.fromPb(pb);
    }
  }
}
