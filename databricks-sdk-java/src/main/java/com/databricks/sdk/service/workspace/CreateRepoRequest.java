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
@JsonSerialize(using = CreateRepoRequest.CreateRepoRequestSerializer.class)
@JsonDeserialize(using = CreateRepoRequest.CreateRepoRequestDeserializer.class)
public class CreateRepoRequest {
  /**
   * Desired path for the repo in the workspace. Almost any path in the workspace can be chosen. If
   * repo is created in `/Repos`, path must be in the format `/Repos/{folder}/{repo-name}`.
   */
  private String path;

  /**
   * Git provider. This field is case-insensitive. The available Git providers are `gitHub`,
   * `bitbucketCloud`, `gitLab`, `azureDevOpsServices`, `gitHubEnterprise`, `bitbucketServer`,
   * `gitLabEnterpriseEdition` and `awsCodeCommit`.
   */
  private String provider;

  /**
   * If specified, the repo will be created with sparse checkout enabled. You cannot enable/disable
   * sparse checkout after the repo is created.
   */
  private SparseCheckout sparseCheckout;

  /** URL of the Git repository to be linked. */
  private String url;

  public CreateRepoRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public CreateRepoRequest setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public CreateRepoRequest setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public CreateRepoRequest setUrl(String url) {
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
    CreateRepoRequest that = (CreateRepoRequest) o;
    return Objects.equals(path, that.path)
        && Objects.equals(provider, that.provider)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, provider, sparseCheckout, url);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRepoRequest.class)
        .add("path", path)
        .add("provider", provider)
        .add("sparseCheckout", sparseCheckout)
        .add("url", url)
        .toString();
  }

  CreateRepoRequestPb toPb() {
    CreateRepoRequestPb pb = new CreateRepoRequestPb();
    pb.setPath(path);
    pb.setProvider(provider);
    pb.setSparseCheckout(sparseCheckout);
    pb.setUrl(url);

    return pb;
  }

  static CreateRepoRequest fromPb(CreateRepoRequestPb pb) {
    CreateRepoRequest model = new CreateRepoRequest();
    model.setPath(pb.getPath());
    model.setProvider(pb.getProvider());
    model.setSparseCheckout(pb.getSparseCheckout());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class CreateRepoRequestSerializer extends JsonSerializer<CreateRepoRequest> {
    @Override
    public void serialize(CreateRepoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateRepoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateRepoRequestDeserializer extends JsonDeserializer<CreateRepoRequest> {
    @Override
    public CreateRepoRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateRepoRequestPb pb = mapper.readValue(p, CreateRepoRequestPb.class);
      return CreateRepoRequest.fromPb(pb);
    }
  }
}
