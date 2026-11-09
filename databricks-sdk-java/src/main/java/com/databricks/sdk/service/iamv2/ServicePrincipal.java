// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A service principal in your Databricks account. */
@Generated
public class ServicePrincipal {
  /** The ID of the account that contains the service principal. */
  @JsonProperty("account_id")
  private String accountId;

  /** Whether the service principal is active in the account. */
  @JsonProperty("account_sp_status")
  private State accountSpStatus;

  /**
   * The service principal's application ID, a UUID. If you don't set it when you create the service
   * principal, Databricks generates one. It must be unique in the account and can't be changed.
   */
  @JsonProperty("application_id")
  private String applicationId;

  /** The service principal's display name. */
  @JsonProperty("display_name")
  private String displayName;

  /** The ID of the service principal in your identity provider (IdP). */
  @JsonProperty("external_id")
  private String externalId;

  /**
   * The resource name of the service principal, in one of these formats: - Account APIs:
   * `accounts/{account_id}/service-principals/{service_principal_id}` - Workspace APIs:
   * `service-principals/{service_principal_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The resource name of the account that contains the service principal, in the format
   * `accounts/{account_id}`. Workspace APIs return the same format.
   */
  @JsonProperty("parent")
  private String parent;

  /** The Databricks ID of the service principal. */
  @JsonProperty("service_principal_id")
  private String servicePrincipalId;

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

  public ServicePrincipal setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServicePrincipal setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ServicePrincipal setServicePrincipalId(String servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public String getServicePrincipalId() {
    return servicePrincipalId;
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
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        accountSpStatus,
        applicationId,
        displayName,
        externalId,
        name,
        parent,
        servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServicePrincipal.class)
        .add("accountId", accountId)
        .add("accountSpStatus", accountSpStatus)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("name", name)
        .add("parent", parent)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
