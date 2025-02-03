// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum ServedModelStateDeployment {
  @JsonProperty("DEPLOYMENT_ABORTED")
  ABORTED,

  @JsonProperty("DEPLOYMENT_CREATING")
  CREATING,

  @JsonProperty("DEPLOYMENT_FAILED")
  FAILED,

  @JsonProperty("DEPLOYMENT_READY")
  READY,

  @JsonProperty("DEPLOYMENT_RECOVERING")
  RECOVERING,
}
