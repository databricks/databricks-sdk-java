// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateInferenceEndpointNotificationsResponse {
  /** */
  @JsonProperty("email_notifications")
  private EmailNotifications emailNotifications;

  /** */
  @JsonProperty("name")
  private String name;

  public UpdateInferenceEndpointNotificationsResponse setEmailNotifications(
      EmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public EmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public UpdateInferenceEndpointNotificationsResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInferenceEndpointNotificationsResponse that =
        (UpdateInferenceEndpointNotificationsResponse) o;
    return Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailNotifications, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInferenceEndpointNotificationsResponse.class)
        .add("emailNotifications", emailNotifications)
        .add("name", name)
        .toString();
  }
}
