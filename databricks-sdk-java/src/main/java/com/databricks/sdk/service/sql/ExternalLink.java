// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalLink {
  /** The number of bytes in the result chunk. */
  @JsonProperty("byte_count")
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  @JsonProperty("chunk_index")
  private Long chunkIndex;

  /**
   * Indicates the date-time that the given external link will expire and becomes invalid, after
   * which point a new `external_link` must be requested.
   */
  @JsonProperty("expiration")
  private String expiration;

  /**
   * A presigned URL pointing to a chunk of result data, hosted by an external service, with a short
   * expiration time (<= 15 minutes). As this URL contains a temporary credential, it should be
   * considered sensitive and the client should expose this URL in a log.
   */
  @JsonProperty("external_link")
  private String externalLink;

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

  public ExternalLink setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ExternalLink setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ExternalLink setExpiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  public String getExpiration() {
    return expiration;
  }

  public ExternalLink setExternalLink(String externalLink) {
    this.externalLink = externalLink;
    return this;
  }

  public String getExternalLink() {
    return externalLink;
  }

  public ExternalLink setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ExternalLink setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ExternalLink setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ExternalLink setRowOffset(Long rowOffset) {
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
    ExternalLink that = (ExternalLink) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(expiration, that.expiration)
        && Objects.equals(externalLink, that.externalLink)
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
        expiration,
        externalLink,
        nextChunkIndex,
        nextChunkInternalLink,
        rowCount,
        rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLink.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("expiration", expiration)
        .add("externalLink", externalLink)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
