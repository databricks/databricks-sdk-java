// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Permission level of the requesting user on the object. For what is allowed at
 * each level, see [MLflow Model permissions](..).
 */
@Generated
public enum PermissionLevel{
  CAN_EDIT,
  CAN_MANAGE,
  CAN_MANAGE_PRODUCTION_VERSIONS,
  CAN_MANAGE_STAGING_VERSIONS,
  CAN_READ,
  
}