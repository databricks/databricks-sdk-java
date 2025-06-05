// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class ResultsPb {
  @JsonProperty("cause")
  private String cause;

  @JsonProperty("data")
  private Object data;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("fileNames")
  private Collection<String> fileNames;

  @JsonProperty("isJsonSchema")
  private Boolean isJsonSchema;

  @JsonProperty("pos")
  private Long pos;

  @JsonProperty("resultType")
  private ResultType resultType;

  @JsonProperty("schema")
  private Collection<Map<String, Object>> schema;

  @JsonProperty("summary")
  private String summary;

  @JsonProperty("truncated")
  private Boolean truncated;

  public ResultsPb setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public ResultsPb setData(Object data) {
    this.data = data;
    return this;
  }

  public Object getData() {
    return data;
  }

  public ResultsPb setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public ResultsPb setFileNames(Collection<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }

  public Collection<String> getFileNames() {
    return fileNames;
  }

  public ResultsPb setIsJsonSchema(Boolean isJsonSchema) {
    this.isJsonSchema = isJsonSchema;
    return this;
  }

  public Boolean getIsJsonSchema() {
    return isJsonSchema;
  }

  public ResultsPb setPos(Long pos) {
    this.pos = pos;
    return this;
  }

  public Long getPos() {
    return pos;
  }

  public ResultsPb setResultType(ResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  public ResultType getResultType() {
    return resultType;
  }

  public ResultsPb setSchema(Collection<Map<String, Object>> schema) {
    this.schema = schema;
    return this;
  }

  public Collection<Map<String, Object>> getSchema() {
    return schema;
  }

  public ResultsPb setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

  public ResultsPb setTruncated(Boolean truncated) {
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
    ResultsPb that = (ResultsPb) o;
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
    return new ToStringer(ResultsPb.class)
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
