// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOboTokenRequest {
  /** Application ID of the service principal. */
  @JsonProperty("application_id")
  private String applicationId;

  /** Comment that describes the purpose of the token. */
  @JsonProperty("comment")
  private String comment;

  /** The number of seconds before the token expires. */
  @JsonProperty("lifetime_seconds")
  private Long lifetimeSeconds;

  public CreateOboTokenRequest setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public CreateOboTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateOboTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }
}
