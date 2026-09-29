// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Header-based API-key authentication for a custom provider: the secret is forwarded on outbound
 * requests under a caller-chosen HTTP header, as `<api_key_name>: <api_key_value>`.
 */
@Generated
public class ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth {
  /**
   * HTTP header name that carries the API key on outbound requests (e.g.,
   * `Ocp-Apim-Subscription-Key`). The value forwarded under this header is supplied via
   * `api_key_value`.
   */
  @JsonProperty("api_key_name")
  private String apiKeyName;

  /**
   * Secret value forwarded under the `api_key_name` header on outbound requests. Supplied as inline
   * plaintext via `ProviderSecret.plaintext`.
   */
  @JsonProperty("api_key_value")
  private ModelProviderServiceConfigProviderSecret apiKeyValue;

  public ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth setApiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  public String getApiKeyName() {
    return apiKeyName;
  }

  public ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth setApiKeyValue(
      ModelProviderServiceConfigProviderSecret apiKeyValue) {
    this.apiKeyValue = apiKeyValue;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKeyValue() {
    return apiKeyValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth that =
        (ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth) o;
    return Objects.equals(apiKeyName, that.apiKeyName)
        && Objects.equals(apiKeyValue, that.apiKeyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyName, apiKeyValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigCustomProviderApiKeyHeaderAuth.class)
        .add("apiKeyName", apiKeyName)
        .add("apiKeyValue", apiKeyValue)
        .toString();
  }
}
