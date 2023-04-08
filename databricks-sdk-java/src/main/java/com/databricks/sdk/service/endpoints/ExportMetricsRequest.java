// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

/**
 * Retrieve the metrics corresponding to a serving endpoint for the current time in Prometheus or
 * OpenMetrics exposition format
 */
public class ExportMetricsRequest {
  /** The name of the serving endpoint to retrieve metrics for. This field is required. */
  private String name;

  public ExportMetricsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
