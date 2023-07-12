// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum Status {
  @JsonProperty("FAILED_REGISTRATION")
  FAILED_REGISTRATION, // Request to register a new model version has failed.

  @JsonProperty("PENDING_REGISTRATION")
  PENDING_REGISTRATION, // Request to register a new model version is pending as server performs
  // background tasks.

  @JsonProperty("READY")
  READY, // Model version is ready for use.
}
