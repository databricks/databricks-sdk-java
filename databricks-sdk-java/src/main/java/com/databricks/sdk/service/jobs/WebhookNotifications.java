// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class WebhookNotifications {
  /**
   * An optional list of system notification IDs to call when the run fails. A
   * maximum of 3 destinations can be specified for the `on_failure` property.
   */
  @JsonProperty("on_failure")
  private Collection<Webhook> onFailure;
  
  /**
   * An optional list of system notification IDs to call when the run starts. A
   * maximum of 3 destinations can be specified for the `on_start` property.
   */
  @JsonProperty("on_start")
  private Collection<Webhook> onStart;
  
  /**
   * An optional list of system notification IDs to call when the run completes
   * successfully. A maximum of 3 destinations can be specified for the
   * `on_success` property.
   */
  @JsonProperty("on_success")
  private Collection<Webhook> onSuccess;
  
  public WebhookNotifications setOnFailure(Collection<Webhook> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<Webhook> getOnFailure() {
    return onFailure;
  }
  
  public WebhookNotifications setOnStart(Collection<Webhook> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<Webhook> getOnStart() {
    return onStart;
  }
  
  public WebhookNotifications setOnSuccess(Collection<Webhook> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public Collection<Webhook> getOnSuccess() {
    return onSuccess;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookNotifications that = (WebhookNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
    && Objects.equals(onStart, that.onStart)
    && Objects.equals(onSuccess, that.onSuccess)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onStart, onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(WebhookNotifications.class)
      .add("onFailure", onFailure)
      .add("onStart", onStart)
      .add("onSuccess", onSuccess).toString();
  }
}
