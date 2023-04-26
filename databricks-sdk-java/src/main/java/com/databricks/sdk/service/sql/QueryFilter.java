// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A filter to limit query history results. This field is optional.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryFilter {
  /** */
  @JsonProperty("query_start_time_range")
  private TimeRange queryStartTimeRange;

  /** */
  @JsonProperty("statuses")
  private Collection<QueryStatus> statuses;

  /** A list of user IDs who ran the queries. */
  @JsonProperty("user_ids")
  private Collection<Long> userIds;

  /** A list of warehouse IDs. */
  @JsonProperty("warehouse_ids")
  private Collection<String> warehouseIds;

  /**
   * <p>Setter for the field <code>queryStartTimeRange</code>.</p>
   *
   * @param queryStartTimeRange a {@link com.databricks.sdk.service.sql.TimeRange} object
   * @return a {@link com.databricks.sdk.service.sql.QueryFilter} object
   */
  public QueryFilter setQueryStartTimeRange(TimeRange queryStartTimeRange) {
    this.queryStartTimeRange = queryStartTimeRange;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryStartTimeRange</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.TimeRange} object
   */
  public TimeRange getQueryStartTimeRange() {
    return queryStartTimeRange;
  }

  /**
   * <p>Setter for the field <code>statuses</code>.</p>
   *
   * @param statuses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.QueryFilter} object
   */
  public QueryFilter setStatuses(Collection<QueryStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * <p>Getter for the field <code>statuses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<QueryStatus> getStatuses() {
    return statuses;
  }

  /**
   * <p>Setter for the field <code>userIds</code>.</p>
   *
   * @param userIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.QueryFilter} object
   */
  public QueryFilter setUserIds(Collection<Long> userIds) {
    this.userIds = userIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>userIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Long> getUserIds() {
    return userIds;
  }

  /**
   * <p>Setter for the field <code>warehouseIds</code>.</p>
   *
   * @param warehouseIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.QueryFilter} object
   */
  public QueryFilter setWarehouseIds(Collection<String> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getWarehouseIds() {
    return warehouseIds;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryFilter that = (QueryFilter) o;
    return Objects.equals(queryStartTimeRange, that.queryStartTimeRange)
        && Objects.equals(statuses, that.statuses)
        && Objects.equals(userIds, that.userIds)
        && Objects.equals(warehouseIds, that.warehouseIds);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(queryStartTimeRange, statuses, userIds, warehouseIds);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryFilter.class)
        .add("queryStartTimeRange", queryStartTimeRange)
        .add("statuses", statuses)
        .add("userIds", userIds)
        .add("warehouseIds", warehouseIds)
        .toString();
  }
}
