// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * State of the job in UI.
 *
 * <p>* `LOCKED`: The job is in a locked state and cannot be modified. * `EDITABLE`: The job is in
 * an editable state and can be modified.
 */
@Generated
public enum JobSettingsUiState {
  EDITABLE, // The job is in an editable state and can be modified.
  LOCKED, // The job is in a locked state and cannot be modified.
}
