// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryVectorIndexRequest {
  /** List of column names to include in the response. */
  @JsonProperty("columns")
  private Collection<String> columns;

  /**
   * JSON string representing query filters.
   *
   * <p>Example filters: - `{"id <": 5}`: Filter for id less than 5. - `{"id >": 5}`: Filter for id
   * greater than 5. - `{"id <=": 5}`: Filter for id less than equal to 5. - `{"id >=": 5}`: Filter
   * for id greater than equal to 5. - `{"id": 5}`: Filter for id equal to 5.
   */
  @JsonProperty("filters_json")
  private String filtersJson;

  /** Name of the vector index to query. */
  private String indexName;

  /** Number of results to return. Defaults to 10. */
  @JsonProperty("num_results")
  private Long numResults;

  /** Query text. Required for Delta Sync Index using model endpoint. */
  @JsonProperty("query_text")
  private String queryText;

  /**
   * Query vector. Required for Direct Vector Access Index and Delta Sync Index using self-managed
   * vectors.
   */
  @JsonProperty("query_vector")
  private Collection<Object /* MISSING TYPE */> queryVector;

  public QueryVectorIndexRequest setColumns(Collection<String> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<String> getColumns() {
    return columns;
  }

  public QueryVectorIndexRequest setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

  public String getFiltersJson() {
    return filtersJson;
  }

  public QueryVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public QueryVectorIndexRequest setNumResults(Long numResults) {
    this.numResults = numResults;
    return this;
  }

  public Long getNumResults() {
    return numResults;
  }

  public QueryVectorIndexRequest setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public QueryVectorIndexRequest setQueryVector(Collection<Object /* MISSING TYPE */> queryVector) {
    this.queryVector = queryVector;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getQueryVector() {
    return queryVector;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryVectorIndexRequest that = (QueryVectorIndexRequest) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(filtersJson, that.filtersJson)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(numResults, that.numResults)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(queryVector, that.queryVector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, filtersJson, indexName, numResults, queryText, queryVector);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexRequest.class)
        .add("columns", columns)
        .add("filtersJson", filtersJson)
        .add("indexName", indexName)
        .add("numResults", numResults)
        .add("queryText", queryText)
        .add("queryVector", queryVector)
        .toString();
  }
}
