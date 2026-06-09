// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Lifecycle and health state of an AI Search index, along with human-readable detail about that
 * state and basic indexing progress.
 */
@Generated
public class IndexStatus {
  /** Index API URL used to perform operations on the index. */
  @JsonProperty("index_url")
  private String indexUrl;

  /** Number of rows indexed. */
  @JsonProperty("indexed_row_count")
  private Long indexedRowCount;

  /** Human-readable detail about the index's current state. */
  @JsonProperty("message")
  private String message;

  /** Whether the index is ready for search. */
  @JsonProperty("ready")
  private Boolean ready;

  public IndexStatus setIndexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
    return this;
  }

  public String getIndexUrl() {
    return indexUrl;
  }

  public IndexStatus setIndexedRowCount(Long indexedRowCount) {
    this.indexedRowCount = indexedRowCount;
    return this;
  }

  public Long getIndexedRowCount() {
    return indexedRowCount;
  }

  public IndexStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public IndexStatus setReady(Boolean ready) {
    this.ready = ready;
    return this;
  }

  public Boolean getReady() {
    return ready;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IndexStatus that = (IndexStatus) o;
    return Objects.equals(indexUrl, that.indexUrl)
        && Objects.equals(indexedRowCount, that.indexedRowCount)
        && Objects.equals(message, that.message)
        && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexUrl, indexedRowCount, message, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(IndexStatus.class)
        .add("indexUrl", indexUrl)
        .add("indexedRowCount", indexedRowCount)
        .add("message", message)
        .add("ready", ready)
        .toString();
  }
}
