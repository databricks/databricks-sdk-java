// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A record of a state transition in the migration lifecycle. */
@Generated
public class MigrationStateTransition {
  /**
   * Free-text the service recorded for this transition — e.g. an internally-determined cancellation
   * or failure reason. Empty for user-driven transitions.
   */
  @JsonProperty("internal_comment")
  private String internalComment;

  /** The state that was entered. */
  @JsonProperty("state")
  private MigrationState state;

  /** Timestamp when this state was entered. */
  @JsonProperty("transition_time")
  private Timestamp transitionTime;

  /**
   * Free-text the initiating user supplied at a user-driven transition — reviewer feedback on an
   * approval, or the reason for a rejection or cancellation. Empty for transitions the service
   * drives internally.
   */
  @JsonProperty("user_comment")
  private String userComment;

  public MigrationStateTransition setInternalComment(String internalComment) {
    this.internalComment = internalComment;
    return this;
  }

  public String getInternalComment() {
    return internalComment;
  }

  public MigrationStateTransition setState(MigrationState state) {
    this.state = state;
    return this;
  }

  public MigrationState getState() {
    return state;
  }

  public MigrationStateTransition setTransitionTime(Timestamp transitionTime) {
    this.transitionTime = transitionTime;
    return this;
  }

  public Timestamp getTransitionTime() {
    return transitionTime;
  }

  public MigrationStateTransition setUserComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

  public String getUserComment() {
    return userComment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrationStateTransition that = (MigrationStateTransition) o;
    return Objects.equals(internalComment, that.internalComment)
        && Objects.equals(state, that.state)
        && Objects.equals(transitionTime, that.transitionTime)
        && Objects.equals(userComment, that.userComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalComment, state, transitionTime, userComment);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrationStateTransition.class)
        .add("internalComment", internalComment)
        .add("state", state)
        .add("transitionTime", transitionTime)
        .add("userComment", userComment)
        .toString();
  }
}
