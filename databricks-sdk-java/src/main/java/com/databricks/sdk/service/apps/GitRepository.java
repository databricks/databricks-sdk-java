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
   * When true, automatically deploys the app on push events to the branch configured in the app's
   * deployment_source.git_source.
   */
  @JsonProperty("auto_deploy")
  private Boolean autoDeploy;

  /**
   * ID of a personal access token Git credential owned by the caller, used to grant the app's
   * service principal access to this repository.
   */
  @JsonProperty("caller_credential_id")
  private Long callerCredentialId;

  /**
   * Git provider. Case insensitive. Supported values: gitHub, gitHubEnterprise, bitbucketCloud,
   * bitbucketServer, azureDevOpsServices, gitLab, gitLabEnterpriseEdition, awsCodeCommit.
   */
  @JsonProperty("provider")
  private String provider;

  /** URL of the Git repository. */
  @JsonProperty("url")
  private String url;

  public GitRepository setAutoDeploy(Boolean autoDeploy) {
    this.autoDeploy = autoDeploy;
    return this;
  }

  public Boolean getAutoDeploy() {
    return autoDeploy;
  }

  public GitRepository setCallerCredentialId(Long callerCredentialId) {
    this.callerCredentialId = callerCredentialId;
    return this;
  }

  public Long getCallerCredentialId() {
    return callerCredentialId;
  }

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
    return Objects.equals(autoDeploy, that.autoDeploy)
        && Objects.equals(callerCredentialId, that.callerCredentialId)
        && Objects.equals(provider, that.provider)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoDeploy, callerCredentialId, provider, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GitRepository.class)
        .add("autoDeploy", autoDeploy)
        .add("callerCredentialId", callerCredentialId)
        .add("provider", provider)
        .add("url", url)
        .toString();
  }
}
