// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = DeltaSyncVectorIndexSpecRequest.DeltaSyncVectorIndexSpecRequestSerializer.class)
@JsonDeserialize(
    using = DeltaSyncVectorIndexSpecRequest.DeltaSyncVectorIndexSpecRequestDeserializer.class)
public class DeltaSyncVectorIndexSpecRequest {
  /**
   * [Optional] Select the columns to sync with the vector index. If you leave this field blank, all
   * columns from the source table are synced with the index. The primary key column and embedding
   * source column or embedding vector column are always synced.
   */
  private Collection<String> columnsToSync;

  /** The columns that contain the embedding source. */
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. */
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * [Optional] Name of the Delta table to sync the vector index contents and computed embeddings
   * to.
   */
  private String embeddingWritebackTable;

  /**
   * Pipeline execution mode. - `TRIGGERED`: If the pipeline uses the triggered execution mode, the
   * system stops processing after successfully refreshing the source table in the pipeline once,
   * ensuring the table is updated based on the data available when the update started. -
   * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it
   * arrives in the source table to keep vector index fresh.
   */
  private PipelineType pipelineType;

  /** The name of the source table. */
  private String sourceTable;

  public DeltaSyncVectorIndexSpecRequest setColumnsToSync(Collection<String> columnsToSync) {
    this.columnsToSync = columnsToSync;
    return this;
  }

  public Collection<String> getColumnsToSync() {
    return columnsToSync;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingWritebackTable(
      String embeddingWritebackTable) {
    this.embeddingWritebackTable = embeddingWritebackTable;
    return this;
  }

  public String getEmbeddingWritebackTable() {
    return embeddingWritebackTable;
  }

  public DeltaSyncVectorIndexSpecRequest setPipelineType(PipelineType pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  public PipelineType getPipelineType() {
    return pipelineType;
  }

  public DeltaSyncVectorIndexSpecRequest setSourceTable(String sourceTable) {
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
    DeltaSyncVectorIndexSpecRequest that = (DeltaSyncVectorIndexSpecRequest) o;
    return Objects.equals(columnsToSync, that.columnsToSync)
        && Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(embeddingWritebackTable, that.embeddingWritebackTable)
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
        pipelineType,
        sourceTable);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSyncVectorIndexSpecRequest.class)
        .add("columnsToSync", columnsToSync)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("embeddingWritebackTable", embeddingWritebackTable)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }

  DeltaSyncVectorIndexSpecRequestPb toPb() {
    DeltaSyncVectorIndexSpecRequestPb pb = new DeltaSyncVectorIndexSpecRequestPb();
    pb.setColumnsToSync(columnsToSync);
    pb.setEmbeddingSourceColumns(embeddingSourceColumns);
    pb.setEmbeddingVectorColumns(embeddingVectorColumns);
    pb.setEmbeddingWritebackTable(embeddingWritebackTable);
    pb.setPipelineType(pipelineType);
    pb.setSourceTable(sourceTable);

    return pb;
  }

  static DeltaSyncVectorIndexSpecRequest fromPb(DeltaSyncVectorIndexSpecRequestPb pb) {
    DeltaSyncVectorIndexSpecRequest model = new DeltaSyncVectorIndexSpecRequest();
    model.setColumnsToSync(pb.getColumnsToSync());
    model.setEmbeddingSourceColumns(pb.getEmbeddingSourceColumns());
    model.setEmbeddingVectorColumns(pb.getEmbeddingVectorColumns());
    model.setEmbeddingWritebackTable(pb.getEmbeddingWritebackTable());
    model.setPipelineType(pb.getPipelineType());
    model.setSourceTable(pb.getSourceTable());

    return model;
  }

  public static class DeltaSyncVectorIndexSpecRequestSerializer
      extends JsonSerializer<DeltaSyncVectorIndexSpecRequest> {
    @Override
    public void serialize(
        DeltaSyncVectorIndexSpecRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSyncVectorIndexSpecRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSyncVectorIndexSpecRequestDeserializer
      extends JsonDeserializer<DeltaSyncVectorIndexSpecRequest> {
    @Override
    public DeltaSyncVectorIndexSpecRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSyncVectorIndexSpecRequestPb pb =
          mapper.readValue(p, DeltaSyncVectorIndexSpecRequestPb.class);
      return DeltaSyncVectorIndexSpecRequest.fromPb(pb);
    }
  }
}
