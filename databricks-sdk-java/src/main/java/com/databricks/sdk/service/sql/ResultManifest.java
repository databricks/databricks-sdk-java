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
  private Collection<ChunkInfo> chunks;

  /**
   * Statement execution supports two result formats: `JSON_ARRAY` (default), and `ARROW_STREAM`.
   *
   * <p>When specifying `format=JSON_ARRAY`, result data will be formatted as an array of arrays of
   * values, where each value is either the *string representation* of a value, or `null`. For
   * example, the output of `SELECT concat('id-', id) AS strId, id AS intId FROM range(3)` would
   * look like this:
   *
   * <p>``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
   *
   * <p>`JSON_ARRAY` is supported with `INLINE` and `EXTERNAL_LINKS` dispositions.
   *
   * <p>`INLINE` `JSON_ARRAY` data can be found at the path `StatementResponse.result.data_array`.
   *
   * <p>For `EXTERNAL_LINKS` `JSON_ARRAY` results, each URL points to a file in cloud storage that
   * contains compact JSON with no indentation or extra whitespace.
   *
   * <p>When specifying `format=ARROW_STREAM`, each chunk in the result will be formatted as Apache
   * Arrow Stream. See the [Apache Arrow streaming format].
   *
   * <p>IMPORTANT: The format `ARROW_STREAM` is supported only with `EXTERNAL_LINKS` disposition.
   *
   * <p>[Apache Arrow streaming format]:
   * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
   */
  @JsonProperty("format")
  private Format format;

  /** Schema is an ordered list of column descriptions. */
  @JsonProperty("schema")
  private ResultSchema schema;

  /** Total number of bytes in the result set. */
  @JsonProperty("total_byte_count")
  private Long totalByteCount;

  /** Total number of chunks that the result set has been divided into. */
  @JsonProperty("total_chunk_count")
  private Long totalChunkCount;

  /** Total number of rows in the result set. */
  @JsonProperty("total_row_count")
  private Long totalRowCount;

  public ResultManifest setChunks(Collection<ChunkInfo> chunks) {
    this.chunks = chunks;
    return this;
  }

  public Collection<ChunkInfo> getChunks() {
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
        && Objects.equals(totalRowCount, that.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunks, format, schema, totalByteCount, totalChunkCount, totalRowCount);
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
        .toString();
  }
}
