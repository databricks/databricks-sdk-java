// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EmbeddingSourceColumn {
  /** Name of the embedding model endpoint, used by default for both ingestion and querying. */
  @JsonProperty("embedding_model_endpoint_name")
  private String embeddingModelEndpointName;

  /**
   * Name of the embedding model endpoint which, if specified, is used for querying (not ingestion).
   */
  @JsonProperty("model_endpoint_name_for_query")
  private String modelEndpointNameForQuery;

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

  public EmbeddingSourceColumn setModelEndpointNameForQuery(String modelEndpointNameForQuery) {
    this.modelEndpointNameForQuery = modelEndpointNameForQuery;
    return this;
  }

  public String getModelEndpointNameForQuery() {
    return modelEndpointNameForQuery;
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
        && Objects.equals(modelEndpointNameForQuery, that.modelEndpointNameForQuery)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingModelEndpointName, modelEndpointNameForQuery, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingSourceColumn.class)
        .add("embeddingModelEndpointName", embeddingModelEndpointName)
        .add("modelEndpointNameForQuery", modelEndpointNameForQuery)
        .add("name", name)
        .toString();
  }
}
