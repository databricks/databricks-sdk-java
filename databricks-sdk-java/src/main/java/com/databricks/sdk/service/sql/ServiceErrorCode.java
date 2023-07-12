// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum ServiceErrorCode {
  @JsonProperty("ABORTED")
  ABORTED,

  @JsonProperty("ALREADY_EXISTS")
  ALREADY_EXISTS,

  @JsonProperty("BAD_REQUEST")
  BAD_REQUEST,

  @JsonProperty("CANCELLED")
  CANCELLED,

  @JsonProperty("DEADLINE_EXCEEDED")
  DEADLINE_EXCEEDED,

  @JsonProperty("INTERNAL_ERROR")
  INTERNAL_ERROR,

  @JsonProperty("IO_ERROR")
  IO_ERROR,

  @JsonProperty("NOT_FOUND")
  NOT_FOUND,

  @JsonProperty("RESOURCE_EXHAUSTED")
  RESOURCE_EXHAUSTED,

  @JsonProperty("SERVICE_UNDER_MAINTENANCE")
  SERVICE_UNDER_MAINTENANCE,

  @JsonProperty("TEMPORARILY_UNAVAILABLE")
  TEMPORARILY_UNAVAILABLE,

  @JsonProperty("UNAUTHENTICATED")
  UNAUTHENTICATED,

  @JsonProperty("UNKNOWN")
  UNKNOWN,

  @JsonProperty("WORKSPACE_TEMPORARILY_UNAVAILABLE")
  WORKSPACE_TEMPORARILY_UNAVAILABLE,
}
