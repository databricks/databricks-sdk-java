// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Slack channel reached through the Databricks app. The app must already be installed in the Slack
 * workspace and connected to this Databricks workspace.
 */
@Generated
public class DatabricksAppSlackConfig {
  /** [Input-Only] Slack channel ID notifications are posted to. */
  @JsonProperty("channel_id")
  private String channelId;

  /** [Output-Only] Whether channel ID is set. */
  @JsonProperty("channel_id_set")
  private Boolean channelIdSet;

  /** [Input-Only] Slack workspace (team) ID the Databricks app is installed in. */
  @JsonProperty("team_id")
  private String teamId;

  /** [Output-Only] Whether team ID is set. */
  @JsonProperty("team_id_set")
  private Boolean teamIdSet;

  public DatabricksAppSlackConfig setChannelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  public String getChannelId() {
    return channelId;
  }

  public DatabricksAppSlackConfig setChannelIdSet(Boolean channelIdSet) {
    this.channelIdSet = channelIdSet;
    return this;
  }

  public Boolean getChannelIdSet() {
    return channelIdSet;
  }

  public DatabricksAppSlackConfig setTeamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  public String getTeamId() {
    return teamId;
  }

  public DatabricksAppSlackConfig setTeamIdSet(Boolean teamIdSet) {
    this.teamIdSet = teamIdSet;
    return this;
  }

  public Boolean getTeamIdSet() {
    return teamIdSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksAppSlackConfig that = (DatabricksAppSlackConfig) o;
    return Objects.equals(channelId, that.channelId)
        && Objects.equals(channelIdSet, that.channelIdSet)
        && Objects.equals(teamId, that.teamId)
        && Objects.equals(teamIdSet, that.teamIdSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelIdSet, teamId, teamIdSet);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksAppSlackConfig.class)
        .add("channelId", channelId)
        .add("channelIdSet", channelIdSet)
        .add("teamId", teamId)
        .add("teamIdSet", teamIdSet)
        .toString();
  }
}
