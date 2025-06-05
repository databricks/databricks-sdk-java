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

@Generated
@JsonSerialize(using = CreateRepoResponse.CreateRepoResponseSerializer.class)
@JsonDeserialize(using = CreateRepoResponse.CreateRepoResponseDeserializer.class)
public class CreateRepoResponse {
  /** Branch that the Git folder (repo) is checked out to. */
  private String branch;

  /** SHA-1 hash representing the commit ID of the current HEAD of the Git folder (repo). */
  private String headCommitId;

  /** ID of the Git folder (repo) object in the workspace. */
  private Long id;

  /** Path of the Git folder (repo) in the workspace. */
  private String path;

  /** Git provider of the linked Git repository. */
  private String provider;

  /** Sparse checkout settings for the Git folder (repo). */
  private SparseCheckout sparseCheckout;

  /** URL of the linked Git repository. */
  private String url;

  public CreateRepoResponse setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public CreateRepoResponse setHeadCommitId(String headCommitId) {
    this.headCommitId = headCommitId;
    return this;
  }

  public String getHeadCommitId() {
    return headCommitId;
  }

  public CreateRepoResponse setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public CreateRepoResponse setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public CreateRepoResponse setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public CreateRepoResponse setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public CreateRepoResponse setUrl(String url) {
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
    CreateRepoResponse that = (CreateRepoResponse) o;
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
    return new ToStringer(CreateRepoResponse.class)
        .add("branch", branch)
        .add("headCommitId", headCommitId)
        .add("id", id)
        .add("path", path)
        .add("provider", provider)
        .add("sparseCheckout", sparseCheckout)
        .add("url", url)
        .toString();
  }

  CreateRepoResponsePb toPb() {
    CreateRepoResponsePb pb = new CreateRepoResponsePb();
    pb.setBranch(branch);
    pb.setHeadCommitId(headCommitId);
    pb.setId(id);
    pb.setPath(path);
    pb.setProvider(provider);
    pb.setSparseCheckout(sparseCheckout);
    pb.setUrl(url);

    return pb;
  }

  static CreateRepoResponse fromPb(CreateRepoResponsePb pb) {
    CreateRepoResponse model = new CreateRepoResponse();
    model.setBranch(pb.getBranch());
    model.setHeadCommitId(pb.getHeadCommitId());
    model.setId(pb.getId());
    model.setPath(pb.getPath());
    model.setProvider(pb.getProvider());
    model.setSparseCheckout(pb.getSparseCheckout());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class CreateRepoResponseSerializer extends JsonSerializer<CreateRepoResponse> {
    @Override
    public void serialize(CreateRepoResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateRepoResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateRepoResponseDeserializer extends JsonDeserializer<CreateRepoResponse> {
    @Override
    public CreateRepoResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateRepoResponsePb pb = mapper.readValue(p, CreateRepoResponsePb.class);
      return CreateRepoResponse.fromPb(pb);
    }
  }
}
