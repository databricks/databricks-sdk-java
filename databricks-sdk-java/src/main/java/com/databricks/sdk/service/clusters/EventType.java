// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public enum EventType{
    AUTOSCALING_STATS_REPORT,
    CREATING,
    DBFS_DOWN,
    DID_NOT_EXPAND_DISK,
    DRIVER_HEALTHY,
    DRIVER_NOT_RESPONDING,
    DRIVER_UNAVAILABLE,
    EDITED,
    EXPANDED_DISK,
    FAILED_TO_EXPAND_DISK,
    INIT_SCRIPTS_FINISHED,
    INIT_SCRIPTS_STARTED,
    METASTORE_DOWN,
    NODE_BLACKLISTED,
    NODE_EXCLUDED_DECOMMISSIONED,
    NODES_LOST,
    PINNED,
    RESIZING,
    RESTARTING,
    RUNNING,
    SPARK_EXCEPTION,
    STARTING,
    TERMINATING,
    UNPINNED,
    UPSIZE_COMPLETED,
    
}