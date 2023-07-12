// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/** This describes an enum */
@Generated
public enum QueryStatus {
  CANCELED, // Query has been cancelled by the user.
  FAILED, // Query has failed.
  FINISHED, // Query has completed.
  QUEUED, // Query has been received and queued.
  RUNNING, // Query has started.
}
