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
 * Determines whether the cluster was created by a user through the UI, created
 * by the Databricks Jobs Scheduler, or through an API request. This is the same
 * as cluster_creator, but read only.
 */
@Generated
public enum ClusterSource{
  API,
  JOB,
  MODELS,
  PIPELINE,
  PIPELINE_MAINTENANCE,
  SQL,
  UI,
  
}