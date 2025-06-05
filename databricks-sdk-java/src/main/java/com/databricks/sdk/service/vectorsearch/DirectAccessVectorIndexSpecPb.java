// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DirectAccessVectorIndexSpecPb {
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  @JsonProperty("schema_json")
  private String schemaJson;

  public DirectAccessVectorIndexSpecPb setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DirectAccessVectorIndexSpecPb setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DirectAccessVectorIndexSpecPb setSchemaJson(String schemaJson) {
    this.schemaJson = schemaJson;
    return this;
  }

  public String getSchemaJson() {
    return schemaJson;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectAccessVectorIndexSpecPb that = (DirectAccessVectorIndexSpecPb) o;
    return Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(schemaJson, that.schemaJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingSourceColumns, embeddingVectorColumns, schemaJson);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectAccessVectorIndexSpecPb.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("schemaJson", schemaJson)
        .toString();
  }
}
