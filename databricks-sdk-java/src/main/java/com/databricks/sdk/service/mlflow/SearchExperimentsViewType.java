// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Qualifier for type of experiments to be returned. If unspecified, return only
 * active experiments.
 */
public enum SearchExperimentsViewType{
    ACTIVE_ONLY,
    ALL,
    DELETED_ONLY,
    
}