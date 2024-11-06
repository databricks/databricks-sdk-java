// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PaLmConfig {
  /**
   * The Databricks secret key reference for a PaLM API key. If you prefer to paste your API key
   * directly, see `palm_api_key_plaintext`. You must provide an API key using one of the following
   * fields: `palm_api_key` or `palm_api_key_plaintext`.
   */
  @JsonProperty("palm_api_key")
  private String palmApiKey;

  /**
   * The PaLM API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `palm_api_key`. You must provide an API key using one of the following
   * fields: `palm_api_key` or `palm_api_key_plaintext`.
   */
  @JsonProperty("palm_api_key_plaintext")
  private String palmApiKeyPlaintext;

  public PaLmConfig setPalmApiKey(String palmApiKey) {
    this.palmApiKey = palmApiKey;
    return this;
  }

  public String getPalmApiKey() {
    return palmApiKey;
  }

  public PaLmConfig setPalmApiKeyPlaintext(String palmApiKeyPlaintext) {
    this.palmApiKeyPlaintext = palmApiKeyPlaintext;
    return this;
  }

  public String getPalmApiKeyPlaintext() {
    return palmApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaLmConfig that = (PaLmConfig) o;
    return Objects.equals(palmApiKey, that.palmApiKey)
        && Objects.equals(palmApiKeyPlaintext, that.palmApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palmApiKey, palmApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(PaLmConfig.class)
        .add("palmApiKey", palmApiKey)
        .add("palmApiKeyPlaintext", palmApiKeyPlaintext)
        .toString();
  }
}
