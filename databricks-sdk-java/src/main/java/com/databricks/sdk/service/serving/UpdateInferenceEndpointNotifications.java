// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateInferenceEndpointNotifications {
  /**
   * The email notification settings to update. Specify email addresses to notify when endpoint
   * state changes occur.
   */
  @JsonProperty("email_notifications")
  private EmailNotifications emailNotifications;

  /**
   * The name of the serving endpoint whose notifications are being updated. This field is required.
   */
  @JsonIgnore private String name;

  public UpdateInferenceEndpointNotifications setEmailNotifications(
      EmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public EmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public UpdateInferenceEndpointNotifications setName(String name) {
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
    UpdateInferenceEndpointNotifications that = (UpdateInferenceEndpointNotifications) o;
    return Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailNotifications, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInferenceEndpointNotifications.class)
        .add("emailNotifications", emailNotifications)
        .add("name", name)
        .toString();
  }
}
