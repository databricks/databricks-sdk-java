// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Whether plans exist for the execution, or the reason why they are missing
 */
public enum PlansState{
    EMPTY,
    EXISTS,
    IGNORED_LARGE_PLANS_SIZE,
    IGNORED_SMALL_DURATION,
    IGNORED_SPARK_PLAN_TYPE,
    UNKNOWN,
    
}