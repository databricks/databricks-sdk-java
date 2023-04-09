// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/**
 * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
 * Defaults to `ENABLED`. You can [enable or disable the
 * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration is
 * not supported, so disable a log delivery configuration that is no longer needed.
 */
public enum LogDeliveryConfigStatus {
  DISABLED,
  ENABLED,
}
