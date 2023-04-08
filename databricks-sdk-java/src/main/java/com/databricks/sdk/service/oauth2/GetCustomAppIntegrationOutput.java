// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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
  private Collection<String> redirectUrls;

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

  public GetCustomAppIntegrationOutput setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public GetCustomAppIntegrationOutput setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    GetCustomAppIntegrationOutput that = (GetCustomAppIntegrationOutput) o;
    return Objects.equals(clientId, that.clientId)
        && Objects.equals(confidential, that.confidential)
        && Objects.equals(integrationId, that.integrationId)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId, confidential, integrationId, name, redirectUrls, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationOutput.class)
        .add("clientId", clientId)
        .add("confidential", confidential)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
