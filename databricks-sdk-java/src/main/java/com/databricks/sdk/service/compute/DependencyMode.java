// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Controls dependency configuration for the cluster.
 *
 * <p>* `DEPENDENCY_MODE_AUTO`: Databricks will choose the most appropriate dependency mode based on
 * your compute configuration. * `DEPENDENCY_MODE_ENVIRONMENTS`: Enables a unified dependency
 * management experience across classic and serverless, resulting in increased stability and
 * performance. Supported only on DBR 19+ in Standard access mode. *
 * `DEPENDENCY_MODE_CLUSTER_LIBRARIES`: Legacy mode: dependencies come from cluster libraries and
 * init scripts.
 */
@Generated
public enum DependencyMode {
  DEPENDENCY_MODE_AUTO, // <Databricks> will choose the most appropriate dependency mode based on
  // your
  // compute configuration.
  DEPENDENCY_MODE_CLUSTER_LIBRARIES, // Legacy mode: dependencies come from cluster libraries and
  // init scripts.
  DEPENDENCY_MODE_ENVIRONMENTS, // Enables a unified dependency management experience across classic
  // and
  // serverless, resulting in increased stability and performance. Supported only
  // on DBR 19+ in Standard access mode.

}
