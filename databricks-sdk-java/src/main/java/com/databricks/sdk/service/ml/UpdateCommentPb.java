// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateCommentPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("id")
  private String id;

  public UpdateCommentPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCommentPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCommentPb that = (UpdateCommentPb) o;
    return Objects.equals(comment, that.comment) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCommentPb.class).add("comment", comment).add("id", id).toString();
  }
}
