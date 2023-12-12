// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * The workload type of the served model. The workload type selects which type of compute to use in
 * the endpoint. The default value for this parameter is "CPU". For deep learning workloads, GPU
 * acceleration is available by selecting workload types like GPU_SMALL and others. See the
 * available [GPU types].
 *
 * <p>[GPU types]:
 * https://docs.databricks.com/machine-learning/model-serving/create-manage-serving-endpoints.html#gpu-workload-types
 */
@Generated
public enum ServedModelInputWorkloadType {
  CPU,
  GPU_LARGE,
  GPU_MEDIUM,
  GPU_SMALL,
  MULTIGPU_MEDIUM,
}
