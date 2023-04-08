// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateComment {
  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Unique identifier of an activity */
  @JsonProperty("id")
  private String id;

  public UpdateComment setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateComment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
