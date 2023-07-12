// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum ActivityType {
  @JsonProperty("APPLIED_TRANSITION")
  APPLIED_TRANSITION, // User applied the corresponding stage transition.

  @JsonProperty("APPROVED_REQUEST")
  APPROVED_REQUEST, // User approved the corresponding stage transition.

  @JsonProperty("CANCELLED_REQUEST")
  CANCELLED_REQUEST, // User cancelled an existing transition request.

  @JsonProperty("NEW_COMMENT")
  NEW_COMMENT,

  @JsonProperty("REJECTED_REQUEST")
  REJECTED_REQUEST, // User rejected the coressponding stage transition.

  @JsonProperty("REQUESTED_TRANSITION")
  REQUESTED_TRANSITION, // User requested the corresponding stage transition.

  @JsonProperty("SYSTEM_TRANSITION")
  SYSTEM_TRANSITION, // For events performed as a side effect, such as archiving existing model
  // versions in a stage.

}
