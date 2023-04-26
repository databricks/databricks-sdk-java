// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Result data chunks are delivered in either the `chunk` field when using `INLINE` disposition, or
 * in the `external_link` field when using `EXTERNAL_LINKS` disposition. Exactly one of these will
 * be set.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ResultData {
  /** Number of bytes in the result chunk. */
  @JsonProperty("byte_count")
  private Long byteCount;

  /** Position within the sequence of result set chunks. */
  @JsonProperty("chunk_index")
  private Long chunkIndex;

  /**
   * `JSON_ARRAY` format is an array of arrays of values, where each non-null value is formatted as
   * a string. Null values are encoded as JSON `null`.
   */
  @JsonProperty("data_array")
  private Collection<Collection<String>> dataArray;

  /** */
  @JsonProperty("external_links")
  private Collection<ExternalLink> externalLinks;

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
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setByteCount(Long byteCount) {
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
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setChunkIndex(Long chunkIndex) {
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
   * <p>Setter for the field <code>dataArray</code>.</p>
   *
   * @param dataArray a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataArray</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  /**
   * <p>Setter for the field <code>externalLinks</code>.</p>
   *
   * @param externalLinks a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setExternalLinks(Collection<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalLinks</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ExternalLink> getExternalLinks() {
    return externalLinks;
  }

  /**
   * <p>Setter for the field <code>nextChunkIndex</code>.</p>
   *
   * @param nextChunkIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setNextChunkIndex(Long nextChunkIndex) {
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
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setNextChunkInternalLink(String nextChunkInternalLink) {
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
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setRowCount(Long rowCount) {
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
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData setRowOffset(Long rowOffset) {
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
    ResultData that = (ResultData) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(dataArray, that.dataArray)
        && Objects.equals(externalLinks, that.externalLinks)
        && Objects.equals(nextChunkIndex, that.nextChunkIndex)
        && Objects.equals(nextChunkInternalLink, that.nextChunkInternalLink)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(rowOffset, that.rowOffset);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        byteCount,
        chunkIndex,
        dataArray,
        externalLinks,
        nextChunkIndex,
        nextChunkInternalLink,
        rowCount,
        rowOffset);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ResultData.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("dataArray", dataArray)
        .add("externalLinks", externalLinks)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
