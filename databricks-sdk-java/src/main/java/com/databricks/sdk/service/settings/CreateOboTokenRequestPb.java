// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration details for creating on-behalf tokens. */
@Generated
class CreateOboTokenRequestPb {
  @JsonProperty("application_id")
  private String applicationId;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("lifetime_seconds")
  private Long lifetimeSeconds;

  public CreateOboTokenRequestPb setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public CreateOboTokenRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateOboTokenRequestPb setLifetimeSeconds(Long lifetimeSeconds) {
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
    CreateOboTokenRequestPb that = (CreateOboTokenRequestPb) o;
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
    return new ToStringer(CreateOboTokenRequestPb.class)
        .add("applicationId", applicationId)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }
}
