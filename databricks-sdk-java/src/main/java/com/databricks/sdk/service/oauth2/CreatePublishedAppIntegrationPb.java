// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreatePublishedAppIntegrationPb {
  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public CreatePublishedAppIntegrationPb setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public CreatePublishedAppIntegrationPb setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    CreatePublishedAppIntegrationPb that = (CreatePublishedAppIntegrationPb) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePublishedAppIntegrationPb.class)
        .add("appId", appId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
