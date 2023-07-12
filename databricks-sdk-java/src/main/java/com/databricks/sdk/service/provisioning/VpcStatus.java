// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum VpcStatus {
  @JsonProperty("BROKEN")
  BROKEN, // Broken.

  @JsonProperty("UNATTACHED")
  UNATTACHED, // Unattached.

  @JsonProperty("VALID")
  VALID, // Valid.

  @JsonProperty("WARNED")
  WARNED, // Warned.
}
