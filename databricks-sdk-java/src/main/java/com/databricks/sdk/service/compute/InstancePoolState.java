// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Current state of the instance pool. */
@Generated
public enum InstancePoolState {
  @JsonProperty("ACTIVE")
  ACTIVE,

  @JsonProperty("DELETED")
  DELETED,

  @JsonProperty("STOPPED")
  STOPPED,
}
