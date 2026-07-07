// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/** Please keep this in sync with workload types in InferenceEndpointEntities.scala. */
@Generated
public enum ServingModelWorkloadType {
  CPU,
  CPU_LARGE,
  CPU_MEDIUM,
  GPU_LARGE,
  GPU_MEDIUM,
  GPU_SMALL,
  GPU_XLARGE,
  MULTIGPU_MEDIUM,
}
