// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class CheckPolicyRequest {
  /** */
  @JsonIgnore
  @QueryParam("actor")
  private Actor actor;

  /** */
  @JsonIgnore
  @QueryParam("authz_identity")
  private RequestAuthzIdentity authzIdentity;

  /** */
  @JsonIgnore
  @QueryParam("consistency_token")
  private ConsistencyToken consistencyToken;

  /** */
  @JsonIgnore
  @QueryParam("permission")
  private String permission;

  /**
   * Ex: (servicePrincipal/use, accounts/<account-id>/servicePrincipals/<sp-id>) Ex:
   * (servicePrincipal.ruleSet/update,
   * accounts/<account-id>/servicePrincipals/<sp-id>/ruleSets/default)
   */
  @JsonIgnore
  @QueryParam("resource")
  private String resource;

  /** */
  @JsonIgnore
  @QueryParam("resource_info")
  private ResourceInfo resourceInfo;

  public CheckPolicyRequest setActor(Actor actor) {
    this.actor = actor;
    return this;
  }

  public Actor getActor() {
    return actor;
  }

  public CheckPolicyRequest setAuthzIdentity(RequestAuthzIdentity authzIdentity) {
    this.authzIdentity = authzIdentity;
    return this;
  }

  public RequestAuthzIdentity getAuthzIdentity() {
    return authzIdentity;
  }

  public CheckPolicyRequest setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyRequest setPermission(String permission) {
    this.permission = permission;
    return this;
  }

  public String getPermission() {
    return permission;
  }

  public CheckPolicyRequest setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  public CheckPolicyRequest setResourceInfo(ResourceInfo resourceInfo) {
    this.resourceInfo = resourceInfo;
    return this;
  }

  public ResourceInfo getResourceInfo() {
    return resourceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckPolicyRequest that = (CheckPolicyRequest) o;
    return Objects.equals(actor, that.actor)
        && Objects.equals(authzIdentity, that.authzIdentity)
        && Objects.equals(consistencyToken, that.consistencyToken)
        && Objects.equals(permission, that.permission)
        && Objects.equals(resource, that.resource)
        && Objects.equals(resourceInfo, that.resourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, authzIdentity, consistencyToken, permission, resource, resourceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CheckPolicyRequest.class)
        .add("actor", actor)
        .add("authzIdentity", authzIdentity)
        .add("consistencyToken", consistencyToken)
        .add("permission", permission)
        .add("resource", resource)
        .add("resourceInfo", resourceInfo)
        .toString();
  }
}
