// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
public enum Status{
  FAILED_REGISTRATION,// Request to register a new model version has failed.
  PENDING_REGISTRATION,// Request to register a new model version is pending as server performs
// background tasks.
  READY,// Model version is ready for use.
  
}