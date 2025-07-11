// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * The status of the model version. Valid values are: * `PENDING_REGISTRATION`: Request to register
 * a new model version is pending as server performs background tasks.
 *
 * <p>* `FAILED_REGISTRATION`: Request to register a new model version has failed.
 *
 * <p>* `READY`: Model version is ready for use.
 */
@Generated
public enum ModelVersionStatus {
  FAILED_REGISTRATION, // Request to register a new model version has failed.
  PENDING_REGISTRATION, // Request to register a new model version is pending as server performs
  // background tasks.
  READY, // Model version is ready for use.
}
