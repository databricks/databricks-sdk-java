// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Can only be one of ``\"CUSTOM_METRIC_TYPE_AGGREGATE\"``, ``\"CUSTOM_METRIC_TYPE_DERIVED\"``, or
 * ``\"CUSTOM_METRIC_TYPE_DRIFT\"``. The ``\"CUSTOM_METRIC_TYPE_AGGREGATE\"`` and
 * ``\"CUSTOM_METRIC_TYPE_DERIVED\"`` metrics are computed on a single table, whereas the
 * ``\"CUSTOM_METRIC_TYPE_DRIFT\"`` compare metrics across baseline and input table, or across the
 * two consecutive time windows. - CUSTOM_METRIC_TYPE_AGGREGATE: only depend on the existing columns
 * in your table - CUSTOM_METRIC_TYPE_DERIVED: depend on previously computed aggregate metrics -
 * CUSTOM_METRIC_TYPE_DRIFT: depend on previously computed aggregate or derived metrics
 */
@Generated
public enum MonitorMetricType {
  CUSTOM_METRIC_TYPE_AGGREGATE,
  CUSTOM_METRIC_TYPE_DERIVED,
  CUSTOM_METRIC_TYPE_DRIFT,
}
