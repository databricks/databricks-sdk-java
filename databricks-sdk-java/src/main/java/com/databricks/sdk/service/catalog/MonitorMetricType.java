// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Can only be one of {@code \"CUSTOM_METRIC_TYPE_AGGREGATE\"}, {@code
 * \"CUSTOM_METRIC_TYPE_DERIVED\"}, or {@code \"CUSTOM_METRIC_TYPE_DRIFT\"}. The {@code
 * \"CUSTOM_METRIC_TYPE_AGGREGATE\"} and {@code \"CUSTOM_METRIC_TYPE_DERIVED\"} metrics are computed
 * on a single table, whereas the {@code \"CUSTOM_METRIC_TYPE_DRIFT\"} compare metrics across
 * baseline and input table, or across the two consecutive time windows.
 *
 * <ul>
 *   <li>CUSTOM_METRIC_TYPE_AGGREGATE: only depend on the existing columns in your table
 *   <li>CUSTOM_METRIC_TYPE_DERIVED: depend on previously computed aggregate metrics
 *   <li>CUSTOM_METRIC_TYPE_DRIFT: depend on previously computed aggregate or derived metrics
 * </ul>
 */
@Generated
public enum MonitorMetricType {
  CUSTOM_METRIC_TYPE_AGGREGATE,
  CUSTOM_METRIC_TYPE_DERIVED,
  CUSTOM_METRIC_TYPE_DRIFT,
}
