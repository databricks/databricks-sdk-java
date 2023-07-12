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
 * This describes an enum
 */
@Generated
public enum QueryStatus{
  CANCELED,// Query has been cancelled by the user.
  FAILED,// Query has failed.
  FINISHED,// Query has completed.
  QUEUED,// Query has been received and queued.
  RUNNING,// Query has started.
  
}