// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PublishedAppOutputPb {
  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("is_confidential_client")
  private Boolean isConfidentialClient;

  @JsonProperty("name")
  private String name;

  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  @JsonProperty("scopes")
  private Collection<String> scopes;

  public PublishedAppOutputPb setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public PublishedAppOutputPb setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public PublishedAppOutputPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PublishedAppOutputPb setIsConfidentialClient(Boolean isConfidentialClient) {
    this.isConfidentialClient = isConfidentialClient;
    return this;
  }

  public Boolean getIsConfidentialClient() {
    return isConfidentialClient;
  }

  public PublishedAppOutputPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PublishedAppOutputPb setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public PublishedAppOutputPb setScopes(Collection<String> scopes) {
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
    PublishedAppOutputPb that = (PublishedAppOutputPb) o;
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
    return new ToStringer(PublishedAppOutputPb.class)
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
