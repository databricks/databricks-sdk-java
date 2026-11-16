// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configures a Microsoft Teams destination. Notifications are posted to the incoming webhook url,
 * which is required. The app_id, auth_secret, channel_url and tenant_id fields can optionally be
 * set together to post through a Microsoft Teams app.
 */
@Generated
public class MicrosoftTeamsConfig {
  /**
   * [Input-Only] Application (client) ID of the Microsoft Teams app, as a UUID. Optional; set it
   * together with auth_secret, channel_url and tenant_id.
   */
  @JsonProperty("app_id")
  private String appId;

  /** [Output-Only] Whether App ID is set. */
  @JsonProperty("app_id_set")
  private Boolean appIdSet;

  /**
   * [Input-Only] Client secret of the Microsoft Teams app. Optional; set it together with app_id,
   * channel_url and tenant_id.
   */
  @JsonProperty("auth_secret")
  private String authSecret;

  /** [Output-Only] Whether secret is set. */
  @JsonProperty("auth_secret_set")
  private Boolean authSecretSet;

  /**
   * [Input-Only] URL of the Microsoft Teams channel that the app posts to. Optional; set it
   * together with app_id, auth_secret and tenant_id.
   */
  @JsonProperty("channel_url")
  private String channelUrl;

  /** [Output-Only] Whether Channel URL is set. */
  @JsonProperty("channel_url_set")
  private Boolean channelUrlSet;

  /**
   * [Input-Only] Microsoft Entra tenant ID of the Microsoft Teams app, as a UUID. Optional; set it
   * together with app_id, auth_secret and channel_url.
   */
  @JsonProperty("tenant_id")
  private String tenantId;

  /** [Output-Only] Whether Tenant ID is set. */
  @JsonProperty("tenant_id_set")
  private Boolean tenantIdSet;

  /**
   * [Input-Only] Microsoft Teams incoming webhook URL that notifications are posted to. Must be an
   * HTTPS URL. The URL is required even when the app fields are set.
   */
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
