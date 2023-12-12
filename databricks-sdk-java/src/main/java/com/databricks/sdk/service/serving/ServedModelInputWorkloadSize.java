// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workload size of the served model. The workload size corresponds to a range of provisioned
 * concurrency that the compute will autoscale between. A single unit of provisioned concurrency can
 * process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned concurrency),
 * "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned concurrency). If
 * scale-to-zero is enabled, the lower bound of the provisioned concurrency for each workload size
 * will be 0.
 */
@Generated
public enum ServedModelInputWorkloadSize {
  @JsonProperty("Large")
  LARGE,

  @JsonProperty("Medium")
  MEDIUM,

  @JsonProperty("Small")
  SMALL,
}
