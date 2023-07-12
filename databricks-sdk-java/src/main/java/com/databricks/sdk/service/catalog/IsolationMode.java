// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether the current securable is accessible from all workspaces or a specific set of workspaces.
 */
@Generated
public enum IsolationMode {
  @JsonProperty("ISOLATED")
  ISOLATED,

  @JsonProperty("OPEN")
  OPEN,
}
