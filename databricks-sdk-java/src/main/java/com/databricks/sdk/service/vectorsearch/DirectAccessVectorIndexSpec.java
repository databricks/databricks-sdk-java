// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DirectAccessVectorIndexSpec {
  /** Contains the optional model endpoint to use during query time. */
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** */
  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * The schema of the index in JSON format.
   *
   * <p>Supported types are `integer`, `long`, `float`, `double`, `boolean`, `string`, `date`,
   * `timestamp`.
   *
   * <p>Supported types for vector column: `array<float>`, `array<double>`,`.
   */
  @JsonProperty("schema_json")
  private String schemaJson;

  public DirectAccessVectorIndexSpec setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DirectAccessVectorIndexSpec setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DirectAccessVectorIndexSpec setSchemaJson(String schemaJson) {
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
    DirectAccessVectorIndexSpec that = (DirectAccessVectorIndexSpec) o;
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
    return new ToStringer(DirectAccessVectorIndexSpec.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("schemaJson", schemaJson)
        .toString();
  }
}
