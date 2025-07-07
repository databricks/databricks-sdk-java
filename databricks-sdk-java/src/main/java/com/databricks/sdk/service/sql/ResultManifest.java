// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The result manifest provides schema and metadata for the result set. */
@Generated
public class ResultManifest {
  /** Array of result set chunk metadata. */
  @JsonProperty("chunks")
  private Collection<BaseChunkInfo> chunks;

  /** */
  @JsonProperty("format")
  private Format format;

  /** */
  @JsonProperty("schema")
  private ResultSchema schema;

  /**
   * The total number of bytes in the result set. This field is not available when using `INLINE`
   * disposition.
   */
  @JsonProperty("total_byte_count")
  private Long totalByteCount;

  /** The total number of chunks that the result set has been divided into. */
  @JsonProperty("total_chunk_count")
  private Long totalChunkCount;

  /** The total number of rows in the result set. */
  @JsonProperty("total_row_count")
  private Long totalRowCount;

  /** Indicates whether the result is truncated due to `row_limit` or `byte_limit`. */
  @JsonProperty("truncated")
  private Boolean truncated;

  public ResultManifest setChunks(Collection<BaseChunkInfo> chunks) {
    this.chunks = chunks;
    return this;
  }

  public Collection<BaseChunkInfo> getChunks() {
    return chunks;
  }

  public ResultManifest setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public ResultManifest setSchema(ResultSchema schema) {
    this.schema = schema;
    return this;
  }

  public ResultSchema getSchema() {
    return schema;
  }

  public ResultManifest setTotalByteCount(Long totalByteCount) {
    this.totalByteCount = totalByteCount;
    return this;
  }

  public Long getTotalByteCount() {
    return totalByteCount;
  }

  public ResultManifest setTotalChunkCount(Long totalChunkCount) {
    this.totalChunkCount = totalChunkCount;
    return this;
  }

  public Long getTotalChunkCount() {
    return totalChunkCount;
  }

  public ResultManifest setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  public Long getTotalRowCount() {
    return totalRowCount;
  }

  public ResultManifest setTruncated(Boolean truncated) {
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
    ResultManifest that = (ResultManifest) o;
    return Objects.equals(chunks, that.chunks)
        && Objects.equals(format, that.format)
        && Objects.equals(schema, that.schema)
        && Objects.equals(totalByteCount, that.totalByteCount)
        && Objects.equals(totalChunkCount, that.totalChunkCount)
        && Objects.equals(totalRowCount, that.totalRowCount)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chunks, format, schema, totalByteCount, totalChunkCount, totalRowCount, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultManifest.class)
        .add("chunks", chunks)
        .add("format", format)
        .add("schema", schema)
        .add("totalByteCount", totalByteCount)
        .add("totalChunkCount", totalChunkCount)
        .add("totalRowCount", totalRowCount)
        .add("truncated", truncated)
        .toString();
  }
}
