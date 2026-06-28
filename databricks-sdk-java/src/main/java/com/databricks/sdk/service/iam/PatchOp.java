// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of patch operation. */
@Generated
public enum PatchOp {
  @JsonProperty("add")
  ADD,

  @JsonProperty("remove")
  REMOVE,

  @JsonProperty("replace")
  REPLACE,
}
