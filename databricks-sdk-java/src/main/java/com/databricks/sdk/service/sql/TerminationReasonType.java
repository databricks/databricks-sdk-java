// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** type of the termination */
@Generated
public enum TerminationReasonType {
  @JsonProperty("CLIENT_ERROR")
  CLIENT_ERROR,

  @JsonProperty("CLOUD_FAILURE")
  CLOUD_FAILURE,

  @JsonProperty("SERVICE_FAULT")
  SERVICE_FAULT,

  @JsonProperty("SUCCESS")
  SUCCESS,
}
