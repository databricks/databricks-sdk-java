// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class ExternalLinkPb {
  @JsonProperty("byte_count")
  private Long byteCount;

  @JsonProperty("chunk_index")
  private Long chunkIndex;

  @JsonProperty("expiration")
  private String expiration;

  @JsonProperty("external_link")
  private String externalLink;

  @JsonProperty("http_headers")
  private Map<String, String> httpHeaders;

  @JsonProperty("next_chunk_index")
  private Long nextChunkIndex;

  @JsonProperty("next_chunk_internal_link")
  private String nextChunkInternalLink;

  @JsonProperty("row_count")
  private Long rowCount;

  @JsonProperty("row_offset")
  private Long rowOffset;

  public ExternalLinkPb setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ExternalLinkPb setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ExternalLinkPb setExpiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  public String getExpiration() {
    return expiration;
  }

  public ExternalLinkPb setExternalLink(String externalLink) {
    this.externalLink = externalLink;
    return this;
  }

  public String getExternalLink() {
    return externalLink;
  }

  public ExternalLinkPb setHttpHeaders(Map<String, String> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public Map<String, String> getHttpHeaders() {
    return httpHeaders;
  }

  public ExternalLinkPb setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ExternalLinkPb setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ExternalLinkPb setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ExternalLinkPb setRowOffset(Long rowOffset) {
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
    ExternalLinkPb that = (ExternalLinkPb) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(expiration, that.expiration)
        && Objects.equals(externalLink, that.externalLink)
        && Objects.equals(httpHeaders, that.httpHeaders)
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
        httpHeaders,
        nextChunkIndex,
        nextChunkInternalLink,
        rowCount,
        rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLinkPb.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("expiration", expiration)
        .add("externalLink", externalLink)
        .add("httpHeaders", httpHeaders)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }
}
