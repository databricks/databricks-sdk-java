// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class UpdateComment {
  /**
   * User-provided comment on the action.
   */
  @JsonProperty("comment")
  private String comment;
  
  /**
   * Unique identifier of an activity
   */
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateComment that = (UpdateComment) o;
    return Objects.equals(comment, that.comment)
    && Objects.equals(id, that.id)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateComment.class)
      .add("comment", comment)
      .add("id", id).toString();
  }
}
