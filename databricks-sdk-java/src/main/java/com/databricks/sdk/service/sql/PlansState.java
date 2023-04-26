// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/**
 * Whether plans exist for the execution, or the reason why they are missing
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public enum PlansState {
  EMPTY,
  EXISTS,
  IGNORED_LARGE_PLANS_SIZE,
  IGNORED_SMALL_DURATION,
  IGNORED_SPARK_PLAN_TYPE,
  UNKNOWN,
}
