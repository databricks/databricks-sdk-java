// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Status of installing the library on the cluster.
 */
public enum LibraryFullStatusStatus{
    FAILED,
    INSTALLED,
    INSTALLING,
    PENDING,
    RESOLVING,
    SKIPPED,
    UNINSTALL_ON_RESTART,
    
}