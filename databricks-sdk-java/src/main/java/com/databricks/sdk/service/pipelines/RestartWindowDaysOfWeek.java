// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

/**
 * Days of week in which the restart is allowed to happen (within a five-hour window starting at
 * start_hour). If not specified all days of the week will be used.
 */
@Generated
public enum RestartWindowDaysOfWeek {
  FRIDAY,
  MONDAY,
  SATURDAY,
  SUNDAY,
  THURSDAY,
  TUESDAY,
  WEDNESDAY,
}
