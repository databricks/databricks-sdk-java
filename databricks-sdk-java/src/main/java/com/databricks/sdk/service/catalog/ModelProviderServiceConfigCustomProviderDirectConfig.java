// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of a custom provider configuration. Set `api_key` to the bearer token sent in the
 * `Authorization` header.
 */
@Generated
public class ModelProviderServiceConfigCustomProviderDirectConfig {
  /**
   * Bearer token forwarded in the `Authorization` header. Supply the value in `api_key.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  /**
   * Endpoint URL of the OpenAI-compatible service (e.g., `https://api.example.com/v1`). Required on
   * Create.
   */
  @JsonProperty("base_url")
  private String baseUrl;

  public ModelProviderServiceConfigCustomProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  public ModelProviderServiceConfigCustomProviderDirectConfig setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigCustomProviderDirectConfig that =
        (ModelProviderServiceConfigCustomProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey) && Objects.equals(baseUrl, that.baseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, baseUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigCustomProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .toString();
  }
}
