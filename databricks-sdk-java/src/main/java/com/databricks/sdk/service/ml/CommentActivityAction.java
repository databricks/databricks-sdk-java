// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * An action that a user (with sufficient permissions) could take on a comment. Valid values are: *
 * `EDIT_COMMENT`: Edit the comment
 *
 * <p>* `DELETE_COMMENT`: Delete the comment
 */
@Generated
public enum CommentActivityAction {
  DELETE_COMMENT, // Delete the comment
  EDIT_COMMENT, // Edit the comment
}
