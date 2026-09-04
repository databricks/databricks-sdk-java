// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Direct form of Anthropic provider config. */
@Generated
public class ModelProviderServiceConfigAnthropicProviderDirectConfig {
  /**
   * Anthropic API key. Required when creating the service. Supply the value in `api_key.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  public ModelProviderServiceConfigAnthropicProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAnthropicProviderDirectConfig that =
        (ModelProviderServiceConfigAnthropicProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAnthropicProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .toString();
  }
}
