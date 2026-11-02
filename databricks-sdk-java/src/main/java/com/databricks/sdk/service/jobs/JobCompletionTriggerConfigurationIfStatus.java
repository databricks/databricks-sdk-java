// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/** The status that all upstream jobs must have before a job completion trigger fires. */
@Generated
public enum JobCompletionTriggerConfigurationIfStatus {
  DONE,
  FAILED,
  SUCCESS,
}
