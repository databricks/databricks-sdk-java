// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Microsoft Teams channel reached through the Databricks app. The app must already be installed in
 * the Microsoft 365 tenant and connected to this Databricks workspace.
 */
@Generated
public class DatabricksAppTeamsConfig {
  /** [Input-Only] Teams channel ID notifications are posted to. */
  @JsonProperty("channel_id")
  private String channelId;

  /** [Output-Only] Whether channel ID is set. */
  @JsonProperty("channel_id_set")
  private Boolean channelIdSet;

  /** [Input-Only] Microsoft Entra group ID of the team that owns the channel. */
  @JsonProperty("team_id")
  private String teamId;

  /** [Output-Only] Whether team ID is set. */
  @JsonProperty("team_id_set")
  private Boolean teamIdSet;

  /** [Input-Only] Microsoft Entra tenant ID of the Microsoft 365 tenant the app is installed in. */
  @JsonProperty("tenant_id")
  private String tenantId;

  /** [Output-Only] Whether tenant ID is set. */
  @JsonProperty("tenant_id_set")
  private Boolean tenantIdSet;

  public DatabricksAppTeamsConfig setChannelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  public String getChannelId() {
    return channelId;
  }

  public DatabricksAppTeamsConfig setChannelIdSet(Boolean channelIdSet) {
    this.channelIdSet = channelIdSet;
    return this;
  }

  public Boolean getChannelIdSet() {
    return channelIdSet;
  }

  public DatabricksAppTeamsConfig setTeamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  public String getTeamId() {
    return teamId;
  }

  public DatabricksAppTeamsConfig setTeamIdSet(Boolean teamIdSet) {
    this.teamIdSet = teamIdSet;
    return this;
  }

  public Boolean getTeamIdSet() {
    return teamIdSet;
  }

  public DatabricksAppTeamsConfig setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  public DatabricksAppTeamsConfig setTenantIdSet(Boolean tenantIdSet) {
    this.tenantIdSet = tenantIdSet;
    return this;
  }

  public Boolean getTenantIdSet() {
    return tenantIdSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksAppTeamsConfig that = (DatabricksAppTeamsConfig) o;
    return Objects.equals(channelId, that.channelId)
        && Objects.equals(channelIdSet, that.channelIdSet)
        && Objects.equals(teamId, that.teamId)
        && Objects.equals(teamIdSet, that.teamIdSet)
        && Objects.equals(tenantId, that.tenantId)
        && Objects.equals(tenantIdSet, that.tenantIdSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelIdSet, teamId, teamIdSet, tenantId, tenantIdSet);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksAppTeamsConfig.class)
        .add("channelId", channelId)
        .add("channelIdSet", channelIdSet)
        .add("teamId", teamId)
        .add("teamIdSet", teamIdSet)
        .add("tenantId", tenantId)
        .add("tenantIdSet", tenantIdSet)
        .toString();
  }
}
