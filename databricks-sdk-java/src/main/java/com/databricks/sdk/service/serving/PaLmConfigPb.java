// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PaLmConfigPb {
  @JsonProperty("palm_api_key")
  private String palmApiKey;

  @JsonProperty("palm_api_key_plaintext")
  private String palmApiKeyPlaintext;

  public PaLmConfigPb setPalmApiKey(String palmApiKey) {
    this.palmApiKey = palmApiKey;
    return this;
  }

  public String getPalmApiKey() {
    return palmApiKey;
  }

  public PaLmConfigPb setPalmApiKeyPlaintext(String palmApiKeyPlaintext) {
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
    PaLmConfigPb that = (PaLmConfigPb) o;
    return Objects.equals(palmApiKey, that.palmApiKey)
        && Objects.equals(palmApiKeyPlaintext, that.palmApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palmApiKey, palmApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(PaLmConfigPb.class)
        .add("palmApiKey", palmApiKey)
        .add("palmApiKeyPlaintext", palmApiKeyPlaintext)
        .toString();
  }
}
