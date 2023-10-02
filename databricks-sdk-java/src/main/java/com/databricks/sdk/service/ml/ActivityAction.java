// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * An action that a user (with sufficient permissions) could take on an activity. Valid values are:
 * * `APPROVE_TRANSITION_REQUEST`: Approve a transition request
 *
 * <p>* `REJECT_TRANSITION_REQUEST`: Reject a transition request
 *
 * <p>* `CANCEL_TRANSITION_REQUEST`: Cancel (delete) a transition request
 */
@Generated
public enum ActivityAction {
  APPROVE_TRANSITION_REQUEST, // Approve a transition request
  CANCEL_TRANSITION_REQUEST, // Cancel (delete) a transition request
  REJECT_TRANSITION_REQUEST, // Reject a transition request
}
