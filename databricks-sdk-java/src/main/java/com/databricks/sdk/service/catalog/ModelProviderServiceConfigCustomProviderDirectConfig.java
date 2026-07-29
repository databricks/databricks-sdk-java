// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of custom provider config.
 *
 * <p>Authentication is one of two mutually exclusive modes, exactly one of which must be supplied
 * on Create: - Bearer: set `api_key`, leave `header_auth` unset. The secret is forwarded as
 * `Authorization: Bearer <secret>`. - Header: set `header_auth`, leave `api_key` unset. The secret
 * is forwarded as `<api_key_name>: <api_key_value>`. Setting both modes or neither mode is
 * rejected.
 */
@Generated
public class ModelProviderServiceConfigCustomProviderDirectConfig {
  /**
   * Bearer token forwarded as the `Authorization: Bearer ...` header on outbound requests. Supplied
   * as inline plaintext via `ProviderSecret.plaintext`. Set this for bearer-token auth.
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
