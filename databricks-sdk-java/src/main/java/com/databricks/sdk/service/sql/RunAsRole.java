// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
 * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
 */
@Generated
public enum RunAsRole {
  @JsonProperty("owner")
  OWNER,

  @JsonProperty("viewer")
  VIEWER,
}
