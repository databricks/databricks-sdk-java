// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Comment details.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CommentObject {
  /** Array of actions on the activity allowed for the current viewer. */
  @JsonProperty("available_actions")
  private Collection<CommentActivityAction> availableActions;

  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** Comment ID */
  @JsonProperty("id")
  private String id;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  /**
   * <p>Setter for the field <code>availableActions</code>.</p>
   *
   * @param availableActions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setAvailableActions(Collection<CommentActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  /**
   * <p>Getter for the field <code>availableActions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<CommentActivityAction> getAvailableActions() {
    return availableActions;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setComment(String comment) {
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
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setId(String id) {
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

  /**
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserId() {
    return userId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentObject that = (CommentObject) o;
    return Objects.equals(availableActions, that.availableActions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(userId, that.userId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        availableActions, comment, creationTimestamp, id, lastUpdatedTimestamp, userId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CommentObject.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("userId", userId)
        .toString();
  }
}
