// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class QueryVectorIndexRequestPb {
  @JsonProperty("columns")
  private Collection<String> columns;

  @JsonProperty("columns_to_rerank")
  private Collection<String> columnsToRerank;

  @JsonProperty("filters_json")
  private String filtersJson;

  @JsonIgnore private String indexName;

  @JsonProperty("num_results")
  private Long numResults;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("query_type")
  private String queryType;

  @JsonProperty("query_vector")
  private Collection<Double> queryVector;

  @JsonProperty("score_threshold")
  private Double scoreThreshold;

  public QueryVectorIndexRequestPb setColumns(Collection<String> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<String> getColumns() {
    return columns;
  }

  public QueryVectorIndexRequestPb setColumnsToRerank(Collection<String> columnsToRerank) {
    this.columnsToRerank = columnsToRerank;
    return this;
  }

  public Collection<String> getColumnsToRerank() {
    return columnsToRerank;
  }

  public QueryVectorIndexRequestPb setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

  public String getFiltersJson() {
    return filtersJson;
  }

  public QueryVectorIndexRequestPb setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public QueryVectorIndexRequestPb setNumResults(Long numResults) {
    this.numResults = numResults;
    return this;
  }

  public Long getNumResults() {
    return numResults;
  }

  public QueryVectorIndexRequestPb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public QueryVectorIndexRequestPb setQueryType(String queryType) {
    this.queryType = queryType;
    return this;
  }

  public String getQueryType() {
    return queryType;
  }

  public QueryVectorIndexRequestPb setQueryVector(Collection<Double> queryVector) {
    this.queryVector = queryVector;
    return this;
  }

  public Collection<Double> getQueryVector() {
    return queryVector;
  }

  public QueryVectorIndexRequestPb setScoreThreshold(Double scoreThreshold) {
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
    QueryVectorIndexRequestPb that = (QueryVectorIndexRequestPb) o;
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
    return new ToStringer(QueryVectorIndexRequestPb.class)
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
