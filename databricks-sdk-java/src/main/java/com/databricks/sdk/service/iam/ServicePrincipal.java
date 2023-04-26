// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ServicePrincipal class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServicePrincipal {
  /** If this user is active */
  @JsonProperty("active")
  private Boolean active;

  /** UUID relating to the service principal */
  @JsonProperty("applicationId")
  private String applicationId;

  /** String that represents a concatenation of given and family names. */
  @JsonProperty("displayName")
  private String displayName;

  /** */
  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** */
  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  /** Databricks service principal ID. */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  /**
   * <p>Setter for the field <code>active</code>.</p>
   *
   * @param active a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setActive(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * <p>Getter for the field <code>active</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getActive() {
    return active;
  }

  /**
   * <p>Setter for the field <code>applicationId</code>.</p>
   *
   * @param applicationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setApplicationId(String applicationId) {
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
   * <p>Setter for the field <code>displayName</code>.</p>
   *
   * @param displayName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>Getter for the field <code>displayName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * <p>Setter for the field <code>entitlements</code>.</p>
   *
   * @param entitlements a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  /**
   * <p>Getter for the field <code>entitlements</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  /**
   * <p>Setter for the field <code>externalId</code>.</p>
   *
   * @param externalId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * <p>Setter for the field <code>groups</code>.</p>
   *
   * @param groups a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * <p>Getter for the field <code>groups</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>roles</code>.</p>
   *
   * @param roles a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * <p>Getter for the field <code>roles</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServicePrincipal that = (ServicePrincipal) o;
    return Objects.equals(active, that.active)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groups, that.groups)
        && Objects.equals(id, that.id)
        && Objects.equals(roles, that.roles);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        active, applicationId, displayName, entitlements, externalId, groups, id, roles);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServicePrincipal.class)
        .add("active", active)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("entitlements", entitlements)
        .add("externalId", externalId)
        .add("groups", groups)
        .add("id", id)
        .add("roles", roles)
        .toString();
  }
}
