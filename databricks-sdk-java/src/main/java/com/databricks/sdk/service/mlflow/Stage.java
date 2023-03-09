// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum Stage{
    Archived,// Archived stage.
    None,// The initial stage of a model version.
    Production,// Production stage.
    Staging,// Staging or pre-production stage.
    
}