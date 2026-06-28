// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configs needed to create a custom provider model route. */
@Generated
public class CustomProviderConfig {
  /**
   * This is a field to provide API key authentication for the custom provider API. You can only
   * specify one authentication method.
   */
  @JsonProperty("api_key_auth")
  private ApiKeyAuth apiKeyAuth;

  /**
   * This is a field to provide bearer token authentication for the custom provider API. You can
   * only specify one authentication method.
   */
  @JsonProperty("bearer_token_auth")
  private BearerTokenAuth bearerTokenAuth;

  /** This is a field to provide the URL of the custom provider API. */
  @JsonProperty("custom_provider_url")
  private String customProviderUrl;

  public CustomProviderConfig setApiKeyAuth(ApiKeyAuth apiKeyAuth) {
    this.apiKeyAuth = apiKeyAuth;
    return this;
  }

  public ApiKeyAuth getApiKeyAuth() {
    return apiKeyAuth;
  }

  public CustomProviderConfig setBearerTokenAuth(BearerTokenAuth bearerTokenAuth) {
    this.bearerTokenAuth = bearerTokenAuth;
    return this;
  }

  public BearerTokenAuth getBearerTokenAuth() {
    return bearerTokenAuth;
  }

  public CustomProviderConfig setCustomProviderUrl(String customProviderUrl) {
    this.customProviderUrl = customProviderUrl;
    return this;
  }

  public String getCustomProviderUrl() {
    return customProviderUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomProviderConfig that = (CustomProviderConfig) o;
    return Objects.equals(apiKeyAuth, that.apiKeyAuth)
        && Objects.equals(bearerTokenAuth, that.bearerTokenAuth)
        && Objects.equals(customProviderUrl, that.customProviderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyAuth, bearerTokenAuth, customProviderUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomProviderConfig.class)
        .add("apiKeyAuth", apiKeyAuth)
        .add("bearerTokenAuth", bearerTokenAuth)
        .add("customProviderUrl", customProviderUrl)
        .toString();
  }
}
