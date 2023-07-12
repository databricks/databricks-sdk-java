// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Whether auto maintenance should be enabled for this object and objects under it. */
@Generated
public enum EnableAutoMaintenance {
  @JsonProperty("DISABLE")
  DISABLE,

  @JsonProperty("ENABLE")
  ENABLE,

  @JsonProperty("INHERIT")
  INHERIT,
}
