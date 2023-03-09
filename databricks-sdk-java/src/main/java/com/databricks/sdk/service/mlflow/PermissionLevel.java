// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Permission level of the requesting user on the object. For what is allowed at
 * each level, see [MLflow Model permissions](..).
 */
public enum PermissionLevel{
    CAN_EDIT,
    CAN_MANAGE,
    CAN_MANAGE_PRODUCTION_VERSIONS,
    CAN_MANAGE_STAGING_VERSIONS,
    CAN_READ,
    
}