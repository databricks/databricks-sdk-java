// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum TriggerType {
  @JsonProperty("FILE_ARRIVAL")
  FILE_ARRIVAL, // Indicates a run that is triggered by a file arrival.

  @JsonProperty("ONE_TIME")
  ONE_TIME, // One time triggers that fire a single run. This occurs you triggered a single
  // run on demand through the UI or the API.

  @JsonProperty("PERIODIC")
  PERIODIC, // Schedules that periodically trigger runs, such as a cron scheduler.

  @JsonProperty("RETRY")
  RETRY, // Indicates a run that is triggered as a retry of a previously failed run. This
  // occurs when you request to re-run the job in case of failures.

  @JsonProperty("RUN_JOB_TASK")
  RUN_JOB_TASK, // Indicates a run that is triggered using a Run Job task.
}
