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
 * Qualifier for type of experiments to be returned. If unspecified, return only
 * active experiments.
 */
@Generated
public enum SearchExperimentsViewType{
  ACTIVE_ONLY,
  ALL,
  DELETED_ONLY,
  
}