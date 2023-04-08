// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute,
 * you must set to `PRO` and also set the field `enable_serverless_compute` to
 * `true`.
 */
public enum WarehouseType{
    CLASSIC,
    PRO,
    TYPE_UNSPECIFIED,
    
}