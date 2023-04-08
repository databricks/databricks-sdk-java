// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CredentialInfo {
  /** ID of the credential object in the workspace. */
  @JsonProperty("credential_id")
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

  public CredentialInfo setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public CredentialInfo setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CredentialInfo setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }
}
