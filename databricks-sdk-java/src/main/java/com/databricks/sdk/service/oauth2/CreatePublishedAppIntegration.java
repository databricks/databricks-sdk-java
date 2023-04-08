// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePublishedAppIntegration {
  /** app_id of the oauth published app integration. For example power-bi, tableau-deskop */
  @JsonProperty("app_id")
  private String appId;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public CreatePublishedAppIntegration setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public CreatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }
}
