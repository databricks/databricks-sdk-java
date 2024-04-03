// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key field for a serving endpoint rate limit. Currently, only 'user' and 'endpoint' are supported,
 * with 'endpoint' being the default if not specified.
 */
@Generated
public enum RateLimitKey {
  @JsonProperty("endpoint")
  ENDPOINT,

  @JsonProperty("user")
  USER,
}
