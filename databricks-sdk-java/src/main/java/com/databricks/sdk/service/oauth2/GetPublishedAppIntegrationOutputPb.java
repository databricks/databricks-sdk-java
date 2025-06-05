// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetPublishedAppIntegrationOutputPb {
  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("created_by")
  private Long createdBy;

  @JsonProperty("integration_id")
  private String integrationId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public GetPublishedAppIntegrationOutputPb setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public GetPublishedAppIntegrationOutputPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public GetPublishedAppIntegrationOutputPb setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public GetPublishedAppIntegrationOutputPb setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public GetPublishedAppIntegrationOutputPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPublishedAppIntegrationOutputPb setTokenAccessPolicy(
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
    GetPublishedAppIntegrationOutputPb that = (GetPublishedAppIntegrationOutputPb) o;
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
    return new ToStringer(GetPublishedAppIntegrationOutputPb.class)
        .add("appId", appId)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
