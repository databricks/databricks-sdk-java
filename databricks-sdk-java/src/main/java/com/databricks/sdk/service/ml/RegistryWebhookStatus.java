// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum RegistryWebhookStatus {
  @JsonProperty("ACTIVE")
  ACTIVE, // Webhook is triggered when an associated event happens.

  @JsonProperty("DISABLED")
  DISABLED, // Webhook is not triggered.

  @JsonProperty("TEST_MODE")
  TEST_MODE, // Webhook can be triggered through the test endpoint, but is not triggered on a
  // real event.

}
