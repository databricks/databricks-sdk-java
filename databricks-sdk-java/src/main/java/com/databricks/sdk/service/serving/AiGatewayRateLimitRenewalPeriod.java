// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Renewal period field for a rate limit. Currently, only 'minute' is supported. */
@Generated
public enum AiGatewayRateLimitRenewalPeriod {
  @JsonProperty("minute")
  MINUTE,
}
