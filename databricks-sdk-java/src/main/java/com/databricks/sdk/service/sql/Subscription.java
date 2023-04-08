// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subscription {
  /** ID of the alert. */
  @JsonProperty("alert_id")
  private String alertId;

  /**
   * Alert destination subscribed to the alert, if it exists. Alert destinations can be configured
   * by admins through the UI. See [here].
   *
   * <p>[here]: https://docs.databricks.com/sql/admin/alert-destinations.html
   */
  @JsonProperty("destination")
  private Destination destination;

  /** ID of the alert subscription. */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("user")
  private User user;

  public Subscription setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public Subscription setDestination(Destination destination) {
    this.destination = destination;
    return this;
  }

  public Destination getDestination() {
    return destination;
  }

  public Subscription setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Subscription setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }
}
