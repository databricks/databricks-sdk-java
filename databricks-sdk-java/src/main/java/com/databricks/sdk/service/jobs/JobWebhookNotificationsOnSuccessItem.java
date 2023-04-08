// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
