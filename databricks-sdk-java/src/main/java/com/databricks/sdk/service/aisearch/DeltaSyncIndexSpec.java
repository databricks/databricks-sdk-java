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
   * Columns of the source table to include in the index. When empty, all columns are synced. The
   * primary key and the embedding source or vector column are always synced. Only synced columns
   * can be returned in query results or used in filters.
   */
  @JsonProperty("columns_to_sync")
  private Collection<String> columnsToSync;

  /**
   * Columns whose text Databricks embeds during sync, using the model endpoint named on each
   * column. Set either this field or `embedding_vector_columns`, not both.
   */
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /**
   * Columns of the source table that already hold precomputed embedding vectors. Set either this
   * field or `embedding_source_columns`, not both.
   */
  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * Three-level name of a Delta table to write the synced rows and computed embeddings to. It
   * applies only when embeddings are computed from `embedding_source_columns`, and the table must
   * not already exist.
   */
  @JsonProperty("embedding_writeback_table")
  private String embeddingWritebackTable;

  /** The ID of the pipeline that is used to sync the index. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * Sync mode of the pipeline that keeps the index up to date. `TRIGGERED` syncs at creation and
   * then each time SyncIndex is called; `CONTINUOUS` processes source changes as they arrive.
   * Storage Optimized endpoints accept only `TRIGGERED`, and an unset value is rejected.
   */
  @JsonProperty("pipeline_type")
  private PipelineType pipelineType;

  /**
   * Three-level Unity Catalog name of the source Delta table, in the form `catalog.schema.table`.
   */
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
