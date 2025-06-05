// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Check access policy to a resource */
@Generated
class CheckPolicyRequestPb {
  @JsonIgnore
  @QueryParam("actor")
  private Actor actor;

  @JsonIgnore
  @QueryParam("authz_identity")
  private RequestAuthzIdentity authzIdentity;

  @JsonIgnore
  @QueryParam("consistency_token")
  private ConsistencyToken consistencyToken;

  @JsonIgnore
  @QueryParam("permission")
  private String permission;

  @JsonIgnore
  @QueryParam("resource")
  private String resource;

  @JsonIgnore
  @QueryParam("resource_info")
  private ResourceInfo resourceInfo;

  public CheckPolicyRequestPb setActor(Actor actor) {
    this.actor = actor;
    return this;
  }

  public Actor getActor() {
    return actor;
  }

  public CheckPolicyRequestPb setAuthzIdentity(RequestAuthzIdentity authzIdentity) {
    this.authzIdentity = authzIdentity;
    return this;
  }

  public RequestAuthzIdentity getAuthzIdentity() {
    return authzIdentity;
  }

  public CheckPolicyRequestPb setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyRequestPb setPermission(String permission) {
    this.permission = permission;
    return this;
  }

  public String getPermission() {
    return permission;
  }

  public CheckPolicyRequestPb setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  public CheckPolicyRequestPb setResourceInfo(ResourceInfo resourceInfo) {
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
    CheckPolicyRequestPb that = (CheckPolicyRequestPb) o;
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
    return new ToStringer(CheckPolicyRequestPb.class)
        .add("actor", actor)
        .add("authzIdentity", authzIdentity)
        .add("consistencyToken", consistencyToken)
        .add("permission", permission)
        .add("resource", resource)
        .add("resourceInfo", resourceInfo)
        .toString();
  }
}
