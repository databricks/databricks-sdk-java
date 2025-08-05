// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EmailNotifications {
  /**
   * A list of email addresses to be notified when an endpoint fails to update its configuration or
   * state.
   */
  @JsonProperty("on_update_failure")
  private Collection<String> onUpdateFailure;

  /**
   * A list of email addresses to be notified when an endpoint successfully updates its
   * configuration or state.
   */
  @JsonProperty("on_update_success")
  private Collection<String> onUpdateSuccess;

  public EmailNotifications setOnUpdateFailure(Collection<String> onUpdateFailure) {
    this.onUpdateFailure = onUpdateFailure;
    return this;
  }

  public Collection<String> getOnUpdateFailure() {
    return onUpdateFailure;
  }

  public EmailNotifications setOnUpdateSuccess(Collection<String> onUpdateSuccess) {
    this.onUpdateSuccess = onUpdateSuccess;
    return this;
  }

  public Collection<String> getOnUpdateSuccess() {
    return onUpdateSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmailNotifications that = (EmailNotifications) o;
    return Objects.equals(onUpdateFailure, that.onUpdateFailure)
        && Objects.equals(onUpdateSuccess, that.onUpdateSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onUpdateFailure, onUpdateSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(EmailNotifications.class)
        .add("onUpdateFailure", onUpdateFailure)
        .add("onUpdateSuccess", onUpdateSuccess)
        .toString();
  }
}
