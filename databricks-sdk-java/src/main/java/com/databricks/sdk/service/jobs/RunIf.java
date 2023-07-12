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
 * This describes an enum
 */
@Generated
public enum RunIf{
  ALL_DONE,// All dependencies completed and at least one was executed
  ALL_FAILED,// ALl dependencies have failed
  ALL_SUCCESS,// All dependencies have executed and succeeded
  AT_LEAST_ONE_FAILED,// At least one dependency failed
  AT_LEAST_ONE_SUCCESS,// At least one dependency has succeeded
  NONE_FAILED,// None of the dependencies have failed and at least one was executed
  
}