// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Edit mode of the job.
 *
 * <p>* `UI_LOCKED`: The job is in a locked UI state and cannot be modified. * `EDITABLE`: The job
 * is in an editable state and can be modified.
 */
@Generated
public enum JobEditMode {
  EDITABLE, // The job is in an editable state and can be modified.
  UI_LOCKED, // The job is in a locked UI state and cannot be modified.
}
