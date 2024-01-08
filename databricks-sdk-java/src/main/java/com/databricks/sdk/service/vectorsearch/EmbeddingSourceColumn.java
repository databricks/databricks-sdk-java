// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EmbeddingSourceColumn {
  /** */
  @JsonProperty("embedding_config")
  private EmbeddingConfig embeddingConfig;

  /** Name of the column */
  @JsonProperty("name")
  private String name;

  public EmbeddingSourceColumn setEmbeddingConfig(EmbeddingConfig embeddingConfig) {
    this.embeddingConfig = embeddingConfig;
    return this;
  }

  public EmbeddingConfig getEmbeddingConfig() {
    return embeddingConfig;
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
    return Objects.equals(embeddingConfig, that.embeddingConfig) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingConfig, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingSourceColumn.class)
        .add("embeddingConfig", embeddingConfig)
        .add("name", name)
        .toString();
  }
}
