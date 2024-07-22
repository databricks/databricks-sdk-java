// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * State of the alert. Possible values are: `unknown` (yet to be evaluated), `triggered` (evaluated
 * and fulfilled trigger conditions), or `ok` (evaluated and did not fulfill trigger conditions).
 */
@Generated
public enum LegacyAlertState {
  @JsonProperty("ok")
  OK,

  @JsonProperty("triggered")
  TRIGGERED,

  @JsonProperty("unknown")
  UNKNOWN,
}
