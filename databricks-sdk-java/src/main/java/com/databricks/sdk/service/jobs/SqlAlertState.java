// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The state of the SQL alert.
 * 
 * * UNKNOWN: alert yet to be evaluated * OK: alert evaluated and did not
 * fulfill trigger conditions * TRIGGERED: alert evaluated and fulfilled trigger
 * conditions
 */
public enum SqlAlertState{
    OK,
    TRIGGERED,
    UNKNOWN,
    
}