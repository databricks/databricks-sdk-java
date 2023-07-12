// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * type of the termination
 */
@Generated
public enum TerminationReasonType{
  CLIENT_ERROR,
  CLOUD_FAILURE,
  SERVICE_FAULT,
  SUCCESS,
  
}