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
 * The cause of a change in target size.
 */
@Generated
public enum EventDetailsCause{
  AUTORECOVERY,
  AUTOSCALE,
  REPLACE_BAD_NODES,
  USER_REQUEST,
  
}