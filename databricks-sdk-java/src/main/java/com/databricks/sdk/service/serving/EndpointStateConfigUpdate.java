// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of an endpoint's config update. This informs the user if the pending_config is in
 * progress, if the update failed, or if there is no update in progress. Note that if the endpoint's
 * config_update state value is IN_PROGRESS, another update can not be made until the update
 * completes or fails."
 */
@Generated
public enum EndpointStateConfigUpdate {
  @JsonProperty("IN_PROGRESS")
  IN_PROGRESS,

  @JsonProperty("NOT_UPDATING")
  NOT_UPDATING,

  @JsonProperty("UPDATE_FAILED")
  UPDATE_FAILED,
}
