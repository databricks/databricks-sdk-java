// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * The execution status of the SQL widget.
 */
@Generated
public enum SqlDashboardWidgetOutputStatus{
  CANCELLED,
  FAILED,
  PENDING,
  RUNNING,
  SUCCESS,
  
}