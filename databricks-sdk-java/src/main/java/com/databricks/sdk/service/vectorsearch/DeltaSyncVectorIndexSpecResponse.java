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
    using = DeltaSyncVectorIndexSpecResponse.DeltaSyncVectorIndexSpecResponseSerializer.class)
@JsonDeserialize(
    using = DeltaSyncVectorIndexSpecResponse.DeltaSyncVectorIndexSpecResponseDeserializer.class)
public class DeltaSyncVectorIndexSpecResponse {
  /** The columns that contain the embedding source. */
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. */
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * [Optional] Name of the Delta table to sync the vector index contents and computed embeddings
   * to.
   */
  private String embeddingWritebackTable;

  /** The ID of the pipeline that is used to sync the index. */
  private String pipelineId;

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

  public DeltaSyncVectorIndexSpecResponse setEmbeddingWritebackTable(
      String embeddingWritebackTable) {
    this.embeddingWritebackTable = embeddingWritebackTable;
    return this;
  }

  public String getEmbeddingWritebackTable() {
    return embeddingWritebackTable;
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
    return new ToStringer(DeltaSyncVectorIndexSpecResponse.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("embeddingWritebackTable", embeddingWritebackTable)
        .add("pipelineId", pipelineId)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }

  DeltaSyncVectorIndexSpecResponsePb toPb() {
    DeltaSyncVectorIndexSpecResponsePb pb = new DeltaSyncVectorIndexSpecResponsePb();
    pb.setEmbeddingSourceColumns(embeddingSourceColumns);
    pb.setEmbeddingVectorColumns(embeddingVectorColumns);
    pb.setEmbeddingWritebackTable(embeddingWritebackTable);
    pb.setPipelineId(pipelineId);
    pb.setPipelineType(pipelineType);
    pb.setSourceTable(sourceTable);

    return pb;
  }

  static DeltaSyncVectorIndexSpecResponse fromPb(DeltaSyncVectorIndexSpecResponsePb pb) {
    DeltaSyncVectorIndexSpecResponse model = new DeltaSyncVectorIndexSpecResponse();
    model.setEmbeddingSourceColumns(pb.getEmbeddingSourceColumns());
    model.setEmbeddingVectorColumns(pb.getEmbeddingVectorColumns());
    model.setEmbeddingWritebackTable(pb.getEmbeddingWritebackTable());
    model.setPipelineId(pb.getPipelineId());
    model.setPipelineType(pb.getPipelineType());
    model.setSourceTable(pb.getSourceTable());

    return model;
  }

  public static class DeltaSyncVectorIndexSpecResponseSerializer
      extends JsonSerializer<DeltaSyncVectorIndexSpecResponse> {
    @Override
    public void serialize(
        DeltaSyncVectorIndexSpecResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSyncVectorIndexSpecResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSyncVectorIndexSpecResponseDeserializer
      extends JsonDeserializer<DeltaSyncVectorIndexSpecResponse> {
    @Override
    public DeltaSyncVectorIndexSpecResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSyncVectorIndexSpecResponsePb pb =
          mapper.readValue(p, DeltaSyncVectorIndexSpecResponsePb.class);
      return DeltaSyncVectorIndexSpecResponse.fromPb(pb);
    }
  }
}
