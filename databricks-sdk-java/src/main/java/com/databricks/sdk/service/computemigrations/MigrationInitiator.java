// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The initiator of a migration, including their role and user identity. */
@Generated
public class MigrationInitiator {
  /**
   * The role of the initiator, determining approval authority. Set by the server: the role is
   * resolved from the caller's identity and permissions on the asset, never taken from the request,
   * since a caller must not be able to assert its own approval authority.
   */
  @JsonProperty("role")
  private MigrationInitiatorRole role;

  /** The user ID of the initiator. Set by the server from the request context. */
  @JsonProperty("user_id")
  private Long userId;

  public MigrationInitiator setRole(MigrationInitiatorRole role) {
    this.role = role;
    return this;
  }

  public MigrationInitiatorRole getRole() {
    return role;
  }

  public MigrationInitiator setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrationInitiator that = (MigrationInitiator) o;
    return Objects.equals(role, that.role) && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrationInitiator.class)
        .add("role", role)
        .add("userId", userId)
        .toString();
  }
}
