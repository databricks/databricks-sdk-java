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
import java.util.Objects;

/** Request payload for getting next page of results. */
@Generated
@JsonSerialize(
    using = QueryVectorIndexNextPageRequest.QueryVectorIndexNextPageRequestSerializer.class)
@JsonDeserialize(
    using = QueryVectorIndexNextPageRequest.QueryVectorIndexNextPageRequestDeserializer.class)
public class QueryVectorIndexNextPageRequest {
  /** Name of the endpoint. */
  private String endpointName;

  /** Name of the vector index to query. */
  private String indexName;

  /** Page token returned from previous `QueryVectorIndex` or `QueryVectorIndexNextPage` API. */
  private String pageToken;

  public QueryVectorIndexNextPageRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public QueryVectorIndexNextPageRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public QueryVectorIndexNextPageRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryVectorIndexNextPageRequest that = (QueryVectorIndexNextPageRequest) o;
    return Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, indexName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexNextPageRequest.class)
        .add("endpointName", endpointName)
        .add("indexName", indexName)
        .add("pageToken", pageToken)
        .toString();
  }

  QueryVectorIndexNextPageRequestPb toPb() {
    QueryVectorIndexNextPageRequestPb pb = new QueryVectorIndexNextPageRequestPb();
    pb.setEndpointName(endpointName);
    pb.setIndexName(indexName);
    pb.setPageToken(pageToken);

    return pb;
  }

  static QueryVectorIndexNextPageRequest fromPb(QueryVectorIndexNextPageRequestPb pb) {
    QueryVectorIndexNextPageRequest model = new QueryVectorIndexNextPageRequest();
    model.setEndpointName(pb.getEndpointName());
    model.setIndexName(pb.getIndexName());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class QueryVectorIndexNextPageRequestSerializer
      extends JsonSerializer<QueryVectorIndexNextPageRequest> {
    @Override
    public void serialize(
        QueryVectorIndexNextPageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryVectorIndexNextPageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryVectorIndexNextPageRequestDeserializer
      extends JsonDeserializer<QueryVectorIndexNextPageRequest> {
    @Override
    public QueryVectorIndexNextPageRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryVectorIndexNextPageRequestPb pb =
          mapper.readValue(p, QueryVectorIndexNextPageRequestPb.class);
      return QueryVectorIndexNextPageRequest.fromPb(pb);
    }
  }
}
