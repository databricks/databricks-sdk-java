// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A task that applies an AI function to a set of input documents or rows. */
@Generated
public class AiFunctionTask {
  /** Classifies each input document or row into one or more labels. */
  @JsonProperty("ai_classify")
  private AiClassifyFunction aiClassify;

  /** Extracts structured fields from the input documents or rows. */
  @JsonProperty("ai_extract")
  private AiExtractFunction aiExtract;

  /** Parses the input documents into structured text. */
  @JsonProperty("ai_parse_document")
  private AiParseDocumentFunction aiParseDocument;

  /** A Unity Catalog Delta table. The function is applied to each row. */
  @JsonProperty("delta_table")
  private DeltaTableSource deltaTable;

  /**
   * Output destination table. When `table` is unset the task generates a stable name from the
   * function and task identity so a downstream task can reference it.
   */
  @JsonProperty("output")
  private QualifiedName output;

  /** A Unity Catalog volume. The function is applied to each file. */
  @JsonProperty("volume")
  private VolumeSource volume;

  public AiFunctionTask setAiClassify(AiClassifyFunction aiClassify) {
    this.aiClassify = aiClassify;
    return this;
  }

  public AiClassifyFunction getAiClassify() {
    return aiClassify;
  }

  public AiFunctionTask setAiExtract(AiExtractFunction aiExtract) {
    this.aiExtract = aiExtract;
    return this;
  }

  public AiExtractFunction getAiExtract() {
    return aiExtract;
  }

  public AiFunctionTask setAiParseDocument(AiParseDocumentFunction aiParseDocument) {
    this.aiParseDocument = aiParseDocument;
    return this;
  }

  public AiParseDocumentFunction getAiParseDocument() {
    return aiParseDocument;
  }

  public AiFunctionTask setDeltaTable(DeltaTableSource deltaTable) {
    this.deltaTable = deltaTable;
    return this;
  }

  public DeltaTableSource getDeltaTable() {
    return deltaTable;
  }

  public AiFunctionTask setOutput(QualifiedName output) {
    this.output = output;
    return this;
  }

  public QualifiedName getOutput() {
    return output;
  }

  public AiFunctionTask setVolume(VolumeSource volume) {
    this.volume = volume;
    return this;
  }

  public VolumeSource getVolume() {
    return volume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiFunctionTask that = (AiFunctionTask) o;
    return Objects.equals(aiClassify, that.aiClassify)
        && Objects.equals(aiExtract, that.aiExtract)
        && Objects.equals(aiParseDocument, that.aiParseDocument)
        && Objects.equals(deltaTable, that.deltaTable)
        && Objects.equals(output, that.output)
        && Objects.equals(volume, that.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiClassify, aiExtract, aiParseDocument, deltaTable, output, volume);
  }

  @Override
  public String toString() {
    return new ToStringer(AiFunctionTask.class)
        .add("aiClassify", aiClassify)
        .add("aiExtract", aiExtract)
        .add("aiParseDocument", aiParseDocument)
        .add("deltaTable", deltaTable)
        .add("output", output)
        .add("volume", volume)
        .toString();
  }
}
