// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * UNSPECIFIED - default unspecify value for proto enum, do not use it in the code UNKNOWN - alert
 * not yet evaluated TRIGGERED - alert is triggered OK - alert is not triggered ERROR - alert
 * evaluation failed
 */
@Generated
public enum AlertEvaluationState {
  ERROR,
  OK,
  TRIGGERED,
  UNKNOWN,
}
