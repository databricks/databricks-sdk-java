// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum QueryStatus {
  @JsonProperty("CANCELED")
  CANCELED, // Query has been cancelled by the user.

  @JsonProperty("FAILED")
  FAILED, // Query has failed.

  @JsonProperty("FINISHED")
  FINISHED, // Query has completed.

  @JsonProperty("QUEUED")
  QUEUED, // Query has been received and queued.

  @JsonProperty("RUNNING")
  RUNNING, // Query has started.
}
