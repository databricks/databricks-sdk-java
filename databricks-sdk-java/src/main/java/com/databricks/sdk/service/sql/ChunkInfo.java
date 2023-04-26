// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Describes metadata for a particular chunk, within a result set; this structure is used both
 * within a manifest, and when fetching individual chunk data or links.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
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

  /**
   * <p>Setter for the field <code>byteCount</code>.</p>
   *
   * @param byteCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>byteCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getByteCount() {
    return byteCount;
  }

  /**
   * <p>Setter for the field <code>chunkIndex</code>.</p>
   *
   * @param chunkIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>chunkIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getChunkIndex() {
    return chunkIndex;
  }

  /**
   * <p>Setter for the field <code>nextChunkIndex</code>.</p>
   *
   * @param nextChunkIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextChunkIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  /**
   * <p>Setter for the field <code>nextChunkInternalLink</code>.</p>
   *
   * @param nextChunkInternalLink a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextChunkInternalLink</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  /**
   * <p>Setter for the field <code>rowCount</code>.</p>
   *
   * @param rowCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>rowCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRowCount() {
    return rowCount;
  }

  /**
   * <p>Setter for the field <code>rowOffset</code>.</p>
   *
   * @param rowOffset a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ChunkInfo} object
   */
  public ChunkInfo setRowOffset(Long rowOffset) {
    this.rowOffset = rowOffset;
    return this;
  }

  /**
   * <p>Getter for the field <code>rowOffset</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRowOffset() {
    return rowOffset;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        byteCount, chunkIndex, nextChunkIndex, nextChunkInternalLink, rowCount, rowOffset);
  }

  /** {@inheritDoc} */
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
