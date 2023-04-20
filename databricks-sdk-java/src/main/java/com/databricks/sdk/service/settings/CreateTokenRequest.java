// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public CreateTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTokenRequest that = (CreateTokenRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, lifetimeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenRequest.class)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }
}
