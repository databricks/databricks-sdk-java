// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FederationPolicy {
  /** Creation time of the federation policy. */
  @JsonProperty("create_time")
  private String createTime;

  /** Description of the federation policy. */
  @JsonProperty("description")
  private String description;

  /**
   * Resource name for the federation policy. Example values include
   * `accounts/<account-id>/federationPolicies/my-federation-policy` for Account Federation
   * Policies, and
   * `accounts/<account-id>/servicePrincipals/<service-principal-id>/federationPolicies/my-federation-policy`
   * for Service Principal Federation Policies. Typically an output parameter, which does not need
   * to be specified in create or update requests. If specified in a request, must match the value
   * in the request URL.
   */
  @JsonProperty("name")
  private String name;

  /** Specifies the policy to use for validating OIDC claims in your federated tokens. */
  @JsonProperty("oidc_policy")
  private OidcFederationPolicy oidcPolicy;

  /** Unique, immutable id of the federation policy. */
  @JsonProperty("uid")
  private String uid;

  /** Last update time of the federation policy. */
  @JsonProperty("update_time")
  private String updateTime;

  public FederationPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public FederationPolicy setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FederationPolicy setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FederationPolicy setOidcPolicy(OidcFederationPolicy oidcPolicy) {
    this.oidcPolicy = oidcPolicy;
    return this;
  }

  public OidcFederationPolicy getOidcPolicy() {
    return oidcPolicy;
  }

  public FederationPolicy setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public FederationPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FederationPolicy that = (FederationPolicy) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(oidcPolicy, that.oidcPolicy)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, name, oidcPolicy, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(FederationPolicy.class)
        .add("createTime", createTime)
        .add("description", description)
        .add("name", name)
        .add("oidcPolicy", oidcPolicy)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
