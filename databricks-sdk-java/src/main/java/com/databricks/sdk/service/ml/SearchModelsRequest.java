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

/** Search models */
@Generated
@JsonSerialize(using = SearchModelsRequest.SearchModelsRequestSerializer.class)
@JsonDeserialize(using = SearchModelsRequest.SearchModelsRequestDeserializer.class)
public class SearchModelsRequest {
  /**
   * String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend
   * automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values
   * wrapped in single quotes.
   */
  private String filter;

  /** Maximum number of models desired. Default is 100. Max threshold is 1000. */
  private Long maxResults;

  /**
   * List of columns for ordering search results, which can include model name and last updated
   * timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks
   * are done by model name ASC.
   */
  private Collection<String> orderBy;

  /** Pagination token to go to the next page based on a previous search query. */
  private String pageToken;

  public SearchModelsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchModelsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchModelsRequest setPageToken(String pageToken) {
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
    SearchModelsRequest that = (SearchModelsRequest) o;
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
    return new ToStringer(SearchModelsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }

  SearchModelsRequestPb toPb() {
    SearchModelsRequestPb pb = new SearchModelsRequestPb();
    pb.setFilter(filter);
    pb.setMaxResults(maxResults);
    pb.setOrderBy(orderBy);
    pb.setPageToken(pageToken);

    return pb;
  }

  static SearchModelsRequest fromPb(SearchModelsRequestPb pb) {
    SearchModelsRequest model = new SearchModelsRequest();
    model.setFilter(pb.getFilter());
    model.setMaxResults(pb.getMaxResults());
    model.setOrderBy(pb.getOrderBy());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class SearchModelsRequestSerializer extends JsonSerializer<SearchModelsRequest> {
    @Override
    public void serialize(SearchModelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchModelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchModelsRequestDeserializer
      extends JsonDeserializer<SearchModelsRequest> {
    @Override
    public SearchModelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchModelsRequestPb pb = mapper.readValue(p, SearchModelsRequestPb.class);
      return SearchModelsRequest.fromPb(pb);
    }
  }
}
