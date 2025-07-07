// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum AiGatewayRateLimitKey {
  @JsonProperty("endpoint")
  ENDPOINT,

  @JsonProperty("service_principal")
  SERVICE_PRINCIPAL,

  @JsonProperty("user")
  USER,

  @JsonProperty("user_group")
  USER_GROUP,
}
