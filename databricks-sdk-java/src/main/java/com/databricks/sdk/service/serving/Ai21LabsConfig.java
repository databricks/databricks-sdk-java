// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Ai21LabsConfig {
  /**
   * The Databricks secret key reference for an AI21 Labs API key. If you prefer to paste your API
   * key directly, see `ai21labs_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `ai21labs_api_key` or `ai21labs_api_key_plaintext`.
   */
  @JsonProperty("ai21labs_api_key")
  private String ai21labsApiKey;

  /**
   * An AI21 Labs API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `ai21labs_api_key`. You must provide an API key using one of the
   * following fields: `ai21labs_api_key` or `ai21labs_api_key_plaintext`.
   */
  @JsonProperty("ai21labs_api_key_plaintext")
  private String ai21labsApiKeyPlaintext;

  public Ai21LabsConfig setAi21labsApiKey(String ai21labsApiKey) {
    this.ai21labsApiKey = ai21labsApiKey;
    return this;
  }

  public String getAi21labsApiKey() {
    return ai21labsApiKey;
  }

  public Ai21LabsConfig setAi21labsApiKeyPlaintext(String ai21labsApiKeyPlaintext) {
    this.ai21labsApiKeyPlaintext = ai21labsApiKeyPlaintext;
    return this;
  }

  public String getAi21labsApiKeyPlaintext() {
    return ai21labsApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ai21LabsConfig that = (Ai21LabsConfig) o;
    return Objects.equals(ai21labsApiKey, that.ai21labsApiKey)
        && Objects.equals(ai21labsApiKeyPlaintext, that.ai21labsApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ai21labsApiKey, ai21labsApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(Ai21LabsConfig.class)
        .add("ai21labsApiKey", ai21labsApiKey)
        .add("ai21labsApiKeyPlaintext", ai21labsApiKeyPlaintext)
        .toString();
  }
}
