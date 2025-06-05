// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Describes metadata for a particular chunk, within a result set; this structure is used both
 * within a manifest, and when fetching individual chunk data or links.
 */
@Generated
class BaseChunkInfoPb {
  @JsonProperty("byte_count")
  private Long byteCount;

  @JsonProperty("chunk_index")
  private Long chunkIndex;

  @JsonProperty("row_count")
  private Long rowCount;

  @JsonProperty("row_offset")
  private Long rowOffset;

  public BaseChunkInfoPb setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public BaseChunkInfoPb setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public BaseChunkInfoPb setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public BaseChunkInfoPb setRowOffset(Long rowOffset) {
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
    BaseChunkInfoPb that = (BaseChunkInfoPb) o;
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
    return new ToStringer(BaseChunkInfoPb.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
