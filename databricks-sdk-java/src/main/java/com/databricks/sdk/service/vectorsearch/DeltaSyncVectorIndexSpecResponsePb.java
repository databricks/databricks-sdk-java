// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DeltaSyncVectorIndexSpecResponsePb {
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  @JsonProperty("embedding_writeback_table")
  private String embeddingWritebackTable;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("pipeline_type")
  private PipelineType pipelineType;

  @JsonProperty("source_table")
  private String sourceTable;

  public DeltaSyncVectorIndexSpecResponsePb setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DeltaSyncVectorIndexSpecResponsePb setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DeltaSyncVectorIndexSpecResponsePb setEmbeddingWritebackTable(
      String embeddingWritebackTable) {
    this.embeddingWritebackTable = embeddingWritebackTable;
    return this;
  }

  public String getEmbeddingWritebackTable() {
    return embeddingWritebackTable;
  }

  public DeltaSyncVectorIndexSpecResponsePb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public DeltaSyncVectorIndexSpecResponsePb setPipelineType(PipelineType pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  public PipelineType getPipelineType() {
    return pipelineType;
  }

  public DeltaSyncVectorIndexSpecResponsePb setSourceTable(String sourceTable) {
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
    DeltaSyncVectorIndexSpecResponsePb that = (DeltaSyncVectorIndexSpecResponsePb) o;
    return Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(embeddingWritebackTable, that.embeddingWritebackTable)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineType, that.pipelineType)
        && Objects.equals(sourceTable, that.sourceTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        embeddingSourceColumns,
        embeddingVectorColumns,
        embeddingWritebackTable,
        pipelineId,
        pipelineType,
        sourceTable);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSyncVectorIndexSpecResponsePb.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("embeddingWritebackTable", embeddingWritebackTable)
        .add("pipelineId", pipelineId)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }
}
