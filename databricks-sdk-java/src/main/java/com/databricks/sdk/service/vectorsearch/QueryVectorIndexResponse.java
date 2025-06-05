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

@Generated
@JsonSerialize(using = QueryVectorIndexResponse.QueryVectorIndexResponseSerializer.class)
@JsonDeserialize(using = QueryVectorIndexResponse.QueryVectorIndexResponseDeserializer.class)
public class QueryVectorIndexResponse {
  /** Metadata about the result set. */
  private ResultManifest manifest;

  /**
   * [Optional] Token that can be used in `QueryVectorIndexNextPage` API to get next page of
   * results. If more than 1000 results satisfy the query, they are returned in groups of 1000.
   * Empty value means no more results. The maximum number of results that can be returned is
   * 10,000.
   */
  private String nextPageToken;

  /** Data returned in the query result. */
  private ResultData result;

  public QueryVectorIndexResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public QueryVectorIndexResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public QueryVectorIndexResponse setResult(ResultData result) {
    this.result = result;
    return this;
  }

  public ResultData getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryVectorIndexResponse that = (QueryVectorIndexResponse) o;
    return Objects.equals(manifest, that.manifest)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, nextPageToken, result);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexResponse.class)
        .add("manifest", manifest)
        .add("nextPageToken", nextPageToken)
        .add("result", result)
        .toString();
  }

  QueryVectorIndexResponsePb toPb() {
    QueryVectorIndexResponsePb pb = new QueryVectorIndexResponsePb();
    pb.setManifest(manifest);
    pb.setNextPageToken(nextPageToken);
    pb.setResult(result);

    return pb;
  }

  static QueryVectorIndexResponse fromPb(QueryVectorIndexResponsePb pb) {
    QueryVectorIndexResponse model = new QueryVectorIndexResponse();
    model.setManifest(pb.getManifest());
    model.setNextPageToken(pb.getNextPageToken());
    model.setResult(pb.getResult());

    return model;
  }

  public static class QueryVectorIndexResponseSerializer
      extends JsonSerializer<QueryVectorIndexResponse> {
    @Override
    public void serialize(
        QueryVectorIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryVectorIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryVectorIndexResponseDeserializer
      extends JsonDeserializer<QueryVectorIndexResponse> {
    @Override
    public QueryVectorIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryVectorIndexResponsePb pb = mapper.readValue(p, QueryVectorIndexResponsePb.class);
      return QueryVectorIndexResponse.fromPb(pb);
    }
  }
}
