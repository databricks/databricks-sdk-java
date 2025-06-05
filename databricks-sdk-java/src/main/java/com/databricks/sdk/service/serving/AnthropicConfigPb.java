// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AnthropicConfigPb {
  @JsonProperty("anthropic_api_key")
  private String anthropicApiKey;

  @JsonProperty("anthropic_api_key_plaintext")
  private String anthropicApiKeyPlaintext;

  public AnthropicConfigPb setAnthropicApiKey(String anthropicApiKey) {
    this.anthropicApiKey = anthropicApiKey;
    return this;
  }

  public String getAnthropicApiKey() {
    return anthropicApiKey;
  }

  public AnthropicConfigPb setAnthropicApiKeyPlaintext(String anthropicApiKeyPlaintext) {
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
    AnthropicConfigPb that = (AnthropicConfigPb) o;
    return Objects.equals(anthropicApiKey, that.anthropicApiKey)
        && Objects.equals(anthropicApiKeyPlaintext, that.anthropicApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anthropicApiKey, anthropicApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(AnthropicConfigPb.class)
        .add("anthropicApiKey", anthropicApiKey)
        .add("anthropicApiKeyPlaintext", anthropicApiKeyPlaintext)
        .toString();
  }
}
