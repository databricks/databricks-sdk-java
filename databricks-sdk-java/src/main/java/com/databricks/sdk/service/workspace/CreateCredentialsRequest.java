// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCredentialsRequest {
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

  /**
   * The ID of the service principal whose credentials will be modified. Only service principal
   * managers can perform this action.
   */
  @JsonProperty("principal_id")
  private Long principalId;

  public CreateCredentialsRequest setGitEmail(String gitEmail) {
    this.gitEmail = gitEmail;
    return this;
  }

  public String getGitEmail() {
    return gitEmail;
  }

  public CreateCredentialsRequest setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CreateCredentialsRequest setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  public CreateCredentialsRequest setIsDefaultForProvider(Boolean isDefaultForProvider) {
    this.isDefaultForProvider = isDefaultForProvider;
    return this;
  }

  public Boolean getIsDefaultForProvider() {
    return isDefaultForProvider;
  }

  public CreateCredentialsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCredentialsRequest setPersonalAccessToken(String personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
    return this;
  }

  public String getPersonalAccessToken() {
    return personalAccessToken;
  }

  public CreateCredentialsRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialsRequest that = (CreateCredentialsRequest) o;
    return Objects.equals(gitEmail, that.gitEmail)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(isDefaultForProvider, that.isDefaultForProvider)
        && Objects.equals(name, that.name)
        && Objects.equals(personalAccessToken, that.personalAccessToken)
        && Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        gitEmail,
        gitProvider,
        gitUsername,
        isDefaultForProvider,
        name,
        personalAccessToken,
        principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialsRequest.class)
        .add("gitEmail", gitEmail)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("isDefaultForProvider", isDefaultForProvider)
        .add("name", name)
        .add("personalAccessToken", personalAccessToken)
        .add("principalId", principalId)
        .toString();
  }
}
