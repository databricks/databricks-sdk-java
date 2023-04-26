// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateTokenRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateTokenRequest {
  /** Optional description to attach to the token. */
  @JsonProperty("comment")
  private String comment;

  /**
   * The lifetime of the token, in seconds.
   *
   * <p>If the ifetime is not specified, this token remains valid indefinitely.
   */
  @JsonProperty("lifetime_seconds")
  private Long lifetimeSeconds;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.CreateTokenRequest} object
   */
  public CreateTokenRequest setComment(String comment) {
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
   * <p>Setter for the field <code>lifetimeSeconds</code>.</p>
   *
   * @param lifetimeSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.CreateTokenRequest} object
   */
  public CreateTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>lifetimeSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTokenRequest that = (CreateTokenRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, lifetimeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateTokenRequest.class)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }
}
