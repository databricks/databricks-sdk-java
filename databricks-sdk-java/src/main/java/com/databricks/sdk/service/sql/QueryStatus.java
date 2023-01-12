// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum QueryStatus{
    CANCELED,// Query has been cancelled by the user.
    FAILED,// Query has failed.
    FINISHED,// Query has completed.
    QUEUED,// Query has been received and queued.
    RUNNING,// Query has started.
    
}