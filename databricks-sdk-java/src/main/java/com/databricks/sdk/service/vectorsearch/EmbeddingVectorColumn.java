// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EmbeddingVectorColumn {
  /** Dimension of the embedding vector */
  @JsonProperty("embedding_dimension")
  private Long embeddingDimension;

  /** Name of the column */
  @JsonProperty("name")
  private String name;

  public EmbeddingVectorColumn setEmbeddingDimension(Long embeddingDimension) {
    this.embeddingDimension = embeddingDimension;
    return this;
  }

  public Long getEmbeddingDimension() {
    return embeddingDimension;
  }

  public EmbeddingVectorColumn setName(String name) {
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
    EmbeddingVectorColumn that = (EmbeddingVectorColumn) o;
    return Objects.equals(embeddingDimension, that.embeddingDimension)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingDimension, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingVectorColumn.class)
        .add("embeddingDimension", embeddingDimension)
        .add("name", name)
        .toString();
  }
}
