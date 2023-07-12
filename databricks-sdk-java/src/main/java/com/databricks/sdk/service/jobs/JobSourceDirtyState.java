// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum JobSourceDirtyState {
  @JsonProperty("DISCONNECTED")
  DISCONNECTED, // The job is temporary disconnected from the remote job specification and is
  // allowed for live edit. Import the remote job specification again from UI to
  // make the job fully synced.

  @JsonProperty("NOT_SYNCED")
  NOT_SYNCED, // The job is not yet synced with the remote job specification. Import the
  // remote job specification from UI to make the job fully synced.

}
