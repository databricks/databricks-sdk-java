// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cause of a change in target size. */
@Generated
public enum EventDetailsCause {
  @JsonProperty("AUTORECOVERY")
  AUTORECOVERY,

  @JsonProperty("AUTOSCALE")
  AUTOSCALE,

  @JsonProperty("REPLACE_BAD_NODES")
  REPLACE_BAD_NODES,

  @JsonProperty("USER_REQUEST")
  USER_REQUEST,
}
