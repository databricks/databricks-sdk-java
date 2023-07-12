// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum ActivityAction {
  @JsonProperty("APPROVE_TRANSITION_REQUEST")
  APPROVE_TRANSITION_REQUEST, // Approve a transition request

  @JsonProperty("CANCEL_TRANSITION_REQUEST")
  CANCEL_TRANSITION_REQUEST, // Cancel (delete) a transition request

  @JsonProperty("REJECT_TRANSITION_REQUEST")
  REJECT_TRANSITION_REQUEST, // Reject a transition request
}
