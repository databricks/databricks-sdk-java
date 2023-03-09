// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Used to tell what is the format of the job. This field is ignored in
 * Create/Update/Reset calls. When using the Jobs API 2.1 this value is always
 * set to `"MULTI_TASK"`.
 */
public enum CreateJobFormat{
    MULTI_TASK,
    SINGLE_TASK,
    
}