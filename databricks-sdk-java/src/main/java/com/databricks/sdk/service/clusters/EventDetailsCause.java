// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The cause of a change in target size.
 */
public enum EventDetailsCause{
    AUTORECOVERY,
    AUTOSCALE,
    REPLACE_BAD_NODES,
    USER_REQUEST,
    
}