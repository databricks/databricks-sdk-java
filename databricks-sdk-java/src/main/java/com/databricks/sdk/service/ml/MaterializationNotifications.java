// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Notifications for the jobs and pipelines that materialize a feature, one field per trigger. */
@Generated
public class MaterializationNotifications {
  /** Who to notify when a run fails, and on which attempts. */
  @JsonProperty("on_failure")
  private MaterializationFailureNotification onFailure;

  /** Who to notify when a run succeeds. */
  @JsonProperty("on_success")
  private MaterializationSuccessNotification onSuccess;

  public MaterializationNotifications setOnFailure(MaterializationFailureNotification onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public MaterializationFailureNotification getOnFailure() {
    return onFailure;
  }

  public MaterializationNotifications setOnSuccess(MaterializationSuccessNotification onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public MaterializationSuccessNotification getOnSuccess() {
    return onSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationNotifications that = (MaterializationNotifications) o;
    return Objects.equals(onFailure, that.onFailure) && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationNotifications.class)
        .add("onFailure", onFailure)
        .add("onSuccess", onSuccess)
        .toString();
  }
}
