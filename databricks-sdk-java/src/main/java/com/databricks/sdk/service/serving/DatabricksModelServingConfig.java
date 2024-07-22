// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabricksModelServingConfig {
  /**
   * The Databricks secret key reference for a Databricks API token that corresponds to a user or
   * service principal with Can Query access to the model serving endpoint pointed to by this
   * external model. If you prefer to paste your API key directly, see
   * `databricks_api_token_plaintext`. You must provide an API key using one of the following
   * fields: `databricks_api_token` or `databricks_api_token_plaintext`.
   */
  @JsonProperty("databricks_api_token")
  private String databricksApiToken;

  /**
   * The Databricks API token that corresponds to a user or service principal with Can Query access
   * to the model serving endpoint pointed to by this external model provided as a plaintext string.
   * If you prefer to reference your key using Databricks Secrets, see `databricks_api_token`. You
   * must provide an API key using one of the following fields: `databricks_api_token` or
   * `databricks_api_token_plaintext`.
   */
  @JsonProperty("databricks_api_token_plaintext")
  private String databricksApiTokenPlaintext;

  /**
   * The URL of the Databricks workspace containing the model serving endpoint pointed to by this
   * external model.
   */
  @JsonProperty("databricks_workspace_url")
  private String databricksWorkspaceUrl;

  public DatabricksModelServingConfig setDatabricksApiToken(String databricksApiToken) {
    this.databricksApiToken = databricksApiToken;
    return this;
  }

  public String getDatabricksApiToken() {
    return databricksApiToken;
  }

  public DatabricksModelServingConfig setDatabricksApiTokenPlaintext(
      String databricksApiTokenPlaintext) {
    this.databricksApiTokenPlaintext = databricksApiTokenPlaintext;
    return this;
  }

  public String getDatabricksApiTokenPlaintext() {
    return databricksApiTokenPlaintext;
  }

  public DatabricksModelServingConfig setDatabricksWorkspaceUrl(String databricksWorkspaceUrl) {
    this.databricksWorkspaceUrl = databricksWorkspaceUrl;
    return this;
  }

  public String getDatabricksWorkspaceUrl() {
    return databricksWorkspaceUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksModelServingConfig that = (DatabricksModelServingConfig) o;
    return Objects.equals(databricksApiToken, that.databricksApiToken)
        && Objects.equals(databricksApiTokenPlaintext, that.databricksApiTokenPlaintext)
        && Objects.equals(databricksWorkspaceUrl, that.databricksWorkspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databricksApiToken, databricksApiTokenPlaintext, databricksWorkspaceUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksModelServingConfig.class)
        .add("databricksApiToken", databricksApiToken)
        .add("databricksApiTokenPlaintext", databricksApiTokenPlaintext)
        .add("databricksWorkspaceUrl", databricksWorkspaceUrl)
        .toString();
  }
}
