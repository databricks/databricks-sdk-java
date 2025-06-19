// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = QueryVectorIndexRequest.QueryVectorIndexRequestSerializer.class)
@JsonDeserialize(using = QueryVectorIndexRequest.QueryVectorIndexRequestDeserializer.class)
public class QueryVectorIndexRequest {
  /** List of column names to include in the response. */
  private Collection<String> columns;

  /** Column names used to retrieve data to send to the reranker. */
  private Collection<String> columnsToRerank;

  /**
   * JSON string representing query filters.
   *
   * <p>Example filters:
   *
   * <p>- `{"id <": 5}`: Filter for id less than 5. - `{"id >": 5}`: Filter for id greater than 5. -
   * `{"id <=": 5}`: Filter for id less than equal to 5. - `{"id >=": 5}`: Filter for id greater
   * than equal to 5. - `{"id": 5}`: Filter for id equal to 5.
   */
  private String filtersJson;

  /** Name of the vector index to query. */
  private String indexName;

  /** Number of results to return. Defaults to 10. */
  private Long numResults;

  /** Query text. Required for Delta Sync Index using model endpoint. */
  private String queryText;

  /** The query type to use. Choices are `ANN` and `HYBRID`. Defaults to `ANN`. */
  private String queryType;

  /**
   * Query vector. Required for Direct Vector Access Index and Delta Sync Index using self-managed
   * vectors.
   */
  private Collection<Double> queryVector;

  /** Threshold for the approximate nearest neighbor search. Defaults to 0.0. */
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

  QueryVectorIndexRequestPb toPb() {
    QueryVectorIndexRequestPb pb = new QueryVectorIndexRequestPb();
    pb.setColumns(columns);
    pb.setColumnsToRerank(columnsToRerank);
    pb.setFiltersJson(filtersJson);
    pb.setIndexName(indexName);
    pb.setNumResults(numResults);
    pb.setQueryText(queryText);
    pb.setQueryType(queryType);
    pb.setQueryVector(queryVector);
    pb.setScoreThreshold(scoreThreshold);

    return pb;
  }

  static QueryVectorIndexRequest fromPb(QueryVectorIndexRequestPb pb) {
    QueryVectorIndexRequest model = new QueryVectorIndexRequest();
    model.setColumns(pb.getColumns());
    model.setColumnsToRerank(pb.getColumnsToRerank());
    model.setFiltersJson(pb.getFiltersJson());
    model.setIndexName(pb.getIndexName());
    model.setNumResults(pb.getNumResults());
    model.setQueryText(pb.getQueryText());
    model.setQueryType(pb.getQueryType());
    model.setQueryVector(pb.getQueryVector());
    model.setScoreThreshold(pb.getScoreThreshold());

    return model;
  }

  public static class QueryVectorIndexRequestSerializer
      extends JsonSerializer<QueryVectorIndexRequest> {
    @Override
    public void serialize(
        QueryVectorIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryVectorIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryVectorIndexRequestDeserializer
      extends JsonDeserializer<QueryVectorIndexRequest> {
    @Override
    public QueryVectorIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryVectorIndexRequestPb pb = mapper.readValue(p, QueryVectorIndexRequestPb.class);
      return QueryVectorIndexRequest.fromPb(pb);
    }
  }
}
