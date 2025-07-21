// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DefaultBaseEnvironment {
  /** */
  @JsonProperty("base_environment_cache")
  private Collection<DefaultBaseEnvironmentCache> baseEnvironmentCache;

  /** */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** */
  @JsonProperty("creator_user_id")
  private Long creatorUserId;

  /**
   * Note: we made `environment` non-internal because we need to expose its `client` field. All
   * other fields should be treated as internal.
   */
  @JsonProperty("environment")
  private Environment environment;

  /** */
  @JsonProperty("filepath")
  private String filepath;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /** */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** */
  @JsonProperty("last_updated_user_id")
  private Long lastUpdatedUserId;

  /** */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("principal_ids")
  private Collection<Long> principalIds;

  /** */
  @JsonProperty("status")
  private DefaultBaseEnvironmentCacheStatus status;

  public DefaultBaseEnvironment setBaseEnvironmentCache(
      Collection<DefaultBaseEnvironmentCache> baseEnvironmentCache) {
    this.baseEnvironmentCache = baseEnvironmentCache;
    return this;
  }

  public Collection<DefaultBaseEnvironmentCache> getBaseEnvironmentCache() {
    return baseEnvironmentCache;
  }

  public DefaultBaseEnvironment setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public DefaultBaseEnvironment setCreatorUserId(Long creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public Long getCreatorUserId() {
    return creatorUserId;
  }

  public DefaultBaseEnvironment setEnvironment(Environment environment) {
    this.environment = environment;
    return this;
  }

  public Environment getEnvironment() {
    return environment;
  }

  public DefaultBaseEnvironment setFilepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

  public String getFilepath() {
    return filepath;
  }

  public DefaultBaseEnvironment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DefaultBaseEnvironment setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public DefaultBaseEnvironment setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public DefaultBaseEnvironment setLastUpdatedUserId(Long lastUpdatedUserId) {
    this.lastUpdatedUserId = lastUpdatedUserId;
    return this;
  }

  public Long getLastUpdatedUserId() {
    return lastUpdatedUserId;
  }

  public DefaultBaseEnvironment setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public DefaultBaseEnvironment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DefaultBaseEnvironment setPrincipalIds(Collection<Long> principalIds) {
    this.principalIds = principalIds;
    return this;
  }

  public Collection<Long> getPrincipalIds() {
    return principalIds;
  }

  public DefaultBaseEnvironment setStatus(DefaultBaseEnvironmentCacheStatus status) {
    this.status = status;
    return this;
  }

  public DefaultBaseEnvironmentCacheStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultBaseEnvironment that = (DefaultBaseEnvironment) o;
    return Objects.equals(baseEnvironmentCache, that.baseEnvironmentCache)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(environment, that.environment)
        && Objects.equals(filepath, that.filepath)
        && Objects.equals(id, that.id)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(lastUpdatedUserId, that.lastUpdatedUserId)
        && Objects.equals(message, that.message)
        && Objects.equals(name, that.name)
        && Objects.equals(principalIds, that.principalIds)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseEnvironmentCache,
        createdTimestamp,
        creatorUserId,
        environment,
        filepath,
        id,
        isDefault,
        lastUpdatedTimestamp,
        lastUpdatedUserId,
        message,
        name,
        principalIds,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultBaseEnvironment.class)
        .add("baseEnvironmentCache", baseEnvironmentCache)
        .add("createdTimestamp", createdTimestamp)
        .add("creatorUserId", creatorUserId)
        .add("environment", environment)
        .add("filepath", filepath)
        .add("id", id)
        .add("isDefault", isDefault)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("lastUpdatedUserId", lastUpdatedUserId)
        .add("message", message)
        .add("name", name)
        .add("principalIds", principalIds)
        .add("status", status)
        .toString();
  }
}
