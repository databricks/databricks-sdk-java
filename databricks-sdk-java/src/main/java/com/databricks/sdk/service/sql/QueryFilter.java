// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryFilter {
  /** Filter by one or more property describing where the query was generated */
  @JsonProperty("context_filter")
  @QueryParam("context_filter")
  private ContextFilter contextFilter;

  /** A range filter for query submitted time. The time range must be <= 30 days. */
  @JsonProperty("query_start_time_range")
  @QueryParam("query_start_time_range")
  private TimeRange queryStartTimeRange;

  /** */
  @JsonProperty("statuses")
  @QueryParam("statuses")
  private Collection<QueryStatus> statuses;

  /** A list of user IDs who ran the queries. */
  @JsonProperty("user_ids")
  @QueryParam("user_ids")
  private Collection<Long> userIds;

  /** A list of warehouse IDs. */
  @JsonProperty("warehouse_ids")
  @QueryParam("warehouse_ids")
  private Collection<String> warehouseIds;

  public QueryFilter setContextFilter(ContextFilter contextFilter) {
    this.contextFilter = contextFilter;
    return this;
  }

  public ContextFilter getContextFilter() {
    return contextFilter;
  }

  public QueryFilter setQueryStartTimeRange(TimeRange queryStartTimeRange) {
    this.queryStartTimeRange = queryStartTimeRange;
    return this;
  }

  public TimeRange getQueryStartTimeRange() {
    return queryStartTimeRange;
  }

  public QueryFilter setStatuses(Collection<QueryStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<QueryStatus> getStatuses() {
    return statuses;
  }

  public QueryFilter setUserIds(Collection<Long> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Collection<Long> getUserIds() {
    return userIds;
  }

  public QueryFilter setWarehouseIds(Collection<String> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public Collection<String> getWarehouseIds() {
    return warehouseIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryFilter that = (QueryFilter) o;
    return Objects.equals(contextFilter, that.contextFilter)
        && Objects.equals(queryStartTimeRange, that.queryStartTimeRange)
        && Objects.equals(statuses, that.statuses)
        && Objects.equals(userIds, that.userIds)
        && Objects.equals(warehouseIds, that.warehouseIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextFilter, queryStartTimeRange, statuses, userIds, warehouseIds);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryFilter.class)
        .add("contextFilter", contextFilter)
        .add("queryStartTimeRange", queryStartTimeRange)
        .add("statuses", statuses)
        .add("userIds", userIds)
        .add("warehouseIds", warehouseIds)
        .toString();
  }
}
