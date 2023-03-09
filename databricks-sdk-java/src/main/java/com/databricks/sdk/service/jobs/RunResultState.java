// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum RunResultState{
    CANCELED,// The run was canceled at user request.
    FAILED,// The task completed with an error.
    SUCCESS,// The task completed successfully.
    TIMEDOUT,// The run was stopped after reaching the timeout.
    
}