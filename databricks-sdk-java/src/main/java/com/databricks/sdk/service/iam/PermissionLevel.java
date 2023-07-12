// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Permission level */
@Generated
public enum PermissionLevel {
  @JsonProperty("CAN_ATTACH_TO")
  CAN_ATTACH_TO,

  @JsonProperty("CAN_BIND")
  CAN_BIND,

  @JsonProperty("CAN_EDIT")
  CAN_EDIT,

  @JsonProperty("CAN_EDIT_METADATA")
  CAN_EDIT_METADATA,

  @JsonProperty("CAN_MANAGE")
  CAN_MANAGE,

  @JsonProperty("CAN_MANAGE_PRODUCTION_VERSIONS")
  CAN_MANAGE_PRODUCTION_VERSIONS,

  @JsonProperty("CAN_MANAGE_RUN")
  CAN_MANAGE_RUN,

  @JsonProperty("CAN_MANAGE_STAGING_VERSIONS")
  CAN_MANAGE_STAGING_VERSIONS,

  @JsonProperty("CAN_READ")
  CAN_READ,

  @JsonProperty("CAN_RESTART")
  CAN_RESTART,

  @JsonProperty("CAN_RUN")
  CAN_RUN,

  @JsonProperty("CAN_USE")
  CAN_USE,

  @JsonProperty("CAN_VIEW")
  CAN_VIEW,

  @JsonProperty("CAN_VIEW_METADATA")
  CAN_VIEW_METADATA,

  @JsonProperty("IS_OWNER")
  IS_OWNER,
}
