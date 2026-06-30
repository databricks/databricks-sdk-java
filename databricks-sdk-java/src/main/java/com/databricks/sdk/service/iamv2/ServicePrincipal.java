// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The details of a ServicePrincipal resource. */
@Generated
public class ServicePrincipal {
  /** The parent account ID for the service principal in Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** The activity status of a service principal in a Databricks account. */
  @JsonProperty("account_sp_status")
  private State accountSpStatus;

  /** Application ID of the service principal. */
  @JsonProperty("application_id")
  private String applicationId;

  /** Display name of the service principal. */
  @JsonProperty("display_name")
  private String displayName;

  /** ExternalId of the service principal in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  /** Internal service principal ID of the service principal in Databricks. */
  @JsonProperty("internal_id")
  private Long internalId;

  public ServicePrincipal setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public ServicePrincipal setAccountSpStatus(State accountSpStatus) {
    this.accountSpStatus = accountSpStatus;
    return this;
  }

  public State getAccountSpStatus() {
    return accountSpStatus;
  }

  public ServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public ServicePrincipal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ServicePrincipal setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public ServicePrincipal setInternalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

  public Long getInternalId() {
    return internalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServicePrincipal that = (ServicePrincipal) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(accountSpStatus, that.accountSpStatus)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(internalId, that.internalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, accountSpStatus, applicationId, displayName, externalId, internalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServicePrincipal.class)
        .add("accountId", accountId)
        .add("accountSpStatus", accountSpStatus)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("internalId", internalId)
        .toString();
  }
}
