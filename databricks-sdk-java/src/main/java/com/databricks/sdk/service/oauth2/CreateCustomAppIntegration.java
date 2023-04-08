// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCustomAppIntegration {
  /** indicates if an oauth client-secret should be generated */
  @JsonProperty("confidential")
  private Boolean confidential;

  /** name of the custom oauth app */
  @JsonProperty("name")
  private String name;

  /** List of oauth redirect urls */
  @JsonProperty("redirect_urls")
  private java.util.List<String> redirectUrls;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public CreateCustomAppIntegration setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public CreateCustomAppIntegration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCustomAppIntegration setRedirectUrls(java.util.List<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public java.util.List<String> getRedirectUrls() {
    return redirectUrls;
  }

  public CreateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }
}
