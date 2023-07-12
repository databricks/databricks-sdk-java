// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum ListRunsRunType {
  @JsonProperty("JOB_RUN")
  JOB_RUN, // Normal job run. A run created with :method:jobs/runNow.

  @JsonProperty("SUBMIT_RUN")
  SUBMIT_RUN, // Submit run. A run created with :method:jobs/submit.

  @JsonProperty("WORKFLOW_RUN")
  WORKFLOW_RUN, // Workflow run. A run created with
  // [dbutils.notebook.run](/dev-tools/databricks-utils.html#dbutils-workflow).

}
