// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum ListRunsRunType{
    JOB_RUN,// Normal job run. A run created with :method:jobs/runNow.
    SUBMIT_RUN,// Submit run. A run created with :method:jobs/submit.
    WORKFLOW_RUN,// Workflow run. A run created with
// [dbutils.notebook.run](/dev-tools/databricks-utils.html#dbutils-workflow).
    
}