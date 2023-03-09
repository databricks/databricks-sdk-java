// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * State of the alert. Possible values are: `unknown` (yet to be evaluated),
 * `triggered` (evaluated and fulfilled trigger conditions), or `ok` (evaluated
 * and did not fulfill trigger conditions).
 */
public enum AlertState{
    ok,
    triggered,
    unknown,
    
}