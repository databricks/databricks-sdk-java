// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Ai21LabsConfig {
  /** The Databricks secret key reference for an AI21Labs API key. */
  @JsonProperty("ai21labs_api_key")
  private String ai21labsApiKey;

  public Ai21LabsConfig setAi21labsApiKey(String ai21labsApiKey) {
    this.ai21labsApiKey = ai21labsApiKey;
    return this;
  }

  public String getAi21labsApiKey() {
    return ai21labsApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ai21LabsConfig that = (Ai21LabsConfig) o;
    return Objects.equals(ai21labsApiKey, that.ai21labsApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ai21labsApiKey);
  }

  @Override
  public String toString() {
    return new ToStringer(Ai21LabsConfig.class).add("ai21labsApiKey", ai21labsApiKey).toString();
  }
}
