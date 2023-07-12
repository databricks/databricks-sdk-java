// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Current status of `model_version` */
@Generated
public enum ModelVersionStatus {
  @JsonProperty("FAILED_REGISTRATION")
  FAILED_REGISTRATION,

  @JsonProperty("PENDING_REGISTRATION")
  PENDING_REGISTRATION,

  @JsonProperty("READY")
  READY,
}
