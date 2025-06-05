// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ResultDataPb {
  @JsonProperty("byte_count")
  private Long byteCount;

  @JsonProperty("chunk_index")
  private Long chunkIndex;

  @JsonProperty("data_array")
  private Collection<Collection<String>> dataArray;

  @JsonProperty("external_links")
  private Collection<ExternalLink> externalLinks;

  @JsonProperty("next_chunk_index")
  private Long nextChunkIndex;

  @JsonProperty("next_chunk_internal_link")
  private String nextChunkInternalLink;

  @JsonProperty("row_count")
  private Long rowCount;

  @JsonProperty("row_offset")
  private Long rowOffset;

  public ResultDataPb setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ResultDataPb setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ResultDataPb setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultDataPb setExternalLinks(Collection<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public Collection<ExternalLink> getExternalLinks() {
    return externalLinks;
  }

  public ResultDataPb setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ResultDataPb setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ResultDataPb setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ResultDataPb setRowOffset(Long rowOffset) {
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
    ResultDataPb that = (ResultDataPb) o;
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
    return new ToStringer(ResultDataPb.class)
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
