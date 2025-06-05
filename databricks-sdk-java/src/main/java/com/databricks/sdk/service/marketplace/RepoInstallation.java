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
@JsonSerialize(using = RepoInstallation.RepoInstallationSerializer.class)
@JsonDeserialize(using = RepoInstallation.RepoInstallationDeserializer.class)
public class RepoInstallation {
  /** the user-specified repo name for their installed git repo listing */
  private String repoName;

  /**
   * refers to the full url file path that navigates the user to the repo's entrypoint (e.g. a
   * README.md file, or the repo file view in the unified UI) should just be a relative path
   */
  private String repoPath;

  public RepoInstallation setRepoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  public String getRepoName() {
    return repoName;
  }

  public RepoInstallation setRepoPath(String repoPath) {
    this.repoPath = repoPath;
    return this;
  }

  public String getRepoPath() {
    return repoPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoInstallation that = (RepoInstallation) o;
    return Objects.equals(repoName, that.repoName) && Objects.equals(repoPath, that.repoPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoName, repoPath);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInstallation.class)
        .add("repoName", repoName)
        .add("repoPath", repoPath)
        .toString();
  }

  RepoInstallationPb toPb() {
    RepoInstallationPb pb = new RepoInstallationPb();
    pb.setRepoName(repoName);
    pb.setRepoPath(repoPath);

    return pb;
  }

  static RepoInstallation fromPb(RepoInstallationPb pb) {
    RepoInstallation model = new RepoInstallation();
    model.setRepoName(pb.getRepoName());
    model.setRepoPath(pb.getRepoPath());

    return model;
  }

  public static class RepoInstallationSerializer extends JsonSerializer<RepoInstallation> {
    @Override
    public void serialize(RepoInstallation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepoInstallationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepoInstallationDeserializer extends JsonDeserializer<RepoInstallation> {
    @Override
    public RepoInstallation deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoInstallationPb pb = mapper.readValue(p, RepoInstallationPb.class);
      return RepoInstallation.fromPb(pb);
    }
  }
}
