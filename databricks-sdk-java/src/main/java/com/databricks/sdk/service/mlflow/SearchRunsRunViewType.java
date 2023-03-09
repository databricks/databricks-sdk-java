// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Whether to display only active, only deleted, or all runs. Defaults to only
 * active runs.
 */
public enum SearchRunsRunViewType{
    ACTIVE_ONLY,
    ALL,
    DELETED_ONLY,
    
}