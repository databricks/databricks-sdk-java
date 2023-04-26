// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetCustomAppIntegrationOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>clientId</code>.</p>
   *
   * @param clientId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clientId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * <p>Setter for the field <code>confidential</code>.</p>
   *
   * @param confidential a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  /**
   * <p>Getter for the field <code>confidential</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getConfidential() {
    return confidential;
  }

  /**
   * <p>Setter for the field <code>integrationId</code>.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>integrationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getIntegrationId() {
    return integrationId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>redirectUrls</code>.</p>
   *
   * @param redirectUrls a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  /**
   * <p>Getter for the field <code>redirectUrls</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  /**
   * <p>Setter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @param tokenAccessPolicy a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   */
  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        clientId, confidential, integrationId, name, redirectUrls, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
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
