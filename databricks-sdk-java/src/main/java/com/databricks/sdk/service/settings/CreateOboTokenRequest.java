// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateOboTokenRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>applicationId</code>.</p>
   *
   * @param applicationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenRequest} object
   */
  public CreateOboTokenRequest setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>applicationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenRequest} object
   */
  public CreateOboTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>lifetimeSeconds</code>.</p>
   *
   * @param lifetimeSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenRequest} object
   */
  public CreateOboTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>lifetimeSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOboTokenRequest that = (CreateOboTokenRequest) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(applicationId, comment, lifetimeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenRequest.class)
        .add("applicationId", applicationId)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }
}
