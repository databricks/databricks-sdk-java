// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AnthropicConfig {
  /**
   * The Databricks secret key reference for an Anthropic API key. If you prefer to paste your API
   * key directly, see `anthropic_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `anthropic_api_key` or `anthropic_api_key_plaintext`.
   */
  @JsonProperty("anthropic_api_key")
  private String anthropicApiKey;

  /**
   * The Anthropic API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `anthropic_api_key`. You must provide an API key using one of the
   * following fields: `anthropic_api_key` or `anthropic_api_key_plaintext`.
   */
  @JsonProperty("anthropic_api_key_plaintext")
  private String anthropicApiKeyPlaintext;

  public AnthropicConfig setAnthropicApiKey(String anthropicApiKey) {
    this.anthropicApiKey = anthropicApiKey;
    return this;
  }

  public String getAnthropicApiKey() {
    return anthropicApiKey;
  }

  public AnthropicConfig setAnthropicApiKeyPlaintext(String anthropicApiKeyPlaintext) {
    this.anthropicApiKeyPlaintext = anthropicApiKeyPlaintext;
    return this;
  }

  public String getAnthropicApiKeyPlaintext() {
    return anthropicApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnthropicConfig that = (AnthropicConfig) o;
    return Objects.equals(anthropicApiKey, that.anthropicApiKey)
        && Objects.equals(anthropicApiKeyPlaintext, that.anthropicApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anthropicApiKey, anthropicApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(AnthropicConfig.class)
        .add("anthropicApiKey", anthropicApiKey)
        .add("anthropicApiKeyPlaintext", anthropicApiKeyPlaintext)
        .toString();
  }
}
