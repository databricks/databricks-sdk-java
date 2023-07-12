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
public enum ActivityType{
  APPLIED_TRANSITION,// User applied the corresponding stage transition.
  APPROVED_REQUEST,// User approved the corresponding stage transition.
  CANCELLED_REQUEST,// User cancelled an existing transition request.
  NEW_COMMENT,
  REJECTED_REQUEST,// User rejected the coressponding stage transition.
  REQUESTED_TRANSITION,// User requested the corresponding stage transition.
  SYSTEM_TRANSITION,// For events performed as a side effect, such as archiving existing model
// versions in a stage.
  
}