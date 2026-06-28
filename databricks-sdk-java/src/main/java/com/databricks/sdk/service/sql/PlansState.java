// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/** Possible Reasons for which we have not saved plans in the database */
@Generated
public enum PlansState {
  EMPTY,
  EXISTS,
  IGNORED_LARGE_PLANS_SIZE,
  IGNORED_SMALL_DURATION,
  IGNORED_SPARK_PLAN_TYPE,
  UNKNOWN,
}
