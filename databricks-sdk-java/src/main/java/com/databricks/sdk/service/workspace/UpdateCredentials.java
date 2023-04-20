// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateCredentials {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  /**
   * Git provider. This field is case-insensitive. The available Git providers are gitHub,
   * bitbucketCloud, gitLab, azureDevOpsServices, gitHubEnterprise, bitbucketServer,
   * gitLabEnterpriseEdition and awsCodeCommit.
   */
  @JsonProperty("git_provider")
  private String gitProvider;

  /** Git username. */
  @JsonProperty("git_username")
  private String gitUsername;

  /** The personal access token used to authenticate to the corresponding Git provider. */
  @JsonProperty("personal_access_token")
  private String personalAccessToken;

  public UpdateCredentials setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public UpdateCredentials setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public UpdateCredentials setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  public UpdateCredentials setPersonalAccessToken(String personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
    return this;
  }

  public String getPersonalAccessToken() {
    return personalAccessToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCredentials that = (UpdateCredentials) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(personalAccessToken, that.personalAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, gitProvider, gitUsername, personalAccessToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCredentials.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("personalAccessToken", personalAccessToken)
        .toString();
  }
}
