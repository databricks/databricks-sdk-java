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
  /**
   * Names of the columns to return for each result. At least one column is required, and only
   * columns that are part of the index can be returned.
   */
  @JsonProperty("columns")
  private Collection<String> columns;

  /** Column names used to retrieve data to send to the reranker. */
  @JsonProperty("columns_to_rerank")
  private Collection<String> columnsToRerank;

  /**
   * Facets to compute over the matched results. Each entry has one of these forms: `"<column>"` -
   * top 10 distinct values by count `"<column> TOP <n>"` - top n distinct values, where n > 0
   * `"<column> BUCKETS [[from,to],...]"` - inclusive numeric ranges `TOP` and `BUCKETS` are
   * case-insensitive. A column may appear at most once.
   */
  @JsonProperty("facets")
  private Collection<String> facets;

  /**
   * Filters to apply to the results, as a JSON object serialized to a string. Each key is a column
   * name, optionally followed by a space and an operator, and each value is the value or list of
   * values to compare the column against. A key without an operator matches the value exactly, or
   * any of the listed values. Supported operators are `NOT`, `<`, `<=`, `>`, `>=`, `OR` and `LIKE`;
   * see https://docs.databricks.com/aws/en/ai-search/query-ai-search for their semantics. This
   * field is not supported on storage-optimized endpoints.
   */
  @JsonProperty("filters_json")
  private String filtersJson;

  /** Name of the vector index to query. */
  @JsonIgnore private String indexName;

  /**
   * Maximum number of results to return. It must be greater than 0 and defaults to 10. By default,
   * a `HYBRID` query can return at most 200 results.
   */
  @JsonProperty("num_results")
  private Long numResults;

  /** Text columns to search for `query_text`. When empty, all text columns are searched. */
  @JsonProperty("query_columns")
  private Collection<String> queryColumns;

  /**
   * Text to search for. Use it for an index with Databricks-managed embeddings, which embeds the
   * text with the index's embedding model endpoint, and for `FULL_TEXT` queries on any index. A
   * `HYBRID` query on an index with managed embeddings requires only `query_text`.
   */
  @JsonProperty("query_text")
  private String queryText;

  /** The query type to use. Choices are `ANN` and `HYBRID` and `FULL_TEXT`. Defaults to `ANN`. */
  @JsonProperty("query_type")
  private String queryType;

  /**
   * Embedding vector to search for. Use it for an index whose embeddings you compute yourself: a
   * Direct Vector Access index or a Delta Sync index with `embedding_vector_columns`. A `HYBRID`
   * query on a Delta Sync index with `embedding_vector_columns`, or on a Direct Vector Access index
   * without `embedding_source_columns`, requires both `query_vector` and `query_text`. A Direct
   * Vector Access index with `embedding_source_columns` can be queried with `query_text` alone.
   */
  @JsonProperty("query_vector")
  private Collection<Double> queryVector;

  /**
   * If set, the top 50 results are reranked with the Databricks Reranker model before returning the
   * `num_results` results to the user. The setting `columns_to_rerank` selects which columns are
   * used for reranking. For each datapoint, the columns selected are concatenated before being sent
   * to the reranking model. See
   * https://docs.databricks.com/aws/en/vector-search/query-vector-search#rerank for more
   * information.
   */
  @JsonProperty("reranker")
  private RerankerConfig reranker;

  /** Threshold for the approximate nearest neighbor search. Defaults to 0.0. */
  @JsonProperty("score_threshold")
  private Double scoreThreshold;

  /**
   * Sort results by column values instead of the default relevance ordering. Each clause has the
   * form `"<column> ASC"` or `"<column> DESC"`, for example `["rating DESC", "price ASC"]`.
   */
  @JsonProperty("sort_columns")
  private Collection<String> sortColumns;

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

  public QueryVectorIndexRequest setFacets(Collection<String> facets) {
    this.facets = facets;
    return this;
  }

  public Collection<String> getFacets() {
    return facets;
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

  public QueryVectorIndexRequest setQueryColumns(Collection<String> queryColumns) {
    this.queryColumns = queryColumns;
    return this;
  }

  public Collection<String> getQueryColumns() {
    return queryColumns;
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

  public QueryVectorIndexRequest setReranker(RerankerConfig reranker) {
    this.reranker = reranker;
    return this;
  }

  public RerankerConfig getReranker() {
    return reranker;
  }

  public QueryVectorIndexRequest setScoreThreshold(Double scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  public Double getScoreThreshold() {
    return scoreThreshold;
  }

  public QueryVectorIndexRequest setSortColumns(Collection<String> sortColumns) {
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
    QueryVectorIndexRequest that = (QueryVectorIndexRequest) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(columnsToRerank, that.columnsToRerank)
        && Objects.equals(facets, that.facets)
        && Objects.equals(filtersJson, that.filtersJson)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(numResults, that.numResults)
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
        indexName,
        numResults,
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
    return new ToStringer(QueryVectorIndexRequest.class)
        .add("columns", columns)
        .add("columnsToRerank", columnsToRerank)
        .add("facets", facets)
        .add("filtersJson", filtersJson)
        .add("indexName", indexName)
        .add("numResults", numResults)
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
