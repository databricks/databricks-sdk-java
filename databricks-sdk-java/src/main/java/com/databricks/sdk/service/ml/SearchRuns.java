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
@JsonSerialize(using = SearchRuns.SearchRunsSerializer.class)
@JsonDeserialize(using = SearchRuns.SearchRunsDeserializer.class)
public class SearchRuns {
  /** List of experiment IDs to search over. */
  private Collection<String> experimentIds;

  /**
   * A filter expression over params, metrics, and tags, that allows returning a subset of runs. The
   * syntax is a subset of SQL that supports ANDing together binary operations between a param,
   * metric, or tag and a constant.
   *
   * <p>Example: `metrics.rmse < 1 and params.model_class = 'LogisticRegression'`
   *
   * <p>You can select columns with special characters (hyphen, space, period, etc.) by using double
   * quotes: `metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas'`
   *
   * <p>Supported operators are `=`, `!=`, `>`, `>=`, `<`, and `<=`.
   */
  private String filter;

  /** Maximum number of runs desired. Max threshold is 50000 */
  private Long maxResults;

  /**
   * List of columns to be ordered by, including attributes, params, metrics, and tags with an
   * optional `"DESC"` or `"ASC"` annotation, where `"ASC"` is the default. Example: `["params.input
   * DESC", "metrics.alpha ASC", "metrics.rmse"]`. Tiebreaks are done by start_time `DESC` followed
   * by `run_id` for runs with the same start time (and this is the default ordering criterion if
   * order_by is not provided).
   */
  private Collection<String> orderBy;

  /** Token for the current page of runs. */
  private String pageToken;

  /** Whether to display only active, only deleted, or all runs. Defaults to only active runs. */
  private ViewType runViewType;

  public SearchRuns setExperimentIds(Collection<String> experimentIds) {
    this.experimentIds = experimentIds;
    return this;
  }

  public Collection<String> getExperimentIds() {
    return experimentIds;
  }

  public SearchRuns setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchRuns setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchRuns setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchRuns setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchRuns setRunViewType(ViewType runViewType) {
    this.runViewType = runViewType;
    return this;
  }

  public ViewType getRunViewType() {
    return runViewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRuns that = (SearchRuns) o;
    return Objects.equals(experimentIds, that.experimentIds)
        && Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runViewType, that.runViewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentIds, filter, maxResults, orderBy, pageToken, runViewType);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRuns.class)
        .add("experimentIds", experimentIds)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .add("runViewType", runViewType)
        .toString();
  }

  SearchRunsPb toPb() {
    SearchRunsPb pb = new SearchRunsPb();
    pb.setExperimentIds(experimentIds);
    pb.setFilter(filter);
    pb.setMaxResults(maxResults);
    pb.setOrderBy(orderBy);
    pb.setPageToken(pageToken);
    pb.setRunViewType(runViewType);

    return pb;
  }

  static SearchRuns fromPb(SearchRunsPb pb) {
    SearchRuns model = new SearchRuns();
    model.setExperimentIds(pb.getExperimentIds());
    model.setFilter(pb.getFilter());
    model.setMaxResults(pb.getMaxResults());
    model.setOrderBy(pb.getOrderBy());
    model.setPageToken(pb.getPageToken());
    model.setRunViewType(pb.getRunViewType());

    return model;
  }

  public static class SearchRunsSerializer extends JsonSerializer<SearchRuns> {
    @Override
    public void serialize(SearchRuns value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchRunsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchRunsDeserializer extends JsonDeserializer<SearchRuns> {
    @Override
    public SearchRuns deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchRunsPb pb = mapper.readValue(p, SearchRunsPb.class);
      return SearchRuns.fromPb(pb);
    }
  }
}
