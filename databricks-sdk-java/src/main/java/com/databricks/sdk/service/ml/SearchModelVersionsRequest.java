// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Searches model versions */
@Generated
@JsonSerialize(using = SearchModelVersionsRequest.SearchModelVersionsRequestSerializer.class)
@JsonDeserialize(using = SearchModelVersionsRequest.SearchModelVersionsRequestDeserializer.class)
public class SearchModelVersionsRequest {
  /**
   * String filter condition, like "name='my-model-name'". Must be a single boolean condition, with
   * string values wrapped in single quotes.
   */
  private String filter;

  /** Maximum number of models desired. Max threshold is 10K. */
  private Long maxResults;

  /**
   * List of columns to be ordered by including model name, version, stage with an optional "DESC"
   * or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition
   * timestamp, followed by name ASC, followed by version DESC.
   */
  private Collection<String> orderBy;

  /** Pagination token to go to next page based on previous search query. */
  private String pageToken;

  public SearchModelVersionsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchModelVersionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchModelVersionsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchModelVersionsRequest setPageToken(String pageToken) {
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
    SearchModelVersionsRequest that = (SearchModelVersionsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelVersionsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }

  SearchModelVersionsRequestPb toPb() {
    SearchModelVersionsRequestPb pb = new SearchModelVersionsRequestPb();
    pb.setFilter(filter);
    pb.setMaxResults(maxResults);
    pb.setOrderBy(orderBy);
    pb.setPageToken(pageToken);

    return pb;
  }

  static SearchModelVersionsRequest fromPb(SearchModelVersionsRequestPb pb) {
    SearchModelVersionsRequest model = new SearchModelVersionsRequest();
    model.setFilter(pb.getFilter());
    model.setMaxResults(pb.getMaxResults());
    model.setOrderBy(pb.getOrderBy());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class SearchModelVersionsRequestSerializer
      extends JsonSerializer<SearchModelVersionsRequest> {
    @Override
    public void serialize(
        SearchModelVersionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchModelVersionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchModelVersionsRequestDeserializer
      extends JsonDeserializer<SearchModelVersionsRequest> {
    @Override
    public SearchModelVersionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchModelVersionsRequestPb pb = mapper.readValue(p, SearchModelVersionsRequestPb.class);
      return SearchModelVersionsRequest.fromPb(pb);
    }
  }
}
