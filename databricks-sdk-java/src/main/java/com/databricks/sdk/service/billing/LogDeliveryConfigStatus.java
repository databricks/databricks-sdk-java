// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
 * Defaults to `ENABLED`. You can [enable or disable the
 * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration is
 * not supported, so disable a log delivery configuration that is no longer needed.
 */
@Generated
public enum LogDeliveryConfigStatus {
  @JsonProperty("DISABLED")
  DISABLED,

  @JsonProperty("ENABLED")
  ENABLED,
}
