// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specification for a Delta Sync index — the index is kept in sync with a source Delta table. */
@Generated
public class DeltaSyncIndexSpec {
  /**
   * [Optional] Select the columns to sync with the index. If left blank, all columns from the
   * source table are synced. The primary key column and embedding source or vector column are
   * always synced.
   */
  @JsonProperty("columns_to_sync")
  private Collection<String> columnsToSync;

  /** The columns that contain the embedding source. */
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. */
  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /** [Optional] Name of the Delta table to sync the index contents and computed embeddings to. */
  @JsonProperty("embedding_writeback_table")
  private String embeddingWritebackTable;

  /** The ID of the pipeline that is used to sync the index. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * Pipeline execution mode. Required on create — the backend rejects an unset value. Storage
   * Optimized endpoints accept only {@code TRIGGERED}; Standard endpoints accept both. No explicit
   * {@code stage} — a REQUIRED field staged below its service would be dropped from combined specs
   * while remaining in {@code required}, tripping the OpenAPI required-vs-properties consistency
   * check. The field inherits the service's launch stage.
   */
  @JsonProperty("pipeline_type")
  private PipelineType pipelineType;

  /** The full name of the source Delta table. */
  @JsonProperty("source_table")
  private String sourceTable;

  public DeltaSyncIndexSpec setColumnsToSync(Collection<String> columnsToSync) {
    this.columnsToSync = columnsToSync;
    return this;
  }

  public Collection<String> getColumnsToSync() {
    return columnsToSync;
  }

  public DeltaSyncIndexSpec setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DeltaSyncIndexSpec setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DeltaSyncIndexSpec setEmbeddingWritebackTable(String embeddingWritebackTable) {
    this.embeddingWritebackTable = embeddingWritebackTable;
    return this;
  }

  public String getEmbeddingWritebackTable() {
    return embeddingWritebackTable;
  }

  public DeltaSyncIndexSpec setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public DeltaSyncIndexSpec setPipelineType(PipelineType pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  public PipelineType getPipelineType() {
    return pipelineType;
  }

  public DeltaSyncIndexSpec setSourceTable(String sourceTable) {
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
    DeltaSyncIndexSpec that = (DeltaSyncIndexSpec) o;
    return Objects.equals(columnsToSync, that.columnsToSync)
        && Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(embeddingWritebackTable, that.embeddingWritebackTable)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineType, that.pipelineType)
        && Objects.equals(sourceTable, that.sourceTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnsToSync,
        embeddingSourceColumns,
        embeddingVectorColumns,
        embeddingWritebackTable,
        pipelineId,
        pipelineType,
        sourceTable);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSyncIndexSpec.class)
        .add("columnsToSync", columnsToSync)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("embeddingWritebackTable", embeddingWritebackTable)
        .add("pipelineId", pipelineId)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }
}
