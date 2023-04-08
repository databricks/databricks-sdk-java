// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Security policy for warehouses
 */
public enum SetWorkspaceWarehouseConfigRequestSecurityPolicy{
    DATA_ACCESS_CONTROL,
    NONE,
    PASSTHROUGH,
    
}