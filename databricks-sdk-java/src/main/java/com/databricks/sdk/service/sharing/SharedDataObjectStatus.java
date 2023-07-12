// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** One of: **ACTIVE**, **PERMISSION_DENIED**. */
@Generated
public enum SharedDataObjectStatus {
  @JsonProperty("ACTIVE")
  ACTIVE,

  @JsonProperty("PERMISSION_DENIED")
  PERMISSION_DENIED,
}
