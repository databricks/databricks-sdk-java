// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * Query status with one the following values: * `QUEUED`: Query has been received and queued. *
 * `RUNNING`: Query has started. * `CANCELED`: Query has been cancelled by the user. * `FAILED`:
 * Query has failed. * `FINISHED`: Query has completed.
 */
@Generated
public enum QueryStatus {
  CANCELED, // Query has been cancelled by the user.
  FAILED, // Query has failed.
  FINISHED, // Query has completed.
  QUEUED, // Query has been received and queued.
  RUNNING, // Query has started.
}
