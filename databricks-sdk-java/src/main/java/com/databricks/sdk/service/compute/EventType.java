// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum EventType {
  @JsonProperty("AUTOSCALING_STATS_REPORT")
  AUTOSCALING_STATS_REPORT,

  @JsonProperty("CREATING")
  CREATING,

  @JsonProperty("DBFS_DOWN")
  DBFS_DOWN,

  @JsonProperty("DID_NOT_EXPAND_DISK")
  DID_NOT_EXPAND_DISK,

  @JsonProperty("DRIVER_HEALTHY")
  DRIVER_HEALTHY,

  @JsonProperty("DRIVER_NOT_RESPONDING")
  DRIVER_NOT_RESPONDING,

  @JsonProperty("DRIVER_UNAVAILABLE")
  DRIVER_UNAVAILABLE,

  @JsonProperty("EDITED")
  EDITED,

  @JsonProperty("EXPANDED_DISK")
  EXPANDED_DISK,

  @JsonProperty("FAILED_TO_EXPAND_DISK")
  FAILED_TO_EXPAND_DISK,

  @JsonProperty("INIT_SCRIPTS_FINISHED")
  INIT_SCRIPTS_FINISHED,

  @JsonProperty("INIT_SCRIPTS_STARTED")
  INIT_SCRIPTS_STARTED,

  @JsonProperty("METASTORE_DOWN")
  METASTORE_DOWN,

  @JsonProperty("NODE_BLACKLISTED")
  NODE_BLACKLISTED,

  @JsonProperty("NODE_EXCLUDED_DECOMMISSIONED")
  NODE_EXCLUDED_DECOMMISSIONED,

  @JsonProperty("NODES_LOST")
  NODES_LOST,

  @JsonProperty("PINNED")
  PINNED,

  @JsonProperty("RESIZING")
  RESIZING,

  @JsonProperty("RESTARTING")
  RESTARTING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("SPARK_EXCEPTION")
  SPARK_EXCEPTION,

  @JsonProperty("STARTING")
  STARTING,

  @JsonProperty("TERMINATING")
  TERMINATING,

  @JsonProperty("UNPINNED")
  UNPINNED,

  @JsonProperty("UPSIZE_COMPLETED")
  UPSIZE_COMPLETED,
}
