// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetPublishedAppIntegrationOutput {
  /** App-id of the published app integration */
  @JsonProperty("app_id")
  private String appId;

  /** */
  @JsonProperty("create_time")
  private String createTime;

  /** */
  @JsonProperty("created_by")
  private Long createdBy;

  /** Unique integration id for the published OAuth app */
  @JsonProperty("integration_id")
  private String integrationId;

  /** Display name of the published OAuth app */
  @JsonProperty("name")
  private String name;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public GetPublishedAppIntegrationOutput setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public GetPublishedAppIntegrationOutput setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public GetPublishedAppIntegrationOutput setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public GetPublishedAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public GetPublishedAppIntegrationOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPublishedAppIntegrationOutput setTokenAccessPolicy(
      TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedAppIntegrationOutput that = (GetPublishedAppIntegrationOutput) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(integrationId, that.integrationId)
        && Objects.equals(name, that.name)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, createTime, createdBy, integrationId, name, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationOutput.class)
        .add("appId", appId)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
