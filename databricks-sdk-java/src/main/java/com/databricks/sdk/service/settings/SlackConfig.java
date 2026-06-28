// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SlackConfig {
  /** [Input-Only] Slack channel ID for notifications. */
  @JsonProperty("channel_id")
  private String channelId;

  /** [Output-Only] Whether channel ID is set. */
  @JsonProperty("channel_id_set")
  private Boolean channelIdSet;

  /** [Input-Only] OAuth token for Slack authentication. */
  @JsonProperty("oauth_token")
  private String oauthToken;

  /** [Output-Only] Whether OAuth token is set. */
  @JsonProperty("oauth_token_set")
  private Boolean oauthTokenSet;

  /** [Input-Only] URL for Slack destination. */
  @JsonProperty("url")
  private String url;

  /** [Output-Only] Whether URL is set. */
  @JsonProperty("url_set")
  private Boolean urlSet;

  public SlackConfig setChannelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  public String getChannelId() {
    return channelId;
  }

  public SlackConfig setChannelIdSet(Boolean channelIdSet) {
    this.channelIdSet = channelIdSet;
    return this;
  }

  public Boolean getChannelIdSet() {
    return channelIdSet;
  }

  public SlackConfig setOauthToken(String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  public String getOauthToken() {
    return oauthToken;
  }

  public SlackConfig setOauthTokenSet(Boolean oauthTokenSet) {
    this.oauthTokenSet = oauthTokenSet;
    return this;
  }

  public Boolean getOauthTokenSet() {
    return oauthTokenSet;
  }

  public SlackConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public SlackConfig setUrlSet(Boolean urlSet) {
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
    SlackConfig that = (SlackConfig) o;
    return Objects.equals(channelId, that.channelId)
        && Objects.equals(channelIdSet, that.channelIdSet)
        && Objects.equals(oauthToken, that.oauthToken)
        && Objects.equals(oauthTokenSet, that.oauthTokenSet)
        && Objects.equals(url, that.url)
        && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelIdSet, oauthToken, oauthTokenSet, url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(SlackConfig.class)
        .add("channelId", channelId)
        .add("channelIdSet", channelIdSet)
        .add("oauthToken", oauthToken)
        .add("oauthTokenSet", oauthTokenSet)
        .add("url", url)
        .add("urlSet", urlSet)
        .toString();
  }
}
