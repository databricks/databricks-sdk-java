// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of Gemini Enterprise provider config.
 *
 * <p>Authentication is one of two mutually exclusive modes; exactly one must be supplied on Create:
 * - API key: set `api_key`, leave `service_credential` unset. - Unity Catalog service credential:
 * set `service_credential`, leave `api_key` unset.
 */
@Generated
public class ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig {
  /**
   * Google Gemini Enterprise API key. Required on Create when using API-key auth; mutually
   * exclusive with `service_credential`. Supplied as inline plaintext via
   * `ProviderSecret.plaintext`.
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
