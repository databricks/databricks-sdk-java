// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/** This describes an enum */
@Generated
public enum Status {
  FAILED_REGISTRATION, // Request to register a new model version has failed.
  PENDING_REGISTRATION, // Request to register a new model version is pending as server performs
  // background tasks.
  READY, // Model version is ready for use.
}
