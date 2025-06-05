// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DatabricksModelServingConfigPb {
  @JsonProperty("databricks_api_token")
  private String databricksApiToken;

  @JsonProperty("databricks_api_token_plaintext")
  private String databricksApiTokenPlaintext;

  @JsonProperty("databricks_workspace_url")
  private String databricksWorkspaceUrl;

  public DatabricksModelServingConfigPb setDatabricksApiToken(String databricksApiToken) {
    this.databricksApiToken = databricksApiToken;
    return this;
  }

  public String getDatabricksApiToken() {
    return databricksApiToken;
  }

  public DatabricksModelServingConfigPb setDatabricksApiTokenPlaintext(
      String databricksApiTokenPlaintext) {
    this.databricksApiTokenPlaintext = databricksApiTokenPlaintext;
    return this;
  }

  public String getDatabricksApiTokenPlaintext() {
    return databricksApiTokenPlaintext;
  }

  public DatabricksModelServingConfigPb setDatabricksWorkspaceUrl(String databricksWorkspaceUrl) {
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
    DatabricksModelServingConfigPb that = (DatabricksModelServingConfigPb) o;
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
    return new ToStringer(DatabricksModelServingConfigPb.class)
        .add("databricksApiToken", databricksApiToken)
        .add("databricksApiTokenPlaintext", databricksApiTokenPlaintext)
        .add("databricksWorkspaceUrl", databricksWorkspaceUrl)
        .toString();
  }
}
