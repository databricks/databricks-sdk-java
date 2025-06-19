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

@Generated
@JsonSerialize(using = SearchExperiments.SearchExperimentsSerializer.class)
@JsonDeserialize(using = SearchExperiments.SearchExperimentsDeserializer.class)
public class SearchExperiments {
  /** String representing a SQL filter condition (e.g. "name ILIKE 'my-experiment%'") */
  private String filter;

  /** Maximum number of experiments desired. Max threshold is 3000. */
  private Long maxResults;

  /**
   * List of columns for ordering search results, which can include experiment name and last updated
   * timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks
   * are done by experiment id DESC.
   */
  private Collection<String> orderBy;

  /** Token indicating the page of experiments to fetch */
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  private ViewType viewType;

  public SearchExperiments setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchExperiments setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchExperiments setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchExperiments setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchExperiments setViewType(ViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  public ViewType getViewType() {
    return viewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchExperiments that = (SearchExperiments) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(viewType, that.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken, viewType);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchExperiments.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .add("viewType", viewType)
        .toString();
  }

  SearchExperimentsPb toPb() {
    SearchExperimentsPb pb = new SearchExperimentsPb();
    pb.setFilter(filter);
    pb.setMaxResults(maxResults);
    pb.setOrderBy(orderBy);
    pb.setPageToken(pageToken);
    pb.setViewType(viewType);

    return pb;
  }

  static SearchExperiments fromPb(SearchExperimentsPb pb) {
    SearchExperiments model = new SearchExperiments();
    model.setFilter(pb.getFilter());
    model.setMaxResults(pb.getMaxResults());
    model.setOrderBy(pb.getOrderBy());
    model.setPageToken(pb.getPageToken());
    model.setViewType(pb.getViewType());

    return model;
  }

  public static class SearchExperimentsSerializer extends JsonSerializer<SearchExperiments> {
    @Override
    public void serialize(SearchExperiments value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchExperimentsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchExperimentsDeserializer extends JsonDeserializer<SearchExperiments> {
    @Override
    public SearchExperiments deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchExperimentsPb pb = mapper.readValue(p, SearchExperimentsPb.class);
      return SearchExperiments.fromPb(pb);
    }
  }
}
