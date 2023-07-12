// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The permission level of the principal making the request. */
@Generated
public enum ServingEndpointDetailedPermissionLevel {
  @JsonProperty("CAN_MANAGE")
  CAN_MANAGE,

  @JsonProperty("CAN_QUERY")
  CAN_QUERY,

  @JsonProperty("CAN_VIEW")
  CAN_VIEW,
}
