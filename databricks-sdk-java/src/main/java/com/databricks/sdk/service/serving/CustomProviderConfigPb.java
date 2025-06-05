// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configs needed to create a custom provider model route. */
@Generated
class CustomProviderConfigPb {
  @JsonProperty("api_key_auth")
  private ApiKeyAuth apiKeyAuth;

  @JsonProperty("bearer_token_auth")
  private BearerTokenAuth bearerTokenAuth;

  @JsonProperty("custom_provider_url")
  private String customProviderUrl;

  public CustomProviderConfigPb setApiKeyAuth(ApiKeyAuth apiKeyAuth) {
    this.apiKeyAuth = apiKeyAuth;
    return this;
  }

  public ApiKeyAuth getApiKeyAuth() {
    return apiKeyAuth;
  }

  public CustomProviderConfigPb setBearerTokenAuth(BearerTokenAuth bearerTokenAuth) {
    this.bearerTokenAuth = bearerTokenAuth;
    return this;
  }

  public BearerTokenAuth getBearerTokenAuth() {
    return bearerTokenAuth;
  }

  public CustomProviderConfigPb setCustomProviderUrl(String customProviderUrl) {
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
    CustomProviderConfigPb that = (CustomProviderConfigPb) o;
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
    return new ToStringer(CustomProviderConfigPb.class)
        .add("apiKeyAuth", apiKeyAuth)
        .add("bearerTokenAuth", bearerTokenAuth)
        .add("customProviderUrl", customProviderUrl)
        .toString();
  }
}
