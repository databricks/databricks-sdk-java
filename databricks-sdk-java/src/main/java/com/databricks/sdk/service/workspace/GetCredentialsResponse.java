// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetCredentialsResponse {
  /** ID of the credential object in the workspace. */
  @JsonProperty("credential_id")
  private Long credentialId;

  /** The Git provider associated with the credential. */
  @JsonProperty("git_provider")
  private String gitProvider;

  /**
   * The username or email provided with your Git provider account and associated with the
   * credential.
   */
  @JsonProperty("git_username")
  private String gitUsername;

  public GetCredentialsResponse setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public GetCredentialsResponse setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public GetCredentialsResponse setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialsResponse that = (GetCredentialsResponse) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, gitProvider, gitUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsResponse.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .toString();
  }
}
