// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A service principal from your identity provider (IdP), identified by its ID in your IdP. This
 * resource is read-only and requires Microsoft Entra ID as your IdP. Getting an external service
 * principal syncs its details and group memberships from your IdP, and adds it to your account if
 * it isn't already there.
 */
@Generated
public class ExternalServicePrincipal {
  /** The ID of the account that contains the service principal. */
  @JsonProperty("account_id")
  private String accountId;

  /** Whether the service principal is active in the account. */
  @JsonProperty("account_sp_status")
  private State accountSpStatus;

  /** The service principal's application ID, from your IdP. */
  @JsonProperty("application_id")
  private String applicationId;

  /** The service principal's display name, from your IdP. */
  @JsonProperty("display_name")
  private String displayName;

  /** The ID of the service principal in your IdP. */
  @JsonProperty("external_service_principal_id")
  private String externalServicePrincipalId;

  /**
   * The Databricks ID of the service principal. Use it as the `service_principal_id` in the service
   * principal APIs.
   */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external service principal, in one of these formats: - Account APIs:
   * `accounts/{account_id}/external-service-principals/{external_service_principal_id}` - Workspace
   * APIs: `external-service-principals/{external_service_principal_id}`
   */
  @JsonProperty("name")
  private String name;

  public ExternalServicePrincipal setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public ExternalServicePrincipal setAccountSpStatus(State accountSpStatus) {
    this.accountSpStatus = accountSpStatus;
    return this;
  }

  public State getAccountSpStatus() {
    return accountSpStatus;
  }

  public ExternalServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public ExternalServicePrincipal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ExternalServicePrincipal setExternalServicePrincipalId(String externalServicePrincipalId) {
    this.externalServicePrincipalId = externalServicePrincipalId;
    return this;
  }

  public String getExternalServicePrincipalId() {
    return externalServicePrincipalId;
  }

  public ExternalServicePrincipal setInternalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  public String getInternalId() {
    return internalId;
  }

  public ExternalServicePrincipal setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalServicePrincipal that = (ExternalServicePrincipal) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(accountSpStatus, that.accountSpStatus)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalServicePrincipalId, that.externalServicePrincipalId)
        && Objects.equals(internalId, that.internalId)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        accountSpStatus,
        applicationId,
        displayName,
        externalServicePrincipalId,
        internalId,
        name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalServicePrincipal.class)
        .add("accountId", accountId)
        .add("accountSpStatus", accountSpStatus)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("externalServicePrincipalId", externalServicePrincipalId)
        .add("internalId", internalId)
        .add("name", name)
        .toString();
  }
}
