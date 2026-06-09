// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Request to query (search) an AI Search index. The legacy `num_results` count is exposed as
 * `max_results`; v1 returns up to `max_results` rows in a single response (no cursor pagination —
 * see the note on `max_results` below).
 */
@Generated
public class QueryIndexRequest {
  /** Column names to include in each result row. */
  @JsonProperty("columns")
  private Collection<String> columns;

  /** Columns whose values are sent to the reranker. */
  @JsonProperty("columns_to_rerank")
  private Collection<String> columnsToRerank;

  /** Facets to compute over the matched results (e.g. `"category TOP 5"`). */
  @JsonProperty("facets")
  private Collection<String> facets;

  /** JSON string describing query filters (e.g. `{"id >": 5}`). */
  @JsonProperty("filters_json")
  private String filtersJson;

  /** Maximum number of results to return (the legacy `num_results`). Defaults to 10. */
  @JsonProperty("max_results")
  private Long maxResults;

  /**
   * Full resource name of the index to query. Format:
   * `workspaces/{workspace_id}/endpoints/{endpoint_id}/indexes/{index_id}`
   */
  @JsonIgnore private String name;

  /** Text columns to search for `query_text`. When empty, all text columns are searched. */
  @JsonProperty("query_columns")
  private Collection<String> queryColumns;

  /** Query text. Required for Delta Sync indexes that compute embeddings from a model endpoint. */
  @JsonProperty("query_text")
  private String queryText;

  /** Query type: `ANN`, `HYBRID`, or `FULL_TEXT`. Defaults to `ANN`. */
  @JsonProperty("query_type")
  private String queryType;

  /**
   * Query vector. Required for Direct Access indexes and Delta Sync indexes with self-managed
   * vectors.
   */
  @JsonProperty("query_vector")
  private Collection<Double> queryVector;

  /** If set, results are reranked before being returned. */
  @JsonProperty("reranker")
  private RerankerConfig reranker;

  /** Score threshold for the approximate nearest-neighbor search. Defaults to 0.0. */
  @JsonProperty("score_threshold")
  private Double scoreThreshold;

  /** Sort clauses, e.g. `["rating DESC", "price ASC"]`. Overrides relevance ordering. */
  @JsonProperty("sort_columns")
  private Collection<String> sortColumns;

  public QueryIndexRequest setColumns(Collection<String> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<String> getColumns() {
    return columns;
  }

  public QueryIndexRequest setColumnsToRerank(Collection<String> columnsToRerank) {
    this.columnsToRerank = columnsToRerank;
    return this;
  }

  public Collection<String> getColumnsToRerank() {
    return columnsToRerank;
  }

  public QueryIndexRequest setFacets(Collection<String> facets) {
    this.facets = facets;
    return this;
  }

  public Collection<String> getFacets() {
    return facets;
  }

  public QueryIndexRequest setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

  public String getFiltersJson() {
    return filtersJson;
  }

  public QueryIndexRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public QueryIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryIndexRequest setQueryColumns(Collection<String> queryColumns) {
    this.queryColumns = queryColumns;
    return this;
  }

  public Collection<String> getQueryColumns() {
    return queryColumns;
  }

  public QueryIndexRequest setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public QueryIndexRequest setQueryType(String queryType) {
    this.queryType = queryType;
    return this;
  }

  public String getQueryType() {
    return queryType;
  }

  public QueryIndexRequest setQueryVector(Collection<Double> queryVector) {
    this.queryVector = queryVector;
    return this;
  }

  public Collection<Double> getQueryVector() {
    return queryVector;
  }

  public QueryIndexRequest setReranker(RerankerConfig reranker) {
    this.reranker = reranker;
    return this;
  }

  public RerankerConfig getReranker() {
    return reranker;
  }

  public QueryIndexRequest setScoreThreshold(Double scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  public Double getScoreThreshold() {
    return scoreThreshold;
  }

  public QueryIndexRequest setSortColumns(Collection<String> sortColumns) {
    this.sortColumns = sortColumns;
    return this;
  }

  public Collection<String> getSortColumns() {
    return sortColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryIndexRequest that = (QueryIndexRequest) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(columnsToRerank, that.columnsToRerank)
        && Objects.equals(facets, that.facets)
        && Objects.equals(filtersJson, that.filtersJson)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(name, that.name)
        && Objects.equals(queryColumns, that.queryColumns)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(queryType, that.queryType)
        && Objects.equals(queryVector, that.queryVector)
        && Objects.equals(reranker, that.reranker)
        && Objects.equals(scoreThreshold, that.scoreThreshold)
        && Objects.equals(sortColumns, that.sortColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        columnsToRerank,
        facets,
        filtersJson,
        maxResults,
        name,
        queryColumns,
        queryText,
        queryType,
        queryVector,
        reranker,
        scoreThreshold,
        sortColumns);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryIndexRequest.class)
        .add("columns", columns)
        .add("columnsToRerank", columnsToRerank)
        .add("facets", facets)
        .add("filtersJson", filtersJson)
        .add("maxResults", maxResults)
        .add("name", name)
        .add("queryColumns", queryColumns)
        .add("queryText", queryText)
        .add("queryType", queryType)
        .add("queryVector", queryVector)
        .add("reranker", reranker)
        .add("scoreThreshold", scoreThreshold)
        .add("sortColumns", sortColumns)
        .toString();
  }
}
