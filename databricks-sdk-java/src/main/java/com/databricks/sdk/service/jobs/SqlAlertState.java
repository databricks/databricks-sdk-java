// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The state of the SQL alert.
 *
 * <ul>
 *   <li>UNKNOWN: alert yet to be evaluated
 *   <li>OK: alert evaluated and did not fulfill trigger conditions
 *   <li>TRIGGERED: alert evaluated and fulfilled trigger conditions
 * </ul>
 */
@Generated
public enum SqlAlertState {
  OK,
  TRIGGERED,
  UNKNOWN,
}
