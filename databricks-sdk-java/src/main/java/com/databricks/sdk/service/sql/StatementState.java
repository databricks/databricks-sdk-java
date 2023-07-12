// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Statement execution state: - `PENDING`: waiting for warehouse - `RUNNING`:
 * running - `SUCCEEDED`: execution was successful, result data available for
 * fetch - `FAILED`: execution failed; reason for failure described in
 * accomanying error message - `CANCELED`: user canceled; can come from explicit
 * cancel call, or timeout with `on_wait_timeout=CANCEL` - `CLOSED`: execution
 * successful, and statement closed; result no longer available for fetch
 */
@Generated
public enum StatementState{
  CANCELED,
  CLOSED,
  FAILED,
  PENDING,
  RUNNING,
  SUCCEEDED,
  
}