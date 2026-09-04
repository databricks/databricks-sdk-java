// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct Gemini Enterprise provider configuration. An API key is required when creating the
 * service.
 */
@Generated
public class ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig {
  /**
   * Google Gemini Enterprise API key. Required when creating the service. Supply the value in
   * `api_key.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  /** GCP project ID hosting the Gemini Enterprise endpoint. Required on Create. */
  @JsonProperty("project_id")
  private String projectId;

  /** GCP region of the Gemini Enterprise endpoint (e.g., `us-central1`). Required on Create. */
  @JsonProperty("region")
  private String region;

  public ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  public ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig setProjectId(
      String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig that =
        (ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, projectId, region);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("projectId", projectId)
        .add("region", region)
        .toString();
  }
}
