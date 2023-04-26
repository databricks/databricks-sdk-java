// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateRepo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   */
  public CreateRepo setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * <p>Setter for the field <code>provider</code>.</p>
   *
   * @param provider a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   */
  public CreateRepo setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * <p>Getter for the field <code>provider</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProvider() {
    return provider;
  }

  /**
   * <p>Setter for the field <code>sparseCheckout</code>.</p>
   *
   * @param sparseCheckout a {@link com.databricks.sdk.service.workspace.SparseCheckout} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   */
  public CreateRepo setSparseCheckout(SparseCheckout sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparseCheckout</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.SparseCheckout} object
   */
  public SparseCheckout getSparseCheckout() {
    return sparseCheckout;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   */
  public CreateRepo setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(path, provider, sparseCheckout, url);
  }

  /** {@inheritDoc} */
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
