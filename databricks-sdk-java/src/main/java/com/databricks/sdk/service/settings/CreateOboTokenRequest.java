// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Configuration details for creating on-behalf tokens. */
@Generated
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

  /** */
  @JsonProperty("scopes")
  private Collection<String> scopes;

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

  public CreateOboTokenRequest setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOboTokenRequest that = (CreateOboTokenRequest) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, comment, lifetimeSeconds, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenRequest.class)
        .add("applicationId", applicationId)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .add("scopes", scopes)
        .toString();
  }
}
