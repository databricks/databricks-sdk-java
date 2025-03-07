// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryVectorIndexRequest {
  /** List of column names to include in the response. */
  @JsonProperty("columns")
  private Collection<String> columns;

  /** Column names used to retrieve data to send to the reranker. */
  @JsonProperty("columns_to_rerank")
  private Collection<String> columnsToRerank;

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
  @JsonIgnore private String indexName;

  /** Number of results to return. Defaults to 10. */
  @JsonProperty("num_results")
  private Long numResults;

  /** Query text. Required for Delta Sync Index using model endpoint. */
  @JsonProperty("query_text")
  private String queryText;

  /** The query type to use. Choices are `ANN` and `HYBRID`. Defaults to `ANN`. */
  @JsonProperty("query_type")
  private String queryType;

  /**
   * Query vector. Required for Direct Vector Access Index and Delta Sync Index using self-managed
   * vectors.
   */
  @JsonProperty("query_vector")
  private Collection<Double> queryVector;

  /** Threshold for the approximate nearest neighbor search. Defaults to 0.0. */
  @JsonProperty("score_threshold")
  private Double scoreThreshold;

  public QueryVectorIndexRequest setColumns(Collection<String> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<String> getColumns() {
    return columns;
  }

  public QueryVectorIndexRequest setColumnsToRerank(Collection<String> columnsToRerank) {
    this.columnsToRerank = columnsToRerank;
    return this;
  }

  public Collection<String> getColumnsToRerank() {
    return columnsToRerank;
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

  public QueryVectorIndexRequest setQueryType(String queryType) {
    this.queryType = queryType;
    return this;
  }

  public String getQueryType() {
    return queryType;
  }

  public QueryVectorIndexRequest setQueryVector(Collection<Double> queryVector) {
    this.queryVector = queryVector;
    return this;
  }

  public Collection<Double> getQueryVector() {
    return queryVector;
  }

  public QueryVectorIndexRequest setScoreThreshold(Double scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  public Double getScoreThreshold() {
    return scoreThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryVectorIndexRequest that = (QueryVectorIndexRequest) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(columnsToRerank, that.columnsToRerank)
        && Objects.equals(filtersJson, that.filtersJson)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(numResults, that.numResults)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(queryType, that.queryType)
        && Objects.equals(queryVector, that.queryVector)
        && Objects.equals(scoreThreshold, that.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        columnsToRerank,
        filtersJson,
        indexName,
        numResults,
        queryText,
        queryType,
        queryVector,
        scoreThreshold);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexRequest.class)
        .add("columns", columns)
        .add("columnsToRerank", columnsToRerank)
        .add("filtersJson", filtersJson)
        .add("indexName", indexName)
        .add("numResults", numResults)
        .add("queryText", queryText)
        .add("queryType", queryType)
        .add("queryVector", queryVector)
        .add("scoreThreshold", scoreThreshold)
        .toString();
  }
}
