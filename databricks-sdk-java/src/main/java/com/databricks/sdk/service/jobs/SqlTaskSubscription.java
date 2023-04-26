// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlTaskSubscription class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlTaskSubscription {
  /** The canonical identifier of the destination to receive email notification. */
  @JsonProperty("destination_id")
  private String destinationId;

  /** The user name to receive the subscription email. */
  @JsonProperty("user_name")
  private String userName;

  /**
   * <p>Setter for the field <code>destinationId</code>.</p>
   *
   * @param destinationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskSubscription} object
   */
  public SqlTaskSubscription setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>destinationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDestinationId() {
    return destinationId;
  }

  /**
   * <p>Setter for the field <code>userName</code>.</p>
   *
   * @param userName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskSubscription} object
   */
  public SqlTaskSubscription setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <p>Getter for the field <code>userName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserName() {
    return userName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskSubscription that = (SqlTaskSubscription) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlTaskSubscription.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }
}
