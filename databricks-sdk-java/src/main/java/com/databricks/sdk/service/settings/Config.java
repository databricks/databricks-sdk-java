// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Config {
  /** */
  @JsonProperty("email")
  private EmailConfig email;

  /** */
  @JsonProperty("generic_webhook")
  private GenericWebhookConfig genericWebhook;

  /** */
  @JsonProperty("microsoft_teams")
  private MicrosoftTeamsConfig microsoftTeams;

  /** */
  @JsonProperty("pagerduty")
  private PagerdutyConfig pagerduty;

  /** */
  @JsonProperty("slack")
  private SlackConfig slack;

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
    return Objects.equals(email, that.email)
        && Objects.equals(genericWebhook, that.genericWebhook)
        && Objects.equals(microsoftTeams, that.microsoftTeams)
        && Objects.equals(pagerduty, that.pagerduty)
        && Objects.equals(slack, that.slack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, genericWebhook, microsoftTeams, pagerduty, slack);
  }

  @Override
  public String toString() {
    return new ToStringer(Config.class)
        .add("email", email)
        .add("genericWebhook", genericWebhook)
        .add("microsoftTeams", microsoftTeams)
        .add("pagerduty", pagerduty)
        .add("slack", slack)
        .toString();
  }
}
