// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** List Queries */
@Generated
@JsonSerialize(using = ListQueryHistoryRequest.ListQueryHistoryRequestSerializer.class)
@JsonDeserialize(using = ListQueryHistoryRequest.ListQueryHistoryRequestDeserializer.class)
public class ListQueryHistoryRequest {
  /** A filter to limit query history results. This field is optional. */
  private QueryFilter filterBy;

  /**
   * Whether to include the query metrics with each query. Only use this for a small subset of
   * queries (max_results). Defaults to false.
   */
  private Boolean includeMetrics;

  /**
   * Limit the number of results returned in one page. Must be less than 1000 and the default is
   * 100.
   */
  private Long maxResults;

  /**
   * A token that can be used to get the next page of results. The token can contains characters
   * that need to be encoded before using it in a URL. For example, the character '+' needs to be
   * replaced by %2B. This field is optional.
   */
  private String pageToken;

  public ListQueryHistoryRequest setFilterBy(QueryFilter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public QueryFilter getFilterBy() {
    return filterBy;
  }

  public ListQueryHistoryRequest setIncludeMetrics(Boolean includeMetrics) {
    this.includeMetrics = includeMetrics;
    return this;
  }

  public Boolean getIncludeMetrics() {
    return includeMetrics;
  }

  public ListQueryHistoryRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListQueryHistoryRequest setPageToken(String pageToken) {
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
    ListQueryHistoryRequest that = (ListQueryHistoryRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(includeMetrics, that.includeMetrics)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, includeMetrics, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueryHistoryRequest.class)
        .add("filterBy", filterBy)
        .add("includeMetrics", includeMetrics)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListQueryHistoryRequestPb toPb() {
    ListQueryHistoryRequestPb pb = new ListQueryHistoryRequestPb();
    pb.setFilterBy(filterBy);
    pb.setIncludeMetrics(includeMetrics);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListQueryHistoryRequest fromPb(ListQueryHistoryRequestPb pb) {
    ListQueryHistoryRequest model = new ListQueryHistoryRequest();
    model.setFilterBy(pb.getFilterBy());
    model.setIncludeMetrics(pb.getIncludeMetrics());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListQueryHistoryRequestSerializer
      extends JsonSerializer<ListQueryHistoryRequest> {
    @Override
    public void serialize(
        ListQueryHistoryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQueryHistoryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQueryHistoryRequestDeserializer
      extends JsonDeserializer<ListQueryHistoryRequest> {
    @Override
    public ListQueryHistoryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQueryHistoryRequestPb pb = mapper.readValue(p, ListQueryHistoryRequestPb.class);
      return ListQueryHistoryRequest.fromPb(pb);
    }
  }
}
