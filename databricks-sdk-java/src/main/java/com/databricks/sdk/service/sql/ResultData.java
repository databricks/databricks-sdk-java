// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Contains the result data of a single chunk when using `INLINE` disposition. When using
 * `EXTERNAL_LINKS` disposition, the array `external_links` is used instead to provide presigned
 * URLs to the result data in cloud storage. Exactly one of these alternatives is used. (While the
 * `external_links` array prepares the API to return multiple links in a single response. Currently
 * only a single link is returned.)
 */
@Generated
public class ResultData {
  /**
   * The number of bytes in the result chunk. This field is not available when using `INLINE`
   * disposition.
   */
  @JsonProperty("byte_count")
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  @JsonProperty("chunk_index")
  private Long chunkIndex;

  /**
   * The `JSON_ARRAY` format is an array of arrays of values, where each non-null value is formatted
   * as a string. Null values are encoded as JSON `null`.
   */
  @JsonProperty("data_array")
  private Collection<Collection<String>> dataArray;

  /** */
  @JsonProperty("external_links")
  private Collection<ExternalLink> externalLinks;

  /**
   * When fetching, provides the `chunk_index` for the _next_ chunk. If absent, indicates there are
   * no more chunks. The next chunk can be fetched with a
   * :method:statementexecution/getStatementResultChunkN request.
   */
  @JsonProperty("next_chunk_index")
  private Long nextChunkIndex;

  /**
   * When fetching, provides a link to fetch the _next_ chunk. If absent, indicates there are no
   * more chunks. This link is an absolute `path` to be joined with your `$DATABRICKS_HOST`, and
   * should be treated as an opaque link. This is an alternative to using `next_chunk_index`.
   */
  @JsonProperty("next_chunk_internal_link")
  private String nextChunkInternalLink;

  /** The number of rows within the result chunk. */
  @JsonProperty("row_count")
  private Long rowCount;

  /** The starting row offset within the result set. */
  @JsonProperty("row_offset")
  private Long rowOffset;

  public ResultData setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ResultData setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ResultData setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultData setExternalLinks(Collection<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public Collection<ExternalLink> getExternalLinks() {
    return externalLinks;
  }

  public ResultData setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ResultData setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ResultData setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ResultData setRowOffset(Long rowOffset) {
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
