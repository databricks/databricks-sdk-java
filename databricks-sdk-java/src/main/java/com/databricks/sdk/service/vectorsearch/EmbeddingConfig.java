// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EmbeddingConfig {
  /** Name of the embedding model endpoint */
  @JsonProperty("embedding_model_endpoint_name")
  private String embeddingModelEndpointName;

  public EmbeddingConfig setEmbeddingModelEndpointName(String embeddingModelEndpointName) {
    this.embeddingModelEndpointName = embeddingModelEndpointName;
    return this;
  }

  public String getEmbeddingModelEndpointName() {
    return embeddingModelEndpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmbeddingConfig that = (EmbeddingConfig) o;
    return Objects.equals(embeddingModelEndpointName, that.embeddingModelEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingModelEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingConfig.class)
        .add("embeddingModelEndpointName", embeddingModelEndpointName)
        .toString();
  }
}
