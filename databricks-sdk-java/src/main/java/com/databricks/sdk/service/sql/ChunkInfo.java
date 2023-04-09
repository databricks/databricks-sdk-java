// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Describes metadata for a particular chunk, within a result set; this structure is used both
 * within a manifest, and when fetching individual chunk data or links.
 */
public class ChunkInfo {
  /** Number of bytes in the result chunk. */
  @JsonProperty("byte_count")
  private Long byteCount;

  /** Position within the sequence of result set chunks. */
  @JsonProperty("chunk_index")
  private Long chunkIndex;

  /**
   * When fetching, gives `chunk_index` for the _next_ chunk; if absent, indicates there are no more
   * chunks.
   */
  @JsonProperty("next_chunk_index")
  private Long nextChunkIndex;

  /**
   * When fetching, gives `internal_link` for the _next_ chunk; if absent, indicates there are no
   * more chunks.
   */
  @JsonProperty("next_chunk_internal_link")
  private String nextChunkInternalLink;

  /** Number of rows within the result chunk. */
  @JsonProperty("row_count")
  private Long rowCount;

  /** Starting row offset within the result set. */
  @JsonProperty("row_offset")
  private Long rowOffset;

  public ChunkInfo setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ChunkInfo setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ChunkInfo setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ChunkInfo setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ChunkInfo setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ChunkInfo setRowOffset(Long rowOffset) {
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
    ChunkInfo that = (ChunkInfo) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(nextChunkIndex, that.nextChunkIndex)
        && Objects.equals(nextChunkInternalLink, that.nextChunkInternalLink)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(rowOffset, that.rowOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        byteCount, chunkIndex, nextChunkIndex, nextChunkInternalLink, rowCount, rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(ChunkInfo.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
