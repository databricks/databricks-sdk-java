// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CohereConfigPb {
  @JsonProperty("cohere_api_base")
  private String cohereApiBase;

  @JsonProperty("cohere_api_key")
  private String cohereApiKey;

  @JsonProperty("cohere_api_key_plaintext")
  private String cohereApiKeyPlaintext;

  public CohereConfigPb setCohereApiBase(String cohereApiBase) {
    this.cohereApiBase = cohereApiBase;
    return this;
  }

  public String getCohereApiBase() {
    return cohereApiBase;
  }

  public CohereConfigPb setCohereApiKey(String cohereApiKey) {
    this.cohereApiKey = cohereApiKey;
    return this;
  }

  public String getCohereApiKey() {
    return cohereApiKey;
  }

  public CohereConfigPb setCohereApiKeyPlaintext(String cohereApiKeyPlaintext) {
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
    CohereConfigPb that = (CohereConfigPb) o;
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
    return new ToStringer(CohereConfigPb.class)
        .add("cohereApiBase", cohereApiBase)
        .add("cohereApiKey", cohereApiKey)
        .add("cohereApiKeyPlaintext", cohereApiKeyPlaintext)
        .toString();
  }
}
