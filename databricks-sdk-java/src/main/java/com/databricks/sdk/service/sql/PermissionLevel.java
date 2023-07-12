// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum PermissionLevel {
  @JsonProperty("CAN_MANAGE")
  CAN_MANAGE, // Can manage the query

  @JsonProperty("CAN_RUN")
  CAN_RUN, // Can run the query

  @JsonProperty("CAN_VIEW")
  CAN_VIEW, // Can view the query
}
