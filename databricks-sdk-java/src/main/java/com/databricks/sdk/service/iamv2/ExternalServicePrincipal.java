// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An external service principal from the customer's Identity Provider, resolved into Databricks.
 * This is a read-only resource keyed by the IdP external ID. The Get method may trigger an
 * idempotent sync from the customer's IdP to provision or refresh the service principal's data in
 * Databricks.
 */
@Generated
public class ExternalServicePrincipal {
  /** The parent account ID, from Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** The activity status of the service principal in the Databricks account. */
  @JsonProperty("account_sp_status")
  private State accountSpStatus;

  /** Application ID of the service principal, from the customer's IdP. */
  @JsonProperty("application_id")
  private String applicationId;

  /** Display name of the service principal, from the customer's IdP. */
  @JsonProperty("display_name")
  private String displayName;

  /** The external ID of the service principal in the customer's IdP. */
  @JsonProperty("external_service_principal_id")
  private String externalServicePrincipalId;

  /** Internal servicePrincipalId of the service principal in Databricks. */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external service principal. The format depends on the API that
   * returned it: - Account-scoped:
   * accounts/{account_id}/external-service-principals/{external_service_principal_id} -
   * Workspace-scoped: external-service-principals/{external_service_principal_id}
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
