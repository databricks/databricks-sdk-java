// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateCustomAppIntegration {
  /** The oauth app integration ID. */
  private String integrationId;

  /** List of oauth redirect urls to be updated in the custom oauth app integration */
  @JsonProperty("redirect_urls")
  private java.util.List<String> redirectUrls;

  /** Token access policy to be updated in the custom oauth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public UpdateCustomAppIntegration setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public UpdateCustomAppIntegration setRedirectUrls(java.util.List<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public java.util.List<String> getRedirectUrls() {
    return redirectUrls;
  }

  public UpdateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }
}
