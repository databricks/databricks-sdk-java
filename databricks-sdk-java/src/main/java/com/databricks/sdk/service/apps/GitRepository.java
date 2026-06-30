// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Git repository configuration specifying the location of the repository. */
@Generated
public class GitRepository {
  /**
   * Git provider. Case insensitive. Supported values: gitHub, gitHubEnterprise, bitbucketCloud,
   * bitbucketServer, azureDevOpsServices, gitLab, gitLabEnterpriseEdition, awsCodeCommit.
   */
  @JsonProperty("provider")
  private String provider;

  /** URL of the Git repository. */
  @JsonProperty("url")
  private String url;

  public GitRepository setProvider(String provider) {
    this.provider = provider;
    return this;
  }

  public String getProvider() {
    return provider;
  }

  public GitRepository setUrl(String url) {
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
    GitRepository that = (GitRepository) o;
    return Objects.equals(provider, that.provider) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GitRepository.class).add("provider", provider).add("url", url).toString();
  }
}
