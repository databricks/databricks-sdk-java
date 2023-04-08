// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateResponse {
  /** Comment details. */
  @JsonProperty("comment")
  private CommentObject comment;

  public UpdateResponse setComment(CommentObject comment) {
    this.comment = comment;
    return this;
  }

  public CommentObject getComment() {
    return comment;
  }
}
