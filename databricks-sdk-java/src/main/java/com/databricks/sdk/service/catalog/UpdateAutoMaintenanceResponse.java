// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateAutoMaintenanceResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateAutoMaintenanceResponse {
  /** Whether auto maintenance is enabled on the metastore. */
  @JsonProperty("state")
  private Boolean state;

  /**
   * Id of the auto maintenance service principal. This will be the user used to run maintenance
   * tasks.
   */
  @JsonProperty("user_id")
  private Long userId;

  /** Name of the auto maintenance service principal. */
  @JsonProperty("username")
  private String username;

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  public UpdateAutoMaintenanceResponse setState(Boolean state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  public UpdateAutoMaintenanceResponse setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUserId() {
    return userId;
  }

  /**
   * <p>Setter for the field <code>username</code>.</p>
   *
   * @param username a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  public UpdateAutoMaintenanceResponse setUsername(String username) {
    this.username = username;
    return this;
  }

  /**
   * <p>Getter for the field <code>username</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUsername() {
    return username;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAutoMaintenanceResponse that = (UpdateAutoMaintenanceResponse) o;
    return Objects.equals(state, that.state)
        && Objects.equals(userId, that.userId)
        && Objects.equals(username, that.username);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(state, userId, username);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateAutoMaintenanceResponse.class)
        .add("state", state)
        .add("userId", userId)
        .add("username", username)
        .toString();
  }
}
