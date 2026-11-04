// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JiraExportConfig {
  /**
   * Three-level Unity Catalog name (`catalog.schema.secret`) of the secret holding the Jira API
   * token, paired with `user_email` as the Jira Cloud basic-auth credential (`email:token`). Only
   * the name is stored; the token is read when an alert is exported, so rotating the secret takes
   * effect without editing this config.
   */
  @JsonProperty("api_token_uc_secret")
  private String apiTokenUcSecret;

  /**
   * Default issue type for created tickets (e.g. `Task`, `Incident`). Jira issue creation requires
   * an issue type, so it is validated at config-save time rather than failing the export at Jira
   * later.
   */
  @JsonProperty("default_issue_type")
  private String defaultIssueType;

  /** Jira instance URL (e.g. `https://acme.atlassian.net`). */
  @JsonProperty("instance_url")
  private String instanceUrl;

  /** Jira project key the exported issues are created under. */
  @JsonProperty("project_key")
  private String projectKey;

  /** User email paired with the API token for Jira Cloud basic auth. */
  @JsonProperty("user_email")
  private String userEmail;

  public JiraExportConfig setApiTokenUcSecret(String apiTokenUcSecret) {
    this.apiTokenUcSecret = apiTokenUcSecret;
    return this;
  }

  public String getApiTokenUcSecret() {
    return apiTokenUcSecret;
  }

  public JiraExportConfig setDefaultIssueType(String defaultIssueType) {
    this.defaultIssueType = defaultIssueType;
    return this;
  }

  public String getDefaultIssueType() {
    return defaultIssueType;
  }

  public JiraExportConfig setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
    return this;
  }

  public String getInstanceUrl() {
    return instanceUrl;
  }

  public JiraExportConfig setProjectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  public String getProjectKey() {
    return projectKey;
  }

  public JiraExportConfig setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  public String getUserEmail() {
    return userEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JiraExportConfig that = (JiraExportConfig) o;
    return Objects.equals(apiTokenUcSecret, that.apiTokenUcSecret)
        && Objects.equals(defaultIssueType, that.defaultIssueType)
        && Objects.equals(instanceUrl, that.instanceUrl)
        && Objects.equals(projectKey, that.projectKey)
        && Objects.equals(userEmail, that.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiTokenUcSecret, defaultIssueType, instanceUrl, projectKey, userEmail);
  }

  @Override
  public String toString() {
    return new ToStringer(JiraExportConfig.class)
        .add("apiTokenUcSecret", apiTokenUcSecret)
        .add("defaultIssueType", defaultIssueType)
        .add("instanceUrl", instanceUrl)
        .add("projectKey", projectKey)
        .add("userEmail", userEmail)
        .toString();
  }
}
