// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * When in synchronous mode with `wait_timeout > 0s` it determines the action
 * taken when the timeout is reached:
 * 
 * `CONTINUE` → the statement execution continues asynchronously and the call
 * returns a statement ID immediately.
 * 
 * `CANCEL` → the statement execution is canceled and the call returns
 * immediately with a `CANCELED` state.
 */
public enum TimeoutAction{
    CANCEL,
    CONTINUE,
    
}