// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EmbeddingSourceColumnPb {
  @JsonProperty("embedding_model_endpoint_name")
  private String embeddingModelEndpointName;

  @JsonProperty("name")
  private String name;

  public EmbeddingSourceColumnPb setEmbeddingModelEndpointName(String embeddingModelEndpointName) {
    this.embeddingModelEndpointName = embeddingModelEndpointName;
    return this;
  }

  public String getEmbeddingModelEndpointName() {
    return embeddingModelEndpointName;
  }

  public EmbeddingSourceColumnPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmbeddingSourceColumnPb that = (EmbeddingSourceColumnPb) o;
    return Objects.equals(embeddingModelEndpointName, that.embeddingModelEndpointName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingModelEndpointName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingSourceColumnPb.class)
        .add("embeddingModelEndpointName", embeddingModelEndpointName)
        .add("name", name)
        .toString();
  }
}
