// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Status of installing the library on the cluster. */
@Generated
public enum LibraryFullStatusStatus {
  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("INSTALLED")
  INSTALLED,

  @JsonProperty("INSTALLING")
  INSTALLING,

  @JsonProperty("PENDING")
  PENDING,

  @JsonProperty("RESOLVING")
  RESOLVING,

  @JsonProperty("SKIPPED")
  SKIPPED,

  @JsonProperty("UNINSTALL_ON_RESTART")
  UNINSTALL_ON_RESTART,
}
