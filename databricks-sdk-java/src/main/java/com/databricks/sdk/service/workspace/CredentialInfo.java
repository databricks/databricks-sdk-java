// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CredentialInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>credentialId</code>.</p>
   *
   * @param credentialId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  public CredentialInfo setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCredentialId() {
    return credentialId;
  }

  /**
   * <p>Setter for the field <code>gitProvider</code>.</p>
   *
   * @param gitProvider a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  public CredentialInfo setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitProvider</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitProvider() {
    return gitProvider;
  }

  /**
   * <p>Setter for the field <code>gitUsername</code>.</p>
   *
   * @param gitUsername a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  public CredentialInfo setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitUsername</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGitUsername() {
    return gitUsername;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CredentialInfo that = (CredentialInfo) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(credentialId, gitProvider, gitUsername);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CredentialInfo.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .toString();
  }
}
