// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Determines the cluster's runtime engine, either standard or Photon.
 *
 * <p>This field is not compatible with legacy `spark_version` values that contain `-photon-`.
 * Remove `-photon-` from the `spark_version` and set `runtime_engine` to `PHOTON`.
 *
 * <p>If left unspecified, the runtime engine defaults to standard unless the spark_version contains
 * -photon-, in which case Photon will be used.
 */
@Generated
public enum RuntimeEngine {
  NULL,
  PHOTON,
  STANDARD,
}
