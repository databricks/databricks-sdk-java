// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SlackExportConfig {
  /**
   * Three-level Unity Catalog name (`catalog.schema.secret`) of the secret holding the Slack bot
   * token. Only the name is stored; the token is read when an alert is exported, so rotating the
   * secret takes effect without editing this config.
   */
  @JsonProperty("bot_token_uc_secret")
  private String botTokenUcSecret;

  /**
   * Channel the alert is posted to: a channel ID (e.g. `C0123456789`) or a channel name without the
   * leading `#` (e.g. `soc-alerts`). The value is stored as sent, so a leading `#`, surrounding
   * whitespace, or a value naming more than one channel is rejected. For private channels, prefer
   * the channel ID — Slack does not guarantee name resolution for those.
   *
   * <p>The Slack app must be a member of the channel and hold the `chat:write` scope.
   */
  @JsonProperty("channel")
  private String channel;

  public SlackExportConfig setBotTokenUcSecret(String botTokenUcSecret) {
    this.botTokenUcSecret = botTokenUcSecret;
    return this;
  }

  public String getBotTokenUcSecret() {
    return botTokenUcSecret;
  }

  public SlackExportConfig setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  public String getChannel() {
    return channel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SlackExportConfig that = (SlackExportConfig) o;
    return Objects.equals(botTokenUcSecret, that.botTokenUcSecret)
        && Objects.equals(channel, that.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botTokenUcSecret, channel);
  }

  @Override
  public String toString() {
    return new ToStringer(SlackExportConfig.class)
        .add("botTokenUcSecret", botTokenUcSecret)
        .add("channel", channel)
        .toString();
  }
}
