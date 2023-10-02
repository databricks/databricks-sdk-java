// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The type of trigger that fired this run.
 *
 * <p>* `PERIODIC`: Schedules that periodically trigger runs, such as a cron scheduler. *
 * `ONE_TIME`: One time triggers that fire a single run. This occurs you triggered a single run on
 * demand through the UI or the API. * `RETRY`: Indicates a run that is triggered as a retry of a
 * previously failed run. This occurs when you request to re-run the job in case of failures. *
 * `RUN_JOB_TASK`: Indicates a run that is triggered using a Run Job task.
 *
 * <p>* `FILE_ARRIVAL`: Indicates a run that is triggered by a file arrival.
 */
@Generated
public enum TriggerType {
  FILE_ARRIVAL, // Indicates a run that is triggered by a file arrival.
  ONE_TIME, // One time triggers that fire a single run. This occurs you triggered a single
  // run on demand through the UI or the API.
  PERIODIC, // Schedules that periodically trigger runs, such as a cron scheduler.
  RETRY, // Indicates a run that is triggered as a retry of a previously failed run. This
  // occurs when you request to re-run the job in case of failures.
  RUN_JOB_TASK, // Indicates a run that is triggered using a Run Job task.
}
