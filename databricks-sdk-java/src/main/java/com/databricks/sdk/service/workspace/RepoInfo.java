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

/** Git folder (repo) information. */
@Generated
@JsonSerialize(using = RepoInfo.RepoInfoSerializer.class)
@JsonDeserialize(using = RepoInfo.RepoInfoDeserializer.class)
public class RepoInfo {
  /** Name of the current git branch of the git folder (repo). */
  private String branch;

  /** Current git commit id of the git folder (repo). */
  private String headCommitId;

  /** Id of the git folder (repo) in the Workspace. */
  private Long id;

  /** Root path of the git folder (repo) in the Workspace. */
  private String path;

  /** Git provider of the remote git repository, e.g. `gitHub`. */
  private String provider;

  /** Sparse checkout config for the git folder (repo). */
  private SparseCheckout sparseCheckout;

  /** URL of the remote git repository. */
  private String url;

  public RepoInfo setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public RepoInfo setHeadCommitId(String headCommitId) {
    this.headCommitId = headCommitId;
    return this;
  }

  public String getHeadCommitId() {
    return headCommitId;
  }

  public RepoInfo setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RepoInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public RepoInfo setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public RepoInfo setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public RepoInfo setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoInfo that = (RepoInfo) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(headCommitId, that.headCommitId)
        && Objects.equals(id, that.id)
        && Objects.equals(path, that.path)
        && Objects.equals(provider, that.provider)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, headCommitId, id, path, provider, sparseCheckout, url);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoInfo.class)
        .add("branch", branch)
        .add("headCommitId", headCommitId)
        .add("id", id)
        .add("path", path)
        .add("provider", provider)
        .add("sparseCheckout", sparseCheckout)
        .add("url", url)
        .toString();
  }

  RepoInfoPb toPb() {
    RepoInfoPb pb = new RepoInfoPb();
    pb.setBranch(branch);
    pb.setHeadCommitId(headCommitId);
    pb.setId(id);
    pb.setPath(path);
    pb.setProvider(provider);
    pb.setSparseCheckout(sparseCheckout);
    pb.setUrl(url);

    return pb;
  }

  static RepoInfo fromPb(RepoInfoPb pb) {
    RepoInfo model = new RepoInfo();
    model.setBranch(pb.getBranch());
    model.setHeadCommitId(pb.getHeadCommitId());
    model.setId(pb.getId());
    model.setPath(pb.getPath());
    model.setProvider(pb.getProvider());
    model.setSparseCheckout(pb.getSparseCheckout());
    model.setUrl(pb.getUrl());

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
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoInfoPb pb = mapper.readValue(p, RepoInfoPb.class);
      return RepoInfo.fromPb(pb);
    }
  }
}
