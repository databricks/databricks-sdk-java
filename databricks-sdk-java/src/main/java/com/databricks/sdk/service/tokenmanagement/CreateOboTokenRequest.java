// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOboTokenRequest that = (CreateOboTokenRequest) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, comment, lifetimeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenRequest.class)
        .add("applicationId", applicationId)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }
}
