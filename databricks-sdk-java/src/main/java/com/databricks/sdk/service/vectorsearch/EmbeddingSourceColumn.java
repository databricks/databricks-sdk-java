// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EmbeddingSourceColumn {
  /** Name of the embedding model endpoint */
  @JsonProperty("embedding_model_endpoint_name")
  private String embeddingModelEndpointName;

  /** Name of the column */
  @JsonProperty("name")
  private String name;

  public EmbeddingSourceColumn setEmbeddingModelEndpointName(String embeddingModelEndpointName) {
    this.embeddingModelEndpointName = embeddingModelEndpointName;
    return this;
  }

  public String getEmbeddingModelEndpointName() {
    return embeddingModelEndpointName;
  }

  public EmbeddingSourceColumn setName(String name) {
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
    EmbeddingSourceColumn that = (EmbeddingSourceColumn) o;
    return Objects.equals(embeddingModelEndpointName, that.embeddingModelEndpointName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingModelEndpointName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingSourceColumn.class)
        .add("embeddingModelEndpointName", embeddingModelEndpointName)
        .add("name", name)
        .toString();
  }
}
