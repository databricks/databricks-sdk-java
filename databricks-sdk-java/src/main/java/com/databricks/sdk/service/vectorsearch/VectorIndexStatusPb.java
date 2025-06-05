// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class VectorIndexStatusPb {
  @JsonProperty("index_url")
  private String indexUrl;

  @JsonProperty("indexed_row_count")
  private Long indexedRowCount;

  @JsonProperty("message")
  private String message;

  @JsonProperty("ready")
  private Boolean ready;

  public VectorIndexStatusPb setIndexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
    return this;
  }

  public String getIndexUrl() {
    return indexUrl;
  }

  public VectorIndexStatusPb setIndexedRowCount(Long indexedRowCount) {
    this.indexedRowCount = indexedRowCount;
    return this;
  }

  public Long getIndexedRowCount() {
    return indexedRowCount;
  }

  public VectorIndexStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public VectorIndexStatusPb setReady(Boolean ready) {
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
    VectorIndexStatusPb that = (VectorIndexStatusPb) o;
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
    return new ToStringer(VectorIndexStatusPb.class)
        .add("indexUrl", indexUrl)
        .add("indexedRowCount", indexedRowCount)
        .add("message", message)
        .add("ready", ready)
        .toString();
  }
}
