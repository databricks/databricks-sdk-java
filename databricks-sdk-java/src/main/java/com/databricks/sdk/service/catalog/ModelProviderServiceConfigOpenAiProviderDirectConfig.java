// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Direct (inline-credentials) form of the OpenAI provider config. */
@Generated
public class ModelProviderServiceConfigOpenAiProviderDirectConfig {
  /**
   * OpenAI API key. Required when creating the service. Supply the value in `api_key.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  /**
   * Optional custom base URL. Defaults to `https://api.openai.com/v1`. Use for
   * OpenAI-API-compatible third-party endpoints or in-network proxies.
   */
  @JsonProperty("base_url")
  private String baseUrl;

  /**
   * Optional OpenAI organization ID. When set, the platform forwards it as the
   * `OpenAI-Organization` header.
   */
  @JsonProperty("organization")
  private String organization;

  public ModelProviderServiceConfigOpenAiProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  public ModelProviderServiceConfigOpenAiProviderDirectConfig setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public ModelProviderServiceConfigOpenAiProviderDirectConfig setOrganization(String organization) {
    this.organization = organization;
    return this;
  }

  public String getOrganization() {
    return organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigOpenAiProviderDirectConfig that =
        (ModelProviderServiceConfigOpenAiProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(baseUrl, that.baseUrl)
        && Objects.equals(organization, that.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, baseUrl, organization);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigOpenAiProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .add("organization", organization)
        .toString();
  }
}
