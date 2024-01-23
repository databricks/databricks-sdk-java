// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeltaSyncVectorIndexSpecResponse {
  /** The columns that contain the embedding source. */
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. */
  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /** The ID of the pipeline that is used to sync the index. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * Pipeline execution mode.
   *
   * <p>- `TRIGGERED`: If the pipeline uses the triggered execution mode, the system stops
   * processing after successfully refreshing the source table in the pipeline once, ensuring the
   * table is updated based on the data available when the update started. - `CONTINUOUS`: If the
   * pipeline uses continuous execution, the pipeline processes new data as it arrives in the source
   * table to keep vector index fresh.
   */
  @JsonProperty("pipeline_type")
  private PipelineType pipelineType;

  /** The name of the source table. */
  @JsonProperty("source_table")
  private String sourceTable;

  public DeltaSyncVectorIndexSpecResponse setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DeltaSyncVectorIndexSpecResponse setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DeltaSyncVectorIndexSpecResponse setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public DeltaSyncVectorIndexSpecResponse setPipelineType(PipelineType pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  public PipelineType getPipelineType() {
    return pipelineType;
  }

  public DeltaSyncVectorIndexSpecResponse setSourceTable(String sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  public String getSourceTable() {
    return sourceTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSyncVectorIndexSpecResponse that = (DeltaSyncVectorIndexSpecResponse) o;
    return Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineType, that.pipelineType)
        && Objects.equals(sourceTable, that.sourceTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        embeddingSourceColumns, embeddingVectorColumns, pipelineId, pipelineType, sourceTable);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSyncVectorIndexSpecResponse.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("pipelineId", pipelineId)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }
}
