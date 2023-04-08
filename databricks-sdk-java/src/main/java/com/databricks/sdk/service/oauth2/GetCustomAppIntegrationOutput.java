// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCustomAppIntegrationOutput {
  /** oauth client id of the custom oauth app */
  @JsonProperty("client_id")
  private String clientId;

  /** indicates if an oauth client-secret should be generated */
  @JsonProperty("confidential")
  private Boolean confidential;

  /** ID of this custom app */
  @JsonProperty("integration_id")
  private String integrationId;

  /** name of the custom oauth app */
  @JsonProperty("name")
  private String name;

  /** List of oauth redirect urls */
  @JsonProperty("redirect_urls")
  private java.util.List<String> redirectUrls;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public GetCustomAppIntegrationOutput setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public GetCustomAppIntegrationOutput setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public GetCustomAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public GetCustomAppIntegrationOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetCustomAppIntegrationOutput setRedirectUrls(java.util.List<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public java.util.List<String> getRedirectUrls() {
    return redirectUrls;
  }

  public GetCustomAppIntegrationOutput setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }
}
