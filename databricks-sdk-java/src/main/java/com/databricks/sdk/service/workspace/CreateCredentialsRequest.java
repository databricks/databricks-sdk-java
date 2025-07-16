// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCredentialsRequest {
  /**
   * Git provider. This field is case-insensitive. The available Git providers are `gitHub`,
   * `bitbucketCloud`, `gitLab`, `azureDevOpsServices`, `gitHubEnterprise`, `bitbucketServer`,
   * `gitLabEnterpriseEdition` and `awsCodeCommit`.
   */
  @JsonProperty("git_provider")
  private String gitProvider;

  /**
   * The username or email provided with your Git provider account, depending on which provider you
   * are using. For GitHub, GitHub Enterprise Server, or Azure DevOps Services, either email or
   * username may be used. For GitLab, GitLab Enterprise Edition, email must be used. For AWS
   * CodeCommit, BitBucket or BitBucket Server, username must be used. For all other providers
   * please see your provider's Personal Access Token authentication documentation to see what is
   * supported.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialsRequest that = (CreateCredentialsRequest) o;
    return Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(isDefaultForProvider, that.isDefaultForProvider)
        && Objects.equals(name, that.name)
        && Objects.equals(personalAccessToken, that.personalAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitProvider, gitUsername, isDefaultForProvider, name, personalAccessToken);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialsRequest.class)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("isDefaultForProvider", isDefaultForProvider)
        .add("name", name)
        .add("personalAccessToken", personalAccessToken)
        .toString();
  }
}
