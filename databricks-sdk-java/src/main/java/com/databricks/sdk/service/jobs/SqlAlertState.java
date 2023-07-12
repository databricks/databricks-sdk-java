// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of the SQL alert.
 *
 * <p>* UNKNOWN: alert yet to be evaluated * OK: alert evaluated and did not fulfill trigger
 * conditions * TRIGGERED: alert evaluated and fulfilled trigger conditions
 */
@Generated
public enum SqlAlertState {
  @JsonProperty("OK")
  OK,

  @JsonProperty("TRIGGERED")
  TRIGGERED,

  @JsonProperty("UNKNOWN")
  UNKNOWN,
}
