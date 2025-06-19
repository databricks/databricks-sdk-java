// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = RepoInfo.RepoInfoSerializer.class)
@JsonDeserialize(using = RepoInfo.RepoInfoDeserializer.class)
public class RepoInfo {
  /** the git repo url e.g. https://github.com/databrickslabs/dolly.git */
  private String gitRepoUrl;

  public RepoInfo setGitRepoUrl(String gitRepoUrl) {
    this.gitRepoUrl = gitRepoUrl;
    return this;
  }

  public String getGitRepoUrl() {
    return gitRepoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoInfo that = (RepoInfo) o;
    return Objects.equals(gitRepoUrl, that.gitRepoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitRepoUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInfo.class).add("gitRepoUrl", gitRepoUrl).toString();
  }

  RepoInfoPb toPb() {
    RepoInfoPb pb = new RepoInfoPb();
    pb.setGitRepoUrl(gitRepoUrl);

    return pb;
  }

  static RepoInfo fromPb(RepoInfoPb pb) {
    RepoInfo model = new RepoInfo();
    model.setGitRepoUrl(pb.getGitRepoUrl());

    return model;
  }

  public static class RepoInfoSerializer extends JsonSerializer<RepoInfo> {
    @Override
    public void serialize(RepoInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepoInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepoInfoDeserializer extends JsonDeserializer<RepoInfo> {
    @Override
    public RepoInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoInfoPb pb = mapper.readValue(p, RepoInfoPb.class);
      return RepoInfo.fromPb(pb);
    }
  }
}
