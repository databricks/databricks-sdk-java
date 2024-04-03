// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PaLmConfig {
  /** The Databricks secret key reference for a PaLM API key. */
  @JsonProperty("palm_api_key")
  private String palmApiKey;

  public PaLmConfig setPalmApiKey(String palmApiKey) {
    this.palmApiKey = palmApiKey;
    return this;
  }

  public String getPalmApiKey() {
    return palmApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaLmConfig that = (PaLmConfig) o;
    return Objects.equals(palmApiKey, that.palmApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palmApiKey);
  }

  @Override
  public String toString() {
    return new ToStringer(PaLmConfig.class).add("palmApiKey", palmApiKey).toString();
  }
}
