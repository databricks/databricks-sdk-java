// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CohereConfig {
  /**
   * This is an optional field to provide a customized base URL for the Cohere API. If left
   * unspecified, the standard Cohere base URL is used.
   */
  @JsonProperty("cohere_api_base")
  private String cohereApiBase;

  /**
   * The Databricks secret key reference for a Cohere API key. If you prefer to paste your API key
   * directly, see `cohere_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `cohere_api_key` or `cohere_api_key_plaintext`.
   */
  @JsonProperty("cohere_api_key")
  private String cohereApiKey;

  /**
   * The Cohere API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `cohere_api_key`. You must provide an API key using one of the
   * following fields: `cohere_api_key` or `cohere_api_key_plaintext`.
   */
  @JsonProperty("cohere_api_key_plaintext")
  private String cohereApiKeyPlaintext;

  public CohereConfig setCohereApiBase(String cohereApiBase) {
    this.cohereApiBase = cohereApiBase;
    return this;
  }

  public String getCohereApiBase() {
    return cohereApiBase;
  }

  public CohereConfig setCohereApiKey(String cohereApiKey) {
    this.cohereApiKey = cohereApiKey;
    return this;
  }

  public String getCohereApiKey() {
    return cohereApiKey;
  }

  public CohereConfig setCohereApiKeyPlaintext(String cohereApiKeyPlaintext) {
    this.cohereApiKeyPlaintext = cohereApiKeyPlaintext;
    return this;
  }

  public String getCohereApiKeyPlaintext() {
    return cohereApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CohereConfig that = (CohereConfig) o;
    return Objects.equals(cohereApiBase, that.cohereApiBase)
        && Objects.equals(cohereApiKey, that.cohereApiKey)
        && Objects.equals(cohereApiKeyPlaintext, that.cohereApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohereApiBase, cohereApiKey, cohereApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(CohereConfig.class)
        .add("cohereApiBase", cohereApiBase)
        .add("cohereApiKey", cohereApiKey)
        .add("cohereApiKeyPlaintext", cohereApiKeyPlaintext)
        .toString();
  }
}
