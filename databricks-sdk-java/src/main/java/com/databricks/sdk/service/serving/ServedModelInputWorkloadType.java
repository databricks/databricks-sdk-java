// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/** Please keep this in sync with with workload types in InferenceEndpointEntities.scala */
@Generated
public enum ServedModelInputWorkloadType {
  CPU,
  GPU_LARGE,
  GPU_MEDIUM,
  GPU_SMALL,
  MULTIGPU_MEDIUM,
}
