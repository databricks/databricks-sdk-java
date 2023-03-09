// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum ActivityType{
    APPLIED_TRANSITION,// User applied the corresponding stage transition.
    APPROVED_REQUEST,// User approved the corresponding stage transition.
    CANCELLED_REQUEST,// User cancelled an existing transition request.
    NEW_COMMENT,
    REJECTED_REQUEST,// User rejected the coressponding stage transition.
    REQUESTED_TRANSITION,// User requested the corresponding stage transition.
    SYSTEM_TRANSITION,// For events performed as a side effect, such as archiving existing model
// versions in a stage.
    
}