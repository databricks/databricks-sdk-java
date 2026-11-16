// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Holds the destination-specific configuration. Exactly one of the nested configs is set. */
@Generated
public class Config {
  /** Configures a Slack channel reached through the Databricks Genie app for Slack. */
  @JsonProperty("databricks_app_slack")
  private DatabricksAppSlackConfig databricksAppSlack;

  /**
   * Configures a Microsoft Teams channel reached through the Databricks Genie app for Microsoft
   * Teams.
   */
  @JsonProperty("databricks_app_teams")
  private DatabricksAppTeamsConfig databricksAppTeams;

  /** Configures an email destination. */
  @JsonProperty("email")
  private EmailConfig email;

  /** Configures a generic HTTPS webhook destination. */
  @JsonProperty("generic_webhook")
  private GenericWebhookConfig genericWebhook;

  /** Configures a Microsoft Teams incoming webhook destination. */
  @JsonProperty("microsoft_teams")
  private MicrosoftTeamsConfig microsoftTeams;

  /** Configures a PagerDuty destination. */
  @JsonProperty("pagerduty")
  private PagerdutyConfig pagerduty;

  /** Configures a Slack incoming webhook destination. */
  @JsonProperty("slack")
  private SlackConfig slack;

  public Config setDatabricksAppSlack(DatabricksAppSlackConfig databricksAppSlack) {
    this.databricksAppSlack = databricksAppSlack;
    return this;
  }

  public DatabricksAppSlackConfig getDatabricksAppSlack() {
    return databricksAppSlack;
  }

  public Config setDatabricksAppTeams(DatabricksAppTeamsConfig databricksAppTeams) {
    this.databricksAppTeams = databricksAppTeams;
    return this;
  }

  public DatabricksAppTeamsConfig getDatabricksAppTeams() {
    return databricksAppTeams;
  }

  public Config setEmail(EmailConfig email) {
    this.email = email;
    return this;
  }

  public EmailConfig getEmail() {
    return email;
  }

  public Config setGenericWebhook(GenericWebhookConfig genericWebhook) {
    this.genericWebhook = genericWebhook;
    return this;
  }

  public GenericWebhookConfig getGenericWebhook() {
    return genericWebhook;
  }

  public Config setMicrosoftTeams(MicrosoftTeamsConfig microsoftTeams) {
    this.microsoftTeams = microsoftTeams;
    return this;
  }

  public MicrosoftTeamsConfig getMicrosoftTeams() {
    return microsoftTeams;
  }

  public Config setPagerduty(PagerdutyConfig pagerduty) {
    this.pagerduty = pagerduty;
    return this;
  }

  public PagerdutyConfig getPagerduty() {
    return pagerduty;
  }

  public Config setSlack(SlackConfig slack) {
    this.slack = slack;
    return this;
  }

  public SlackConfig getSlack() {
    return slack;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Config that = (Config) o;
    return Objects.equals(databricksAppSlack, that.databricksAppSlack)
        && Objects.equals(databricksAppTeams, that.databricksAppTeams)
        && Objects.equals(email, that.email)
        && Objects.equals(genericWebhook, that.genericWebhook)
        && Objects.equals(microsoftTeams, that.microsoftTeams)
        && Objects.equals(pagerduty, that.pagerduty)
        && Objects.equals(slack, that.slack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        databricksAppSlack,
        databricksAppTeams,
        email,
        genericWebhook,
        microsoftTeams,
        pagerduty,
        slack);
  }

  @Override
  public String toString() {
    return new ToStringer(Config.class)
        .add("databricksAppSlack", databricksAppSlack)
        .add("databricksAppTeams", databricksAppTeams)
        .add("email", email)
        .add("genericWebhook", genericWebhook)
        .add("microsoftTeams", microsoftTeams)
        .add("pagerduty", pagerduty)
        .add("slack", slack)
        .toString();
  }
}
