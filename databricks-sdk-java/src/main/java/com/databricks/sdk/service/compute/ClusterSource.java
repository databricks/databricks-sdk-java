// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Determines whether the cluster was created by a user through the UI, created by the Databricks
 * Jobs Scheduler, or through an API request. This is the same as cluster_creator, but read only.
 */
@Generated
public enum ClusterSource {
  API,
  JOB,
  MODELS,
  PIPELINE,
  PIPELINE_MAINTENANCE,
  SQL,
  UI,
}
