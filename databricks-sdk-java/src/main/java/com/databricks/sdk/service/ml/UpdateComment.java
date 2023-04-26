// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateComment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateComment {
  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Unique identifier of an activity */
  @JsonProperty("id")
  private String id;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateComment} object
   */
  public UpdateComment setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateComment} object
   */
  public UpdateComment setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateComment that = (UpdateComment) o;
    return Objects.equals(comment, that.comment) && Objects.equals(id, that.id);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, id);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateComment.class).add("comment", comment).add("id", id).toString();
  }
}
