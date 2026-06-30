// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetIndexRequest {
  /**
   * If true, the URL returned for the index is guaranteed to be compatible with the reranker.
   * Currently this means we return the CP URL regardless of how the index is being accessed. If not
   * set or set to false, the URL may still be compatible with the reranker depending on what URL we
   * return.
   */
  @JsonIgnore
  @QueryParam("ensure_reranker_compatible")
  private Boolean ensureRerankerCompatible;

  /** Name of the index */
  @JsonIgnore private String indexName;

  public GetIndexRequest setEnsureRerankerCompatible(Boolean ensureRerankerCompatible) {
    this.ensureRerankerCompatible = ensureRerankerCompatible;
    return this;
  }

  public Boolean getEnsureRerankerCompatible() {
    return ensureRerankerCompatible;
  }

  public GetIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIndexRequest that = (GetIndexRequest) o;
    return Objects.equals(ensureRerankerCompatible, that.ensureRerankerCompatible)
        && Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ensureRerankerCompatible, indexName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIndexRequest.class)
        .add("ensureRerankerCompatible", ensureRerankerCompatible)
        .add("indexName", indexName)
        .toString();
  }
}
