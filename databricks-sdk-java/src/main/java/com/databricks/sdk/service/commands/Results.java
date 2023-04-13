// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Results {
  /** The cause of the error */
  @JsonProperty("cause")
  private String cause;

  /** */
  @JsonProperty("data")
  private Object /* MISSING TYPE */ data;

  /** The image filename */
  @JsonProperty("fileName")
  private String fileName;

  /** */
  @JsonProperty("fileNames")
  private Collection<String> fileNames;

  /** true if a JSON schema is returned instead of a string representation of the Hive type. */
  @JsonProperty("isJsonSchema")
  private Boolean isJsonSchema;

  /** internal field used by SDK */
  @JsonProperty("pos")
  private Long pos;

  /** */
  @JsonProperty("resultType")
  private ResultType resultType;

  /** The table schema */
  @JsonProperty("schema")
  private Collection<Map<String, Object /* MISSING TYPE */>> schema;

  /** The summary of the error */
  @JsonProperty("summary")
  private String summary;

  /** true if partial results are returned. */
  @JsonProperty("truncated")
  private Boolean truncated;

  public Results setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public Results setData(Object /* MISSING TYPE */ data) {
    this.data = data;
    return this;
  }

  public Object /* MISSING TYPE */ getData() {
    return data;
  }

  public Results setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public Results setFileNames(Collection<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }

  public Collection<String> getFileNames() {
    return fileNames;
  }

  public Results setIsJsonSchema(Boolean isJsonSchema) {
    this.isJsonSchema = isJsonSchema;
    return this;
  }

  public Boolean getIsJsonSchema() {
    return isJsonSchema;
  }

  public Results setPos(Long pos) {
    this.pos = pos;
    return this;
  }

  public Long getPos() {
    return pos;
  }

  public Results setResultType(ResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  public ResultType getResultType() {
    return resultType;
  }

  public Results setSchema(Collection<Map<String, Object /* MISSING TYPE */>> schema) {
    this.schema = schema;
    return this;
  }

  public Collection<Map<String, Object /* MISSING TYPE */>> getSchema() {
    return schema;
  }

  public Results setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

  public Results setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Results that = (Results) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(data, that.data)
        && Objects.equals(fileName, that.fileName)
        && Objects.equals(fileNames, that.fileNames)
        && Objects.equals(isJsonSchema, that.isJsonSchema)
        && Objects.equals(pos, that.pos)
        && Objects.equals(resultType, that.resultType)
        && Objects.equals(schema, that.schema)
        && Objects.equals(summary, that.summary)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        data,
        fileName,
        fileNames,
        isJsonSchema,
        pos,
        resultType,
        schema,
        summary,
        truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(Results.class)
        .add("cause", cause)
        .add("data", data)
        .add("fileName", fileName)
        .add("fileNames", fileNames)
        .add("isJsonSchema", isJsonSchema)
        .add("pos", pos)
        .add("resultType", resultType)
        .add("schema", schema)
        .add("summary", summary)
        .add("truncated", truncated)
        .toString();
  }
}
