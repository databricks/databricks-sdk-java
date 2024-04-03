// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AnthropicConfig {
  /** The Databricks secret key reference for an Anthropic API key. */
  @JsonProperty("anthropic_api_key")
  private String anthropicApiKey;

  public AnthropicConfig setAnthropicApiKey(String anthropicApiKey) {
    this.anthropicApiKey = anthropicApiKey;
    return this;
  }

  public String getAnthropicApiKey() {
    return anthropicApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnthropicConfig that = (AnthropicConfig) o;
    return Objects.equals(anthropicApiKey, that.anthropicApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anthropicApiKey);
  }

  @Override
  public String toString() {
    return new ToStringer(AnthropicConfig.class).add("anthropicApiKey", anthropicApiKey).toString();
  }
}
