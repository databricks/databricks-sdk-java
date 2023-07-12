// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum CommentActivityAction {
  @JsonProperty("DELETE_COMMENT")
  DELETE_COMMENT, // Delete the comment

  @JsonProperty("EDIT_COMMENT")
  EDIT_COMMENT, // Edit the comment
}
