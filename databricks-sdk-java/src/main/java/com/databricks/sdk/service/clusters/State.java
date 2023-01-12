// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Current state of the cluster.
 */
public enum State{
    ERROR,
    PENDING,
    RESIZING,
    RESTARTING,
    RUNNING,
    TERMINATED,
    TERMINATING,
    UNKNOWN,
    
}