// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The type of a run.
 *
 * <ul>
 *   <li>{@code JOB_RUN}: Normal job run. A run created with :method:jobs/runNow.
 *   <li>{@code WORKFLOW_RUN}: Workflow run. A run created with <a
 *       href="https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-workflow">dbutils.notebook.run</a>.
 *   <li>{@code SUBMIT_RUN}: Submit run. A run created with :method:jobs/submit.
 * </ul>
 */
@Generated
public enum RunType {
  JOB_RUN, // Normal job run. A run created with :method:jobs/runNow.
  SUBMIT_RUN, // Submit run. A run created with :method:jobs/submit.
  WORKFLOW_RUN, // Workflow run. A run created with
  // [dbutils.notebook.run](/dev-tools/databricks-utils.html#dbutils-workflow).

}
