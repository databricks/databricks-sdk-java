// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Permission level of the requesting user on the object. For what is allowed at each level, see
 * [MLflow Model permissions](..).
 */
@Generated
public enum PermissionLevel {
  @JsonProperty("CAN_EDIT")
  CAN_EDIT,

  @JsonProperty("CAN_MANAGE")
  CAN_MANAGE,

  @JsonProperty("CAN_MANAGE_PRODUCTION_VERSIONS")
  CAN_MANAGE_PRODUCTION_VERSIONS,

  @JsonProperty("CAN_MANAGE_STAGING_VERSIONS")
  CAN_MANAGE_STAGING_VERSIONS,

  @JsonProperty("CAN_READ")
  CAN_READ,
}
