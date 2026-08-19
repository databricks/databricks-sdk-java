// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * A telemetry signal that a serving endpoint can export to Unity Catalog. Use these values to
 * select which signals the endpoint exports.
 */
@Generated
public enum TelemetryFeature {
  TELEMETRY_FEATURE_INFERENCE_TABLE,
  TELEMETRY_FEATURE_LOGS,
  TELEMETRY_FEATURE_METRICS,
  TELEMETRY_FEATURE_TRACES,
}
