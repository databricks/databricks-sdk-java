// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRepo {
  /**
   * Desired path for the repo in the workspace. Must be in the format /Repos/{folder}/{repo-name}.
   */
  @JsonProperty("path")
  private String path;

  /**
   * Git provider. This field is case-insensitive. The available Git providers are gitHub,
   * bitbucketCloud, gitLab, azureDevOpsServices, gitHubEnterprise, bitbucketServer,
   * gitLabEnterpriseEdition and awsCodeCommit.
   */
  @JsonProperty("provider")
  private String provider;

  /**
   * If specified, the repo will be created with sparse checkout enabled. You cannot enable/disable
   * sparse checkout after the repo is created.
   */
  @JsonProperty("sparse_checkout")
  private SparseCheckout sparseCheckout;

  /** URL of the Git repository to be linked. */
  @JsonProperty("url")
  private String url;

  public CreateRepo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public CreateRepo setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public CreateRepo setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  public CreateRepo setUrl(String url) {
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
    CreateRepo that = (CreateRepo) o;
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
    return new ToStringer(CreateRepo.class)
        .add("path", path)
        .add("provider", provider)
        .add("sparseCheckout", sparseCheckout)
        .add("url", url)
        .toString();
  }
}
