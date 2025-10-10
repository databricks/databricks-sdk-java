// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCredentialsRequest {
  /** The ID for the corresponding credential to access. */
  @JsonIgnore private Long credentialId;

  /**
   * The authenticating email associated with your Git provider user account. Used for
   * authentication with the remote repository and also sets the author & committer identity for
   * commits. Required for most Git providers except AWS CodeCommit. Learn more at
   * https://docs.databricks.com/aws/en/repos/get-access-tokens-from-git-provider
   */
  @JsonProperty("git_email")
  private String gitEmail;

  /**
   * Git provider. This field is case-insensitive. The available Git providers are `gitHub`,
   * `bitbucketCloud`, `gitLab`, `azureDevOpsServices`, `gitHubEnterprise`, `bitbucketServer`,
   * `gitLabEnterpriseEdition` and `awsCodeCommit`.
   */
  @JsonProperty("git_provider")
  private String gitProvider;

  /**
   * The username provided with your Git provider account and associated with the credential. For
   * most Git providers it is only used to set the Git committer & author names for commits, however
   * it may be required for authentication depending on your Git provider / token requirements.
   * Required for AWS CodeCommit.
   */
  @JsonProperty("git_username")
  private String gitUsername;

  /** if the credential is the default for the given provider */
  @JsonProperty("is_default_for_provider")
  private Boolean isDefaultForProvider;

  /** the name of the git credential, used for identification and ease of lookup */
  @JsonProperty("name")
  private String name;

  /**
   * The personal access token used to authenticate to the corresponding Git provider. For certain
   * providers, support may exist for other types of scoped access tokens. [Learn more].
   *
   * <p>[Learn more]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
   */
  @JsonProperty("personal_access_token")
  private String personalAccessToken;

  public UpdateCredentialsRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public UpdateCredentialsRequest setGitEmail(String gitEmail) {
    this.gitEmail = gitEmail;
    return this;
  }

  public String getGitEmail() {
    return gitEmail;
  }

  public UpdateCredentialsRequest setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public UpdateCredentialsRequest setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  public UpdateCredentialsRequest setIsDefaultForProvider(Boolean isDefaultForProvider) {
    this.isDefaultForProvider = isDefaultForProvider;
    return this;
  }

  public Boolean getIsDefaultForProvider() {
    return isDefaultForProvider;
  }

  public UpdateCredentialsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCredentialsRequest setPersonalAccessToken(String personalAccessToken) {
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
    UpdateCredentialsRequest that = (UpdateCredentialsRequest) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitEmail, that.gitEmail)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(isDefaultForProvider, that.isDefaultForProvider)
        && Objects.equals(name, that.name)
        && Objects.equals(personalAccessToken, that.personalAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        credentialId,
        gitEmail,
        gitProvider,
        gitUsername,
        isDefaultForProvider,
        name,
        personalAccessToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCredentialsRequest.class)
        .add("credentialId", credentialId)
        .add("gitEmail", gitEmail)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("isDefaultForProvider", isDefaultForProvider)
        .add("name", name)
        .add("personalAccessToken", personalAccessToken)
        .toString();
  }
}
