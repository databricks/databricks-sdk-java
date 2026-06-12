// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * An action that a user (with sufficient permissions) could take on an activity or comment.
 *
 * <p>For activities, valid values are:
 *
 * <ul>
 *   <li>{@code APPROVE_TRANSITION_REQUEST}: Approve a transition request
 *   <li>{@code REJECT_TRANSITION_REQUEST}: Reject a transition request
 *   <li>{@code CANCEL_TRANSITION_REQUEST}: Cancel (delete) a transition request
 * </ul>
 *
 * <p>For comments, valid values are:
 *
 * <ul>
 *   <li>{@code EDIT_COMMENT}: Edit the comment
 *   <li>{@code DELETE_COMMENT}: Delete the comment
 * </ul>
 */
@Generated
public enum CommentActivityAction {
  APPROVE_TRANSITION_REQUEST, // Approve a transition request
  CANCEL_TRANSITION_REQUEST, // Cancel (delete) a transition request
  DELETE_COMMENT, // Delete the comment
  EDIT_COMMENT, // Edit the comment
  REJECT_TRANSITION_REQUEST, // Reject a transition request
}
