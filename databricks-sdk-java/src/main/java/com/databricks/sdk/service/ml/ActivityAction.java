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
public enum ActivityAction{
  APPROVE_TRANSITION_REQUEST,// Approve a transition request
  CANCEL_TRANSITION_REQUEST,// Cancel (delete) a transition request
  REJECT_TRANSITION_REQUEST,// Reject a transition request
  
}