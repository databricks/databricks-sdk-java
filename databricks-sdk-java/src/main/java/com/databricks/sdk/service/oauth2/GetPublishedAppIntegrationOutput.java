// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetPublishedAppIntegrationOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPublishedAppIntegrationOutput {
  /** app-id of the published app integration */
  @JsonProperty("app_id")
  private String appId;

  /** unique integration id for the published oauth app */
  @JsonProperty("integration_id")
  private String integrationId;

  /** name of the published oauth app */
  @JsonProperty("name")
  private String name;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * <p>Setter for the field <code>appId</code>.</p>
   *
   * @param appId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <p>Getter for the field <code>appId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAppId() {
    return appId;
  }

  /**
   * <p>Setter for the field <code>integrationId</code>.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput setIntegrationId(String integrationId) {
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
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput setName(String name) {
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
   * <p>Setter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @param tokenAccessPolicy a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput setTokenAccessPolicy(
      TokenAccessPolicy tokenAccessPolicy) {
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
    GetPublishedAppIntegrationOutput that = (GetPublishedAppIntegrationOutput) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(integrationId, that.integrationId)
        && Objects.equals(name, that.name)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(appId, integrationId, name, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationOutput.class)
        .add("appId", appId)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
