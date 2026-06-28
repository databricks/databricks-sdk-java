// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Space {
  /** The creation time of the app space. Formatted timestamp in ISO 6801. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The email of the user that created the app space. */
  @JsonProperty("creator")
  private String creator;

  /** The description of the app space. */
  @JsonProperty("description")
  private String description;

  /** The effective usage policy ID used by apps in the space. */
  @JsonProperty("effective_usage_policy_id")
  private String effectiveUsagePolicyId;

  /** The effective api scopes granted to the user access token. */
  @JsonProperty("effective_user_api_scopes")
  private Collection<String> effectiveUserApiScopes;

  /** The unique identifier of the app space. */
  @JsonProperty("id")
  private String id;

  /**
   * The name of the app space. The name must contain only lowercase alphanumeric characters and
   * hyphens. It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Resources for the app space. Resources configured at the space level are available to all apps
   * in the space.
   */
  @JsonProperty("resources")
  private Collection<AppResource> resources;

  /** The service principal client ID for the app space. */
  @JsonProperty("service_principal_client_id")
  private String servicePrincipalClientId;

  /** The service principal ID for the app space. */
  @JsonProperty("service_principal_id")
  private Long servicePrincipalId;

  /** The service principal name for the app space. */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** The status of the app space. */
  @JsonProperty("status")
  private SpaceStatus status;

  /** The update time of the app space. Formatted timestamp in ISO 6801. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** The email of the user that last updated the app space. */
  @JsonProperty("updater")
  private String updater;

  /** The usage policy ID for managing cost at the space level. */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  /** OAuth scopes for apps in the space. */
  @JsonProperty("user_api_scopes")
  private Collection<String> userApiScopes;

  public Space setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Space setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public Space setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Space setEffectiveUsagePolicyId(String effectiveUsagePolicyId) {
    this.effectiveUsagePolicyId = effectiveUsagePolicyId;
    return this;
  }

  public String getEffectiveUsagePolicyId() {
    return effectiveUsagePolicyId;
  }

  public Space setEffectiveUserApiScopes(Collection<String> effectiveUserApiScopes) {
    this.effectiveUserApiScopes = effectiveUserApiScopes;
    return this;
  }

  public Collection<String> getEffectiveUserApiScopes() {
    return effectiveUserApiScopes;
  }

  public Space setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Space setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Space setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  public Space setServicePrincipalClientId(String servicePrincipalClientId) {
    this.servicePrincipalClientId = servicePrincipalClientId;
    return this;
  }

  public String getServicePrincipalClientId() {
    return servicePrincipalClientId;
  }

  public Space setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public Space setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public Space setStatus(SpaceStatus status) {
    this.status = status;
    return this;
  }

  public SpaceStatus getStatus() {
    return status;
  }

  public Space setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Space setUpdater(String updater) {
    this.updater = updater;
    return this;
  }

  public String getUpdater() {
    return updater;
  }

  public Space setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  public Space setUserApiScopes(Collection<String> userApiScopes) {
    this.userApiScopes = userApiScopes;
    return this;
  }

  public Collection<String> getUserApiScopes() {
    return userApiScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Space that = (Space) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveUsagePolicyId, that.effectiveUsagePolicyId)
        && Objects.equals(effectiveUserApiScopes, that.effectiveUserApiScopes)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(resources, that.resources)
        && Objects.equals(servicePrincipalClientId, that.servicePrincipalClientId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updater, that.updater)
        && Objects.equals(usagePolicyId, that.usagePolicyId)
        && Objects.equals(userApiScopes, that.userApiScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creator,
        description,
        effectiveUsagePolicyId,
        effectiveUserApiScopes,
        id,
        name,
        resources,
        servicePrincipalClientId,
        servicePrincipalId,
        servicePrincipalName,
        status,
        updateTime,
        updater,
        usagePolicyId,
        userApiScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(Space.class)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("description", description)
        .add("effectiveUsagePolicyId", effectiveUsagePolicyId)
        .add("effectiveUserApiScopes", effectiveUserApiScopes)
        .add("id", id)
        .add("name", name)
        .add("resources", resources)
        .add("servicePrincipalClientId", servicePrincipalClientId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("status", status)
        .add("updateTime", updateTime)
        .add("updater", updater)
        .add("usagePolicyId", usagePolicyId)
        .add("userApiScopes", userApiScopes)
        .toString();
  }
}
