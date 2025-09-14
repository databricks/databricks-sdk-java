// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MicrosoftTeamsConfig {
  /** [Input-Only] App ID for Microsoft Teams App. */
  @JsonProperty("app_id")
  private String appId;

  /** [Output-Only] Whether App ID is set. */
  @JsonProperty("app_id_set")
  private Boolean appIdSet;

  /** [Input-Only] Secret for Microsoft Teams App authentication. */
  @JsonProperty("auth_secret")
  private String authSecret;

  /** [Output-Only] Whether secret is set. */
  @JsonProperty("auth_secret_set")
  private Boolean authSecretSet;

  /** [Input-Only] Channel URL for Microsoft Teams App. */
  @JsonProperty("channel_url")
  private String channelUrl;

  /** [Output-Only] Whether Channel URL is set. */
  @JsonProperty("channel_url_set")
  private Boolean channelUrlSet;

  /** [Input-Only] Tenant ID for Microsoft Teams App. */
  @JsonProperty("tenant_id")
  private String tenantId;

  /** [Output-Only] Whether Tenant ID is set. */
  @JsonProperty("tenant_id_set")
  private Boolean tenantIdSet;

  /** [Input-Only] URL for Microsoft Teams webhook. */
  @JsonProperty("url")
  private String url;

  /** [Output-Only] Whether URL is set. */
  @JsonProperty("url_set")
  private Boolean urlSet;

  public MicrosoftTeamsConfig setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public MicrosoftTeamsConfig setAppIdSet(Boolean appIdSet) {
    this.appIdSet = appIdSet;
    return this;
  }

  public Boolean getAppIdSet() {
    return appIdSet;
  }

  public MicrosoftTeamsConfig setAuthSecret(String authSecret) {
    this.authSecret = authSecret;
    return this;
  }

  public String getAuthSecret() {
    return authSecret;
  }

  public MicrosoftTeamsConfig setAuthSecretSet(Boolean authSecretSet) {
    this.authSecretSet = authSecretSet;
    return this;
  }

  public Boolean getAuthSecretSet() {
    return authSecretSet;
  }

  public MicrosoftTeamsConfig setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

  public String getChannelUrl() {
    return channelUrl;
  }

  public MicrosoftTeamsConfig setChannelUrlSet(Boolean channelUrlSet) {
    this.channelUrlSet = channelUrlSet;
    return this;
  }

  public Boolean getChannelUrlSet() {
    return channelUrlSet;
  }

  public MicrosoftTeamsConfig setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  public MicrosoftTeamsConfig setTenantIdSet(Boolean tenantIdSet) {
    this.tenantIdSet = tenantIdSet;
    return this;
  }

  public Boolean getTenantIdSet() {
    return tenantIdSet;
  }

  public MicrosoftTeamsConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public MicrosoftTeamsConfig setUrlSet(Boolean urlSet) {
    this.urlSet = urlSet;
    return this;
  }

  public Boolean getUrlSet() {
    return urlSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MicrosoftTeamsConfig that = (MicrosoftTeamsConfig) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(appIdSet, that.appIdSet)
        && Objects.equals(authSecret, that.authSecret)
        && Objects.equals(authSecretSet, that.authSecretSet)
        && Objects.equals(channelUrl, that.channelUrl)
        && Objects.equals(channelUrlSet, that.channelUrlSet)
        && Objects.equals(tenantId, that.tenantId)
        && Objects.equals(tenantIdSet, that.tenantIdSet)
        && Objects.equals(url, that.url)
        && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appId,
        appIdSet,
        authSecret,
        authSecretSet,
        channelUrl,
        channelUrlSet,
        tenantId,
        tenantIdSet,
        url,
        urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(MicrosoftTeamsConfig.class)
        .add("appId", appId)
        .add("appIdSet", appIdSet)
        .add("authSecret", authSecret)
        .add("authSecretSet", authSecretSet)
        .add("channelUrl", channelUrl)
        .add("channelUrlSet", channelUrlSet)
        .add("tenantId", tenantId)
        .add("tenantIdSet", tenantIdSet)
        .add("url", url)
        .add("urlSet", urlSet)
        .toString();
  }
}
