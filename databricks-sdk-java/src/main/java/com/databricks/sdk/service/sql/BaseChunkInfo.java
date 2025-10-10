// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class BaseChunkInfo {
  /**
   * The number of bytes in the result chunk. This field is not available when using `INLINE`
   * disposition.
   */
  @JsonProperty("byte_count")
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  @JsonProperty("chunk_index")
  private Long chunkIndex;

  /** The number of rows within the result chunk. */
  @JsonProperty("row_count")
  private Long rowCount;

  /** The starting row offset within the result set. */
  @JsonProperty("row_offset")
  private Long rowOffset;

  public BaseChunkInfo setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public BaseChunkInfo setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public BaseChunkInfo setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public BaseChunkInfo setRowOffset(Long rowOffset) {
    this.rowOffset = rowOffset;
    return this;
  }

  public Long getRowOffset() {
    return rowOffset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseChunkInfo that = (BaseChunkInfo) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(rowOffset, that.rowOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteCount, chunkIndex, rowCount, rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(BaseChunkInfo.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
