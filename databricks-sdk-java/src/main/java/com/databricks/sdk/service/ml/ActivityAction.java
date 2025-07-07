// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * An action that a user (with sufficient permissions) could take on an activity or comment.
 *
 * <p>For activities, valid values are: * `APPROVE_TRANSITION_REQUEST`: Approve a transition request
 *
 * <p>* `REJECT_TRANSITION_REQUEST`: Reject a transition request
 *
 * <p>* `CANCEL_TRANSITION_REQUEST`: Cancel (delete) a transition request
 *
 * <p>For comments, valid values are: * `EDIT_COMMENT`: Edit the comment
 *
 * <p>* `DELETE_COMMENT`: Delete the comment
 */
@Generated
public enum ActivityAction {
  APPROVE_TRANSITION_REQUEST, // Approve a transition request
  CANCEL_TRANSITION_REQUEST, // Cancel (delete) a transition request
  DELETE_COMMENT, // Delete the comment
  EDIT_COMMENT, // Edit the comment
  REJECT_TRANSITION_REQUEST, // Reject a transition request
}
