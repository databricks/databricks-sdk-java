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

  /**
   * Reference to a Unity Catalog service credential authorizing Gemini Enterprise requests. On
   * Create, supply `service_credential.name` as `credentials/{name}`; required when using
   * service-credential authentication and mutually exclusive with `api_key`. The credential is
   * referenced by name; its value is not carried here. On read, the resolved `id` and `is_deleted`
   * are also populated. Supported only on GCP-hosted workspaces.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

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

  public ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig setServiceCredential(
      ModelProviderServiceConfigServiceCredential serviceCredential) {
    this.serviceCredential = serviceCredential;
    return this;
  }

  public ModelProviderServiceConfigServiceCredential getServiceCredential() {
    return serviceCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig that =
        (ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(region, that.region)
        && Objects.equals(serviceCredential, that.serviceCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, projectId, region, serviceCredential);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("projectId", projectId)
        .add("region", region)
        .add("serviceCredential", serviceCredential)
        .toString();
  }
}
