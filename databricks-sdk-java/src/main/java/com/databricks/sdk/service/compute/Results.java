// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>Results class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>cause</code>.</p>
   *
   * @param cause a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setCause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * <p>Getter for the field <code>cause</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCause() {
    return cause;
  }

  /**
   * <p>Setter for the field <code>data</code>.</p>
   *
   * @param data a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setData(Object /* MISSING TYPE */ data) {
    this.data = data;
    return this;
  }

  /**
   * <p>Getter for the field <code>data</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getData() {
    return data;
  }

  /**
   * <p>Setter for the field <code>fileName</code>.</p>
   *
   * @param fileName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fileName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * <p>Setter for the field <code>fileNames</code>.</p>
   *
   * @param fileNames a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setFileNames(Collection<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }

  /**
   * <p>Getter for the field <code>fileNames</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getFileNames() {
    return fileNames;
  }

  /**
   * <p>Setter for the field <code>isJsonSchema</code>.</p>
   *
   * @param isJsonSchema a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setIsJsonSchema(Boolean isJsonSchema) {
    this.isJsonSchema = isJsonSchema;
    return this;
  }

  /**
   * <p>Getter for the field <code>isJsonSchema</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsJsonSchema() {
    return isJsonSchema;
  }

  /**
   * <p>Setter for the field <code>pos</code>.</p>
   *
   * @param pos a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setPos(Long pos) {
    this.pos = pos;
    return this;
  }

  /**
   * <p>Getter for the field <code>pos</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPos() {
    return pos;
  }

  /**
   * <p>Setter for the field <code>resultType</code>.</p>
   *
   * @param resultType a {@link com.databricks.sdk.service.compute.ResultType} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setResultType(ResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * <p>Getter for the field <code>resultType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ResultType} object
   */
  public ResultType getResultType() {
    return resultType;
  }

  /**
   * <p>Setter for the field <code>schema</code>.</p>
   *
   * @param schema a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setSchema(Collection<Map<String, Object /* MISSING TYPE */>> schema) {
    this.schema = schema;
    return this;
  }

  /**
   * <p>Getter for the field <code>schema</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Map<String, Object /* MISSING TYPE */>> getSchema() {
    return schema;
  }

  /**
   * <p>Setter for the field <code>summary</code>.</p>
   *
   * @param summary a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * <p>Getter for the field <code>summary</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSummary() {
    return summary;
  }

  /**
   * <p>Setter for the field <code>truncated</code>.</p>
   *
   * @param truncated a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * <p>Getter for the field <code>truncated</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getTruncated() {
    return truncated;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
