// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class Ai21LabsConfigPb {
  @JsonProperty("ai21labs_api_key")
  private String ai21labsApiKey;

  @JsonProperty("ai21labs_api_key_plaintext")
  private String ai21labsApiKeyPlaintext;

  public Ai21LabsConfigPb setAi21labsApiKey(String ai21labsApiKey) {
    this.ai21labsApiKey = ai21labsApiKey;
    return this;
  }

  public String getAi21labsApiKey() {
    return ai21labsApiKey;
  }

  public Ai21LabsConfigPb setAi21labsApiKeyPlaintext(String ai21labsApiKeyPlaintext) {
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
    Ai21LabsConfigPb that = (Ai21LabsConfigPb) o;
    return Objects.equals(ai21labsApiKey, that.ai21labsApiKey)
        && Objects.equals(ai21labsApiKeyPlaintext, that.ai21labsApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ai21labsApiKey, ai21labsApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(Ai21LabsConfigPb.class)
        .add("ai21labsApiKey", ai21labsApiKey)
        .add("ai21labsApiKeyPlaintext", ai21labsApiKeyPlaintext)
        .toString();
  }
}
