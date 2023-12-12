// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CohereConfig {
  /** The Databricks secret key reference for a Cohere API key. */
  @JsonProperty("cohere_api_key")
  private String cohereApiKey;

  public CohereConfig setCohereApiKey(String cohereApiKey) {
    this.cohereApiKey = cohereApiKey;
    return this;
  }

  public String getCohereApiKey() {
    return cohereApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CohereConfig that = (CohereConfig) o;
    return Objects.equals(cohereApiKey, that.cohereApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohereApiKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CohereConfig.class).add("cohereApiKey", cohereApiKey).toString();
  }
}
