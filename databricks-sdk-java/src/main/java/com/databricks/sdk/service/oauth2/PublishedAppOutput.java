// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PublishedAppOutput {
  /** Unique ID of the published OAuth app. */
  @JsonProperty("app_id")
  private String appId;

  /** Client ID of the published OAuth app. It is the client_id in the OAuth flow */
  @JsonProperty("client_id")
  private String clientId;

  /** Description of the published OAuth app. */
  @JsonProperty("description")
  private String description;

  /**
   * Whether the published OAuth app is a confidential client. It is always false for published
   * OAuth apps.
   */
  @JsonProperty("is_confidential_client")
  private Boolean isConfidentialClient;

  /** Name of the published OAuth app. */
  @JsonProperty("name")
  private String name;

  /** Redirect URLs of the published OAuth app. */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /** Required scopes for the published OAuth app. */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public PublishedAppOutput setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public PublishedAppOutput setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public PublishedAppOutput setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PublishedAppOutput setIsConfidentialClient(Boolean isConfidentialClient) {
    this.isConfidentialClient = isConfidentialClient;
    return this;
  }

  public Boolean getIsConfidentialClient() {
    return isConfidentialClient;
  }

  public PublishedAppOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PublishedAppOutput setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public PublishedAppOutput setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishedAppOutput that = (PublishedAppOutput) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(clientId, that.clientId)
        && Objects.equals(description, that.description)
        && Objects.equals(isConfidentialClient, that.isConfidentialClient)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appId, clientId, description, isConfidentialClient, name, redirectUrls, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishedAppOutput.class)
        .add("appId", appId)
        .add("clientId", clientId)
        .add("description", description)
        .add("isConfidentialClient", isConfidentialClient)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .toString();
  }
}
