// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum StartUpdateCause {
  @JsonProperty("API_CALL")
  API_CALL,

  @JsonProperty("JOB_TASK")
  JOB_TASK,

  @JsonProperty("RETRY_ON_FAILURE")
  RETRY_ON_FAILURE,

  @JsonProperty("SCHEMA_CHANGE")
  SCHEMA_CHANGE,

  @JsonProperty("SERVICE_UPGRADE")
  SERVICE_UPGRADE,

  @JsonProperty("USER_ACTION")
  USER_ACTION,
}
