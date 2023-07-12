// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum RunIf {
  @JsonProperty("ALL_DONE")
  ALL_DONE, // All dependencies completed and at least one was executed

  @JsonProperty("ALL_FAILED")
  ALL_FAILED, // ALl dependencies have failed

  @JsonProperty("ALL_SUCCESS")
  ALL_SUCCESS, // All dependencies have executed and succeeded

  @JsonProperty("AT_LEAST_ONE_FAILED")
  AT_LEAST_ONE_FAILED, // At least one dependency failed

  @JsonProperty("AT_LEAST_ONE_SUCCESS")
  AT_LEAST_ONE_SUCCESS, // At least one dependency has succeeded

  @JsonProperty("NONE_FAILED")
  NONE_FAILED, // None of the dependencies have failed and at least one was executed
}
