// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The singular form of the type of object which can be owned. */
@Generated
public enum OwnableObjectType {
  @JsonProperty("alert")
  ALERT,

  @JsonProperty("dashboard")
  DASHBOARD,

  @JsonProperty("query")
  QUERY,
}
