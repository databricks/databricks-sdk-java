// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a service principal in the Databricks account. Service principals are identities for
 * jobs, automated tools and systems such as scripts, apps and CI/CD platforms.
 */
@Generated
public class AccountServicePrincipal {
  /** Identifies the Databricks account that the service principal belongs to. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Indicates whether the service principal is active. A deactivated service principal cannot
   * authenticate or access Databricks APIs, but it keeps its permissions.
   */
  @JsonProperty("active")
  private Boolean active;

  /**
   * Identifies the service principal when it authenticates to Databricks. Databricks generates the
   * application ID, except on Azure, where it can be the application ID of a Microsoft Entra ID
   * service principal.
   */
  @JsonProperty("applicationId")
  private String applicationId;

  /** Identifies the service principal by a human-readable name. */
  @JsonProperty("displayName")
  private String displayName;

  /**
   * Identifies the service principal in an external identity provider. Identity providers use it to
   * match the service principals they manage to Databricks service principals.
   */
  @JsonProperty("externalId")
  private String externalId;

  /**
   * Identifies the service principal within Databricks. Databricks generates the ID when the
   * service principal is created.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Lists the account roles that are assigned to the service principal. The only supported role
   * value is `account_admin`.
   */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  public AccountServicePrincipal setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public AccountServicePrincipal setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public AccountServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public AccountServicePrincipal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public AccountServicePrincipal setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AccountServicePrincipal setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AccountServicePrincipal setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountServicePrincipal that = (AccountServicePrincipal) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(active, that.active)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(id, that.id)
        && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, active, applicationId, displayName, externalId, id, roles);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountServicePrincipal.class)
        .add("accountId", accountId)
        .add("active", active)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("id", id)
        .add("roles", roles)
        .toString();
  }
}
