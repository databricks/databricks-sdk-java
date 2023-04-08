// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class JobWebhookNotificationsOnSuccessItem {
  /** */
  @JsonProperty("id")
  private String id;

  public JobWebhookNotificationsOnSuccessItem setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobWebhookNotificationsOnSuccessItem that = (JobWebhookNotificationsOnSuccessItem) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(JobWebhookNotificationsOnSuccessItem.class).add("id", id).toString();
  }
}
